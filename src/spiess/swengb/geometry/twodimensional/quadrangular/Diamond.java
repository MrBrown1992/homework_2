package spiess.swengb.geometry.twodimensional.quadrangular;

import spiess.swengb.geometry.threedimensional.quadrangular.*;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public class Diamond extends Quadrangular {

    public double alpha;

    public Diamond(double alpha,int sideA) {
        this.alpha = alpha;
        this.sideA=sideA;

    }


    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA() {
        this.sideA = sideA;
    }

    public double calculateArea(){

        this.area = this.sideA*this.sideA*Math.sin(alpha);
        return area;
    }


    public double calculatePerimeter(){
        this.perimeter = 4*this.sideA;
        return perimeter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diamond)) return false;
        if (!super.equals(o)) return false;

        Diamond diamond = (Diamond) o;

        return Double.compare(diamond.alpha, alpha) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(alpha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

