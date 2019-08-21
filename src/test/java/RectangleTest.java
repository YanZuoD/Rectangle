import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testRectangleMethod() {
        Double length = 12.6;
        Double width = 12.7;
        Rectangle rectangle = new Rectangle(length,width);
        Assert.assertTrue(rectangle.getArea() == length*width);
        Assert.assertTrue(rectangle.getCircumference() == 2*(length+width));
    }
}
