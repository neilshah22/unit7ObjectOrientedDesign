import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControlPanel extends JPanel
{
    private JFrame frame;
    private JButton pickColorButton;
    private JPanel mainPanel;
    private JButton addCircleDisplay;
    private JButton addRectangleDisplay;
    private JLabel label;
    public ControlPanel(DrawingPanel canvas)
    {
        
        this.pickColorButton = new JButton("Pick a Color");
        this.mainPanel.add(this.pickColorButton);
        
        this.addCircleDisplay = new JButton("Add a Circle");
        this.mainPanel.add(this.addCircleDisplay);
        
        this.addRectangleDisplay = new JButton("Add a Rectangle");
        this.mainPanel.add(this.addRectangleDisplay);
        
        this.label = new JLabel();
        this.mainPanel.add(this.label);
        
        this.frame = new JFrame();
        this.mainPanel.add(this.frame);
        
        ClickListener listener = new ClickListener();
        this.pickColorButton.addActionListener(listener);
        this.addCircleDisplay.addActionListener(listener);
        this.addRectangleDisplay.addActionListener(listener);
        
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main( String [] args )
    {
 
    }
    public class ClickListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event )
        {
            label.setText( "Button" + event.getActionCommand() +" was clicked!" );
        }
    }
}
        