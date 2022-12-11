package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditionStatus;
    private static final double FUEL_CONSUMPTION_WITH_AIR_CON = 0.8;
    private static final double PER_NUMBER_OF_KM = 100;

    public Car(String name, int tankCapacity, double averageFuelConsumption, boolean airConditionStatus) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditionStatus = airConditionStatus;
    }

    public boolean isAirConditionStatus() {
        return airConditionStatus;
    }

    public void setAirConditionStatus(boolean airConditionStatus) {
        this.airConditionStatus = airConditionStatus;
    }

    double calculateFuelWithAirCon() {
        if (airConditionStatus) {
            return getAverageFuelConsumption() + FUEL_CONSUMPTION_WITH_AIR_CON;
        }
        return getAverageFuelConsumption();
    }

    double calculateRangeOfVehicle() {
        if (airConditionStatus) {
            return (getTankCapacity() / calculateFuelWithAirCon() * PER_NUMBER_OF_KM);
        } else {
            return getTankCapacity() / getAverageFuelConsumption() * PER_NUMBER_OF_KM;
        }
    }

    void turnAirConditionOn() {
        airConditionStatus = true;
    }

    void printInfoOfRange() {
        System.out.printf("Range of %s is: %.2f km\n", getName(), calculateRangeOfVehicle());
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", is air condition on? " + airConditionStatus;
    }

}

