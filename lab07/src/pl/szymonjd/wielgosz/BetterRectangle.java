package pl.szymonjd.wielgosz;
import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height)
    {
        this.setLocation(x, y);
        this.setSize(width, height);
    }

    public double getPerimeter()
    {
        return 2 * this.width + 2 * this.height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }
}
