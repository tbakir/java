
package awt_uebungen1;

import  java.awt.*;
import  java.awt.event.*;

public class MainFrameGUI 
extends Frame
{
    public static int x;
    public static int y;
    
    public MainFrameGUI (MyMouseListener cmd1, MyWindowListener cmd2)
    {
        super("Smiley Creator");
        setSize(1000,800);
        setLocation(100,100);
        setVisible(true);
        addMouseListener(cmd1);
        addWindowListener(cmd2);
    }
    
    public static void DrawSmiley(Graphics g)
    {
       g.drawOval(x-10,y-10,20,20);
       g.fillRect(x-6,y-4,4,5);
       g.fillRect(x+3,y-4,4,5);
       g.drawArc(x-7,y-7,14,14,225,100);
    }
}
