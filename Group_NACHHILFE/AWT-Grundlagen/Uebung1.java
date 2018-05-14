
package awt.grundlagen;

import java.awt.*;
public class Uebung1
extends Frame
{
    public static void main(String[] args) 
    {
       Uebung1 wnd = new Uebung1();
    }
    
    public Uebung1()
    {
        super("Strichliste");
        addWindowListener(new WindowClosingAdapter(true));
        setBackground(Color.lightGray);
        setSize(700,500);
        setLocation(100,100);
        setVisible(true);        
    }
    
    @Override
    public void paint(Graphics g)
    {
        int x = 80;
        
        Color col = new Color(20,20,190);
        g.setColor(col);
        
        for (int i=0; i < 60; i++)
        {
            g.drawLine(x,40,x,100);
            x += 1 + 3*Math.random();
        }
        g.drawString("Das ist eine Strichliste",80, 150);
        
        col = new Color(180,10,10);
        g.setColor(col);
        
        g.drawRect(300,40,80,50);
        g.drawString("Das ist ein Rechteck, ", 300, 150);
    }
            
}
