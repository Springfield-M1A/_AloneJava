public class A001_12_BreakLabel {
    public static void main(String[] args) {
        System.out.println("Label Name : M1A_");
        int a = 0;
        int b = 0;

        M1A_: while ( a <10 ) {
            while ( b < 10 ) {
                System.out.println("a = " + a + ", b = " + b);
                a++;
                b++;

                if (a == 5) {
                    System.out.println("Break M1A_ : Break the loop with label M1A_");
                    break M1A_;
                }
            }
        }
    }
}