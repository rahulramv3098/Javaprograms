package abstraction;

abstract class Colours {
    public abstract void paint();
}

class Red extends Colours {
    public void paint() {
        System.out.println("Red colour");
    }
}

class Blue extends Colours {
    public void paint() {
        System.out.println("Blue colour");
    }
}

public class prgm2 {
    public static void main(String[] args) {
        Red red = new Red();
        Blue blue = new Blue();
        red.paint();
        blue.paint();
    }
}