
package awt_uebungen1;

import  java.awt.*;
import  java.awt.event.*;

public class MyMouseListener
extends MouseAdapter
{
    public void mousePressed(MouseEvent event)
    {
         Frame source    = (Frame)event.getSource();
         MainFrameGUI.x = event.getX();
         MainFrameGUI.y = event.getY();
         Graphics g      = source.getGraphics();
         MainFrameGUI.DrawSmiley(g);
    }
}