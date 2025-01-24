class CompareFloats {
    public static void main(String[] args) {
        double num1 = 3.14159;
        double num2 = 3.14149;

        // Extract up to three decimal places manually
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);

        if (intNum1 == intNum2) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
    }
}
