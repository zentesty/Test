import com.zentelia.shapes.Square;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;


/**
 * Created by martin-pierreroy on 2017-03-01.
 */
public class SquareTester {

    public void InitializeSquare()
    {
        System.out.println("MP - - BEFORE TEST");
    }

    @Test()
    public void testRight() throws Exception {
        System.out.println("MP - - TestRight");
        Assert.assertEquals(true, false);

    }

    @Test()
    public void testSquareSize()
    {
        Square mySquare = new Square();

        Assert.assertTrue(mySquare.setSize(212) < 10);

    }


    public void freeSquare()
    {
        System.out.println("MP - - BEFORE TEST");

    }

}
