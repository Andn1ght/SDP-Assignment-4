public class Main {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();
        Logistics skyLogistics = new SkyLogistics();

        String cargo = "00B201";
        String destination = "New York";

        Transport transport = roadLogistics.createTransport();
        transport.deliver(cargo, destination);

        Order order = new Order();
        DeliveryObserver customer = new Customer("Jack");
        order.addCustomer(customer);

        order.setStatus("Shipped");
        order.setStatus("In Transit");
        order.setStatus("At your house");
    }
}