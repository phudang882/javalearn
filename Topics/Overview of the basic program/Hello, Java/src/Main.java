
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Write how many ml of water the coffee machine has: ");
        a = scanner.nextInt()/200;
        System.out.println("Write how many ml of milk the coffee machine has: ");
        b = scanner.nextInt()/50;
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        c = scanner.nextInt()/15;
        System.out.println("Write how many cups of coffee you will need: ");
        d = scanner.nextInt();
        int min = Math.min(Math.min(a,b),c);
        boolean x = d<=min;
        System.out.print((x?"Yes":"No")+", I can make "+(x?"that amount ":("only "+min+" cup(s)"))+"of coffee");
        if (min-d>0) System.out.print("(and even " + (d) + " more than that)");
    }
}
