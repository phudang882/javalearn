// You can experiment here, it won’t be checked

public class Task {
    public enum Currency {
        USD,
        EUR,
        GBP,
        RUB,
        UAH,
        KZT,
        CAD,
        JPY,
        CNY,
    }
    public static void main(String[] args) {
      // put your code here
        Currency a = Currency.valueOf("USD");
        System.out.println(a.ordinal());
    }
}
