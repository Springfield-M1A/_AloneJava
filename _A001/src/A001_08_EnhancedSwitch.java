import java.util.Scanner;
public class A001_08_EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enhanced Switch Statement");
        System.out.println("It will print from the number Just like the Formal Switch Statement #01");
        System.out.println("But, Not like the formal one, Break is not needed");

        System.out.print("Num : ");
        int testInteger = sc.nextInt();

        switch (testInteger) {
            case 5 -> System.out.println("Five");
            case 4 -> System.out.println("Four");
            case 3 -> System.out.println("Three");
            case 2 -> System.out.println("Two");
            case 1 -> System.out.println("One");
            default -> System.out.println("Invalid number");
        }

        System.out.println("-----------------------------");
        System.out.println("It can also get return value like | String A = switch ...");
        System.out.println("But, It's not recommended to use it like this");

        System.out.println("Num : ");
        testInteger = sc.nextInt();

        String A = switch (testInteger) {
            case 5 -> "Five";
            case 4 -> "Four";
            case 3 -> "Three";
            case 2 -> "Two";
            case 1 -> "One";
            default -> "Invalid number";
        };
        System.out.println(A);

        System.out.println("-----------------------------");

        System.out.println("yield can be used to return value");
        System.out.println("(Break 없이 탈출, 곧바로 반환 해주는 역할)");

        System.out.println("Num : ");
        testInteger = sc.nextInt();

        String B = switch (testInteger) {
            case 5 -> {
                System.out.println("Five");
                yield "Five";
            }
            case 4 -> {
                System.out.println("Four");
                yield "Four";
            }
            case 3 -> {
                System.out.println("Three");
                yield "Three";
            }
            case 2 -> {
                System.out.println("Two");
                yield "Two";
            }
            case 1 -> {
                System.out.println("One");
                yield "One";
            }
            default -> {
                System.out.println("Invalid number");
                yield "Invalid number";
            }
        };
    }
}
