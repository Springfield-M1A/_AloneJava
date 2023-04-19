import java.util.Scanner;
public class A001_03_ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 공백, 탭 등의 구분자에 따라 입력 분리");
        System.out.print("정수 세 개를 구분지어 입력 : ");
        int testInteger1 = sc.nextInt();
        int testInteger2 = sc.nextInt();
        int testInteger3 = sc.nextInt();
        System.out.println("입력된 정수 : " + testInteger1 + ", " + testInteger2 + ", " + testInteger3);
        System.out.println("--------------------------------------------------");

        System.out.println("2. next() 메서드도 똑같이 구분자에 따라 입력 분리");
        System.out.print("문자열 입력 : ");
        String testString = sc.next();
        System.out.println("입력된 문자열 : " + testString);

        System.out.println("==== nextLine() 사용하여 버퍼 초기화 ====");
        sc.nextLine();
        System.out.println("--------------------------------------------------");

        System.out.println("3. nextLine() 메서드는 \\n (개행문자)를 만날 때까지 입력을 받음");
        System.out.println("따라서 nextLine() 메서드를 사용하기 전에 next() 메서드를 사용하면 \\n을 입력으로 받아버리는 경우 발생 가능");
        System.out.print("문자열 입력 : ");
        testString = sc.nextLine();
        System.out.println("입력된 문자열 : " + testString);
    }
}
