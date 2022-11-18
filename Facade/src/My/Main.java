package My;

public class Main {
    public static void main(String[] args) {
        Seats seats = new Seats("seats");
        Mirrors mirrors = new Mirrors("mirrors");
        Rudder rudder = new Rudder("rudder");

        SmartCar smartCar = new SmartCar(seats,mirrors,rudder);
        smartCar.startCar();
        smartCar.endCar();
    }
}
