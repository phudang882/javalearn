package machine;

import java.util.Scanner;

public class CoffeeMachine{
    /**
     * a is a array 2d
     * a[x (9<=x<=4)][0] the machine has
     * a[x (0<=x<=4)][i (i!=0)] the machine need to make coffee in menu i
     * */
    public static int[][] a = {{400, 250, 350, 200},
                            {540, 0, 75, 100},
                            {120, 16, 20, 12},
                            {9, 1, 1, 1, 1},
                            {550, -4, -7, -6}};
    public static int[] b = {0,0,0,0};
    public static String[] str = {"water", "milk", "coffee beans", "disposable cups", "exit"};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            s = scanner.next();
            switch (s) {
                case "buy":
                    buy(scanner);
                    break;
                case "fill":
                    fill(scanner);
                    break;
                case "take":
                    System.out.print("I gave you $" + a[4][0]);
                    a[4][0] = 0;
                    break;
                case "remaining":
                    print();
                    break;
            }
            System.out.println();
        } while (!s.equals("exit"));
    }
    public static void buy(Scanner scanner){
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String s = scanner.next();
        int i;
        if (s.equals("back")) {
            return;
        }
        else {
            i=Integer.parseInt(s);
        }
        for (int j = 0; j < 4; j++) {
            if (a[j][0] - a[j][i] >= 0) {
                b[j]=a[j][0] - a[j][i];
            }
            else {
               System.out.println("Sorry, not enough " + str[j]);
               return;
            }
        }
        for (int j = 0; j < 4; j++) {
            a[j][0] = b[j];
        }
        a[4][0] -= a[4][i];
        System.out.println("I have enough resources, making you a coffee!");
    }
    public static void fill(Scanner scanner){
        System.out.println("\nWrite how many ml of water you want to add: ");
        a[0][0] += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        a[1][0] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        a[2][0] += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        a[3][0] += scanner.nextInt();
    }
    public static void print() {
        System.out.println("\nThe coffee machine has: ");
        System.out.println(a[0][0] + " ml of water");
        System.out.println(a[1][0] + " ml of milk");
        System.out.println(a[2][0] + " ml of coffee beans");
        System.out.println(a[3][0] + " disposable cups");
        System.out.println("$"+a[4][0] + " of money");
    }
}

