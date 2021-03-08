package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private final int SINGLE_JOB_PAYMENT = 80;
    private final int BONUS_AMOUNT = 70_000;

    public Picker(Warehouse warehouse) {
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
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (warehouse.getCountPickedOrders() >= 10_000) {
            salary += BONUS_AMOUNT;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
