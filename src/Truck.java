public class Truck implements Transport{
    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Cargo by truck is on its way to " + destination);
    }
}
