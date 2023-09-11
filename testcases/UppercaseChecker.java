public class UppercaseChecker {

    //@ requires str != null;
    //@ ensures (\result == true) <==> (\forall int i; 0 <= i && i < str.length(); Character.isUpperCase(str.charAt(i)));
    public static boolean isUppercase(String str) {
        int len = str.length();
        int i = 0;
        //@ maintaining 0 <= i && i <= len;
        //@ maintaining (\forall int j; 0 <= j && j < i; Character.isUpperCase(str.charAt(j)));
        while (i < len) {
            if (!Character.isUpperCase(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }
}

