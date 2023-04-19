public class A001_11_BranchStatement {
    public static void main(String[] args) {
        System.out.println("Branch Statement");
        System.out.println("1. Break Statement");
        System.out.println("If i == 5, break the loop");
        int i;
        for (i = 0 ; i < 10 ; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("2. Continue Statement");
        System.out.println("If i == 5, continue the loop");
        for (i = 0 ; i < 10 ; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("3. Infinite Loop (Will break at i=10");

        while (true) {
            System.out.println("i = " + i);
            i++;
            if (i == 10) {
                break;
            }
        }
    }
}
