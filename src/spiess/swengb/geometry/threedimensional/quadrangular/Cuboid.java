package spiess.swengb.geometry.threedimensional.quadrangular;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public class Cuboid extends Quadrangular {

    private int sideB;
    private int sideC;

    public Cuboid( int sideA ,int sideB, int sideC) {
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideA =sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setSideA(int sideA){
        this.sideA = sideA;
    }

    public int getSideA(int sideA){
        return sideA;
    }

    public double calculateVolume(){
        this.volume = this.sideA * this.sideB *this.sideC;
                return this.volume;
    }

    public double calculateSurfaceArea(){
        this.surfaceArea = 2*(this.sideA * this.sideB + this.sideA * this.sideC + this.sideB*this.sideC);
        return this.surfaceArea;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cuboid)) return false;
        if (!super.equals(o)) return false;

        Cuboid cuboid = (Cuboid) o;

        if (sideB != cuboid.sideB) return false;
        return sideC == cuboid.sideC;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sideB;
        result = 31 * result + sideC;
        return result;
    }
}

