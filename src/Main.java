// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        excercise2.Customer premiumCustomer = new Customer("Premium");
        excercise2.Customer goldCustomer = new Customer("Gold");
        excercise2.Customer silverCustomer = new Customer("Silver");
        excercise2.Customer normalCustomer = new Customer("Normal");
        excercise2.Sale sale = new Sale();

        System.out.println("Service discount for Premium customer: " + sale.getServiceDiscountRate(premiumCustomer.getType()) * 100 + "%");
        System.out.println("Product discount for Premium customer: " + sale.getProductDiscountRate(premiumCustomer.getType()) * 100 + "%");

        System.out.println("Service discount for Gold customer: " + sale.getServiceDiscountRate(goldCustomer.getType()) * 100 + "%");
        System.out.println("Product discount for Gold customer: " + sale.getProductDiscountRate(goldCustomer.getType()) * 100 + "%");

        System.out.println("Service discount for Silver customer: " + sale.getServiceDiscountRate(silverCustomer.getType()) * 100 + "%");
        System.out.println("Product discount for Silver customer: " + sale.getProductDiscountRate(silverCustomer.getType()) * 100 + "%");

        System.out.println("Service discount for Normal customer: " + sale.getServiceDiscountRate(normalCustomer.getType()) * 100 + "%");
        System.out.println("Product discount for Normal customer: " + sale.getProductDiscountRate(normalCustomer.getType()) * 100 + "%");
        }
    }
}