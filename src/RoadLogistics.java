public class RoadLogistics implements Logistics{
    public Transport createTransport() {
        return new Truck();
    }
}
