package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 123;
        int digits = String.valueOf(n).length();
        int[] a = new int[9];
        String s = Integer.toString(n);
        int start = a.length - s.length();
        for (int i = 0; i < s.length(); i++) {
            a[start + i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Number of digits: " + digits);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
    
}