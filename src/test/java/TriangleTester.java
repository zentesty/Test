import com.zentelia.shapes.Triangle;
import com.zentelia.shapes.ZenShapes;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by martin-pierreroy on 2017-03-01.
 */
public class TriangleTester {

    public void InitializeSquare()
    {
        System.out.println("MP - - BEFORE TEST");
    }

    @Test()
    public void testRight() throws Exception {
        Triangle myTriangle = new Triangle();

        Assert.assertTrue(myTriangle.setSize(155) < 10);
    }



    public void freeSquare()
    {
        System.out.println("MP - - AFTER TEST");

    }
}
