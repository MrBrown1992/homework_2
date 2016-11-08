package spiess.swengb;


import spiess.swengb.geometry.*;
import spiess.swengb.geometry.threedimensional.ThreeDimensional;
import spiess.swengb.geometry.threedimensional.quadrangular.Cuboid;
import spiess.swengb.geometry.threedimensional.round.Cone;
import spiess.swengb.geometry.threedimensional.round.Cylinder;
import spiess.swengb.geometry.twodimensional.TwoDimensional;
import spiess.swengb.geometry.twodimensional.quadrangular.Diamond;
import spiess.swengb.geometry.twodimensional.quadrangular.Square;
import spiess.swengb.geometry.twodimensional.triangular.RightTriangle;

import java.util.*;

/**
 * Created by Nikolaus Spieß  on 08.11.16.
 */
public class Main {
    public static void main(String[] args) {

        Main main   = new Main();

        main.doIt();

    }

    private void fill2DList(List<TwoDimensional> twoDList) {
        twoDList.add(new Diamond(25, 6));
        twoDList.add(new Diamond(34, 8));
        twoDList.add(new Square(5));
        twoDList.add(new Square(9));
        twoDList.add(new RightTriangle(4,5,20,12));
        twoDList.add(new RightTriangle(7,8,90,45));




    }

    private void fill3DList(List<ThreeDimensional> threeDList) {

        threeDList.add(new Cuboid(5,9,7));
        threeDList.add(new Cuboid(9,3,8));
        threeDList.add(new Cone(9,12));
        threeDList.add(new Cone(6,3));
        threeDList.add(new Cylinder(8,2));
        threeDList.add(new Cylinder(23,9));

    }

    private void doIt() {

        List <TwoDimensional> twoDList = new ArrayList<>();
        List<ThreeDimensional> threeDList = new ArrayList<>();

        fill2DList(twoDList);

        fill3DList(threeDList);

        System.out.println("---------- sumArea ----------\n"+sumArea(twoDList)+
                "\n---------- sumPerimeters ----------\n" +sumPerimeters(twoDList)+
                "\n---------- sumVolume ----------\n" +sumVolume(threeDList)+
                "\n---------- sumSurfaceArea ----------\n"+sumSurfaceArea(threeDList));




    }

    private double sumArea(List<TwoDimensional> twoDimensionalList){

        double areaSum = 0;

        for (TwoDimensional object : twoDimensionalList) {
            areaSum+=object.calculateArea();

        }
        return areaSum;

    }
    private double sumPerimeters(List<TwoDimensional> twoDimensionalList){

        double perimeterSum= 0;

        for (TwoDimensional object : twoDimensionalList) {
            perimeterSum+=object.calculatePerimeter();

        }
        return perimeterSum;
    }
    private double sumVolume(List<ThreeDimensional> threeDimensionalList){

        double volumeSum = 0;

        for (ThreeDimensional object : threeDimensionalList) {
            volumeSum+=object.calculateVolume();

        }
        return volumeSum;

    }

    private double sumSurfaceArea(List<ThreeDimensional> threeDimensionalList){

        double surfaceAreaSum = 0;

        for (ThreeDimensional object : threeDimensionalList) {
            surfaceAreaSum+=object.calculateSurfaceArea();

        }
        return surfaceAreaSum;

    }

}
