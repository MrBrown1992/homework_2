package spiess.swengb.geometry.twodimensional;

import spiess.swengb.geometry.Geometry;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public abstract class TwoDimensional extends Geometry {


    protected  double area;

    protected  double perimeter;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
