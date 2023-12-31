public class MultiplesOfThree {

    //@ requires n >= 0;
    //@ requires n*3 < Integer.MAX_VALUE;
    //@ ensures (\forall int i; 0 <= i && i < \result.length; \result[i] == 3 * (i + 1));
    public static int[] doit(int n) {
        int[] arr = new int[n];
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int k; 0 <= k && k < i; arr[k] == 3 * (k + 1));
        for (int i = 0; i < n; i++) {
            arr[i] = 3 * (i + 1);
        }
        //@ assert (\forall int i; 0 <= i && i < arr.length; arr[i] == 3 * (i + 1));
        return arr;
    }
}

