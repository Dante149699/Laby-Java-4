public class PremiumVehicle extends Car {
    public PremiumVehicle(int price) {
        super(price);
    }

    @Override
    public int calculate(int hours) {
        return price * hours;
    }
}
