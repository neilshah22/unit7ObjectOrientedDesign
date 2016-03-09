import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Color;

public class ControlPanel extends JPanel
{
    private Color currColor;
    
    private DrawingPanel canvas;
    
    private JPanel colorSquare;
    
    private JButton colorSelect;
    private JButton addCircle;
    private JButton addRectangle;
    public ControlPanel(DrawingPanel canvas)
    {

        colorSelect = new JButton("Select Color");
        colorSelect.setPreferredSize(new Dimension(150, 50));
        this.add(colorSelect);
        
        currColor = canvas.getColor();
        
        colorSquare = new JPanel();
        colorSquare.setBackground(currColor);
        colorSquare.setPreferredSize(new Dimension(50, 50));
        this.add(colorSquare);
        
        addCircle = new JButton("Add Circle");
        addCircle.setPreferredSize(new Dimension(150, 50));
        this.add(addCircle);
        
        addRectangle = new JButton("Add Rectangle");
        addRectangle.setPreferredSize(new Dimension(150, 50));
        this.add(addRectangle);
        
        

        ClickListener listener = new ClickListener();
        colorSelect.addActionListener(listener);
        
        addCircle.addActionListener(listener);
        
        addRectangle.addActionListener(listener);
        
        
        this.canvas = canvas;
    }

    public class ClickListener implements ActionListener
    {
        public ClickListener()
        { 
        }
        
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals("Select Color"))
            {
                canvas.pickColor();
                System.out.println("Select Color");
                currColor = canvas.getColor();
                colorSquare.setBackground(currColor);
            }
            
            else if (event.getActionCommand().equals("Add Circle"))
            {
                canvas.addCircle();
                System.out.println("Add Circle");
            }
            
            else if (event.getActionCommand().equals("Add Rectangle"))
            {
                canvas.addSquare();
                System.out.println("Add Rectangle");
            }
            
            else
            {
                System.out.println("error");
            }
            canvas.repaint();
        }
    }
    
}