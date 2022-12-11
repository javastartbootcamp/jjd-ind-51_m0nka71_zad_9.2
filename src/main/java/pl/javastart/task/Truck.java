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

    double calculateFuelWithAirCon() {
        if (isAirConditionStatus()) {
            if (loadWeight > PER_NUMBER_OF_KM) {
                double result = (loadWeight / PER_NUMBER_OF_KM) * FUEL_CONSUMPTION_WITH_LOAD_WEIGHT;
                return result + getAverageFuelConsumption() + FUEL_CONSUMPTION_WITH_AIR_CON;
            } else {
                return getAverageFuelConsumption() + FUEL_CONSUMPTION_WITH_AIR_CON;
            }
        }
        return getAverageFuelConsumption();
    }

    @Override
    double calculateRangeOfVehicle() {
        return super.calculateRangeOfVehicle();
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", load weight: " + loadWeight;
    }
}

