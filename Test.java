//Reverse a String in Java
/* public class Test {
    public static void main(String[] args) {
        String str = "Java";
        String rstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rstr = rstr + str.charAt(i);
        }

        System.out.println(rstr);
    }
} */


//, this solution is not optimal because String is immutable.
//A better approach is to use StringBuilder, which is mutable and more efficient.

public class Test {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
