public class Text {

    public static void main (String [] args) {

        String name = "Chell";
        int age = 21;
        double balance = (245.3452 + 34.2341) / 3 * 2;
        System.out.println(String.format("My name is %s, i'm %d years old and I have $%.2f!", name, age, balance));
    }
}
