/**
 * The Logistics interface defines a contract for logistics providers to create different modes of transportation.
 * Implementing classes should provide a factory method to create specific Transport objects.
 */
public interface Logistics {
    /**
     * Creates and returns a Transport object, representing a specific mode of transportation.
     *
     * @return A Transport object for a specific transportation mode.
     */
    Transport createTransport();
}
