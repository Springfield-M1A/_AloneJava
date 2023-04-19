import java.util.Scanner;
public class A001_06_SwitchStatement01 {
    public static void main(String[] args) {
        System.out.println("Formal Switch Statement #01");
        System.out.println("It will print from the number you entered to 1");
        System.out.println("(Should enter a number between 1 and 5)");
        System.out.println("It keep continues until it meets the break statement");

        Scanner sc = new Scanner(System.in);
        System.out.print("Num : ");
        int testInteger = sc.nextInt();

        switch (testInteger) {
            case 5:
                System.out.println("Five");
            case 4:
                System.out.println("Four");
            case 3:
                System.out.println("Three");
            case 2:
                System.out.println("Two");
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
