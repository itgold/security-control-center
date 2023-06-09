/* eslint-disable react-hooks/exhaustive-deps */
import React from 'react';
import deepEqual from 'lodash/isEqual';

function isPrimitive(val) {
    return val == null || /^[sbn]/.test(typeof val);
}

/**
 * https://github.com/kentcdodds/use-deep-compare-effect
 */
function checkDeps(deps) {
    if (!deps || !deps.length) {
        throw new Error('useDeepCompareEffect should not be used with no dependencies. Use React.useEffect instead.');
    }
    if (deps.every(isPrimitive)) {
        throw new Error(
            'useDeepCompareEffect should not be used with dependencies that are all primitive values. Use React.useEffect instead.'
        );
    }
}

function useDeepCompareMemoize(value) {
    const ref = React.useRef();

    if (!deepEqual(value, ref.current)) {
        ref.current = value;
    }

    return ref.current;
}

function useDeepCompareEffect(callback, dependencies) {
    if (process.env.NODE_ENV !== 'production') {
        checkDeps(dependencies);
    }
    React.useEffect(callback, useDeepCompareMemoize(dependencies));
}

export function useDeepCompareEffectNoCheck(callback, dependencies) {
    React.useEffect(callback, useDeepCompareMemoize(dependencies));
}

export default useDeepCompareEffect;
