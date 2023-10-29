import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<DeliveryObserver> observers = new ArrayList<>();
    private String status;

    public void addCustomer(DeliveryObserver observer) {
        observers.add(observer);
    }

    public void removeCustomer(DeliveryObserver observer) {
        observers.add(observer);
    }

    public void notifyCustomers(String status) {
        for (DeliveryObserver observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyCustomers(status);
    }
}
