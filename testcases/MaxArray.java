public class MaxArray {

    //@ ensures \forall int i; 0 <= i < a.length; \result >= a[i];
    //@ requires a.length > 0;
    public static int findMax(int[] a) {
        int max = a[0];
        //@ maintaining 1 <= i <= a.length;
        //@ maintaining \forall int k; 0 <= k < i; a[k] <= max;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        //@ assert \forall int i; 0 <= i < a.length; max >= a[i];
        return max;
    }
}

