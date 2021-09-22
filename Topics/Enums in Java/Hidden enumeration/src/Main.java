public class Main {

    public static void main(String[] args) {
    // write your program here
        int i = 0;
        for (Secret c : Secret.values()) {
            i+= c.name().startsWith("STAR") ? 1 : 0;
        }
        System.out.print(i);
    }
}

//enum Secret {
//    STAR, CRASH, START,
//    ; // ...
//}
