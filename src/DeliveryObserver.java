/**
 * The DeliveryObserver interface defines a contract for objects that can receive and respond to status updates about deliveries.
 */
public interface DeliveryObserver {
    /**
     * Update the observer with a status message about a delivery.
     *
     * @param status The status message to be received and processed by the observer.
     */
    void update(String status);
}
