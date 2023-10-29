/**
 * The SeaLogistics class represents a logistics provider for delivering cargo by sea.
 * It implements the Logistics interface and provides a specific factory method to create Ship objects for sea transport.
 */
public class SeaLogistics implements Logistics {
    /**
     * Creates and returns a Ship object to handle sea transportation.
     *
     * @return A new Ship object for sea transport.
     */
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
