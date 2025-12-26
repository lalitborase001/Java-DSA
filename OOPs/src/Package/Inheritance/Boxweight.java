package Package.Inheritance;

public class Boxweight extends Box {
    double weight;

    public Boxweight() {
        this.weight = -1;
    }

    public Boxweight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
