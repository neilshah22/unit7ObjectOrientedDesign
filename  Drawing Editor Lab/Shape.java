import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;

    public Shape(Point2D.Double inputCenter, double inputRadius, Color inputColor)
    {
        center = inputCenter;
        radius = inputRadius;
        color = inputColor;
    }

    public Point2D.Double getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;
    }

    public void move(double x, double y)
    {
        center = new Point2D.Double(x, y); 
    }

    public void setRadius(double r) 
    {
        radius = r;
    }

    public Color getColor()
    {
        return color;
    }

    abstract boolean isInside(Point2D.Double point);
    abstract boolean isOnBorder(Point2D.Double point);
    abstract void draw(Graphics2D g2, boolean filled);
}