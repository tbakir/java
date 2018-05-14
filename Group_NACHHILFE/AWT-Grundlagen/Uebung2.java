
package awt.grundlagen;

import java.awt.*;
public class Uebung2
extends Frame
{

    public static void main(String[] args) 
    {
        Uebung2 wnd = new Uebung2();
    }
    
    public Uebung2()
    {
        super("Rechteckfolge");
        addWindowListener(new WindowClosingAdapter(true));
        setBackground(Color.lightGray);
        setSize(700,500);
        setLocation(100,100);
        setVisible(true);        
    }
        
    @Override
    public void paint(Graphics g)
    {
        int x = 120;
        int y = 80;
        int sizex = 0;
        int sizey = 0;
        
        while (x < 480 && y < 380)
        {
            sizex = 4 + (int)(Math.random()*9);
            if (Math.random() > 0.5)
            {
                y += sizey;
                sizey = 4 + (int)(Math.random()*11);
            }
            else
            {
                sizey = 4 + (int)(Math.random()*11);
                y -= sizey;
            }
            g.drawRect(x,y,sizex,sizey);
            x += sizex;
        }
    }
    
}
