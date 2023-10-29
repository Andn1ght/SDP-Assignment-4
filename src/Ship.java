public class Ship implements Transport{

    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Cargo by ship is on its way to " + destination);
    }
}
