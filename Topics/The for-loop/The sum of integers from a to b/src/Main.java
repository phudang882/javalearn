import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (int) ((float) (a + b) * (b - a + 1) / 2);
        System.out.print(c);
    }
}
