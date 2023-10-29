/**
 * The Ship class represents a mode of transportation for delivering cargo by sea.
 * It implements the Transport interface and provides a specific delivery method for ships.
 */
public class Ship implements Transport {
    /**
     * Delivers cargo to a specified destination by ship.
     *
     * @param cargo       The cargo to be delivered.
     * @param destination The destination where the cargo is being shipped to.
     */
    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Cargo by ship is on its way to " + destination);
    }
}
