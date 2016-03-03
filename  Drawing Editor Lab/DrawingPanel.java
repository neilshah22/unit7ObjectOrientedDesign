import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
impoet java.awt.geom.Ellipse
public class DrawingPanel
{
    private ArrayList<Shape>;
    private Shape activeShape;
    private boolean picked;
    private boolean movied;
    private boolean streched;
    private Color currentDrawingColor;
    
    public DrawingPanel()
    {
        this.setBackGround(colorWhite);
        
        MousePressListener pressListener = new MousePressListener();
        this.addMouseListener(pressListener);
        
        MouseMovementListner movementLisener = new MouseMovementListener();
        this.addMouseListener(movementListener);
        
        this.shapes = new ArrayList<Shape>();
        
        this.currentDrawingColor = Color.BLUE;
    }
    
    public Color getColor()
    {
        return Color.WHITE;
    }
    
    public Demension getPreferredSize()
    {
        Dimension wasd = new Dimension(1000, 750);
        return dimension;
    }
    public void pickColor()
    {
        JColorChooser colorChooser = new JColorChooser(Color.Blue);
    }
    
    public void addSquare()
    {
        double x = this.getPreferredSize().getWidth()/2;
        double y = this.getPrefferedSize().getHeight()/2;
        Point2D.Double center = new Point2D.Double(x,y);
        Random random = new Random();
        int lengh = random.nextInt();
        Square newSquare = new Square(center, lenght, this.currDrawingColor);
        this.shapes.add(newSquare);
    }
    
    public void addCircle()
    {
        double x = this.getPreferredSize().getWidth()/2;
        double y = this.getPreferredSize().getHeight()/2;
        Point2D.Double center = new Point2D.Double(x, y);
        Random random = new Random();
        int radius = random.nextInt();
        Circle newCircle = new Circle(center, radius, this.currDrawingColor);
        this.shapes.add(newCircle);
    }
    
    public class MousePressListner implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            activeShape = null;
            for (Shape shape : shapes)
            {
                if(shape.isInside(point))
                {
                    activeShape shape = shape;
                }
            }
        }
        
        public void mouseClicked(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
    
    public class MouseMotionListner implements MouseMotionListener
    {
        public void mouse(MouseEvent event)
        {
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            activeShape = null;
            for (Shape shape : shapes)
            {
                if(shape.isInside(point))
                {
                    activeShape shape = shape;
                }
            }
        }
        
        public void mouseClicked(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}


