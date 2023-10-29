import java.util.ArrayList;
import java.util.List;

/**
 * The Order class represents an order with status updates that can be observed by customers.
 */
public class Order {
    private List<DeliveryObserver> observers = new ArrayList<>();
    private String status;

    /**
     * Attach a customer as an observer to this order to receive status updates.
     *
     * @param observer The customer observer to attach.
     */
    public void addCustomer(DeliveryObserver observer) {
        observers.add(observer);
    }

    /**
     * Detach a customer observer from this order.
     *
     * @param observer The customer observer to detach.
     */
    public void removeCustomer(DeliveryObserver observer) {
        observers.remove(observer);
    }

    /**
     * Notify all attached customer observers with a status message.
     *
     * @param status The status message to notify the customer observers.
     */
    public void notifyCustomers(String status) {
        for (DeliveryObserver observer : observers) {
            observer.update(status);
        }
    }

    /**
     * Set the status of the order and notify attached customer observers.
     *
     * @param status The new status of the order.
     */
    public void setStatus(String status) {
        this.status = status;
        notifyCustomers(status);
    }
}
