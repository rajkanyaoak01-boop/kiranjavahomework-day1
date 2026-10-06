public class profitandloss {
    public static void main(String[] args) {
        double costPrice = 500;
        double sellingPrice = 650;

        if (sellingPrice > costPrice) {
            System.out.println("Profit: " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss: " + (costPrice - sellingPrice));
        } else {
            System.out.println("No profit, no loss");
        }
    }
}
