
package awt_uebungen1;

import  java.awt.*;
import  java.awt.event.*;

public class MyWindowListener
extends WindowAdapter
{
    private boolean exitSystem;
    
    public MyWindowListener(boolean exitSystem)  // Konstruktor
    {
        this.exitSystem = exitSystem;
    }
        
    public MyWindowListener()                   // Konstruktor
    {
        this(false);
    }
    
    public void windowClosing(WindowEvent event)  // Der wesentliche Teil
                                                  // des WindowListener
    {
        event.getWindow().setVisible(false);
        event.getWindow().dispose();
        if (exitSystem)
           System.exit(0);
    }
}
