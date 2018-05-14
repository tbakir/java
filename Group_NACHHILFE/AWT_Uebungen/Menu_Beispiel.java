
package awt_uebungen;

import java.awt.*;
public class Menu_Beispiel 
extends Frame
{

    public static void main(String[] args) 
    {
        Menu_Beispiel wnd = new Menu_Beispiel();
    }    
    
    public Menu_Beispiel()
    {
            super("Menues");
            setLocation(100,100);
            setSize(1000,700);
            setMenuBar(new MainMenu1());
            setVisible(true);
            addWindowListener(new WindowClosingAdapter(true));
    }
}
