import com.zentelia.shapes.Square;

import org.testng.IInvokedMethod;
import org.testng.ITestResult;
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
        Square mySquare = new Square();

        Assert.assertTrue(mySquare.setSize(212) < 10);
    }



    public void freeSquare()
    {
        System.out.println("MP - - AFTER TEST");

    }



}
