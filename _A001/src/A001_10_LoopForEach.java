public class A001_10_LoopForEach {
    public static void main(String[] args) {
        System.out.println("For Each Statement Example");
        System.out.println("Only prints If i%3 == 0");

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : intArray) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}
