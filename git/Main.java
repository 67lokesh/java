package git;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int i = 1;

        do {
            int j = 1;
            // Print spaces
            do {
                if (j <= n - i) {
                    System.out.print("  ");
                } else {
                    break;
                }
                j++;
            } while (true);

            int k = 1;
            // Print stars
            do {
                if (k <= i) {
                    System.out.print("* ");
                } else {
                    break;
                }
                k++;
            } while (true);

            System.out.println(); // Move to the next line
            i++;
        } while (i <= n);
    }
}
