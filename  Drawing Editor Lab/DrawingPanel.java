import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapes;
    private Shape activeShape;
    
    private Color currColor;
    
    private Dimension dim;
    

    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        
        currColor = Color.BLUE;
        
        shapes = new ArrayList<Shape>();
        
        dim = new Dimension(1000, 800);
        
        this.addMouseListener(new Listener());
        this.addMouseMotionListener(new Listener());
    }
    
    public Color getColor()
    {
        return currColor;
    }
    
    public Dimension getPreferredSize()
    {
        return dim;
    }
    
    public void pickColor()
    {
        currColor = JColorChooser.showDialog(this, "Pick Color", currColor);
    }
    
    public void addCircle()
    {
        shapes.add(new Circle(new Point2D.Double(600, 350), 25, currColor));
    }
    
    public void addSquare()
    {
        shapes.add(new Square(new Point2D.Double(600, 350), 25, currColor));
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Shape shp: shapes)
        {
            shp.draw(g2, activeShape == null? true: (!(activeShape == shp)));
        }
    }
    
    public class Listener implements MouseListener, MouseMotionListener
    {
        private boolean found;
        
        public void mouseClicked(MouseEvent event){}
        
        public void mousePressed(MouseEvent event)
        {
            found = false;
            for(Shape shp: shapes)
            {
                if (shp.isInside(new Point2D.Double(event.getX(), event.getY())))
                {
                    found = true;
                    activeShape = shp;
                }            
            }
            
            if(!found)
            {
                activeShape = null;
            }
            
            repaint();
        }
        
        public void mouseReleased(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        
        public void mouseDragged(MouseEvent event)
        {
            activeShape.move(event.getX(), event.getY());
            repaint();
        }
        
        public void mouseMoved(MouseEvent event){}
    }
}