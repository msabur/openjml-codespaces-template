public class EvenArray {

    //@ requires n >= 0;
    //@ requires n*2 < Integer.MAX_VALUE;
    //@ ensures (\forall int i; 0 <= i && i < \result.length; \result[i] % 2 == 0);
    public static int[] makeEvenArray(int n) {
        int[] arr = new int[n];
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int k; 0 <= k && k < i; arr[k] % 2 == 0);
        for (int i = 0; i < n; i++) {
            arr[i] = 2 * (i + 1);
        }
        //@ assert (\forall int i; 0 <= i && i < arr.length; arr[i] % 2 == 0);
        return arr;
    }
}

