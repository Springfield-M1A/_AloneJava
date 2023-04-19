public class A001_02_PrintFormat {
    public static void main(String[] args) {
        int testInteger = 98;
        String testString = "M1A-Springfield";
        double testDouble = 3.141592;

        System.out.printf("%d : Decimal Integer (10진수)\n", testInteger);
        System.out.printf("%o : Octal Integer (8진수)\n", testInteger);
        System.out.printf("%x : Hexadecimal Integer (16진수)\n", testInteger);
        System.out.printf("%c : Character (98)\n", testInteger);
        System.out.printf("%5d : Decimal Integer (5 spaces)\n", testInteger);
        System.out.printf("%05d : Decimal Integer (5 spaces, 0 fill)\n", testInteger);
        System.out.printf("%-5d : Decimal Integer (5 spaces, left justified)\n", testInteger);
        System.out.println("--------------------------------------------------");

        testInteger = 10000000;
        System.out.printf("(Changed testInteger to %d)\n", testInteger);
        System.out.printf("%,d : Decimal Integer (with commas)\n", testInteger);
        System.out.println("--------------------------------------------------");

        System.out.printf("%s : String\n", testString);
        System.out.printf("%10s : String (10 spaces)\n", testString);
        System.out.printf("%-10s : String (10 spaces, left justified)\n", testString);
        System.out.printf("%-10.10s : String (10 spaces, 5 characters, left justified)\n", testString);
        System.out.println("--------------------------------------------------");

        System.out.printf("%f : Floating Point\n", testDouble);
        System.out.printf("%e : Floating Point (exponential)\n", testDouble);
        // System.out.printf("%g : Floating Point (exponential or decimal)\n", testDouble);
        // %g is not supported in Java 1.4
        System.out.printf("%10.2f : Floating Point (10 spaces, 2 decimal places)\n", testDouble);
        System.out.printf("%-10.2f : Floating Point (10 spaces, 2 decimal places, left justified)\n", testDouble);
        System.out.printf("%010.2f : Floating Point (10 spaces, 2 decimal places, 0 fill)\n", testDouble);
    }
}
