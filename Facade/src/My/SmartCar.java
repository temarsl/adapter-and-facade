package My;

public class SmartCar {
    Seats seats;
    Mirrors mirrors;
    Rudder rudder;

    public SmartCar(Seats seats, Mirrors mirrors, Rudder rudder) {
        this.seats = seats;
        this.mirrors = mirrors;
        this.rudder = rudder;
    }

    public void startCar() {
        System.out.println("Машина заводится");
        seats.move();
        seats.raise();
        mirrors.move();
        mirrors.raise();
        rudder.move();
        rudder.raise();
        System.out.println();
    }

    public void endCar() {
        System.out.println("Глушим машину");
        seats.omit();
        seats.pushBack();
        mirrors.omit();
        mirrors.pushBack();
        rudder.omit();
        rudder.pushBack();
        System.out.println();
    }
}
