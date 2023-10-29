/**
 * The RoadLogistics class represents a logistics provider for delivering cargo by land (road).
 * It implements the Logistics interface and provides a specific factory method to create Truck objects for ground transport.
 */
public class RoadLogistics implements Logistics {
    /**
     * Creates and returns a Truck object to handle ground transportation.
     *
     * @return A new Truck object for ground transport.
     */
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
