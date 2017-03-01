package com.zentelia.shapes;

/**
 * Created by martin-pierreroy on 2017-03-01.
 */
public class Triangle implements ZenShapes{

    protected int m_height = 0;

    public int getSize() {
        return m_height;
    }

    public int setSize(int nSize) {

        m_height = (nSize / 3) * 2;
        return m_height;
    }
}
