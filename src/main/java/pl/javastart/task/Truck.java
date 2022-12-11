package pl.javastart.task;

public class Truck extends Car {
    private double loadWeight;
    private static final double FUEL_CONSUMPTION_WITH_AIR_CON = 1.6;
    private static final double FUEL_CONSUMPTION_WITH_LOAD_WEIGHT = 0.5;
    private static final double PER_NUMBER_OF_KM = 100;

    public Truck(String name, int tankCapacity, double averageFuelConsumption,
         boolean airConditionStatus, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, airConditionStatus);
        this.loadWeight = loadWeight;
    }

    @Override
    public boolean isAirConditionStatus() {
        return super.isAirConditionStatus();
    }

    double calculateRangeOfVehicle() {
        if (isAirConditionStatus()) {
            if (loadWeight > PER_NUMBER_OF_KM) {
                double consumptionWithWeight = (loadWeight / PER_NUMBER_OF_KM) * FUEL_CONSUMPTION_WITH_LOAD_WEIGHT;
                double totalFuelConsumption = consumptionWithWeight + getAverageFuelConsumption() + FUEL_CONSUMPTION_WITH_AIR_CON;
                return (getTankCapacity() / totalFuelConsumption) * PER_NUMBER_OF_KM;
            } else {
                return getTankCapacity() / getAverageFuelConsumption() * 100;
            }
        }
        return getTankCapacity() / getAverageFuelConsumption() * 100;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", load weight: " + loadWeight;
    }
}

