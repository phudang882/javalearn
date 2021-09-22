import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        int m = 0;
        do {
            b = scanner.nextInt();
            if (b == 0) {
                break;
            }
            if (m == 2) {
                continue;
            }
            if (m == 0) {
                m += a > b ? 1 : 0;
                m += a < b ? -1 : 0;
            }
            m = m == 1 && a < b ? 2 : m;
            m = m == -1 && a > b ? 2 : m;
            a = b;
        } while (true);
        System.out.print(m == 2 ? "false" : "true");
    }
}
