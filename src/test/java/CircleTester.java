import com.zentelia.shapes.Circle;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;


/**
 * Created by martin-pierreroy on 2017-03-01.
 */
public class CircleTester {

    public void InitializeSquare()
    {
        System.out.println("MP - - BEFORE TEST");

    }

    @Test()
    public void testCircleSize()
    {
        Circle myCircle = new Circle();

        Assert.assertTrue(myCircle.setSize(212) < 10);

    }


    public void freeSquare()
    {
        System.out.println("MP - - BEFORE TEST");

    }
}
