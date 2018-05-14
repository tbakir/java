
package awt.grundlagen;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Beispiel2 
{
    public static void main(String[] args) 
    {
        Frame wnd = new Frame("Fenster schliessen jetzt moeglich");
        wnd.addWindowListener(new WindowClosingAdapter(true));
        wnd.setSize(1000,800);
        wnd.setVisible(true);
    }
    
}
