public class eligiblity {
    public static void main(String[] args) {
        int age = 21;

        if (age < 0 || age > 120) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("Valid age: eligible for voting");
        } else {
            System.out.println("Valid age: not eligible for voting");
        }
    }
}
