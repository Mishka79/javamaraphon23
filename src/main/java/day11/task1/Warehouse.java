package day11.task1;

public class Warehouse {
    protected int countPickedOrders;
    protected int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return ("Количество собранных заказов " + countPickedOrders + ", \nколичество доставленных заказов " + countDeliveredOrders);
    }
}
