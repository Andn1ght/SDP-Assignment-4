/**
 * The Transport interface defines a common contract for various modes of transportation.
 * Classes that implement this interface should provide specific methods for delivering cargo.
 */
public interface Transport {
    /**
     * Delivers cargo to a specified destination.
     *
     * @param cargo       The cargo to be delivered.
     * @param destination The destination where the cargo is being transported to.
     */
    void deliver(String cargo, String destination);
}
