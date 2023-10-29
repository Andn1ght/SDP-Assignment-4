/**
 * The SkyLogistics class represents a logistics provider for delivering cargo by air.
 * It implements the Logistics interface and provides a specific factory method to create Plane objects for air transport.
 */
public class SkyLogistics implements Logistics {
    /**
     * Creates and returns a Plane object to handle air transport.
     *
     * @return A new Plane object for air transport.
     */
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
