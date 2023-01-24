package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    public static int bonus;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return ""+getSalary()+bonus;
    }

    public Courier(Warehouse warehouse) {
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders += 1;


    }

    ;

    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.countPickedOrders == 10000){
            isPayed = true;
            bonus=50000;
        }
    }
}
