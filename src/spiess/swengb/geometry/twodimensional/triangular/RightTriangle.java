package spiess.swengb.geometry.twodimensional.triangular;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public class RightTriangle extends Triangular {


    private double sideA;
    private double sideB;


    public RightTriangle(int x, int y,double sideA, double sideB) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }


    public double calcSideC() {
        return Math.sqrt(sideA*sideA+sideB*sideB);
    }


    public double calculateArea() {
        return Math.sqrt(sideA*sideA+sideB*sideB);
    }


    public double calculatePerimeter() {
        return this.sideA+ this.sideB+ calcSideC();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RightTriangle)) return false;
        if (!super.equals(o)) return false;

        RightTriangle that = (RightTriangle) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        return Double.compare(that.sideB, sideB) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
