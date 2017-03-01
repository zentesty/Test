package com.zentelia.shapes;

/**
 * Created by martin-pierreroy on 2017-03-01.
 */
public class Circle implements ZenShapes {

    protected int m_diameter = 0;

    public Circle() {
    }

    public int setSize(int nSize) {
        m_diameter = nSize * 6;
        return m_diameter;
    }

    public int getSize() {
        return m_diameter;
    }
}
