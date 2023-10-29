/**
 * The Plane class represents a mode of transportation for delivering cargo by air.
 * It implements the Transport interface and provides a specific delivery method for planes.
 */
public class Plane implements Transport {
    /**
     * Delivers cargo to a specified destination by plane.
     *
     * @param cargo       The cargo to be delivered.
     * @param destination The destination where the cargo is being transported to by plane.
     */
    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Cargo by plane is on its way to " + destination);
    }
}
