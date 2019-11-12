package dependencies;

public class Main {

    private static Temp temp;

    public static void main(String[] args) {
        if (args.length > 0) {
            temp = new B("B");
            System.out.println(temp.toString());
        }
    }
}
