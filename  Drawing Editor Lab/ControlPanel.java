import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
public class ControlPanel extends JPanel
{
    
    private JButton pickColorButton;
    private JPanel currentColorDisplay;
    private JButton addCircleDisplay;
    private JButton addRectngleDisplay;
    private JLabel label;
    public ControlPanel(DrawingPanel canvas)
    {
        
        this.pickColorButton = new JButton("Pick a Color");
        this.panel.add(this.button);
        
        this.addCircleDisplay = new JButton("Add a Circle");
        this.panel.add(this.button2);
        
        this.addRectangleDisplay = new JButton("Add a Rectangle");
        this.panel.add(this.button3);
        
        this.label = new JLabel();
        this.panel.add(this.panel);
        
        
        ClickListener listener = new ClickListener();
        this.button.addActionListener(listener);
        this.button2.addActionListener(listener);
        this.button3.addActionListener(listener);
        
        frame.setSize(Frame_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main( String [] args )
    {
        ButtonViewer view = new ButtonViewer();
    }
    
}
        