package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("BMW", 70, 8, false);
        vehicles[1] = new Car("Audi", 75, 7, false);
        vehicles[2] = new Truck("Volvo", 300, 30, false, 500);
        vehicles[3] = new Truck("Mercedes", 450, 45, false, 350);
        printVehiclesInfo(vehicles);

    }

    private static void printVehiclesInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
