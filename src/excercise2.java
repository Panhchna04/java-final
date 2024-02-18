public class excercise2 {

    public interface DiscountRate {
        double getDiscountRate(CustomerType customerType, ProductType productType);
    }

    public enum CustomerType {
        PREMIUM, GOLD, SILVER, NORMAL
    }

    public enum ProductType {
        SERVICE, PRODUCT
    }

    public class Customer implements DiscountRate {
        private CustomerType customerType;

        public Customer(CustomerType customerType) {
            this.customerType = customerType;
        }

        @Override
        public double getDiscountRate(CustomerType customerType, ProductType productType) {
            if (this.customerType == customerType) {
                switch (productType) {
                    case SERVICE:
                        switch (customerType) {
                            case PREMIUM:
                                return 0.2;
                            case GOLD:
                                return 0.15;
                            case SILVER:
                                return 0.1;
                            default:
                                return 0;
                        }
                    case PRODUCT:
                        return 0.1; // Same discount for all customer types on products
                    default:
                        return 0;
                }
            } else {
                return 0; // No discount for different customer types
            }
        }
    }

    public class Sale {
        private Customer customer;
        private ProductType productType;
        private double price;

        public Sale(Customer customer, ProductType productType, double price) {
            this.customer = customer;
            this.productType = productType;
            this.price = price;
        }

        public double getFinalPrice() {
            double discountRate = customer.getDiscountRate(customer.getCustomerType(), productType);
            double discountAmount = price * discountRate;
            return price - discountAmount;
        }
}