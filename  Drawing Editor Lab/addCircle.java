import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

public class addCircle extends Shape
{
    private Ellipse2D.Double circle;
    

    public addCircle(Point2D.Double inputCenter, double inputRadius, Color inputColor)
    {
        super(inputCenter, inputRadius, inputColor);
        addCircle = new Ellipse2D.Double(inputCenter.getX() - inputRadius, inputCenter.getY() - inputRadius, 2*inputRadius, 2*inputRadius);
    }

    public boolean isInside(Point2D.Double point)
    {
        addCircle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        return circle.contains(point);
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        addCircle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        double compRadius = this.getRadius() * .85;
        Ellipse2D.Double comparator = new Ellipse2D.Double(this.getCenter().getX() - compRadius, this.getCenter().getY() - compRadius, 2*compRadius, 2*compRadius);
        return circle.contains(point) && !comparator.contains(point);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        addCircle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        g2.setColor(this.getColor());
        g2.draw(circle);
        if (filled)
        {
            g2.fill(circle);
        }
    }
}
