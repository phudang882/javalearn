import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c, x;
        a = b = c = 0;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            a += x==1 ? 1 : 0;
            b += x==0 ? 1 : 0;
            c += x==-1 ? 1 : 0;
        }
        System.out.print(b + " " + a + " " + c);
        switch (c) {
            case 1:
                System.out.print(b + " " + a + " " + c);
                break;
            case 2:
                System.out.print(b + " " + a + " " );
                break;
        }
    }
}