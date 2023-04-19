public class A001_04_Operator {
    public static void main(String[] args) {
        System.out.println("1. Arithmetic Operators (산술 연산자)");

        int a = 10;
        int b = 3;
        int c = 0;

        System.out.println("a + b = " + (a + b) + " // Addition");
        System.out.println("a - b = " + (a - b) + " // Subtraction");
        System.out.println("a * b = " + (a * b) + " // Multiplication");
        System.out.println("a / b = " + (a / b) + " // Division");
        System.out.println("a % b = " + (a % b) + " // Modulo");
        System.out.println("--------------------------------------------------");

        System.out.println("2. Increment and Decrement Operators (증감 연산자)");
        System.out.println("a++ = " + (a++) + " // Post-increment (a is now 11)");
        System.out.println("a = " + a + " // (Post-increment) a is now 11");
        System.out.println("++a = " + (++a) + " // Pre-increment");
        System.out.println("a = " + a + " // (Pre-increment) a is now 12");
        System.out.println("a-- = " + (a--) + " // Post-decrement (a is now 11)");
        System.out.println("a = " + a + " // (Post-decrement) a is now 11");
        System.out.println("--a = " + (--a) + " // Pre-decrement");
        System.out.println("a = " + a + " // (Pre-decrement) a is now 10");
        System.out.println("--------------------------------------------------");

        System.out.println("3. Relational Operators (관계 연산자)");
        System.out.println("a == b = " + (a == b) + " // Equal to");
        System.out.println("a != b = " + (a != b) + " // Not equal to");
        System.out.println("a > b = " + (a > b) + " // Greater than");
        System.out.println("a < b = " + (a < b) + " // Less than");
        System.out.println("a >= b = " + (a >= b) + " // Greater than or equal to");
        System.out.println("a <= b = " + (a <= b) + " // Less than or equal to");
        System.out.println("--------------------------------------------------");

        System.out.println("4. Logical Operators (논리 연산자)");
        System.out.println("a > 0 && b > 0 = " + ((a > 0) && (b > 0)) + " // Logical AND");
        System.out.println("a > 0 || b > 0 = " + ((a > 0) || (b > 0)) + " // Logical OR");
        System.out.println("!(a > 0) = " + (!(a > 0)) + " // Logical NOT");
        System.out.println("a > 0 ^ b > 0 = " + ((a > 0) ^ (b > 0)) + " // Logical XOR");
        System.out.println("--------------------------------------------------");

        System.out.println("5. Bitwise Operators (비트 연산자)");
        System.out.println("a & b = " + (a & b) + " // Bitwise AND");
        System.out.println("a | b = " + (a | b) + " // Bitwise OR");
        System.out.println("~a = " + (~a) + " // Bitwise NOT");
        System.out.println("a ^ b = " + (a ^ b) + " // Bitwise XOR");
        System.out.println("a << 2 = " + (a << 2) + " // Bitwise left shift");
        System.out.println("a >> 2 = " + (a >> 2) + " // Bitwise right shift");
        System.out.println("a >>> 2 = " + (a >>> 2) + " // Bitwise right shift (zero fill)");
        System.out.println("--------------------------------------------------");

        System.out.println("6. Conditional Operators (조건 연산자)");
        System.out.println("c = ( a > b ) ? a : b; // c = " + c +" // Conditional operator");
        System.out.println("a > b is True, so c = a = " + c);
    }
}
