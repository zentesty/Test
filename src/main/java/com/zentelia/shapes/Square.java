package com.zentelia.shapes;

/**
 * Created by martin-pierreroy on 2017-02-27.
 */
public class Square implements ZenShapes {

    protected int m_nSize = 0;

    public Square() {

    }

    public int setSize(int nSize)
    {
        m_nSize = nSize;
        return nSize * nSize;
    }

    public int getSize() {
        return m_nSize;
    }
}
