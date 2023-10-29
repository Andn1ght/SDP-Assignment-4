/**
 * The Truck class represents a mode of ground transportation for delivering cargo by land.
 * It implements the Transport interface and provides a specific delivery method for trucks.
 */
public class Truck implements Transport {
    /**
     * Delivers cargo to a specified destination by truck.
     *
     * @param cargo       The cargo to be delivered.
     * @param destination The destination where the cargo is being transported to by truck.
     */
    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Cargo by truck is on its way to " + destination);
    }
}
