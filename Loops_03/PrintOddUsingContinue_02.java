package Loops_03;

public class PrintOddUsingContinue_02 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }
    }
}
