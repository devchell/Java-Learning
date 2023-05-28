public class Conditional {
    public static void main(String[] args) {

        int year = 1986;
        boolean inThePlan = false;
        String plan = "Normal";
        double price = 4.99;

        if (year > 2022){
            System.out.println("Release");
        } else {
            System.out.println("Out of release");
        }

        if (inThePlan || plan.equals("Plus")) {
            System.out.println("Watch now!");
        } else {
            System.out.println("Rent for $" + price);
        }
    }
}
