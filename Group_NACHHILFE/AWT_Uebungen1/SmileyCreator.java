
package awt_uebungen1;

import  java.awt.*;
import  java.awt.event.*;

public class SmileyCreator 
{
    // Implementation unter Verwendung von Entwurfsmuster 3:
    // Trennung von GUI- und Anwendungscode
    
        
    public static void main(String[] args) 
    {
        MyMouseListener  cmd1 = new MyMouseListener();
        MyWindowListener cmd2 = new MyWindowListener();
        
        MainFrameGUI     gui  = new MainFrameGUI(cmd1, cmd2);
            
    }
}
