public class App {
    public static void main(String[] args) {
        displayCard("Ohm Cambodia", 3000, "Gold");
        System.out.println("****************");
        displayCard("Pete Pakret", 5000, "Silver");
        System.out.println("****************");
        displayCard("Sub Roblox", 5000, "Diamond");
        System.out.println("****************");
        displayCard("Fluke Handsome", 2500, "Platinum");
    }

    public static void displayCard(String name, double purchaseAmount, String type) {
        double discount = calculateDiscount(type, purchaseAmount);
        System.out.println("Customer Name: " + name);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount: " + (purchaseAmount - discount));
    }

    public static double calculateDiscount(String type, double purchaseAmount) {
        switch (type) {
            case "Gold":
                return purchaseAmount * 0.10;
            case "Silver":
                return purchaseAmount * 0.05;
            case "Platinum":
                return purchaseAmount * 0.15;
            case "Diamond":
                return purchaseAmount * 0.20;
            default:
                return 0;
        }
    }
}
