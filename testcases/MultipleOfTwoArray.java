public class MultipleOfTwoArray {

    //@ requires n >= 0;
    //@ requires 2*n < Integer.MAX_VALUE;
    //@ ensures (\forall int i; 0 <= i && i < \result.length; \result[i] == 2 * (i + 1));
    public static int[] makeMultipleOfTwoArray(int n) {
        int[] arr = new int[n];
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int k; 0 <= k && k < i; arr[k] == 2 * (k + 1));
        for (int i = 0; i < n; i++) {
            arr[i] = 2 * (i + 1);
        }
        //@ assert (\forall int i; 0 <= i && i < arr.length; arr[i] == 2 * (i + 1));
        return arr;
    }
}

