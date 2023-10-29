/**
 * The Customer class represents a customer who acts as an observer to receive status updates about a delivery.
 * It implements the DeliveryObserver interface and displays status updates to the customer.
 */
public class Customer implements DeliveryObserver {
    private String name;

    /**
     * Constructs a Customer object with a name.
     *
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String status) {
        System.out.println(name + " received a new status update: " + status);
    }
}
