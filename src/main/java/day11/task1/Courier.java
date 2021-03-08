package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private final int SINGLE_JOB_PAYMENT = 100;
    private final int BONUS_AMOUNT = 50_000;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += SINGLE_JOB_PAYMENT;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (warehouse.getCountDeliveredOrders() >= 10_000) {
            salary += BONUS_AMOUNT;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", SINGLE_JOB_PAYMENT=" + SINGLE_JOB_PAYMENT +
                ", BONUS_AMOUNT=" + BONUS_AMOUNT +
                '}';
    }
}
