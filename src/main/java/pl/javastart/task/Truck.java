package pl.javastart.task;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, int tankCapacity, double averageFuelConsumption,
         boolean airConditionStatus, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, airConditionStatus);
        this.loadWeight = loadWeight;
    }

    @Override
    public boolean isAirConditionStatus() {
        return super.isAirConditionStatus();
    }

    double calculateFuelWithAirCon(Vehicle[] vehicles) {
        if (isAirConditionStatus()) {
            if (loadWeight > 100) {
                double result = (loadWeight / 100) * 0.5;
                return result + getAverageFuelConsumption() + 1.6;
            } else {
                return getAverageFuelConsumption() + 1.6;
            }
        }
        return getAverageFuelConsumption();
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", load weight: " + loadWeight;
    }
}

