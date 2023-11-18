public class hello {

    public static void main(String[] args) {
        byte b = 100;
        String str = "" + b;

        System.out.println(str instanceof String); // => true
        System.out.println(str instanceof Object); // => true

    }
}