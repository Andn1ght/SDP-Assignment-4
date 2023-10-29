public class SkyLogistics implements Logistics{

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
