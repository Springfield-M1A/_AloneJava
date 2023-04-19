public class A001_09_LoopStatement {
    public static void main(String[] args) {
        System.out.println("1. While Statement");

        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("2. Do While Statement");

        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 10);
        System.out.println();
        System.out.println("* Difference : do ~ while will execute at least ONCE");

        System.out.println("--------------------------------------------------");
        System.out.println("3. For Statement");

        for (i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("4. For Each Statement");

        int[] intArray = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        for (int j : intArray) {
            System.out.println("j = " + j);
        }
    }
}
