public class Square extends Shape 
{
    private final double width, length; //sides

    public Square() 
    {
        this(1,1);
    }
    public Square (double width, double length) 
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() 
    {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() 
    {
        // P = 2(w + l)
        return 2 * (width + length);
    }

}