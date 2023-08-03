public class Namedloop {
    public static void main(String[] args) {
        outerLoop: // Labeled outer loop
        for (int i = 1; i <= 3; i++) {
            innerLoop: // Labeled inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (i == 2 && j == 2) {
                    break outerLoop; // Breaking out of the outer loop when i=2 and j=2
                }
            }
        }
    }
}
