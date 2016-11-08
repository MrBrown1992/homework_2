package spiess.swengb.geometry.threedimensional;

import spiess.swengb.geometry.Geometry;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public abstract class ThreeDimensional extends Geometry {

    protected  double volume;

    protected  double surfaceArea;

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}
