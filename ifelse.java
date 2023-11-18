public class ifelse {
    public static void main(String[] args) {
        boolean expression = 4 > 5;
        boolean expression2 = 8 == 9;

        if (expression) {
            System.out.println("First expression is true.");
        } else {
            if (expression2) {
                System.out.println("Second expression is true.");

            } else {
                System.out.println("Both expressions are false.");
            }
        }
    }
}
