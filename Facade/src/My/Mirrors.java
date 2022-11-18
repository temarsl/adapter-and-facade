package My;

public class Mirrors { // зеркала
    String description;

    public Mirrors(String description) {
        this.description = description;
    }

    public void raise() { // поднять
        System.out.println(description + " raise");
    }

    public void omit() { // опустить
        System.out.println(description + " omit");
    }

    public void move() { // подвинуть (вперед)
        System.out.println(description + " move");
    }

    public void pushBack() { // отодвинуть (назад)
        System.out.println(description + " pushBack");
    }

}
