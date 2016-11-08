package spiess.swengb.geometry.threedimensional.round;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public class Cone extends Round {

    private  int height;

    public Cone(int height, int radius) {
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

    public double calculateVolume(){
        this.volume= 1/3 * this.radius*this.radius*this.height * Math.PI;
        return this.volume;

    }


    public  double calculateSurfaceArea(){
        this.surfaceArea= Math.PI * this.radius*this.radius + Math.PI * this.radius * Math.sqrt(this.height*this.height + this.radius*this.radius);
        return this.surfaceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cone)) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        return height == cone.height;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        return result;
    }
}
