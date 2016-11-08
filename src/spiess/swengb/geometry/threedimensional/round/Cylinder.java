package spiess.swengb.geometry.threedimensional.round;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public class Cylinder extends Round {


    private int height;


    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        this.volume = Math.PI * this.radius * this.radius * this.height;
        return this.volume;

    }


    public double calculateSurfaceArea() {
        this.surfaceArea = 2 * Math.PI * this.radius * this.radius + 2 * Math.PI * this.radius * this.height;
        return this.surfaceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        return height == cylinder.height;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        return result;
    }
}
