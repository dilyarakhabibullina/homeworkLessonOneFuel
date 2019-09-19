public class Main {
    public static void main(String[] args) {
        double fuelAmountLeft = 21;
        double fuelConsumption = 12;
        double fuelConsumptionPerKm = fuelConsumption/100;
        int kmLeft = (int) (fuelAmountLeft / fuelConsumptionPerKm);
        System.out.println("Бензина осталось на "+kmLeft +" км");
    }
}

