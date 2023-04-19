import java.util.Scanner;
public class A001_05_ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("1. If ~ Else Statement (Odd / Even)");
        System.out.println("By using %2 (mod 2), we can check if the number is odd or even");
        Scanner sc = new Scanner(System.in);
        System.out.print("Num : ");

        int testInteger = sc.nextInt();
        if (testInteger % 2 == 0) {
            System.out.println("Even (짝수)");
        } else {
            System.out.println("Odd (홀수)");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("2. Multiple If Statement (다중 if 문)");
        System.out.println("By using if ~ else if ~ else, we can check the grade");

        System.out.print("Score : ");
        testInteger = sc.nextInt();

        if (testInteger >= 90) {
            System.out.println("A");
        } else if (testInteger >= 80) {
            System.out.println("B");
        } else if (testInteger >= 70) {
            System.out.println("C");
        } else if (testInteger >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("3. Overlapped If Statement (중첩 if 문)");
        System.out.println("By using if ~ else if ~ else, we can check the grade");

        System.out.print("Score : ");
        testInteger = sc.nextInt();

        if (testInteger >= 90) {
            System.out.println("A");
        } else {
            if (testInteger >= 80) {
                System.out.println("B");
            } else {
                if (testInteger >= 70) {
                    System.out.println("C");
                } else {
                    if (testInteger >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("F");
                    }
                }
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("4. Switch Statement (switch 문)");
        System.out.println("By using switch ~ case ~ default, we can check the grade");

        System.out.print("Score : ");
        testInteger = sc.nextInt();

        switch (testInteger / 10) {
            case 10, 9 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            default -> System.out.println("F");
        }
    }
}
