package com.zentelia.app;

import com.zentelia.shapes.Circle;
import com.zentelia.shapes.Square;
import com.zentelia.shapes.ZenShapes;

/**
 * Created by martin-pierreroy on 2017-02-26.
 */
public class MyMainApp {


    public static void main(String[] args) {
        int nRet;

        Square pSquare = new Square();
        nRet = pSquare.setSize(16);

        System.out.println("ZenTestApp Main in -> " + nRet);

        ZenShapes zShape = new Circle();
        zShape.setSize(133);
        System.out.println("Circle size is -> " + zShape.getSize());

    }
}
