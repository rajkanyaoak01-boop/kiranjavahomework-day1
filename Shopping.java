public class ShoppingBill {

    // (a + b) + 18% GST
    public static double calculateElectronicsGST(double a, double b) {
        double subtotal = a + b;
        return subtotal + subtotal * 0.18;
    }

    // (c + d) + 13% GST
    public static double calculateFashionGST(double c, double d) {
        double subtotal = c + d;
        return subtotal + subtotal * 0.13;
    }

    // e + 7% GST
    public static double calculateFoodGST(double e) {
        return e + e * 0.07;
    }

    // Sum of all three GST-inclusive amounts
    public static double totalBill(double a, double b, double c, double d, double e) {
        return calculateElectronicsGST(a, b)
                + calculateFashionGST(c, d)
                + calculateFoodGST(e);
    }

    // Total after GST, minus 20% discount = final payable amount
    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        return total - discount;
    }

    public static void main(String[] args) {
        double a = 100, b = 100, c = 100, d = 100, e = 100;

        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);
        double total = totalBill(a, b, c, d, e);
        double finalAmount = calculateDiscountedBill(a, b, c, d, e);
        double discount = total - finalAmount;

        System.out.printf("Electronics: %.2f%n", electronics);
        System.out.printf("Fashion: %.2f%n", fashion);
        System.out.printf("Food: %.2f%n", food);
        System.out.printf("Total after GST = %.2f | Discount = %.2f | Final payable amount = %.2f%n",
                total, discount, finalAmount);
    }
}
