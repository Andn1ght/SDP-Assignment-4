public class Plane implements Transport{

    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Cargo by plane is on its way to " + destination);
    }
}
