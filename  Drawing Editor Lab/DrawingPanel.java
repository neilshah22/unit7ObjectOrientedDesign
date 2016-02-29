import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        this.shapes = new ArrayList<Shape>();
        
        this.currentDrawingColor = Color.BLUE;
    }
    
    public Color getColor()
    {
        return Color.WHITE;
    }
    
    public Demension getPreferredSize()
    {
        Dimension wasd = new Demansion(getPreferredSize);
        
    }
}