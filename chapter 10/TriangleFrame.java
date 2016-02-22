import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TriangleFrame
{
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 750;

    private TriangleComponent scene;    
    
    public TriangleFrame()
    {
        
        this.scene = new TriangleComponent();
        
        MousePressListener listener = new MousePressListener();
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main( String[] args )
    {
        TriangleFrame frame = new TriangleFrame();
    }
    
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
        }
        
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}
