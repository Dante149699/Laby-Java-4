public class BudgetVehicle extends Vehicle {
    public BudgetVehicle(int price) {
        super(price);
    }

    @Override
    public int calculate(int hours) {
        return getPrice() * hours;
    }
}
