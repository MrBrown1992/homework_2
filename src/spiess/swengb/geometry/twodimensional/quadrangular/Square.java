package spiess.swengb.geometry.twodimensional.quadrangular;



/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public class Square extends Quadrangular {

    public Square(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public  double calculateArea(){

        this.area = this.sideA*this.sideA;
        return area;

    }

    public double calculatePerimeter(){
        this.perimeter= 4*this.sideA;
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return Double.compare(square.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }




}
