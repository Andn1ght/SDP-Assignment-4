public class Customer implements DeliveryObserver{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String status) {
        System.out.println(name + " received a new status update: " + status);
    }
}
