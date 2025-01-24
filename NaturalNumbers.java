class NaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of natural numbers to display
        int sum = 0;

        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i; // Add the current number to the sum
        }

        System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
    }
}
