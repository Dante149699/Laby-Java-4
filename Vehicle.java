public abstract class Vehicle {
    protected int price;

    public Vehicle(int price) {
        this.price = price;
    }

    public abstract int calculate(int hours);
}
