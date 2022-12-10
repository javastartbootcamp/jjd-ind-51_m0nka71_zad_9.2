package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditionStatus;

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

    double calculateFuelWithAirCon(Vehicle[] vehicles) {
        if (airConditionStatus) {
            return getAverageFuelConsumption() + 0.8;
        }
        return getAverageFuelConsumption();
    }

    //jak wywołac?
    boolean turnAirConditionOn(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            return airConditionStatus = true;
        }
        return false;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", is air condition on? " + airConditionStatus;
    }
}

