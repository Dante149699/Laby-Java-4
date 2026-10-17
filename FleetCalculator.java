import java.util.Random;

public class FleetCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0; // всего денег с таксопарка

        for (int i = 1; i <= 16; i++) { // 16 машин
            Vehicle vehicle;
            int price;

            if (i % 2 == 0) { // чётные — бизнес, нечётные — эконом
                price = random.nextInt(151) + 450;
                vehicle = new PremiumVehicle(price);
            } else {
                price = random.nextInt(151) + 150;
                vehicle = new BudgetVehicle(price);
            }

            int income = 0; // доход за неделю
            for (int day = 1; day <= 5; day++) {
                int hours = random.nextInt(9); // сколько часов в день отработала машина
                income += vehicle.calculate(hours);
            }

            total += income;
            System.out.println("Машина " + i + ": доход за неделю = " + income + " руб.");
        }

        System.out.println("Доход таксопарка за неделю: " + total + " руб.");
    }
}
