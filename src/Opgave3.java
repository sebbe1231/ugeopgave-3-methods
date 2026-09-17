import java.util.Scanner;

public class Opgave3 {
    Scanner input = new Scanner(System.in);

    void main() {
        System.out.println("Insert base price:");
        double basePrice =  Double.parseDouble(input.nextLine());

        System.out.println("Costumer type (normal/student/senior):");
        String costumerType = input.nextLine();

        double discount = 0;
        switch (costumerType) {
            case "normal":
                discount = 0;
                break;
            case "student":
                discount = 15;
                break;
            case "senior":
                discount = 10;
                break;
            default:
                System.out.println("Not a valid input");
        }

        double finalPrice = calculateFinalPrice(basePrice, discount);
        System.out.println("Final price with " + discount + "% discount is " + finalPrice + "kr.");
    }

    public double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    public double addTax(double price) {
        return price * 1.25;
    }

    public double calculateFinalPrice(double basePrice, double discount) {
        double afterDiscount = applyDiscount(basePrice, discount);
        return addTax(afterDiscount);

    }
}
