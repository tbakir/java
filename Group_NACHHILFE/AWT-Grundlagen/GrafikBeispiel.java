
package awt.grundlagen;

import java.awt.*;
import java.awt.event.*;

public class GrafikBeispiel 
extends Frame
{

    public static void main(String[] args) 
    {
        GrafikBeispiel wnd = new GrafikBeispiel();
    } 
    
    public GrafikBeispiel()
    {
        super("GrafikBeispiel");
        addWindowListener(new WindowClosingAdapter(true));
        setBackground(Color.lightGray);
        setSize(1000,800);
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        g.drawLine(100,100,500,100);
    }
}
