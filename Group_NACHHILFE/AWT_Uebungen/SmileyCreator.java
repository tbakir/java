package awt_uebungen;

import  java.awt.*;
import  java.awt.event.*;

public class SmileyCreator 
extends Frame                   
{
    // Implementation unter Verwendung von Entwurfsmuster 2: 
    // Einsatz lokaler Klassen
    
    public static void main(String[] args)   
    {
        SmileyCreator wnd = new SmileyCreator();    // Objekt vom Typ SmileyCreator
                                                    // erzeugen und damit auch ein
    }                                               // Fenster
    
    public SmileyCreator()
    {
        super("Smiley Creator");
        setSize(1000,800);
        setLocation(100,100);
        setVisible(true);
        addWindowListener(new MyWindowListener(true));
        addMouseListener(new MyMouseListener());
        
    }
    
    class MyMouseListener       // Lokale Klasse (Inner class)
    extends MouseAdapter        // Adapter-Klasse benutzen, somit muss nur die
                                // Methode mousePressed() ueberschrieben werden
    {
        public void mousePressed(MouseEvent event)  // Der wesentliche Teil des
                                                    // MouseListener
        {
            Graphics g = getGraphics();  // Universelles "Ausgabegeraet" fuer das  
                                         // Zeichnen erzeugen
            int x = event.getX();        // x-Koordinate des Mauszeigers zum
                                         // Zeitpunkt des Mouse Events
                                         // "Druecken einer Maustaste"
            int y = event.getY();        // y-Koordinate des Mauszeigers zum
                                         // Zeitpunkt des Mouse Events
                                         // "Druecken einer Maustaste"
            // Zeichnen des Smiley an Position x,y
            g.drawOval(x-10,y-10,20,20);       // Zeichnen Kopfform
            g.fillRect(x-6,y-5, 4,5);          // Zeichnen Augen
            g.fillRect(x+3, y-5,4,5);          // Zeichnen Augen          
            g.drawArc(x-7,y-7,14,14,225,100);  // Zeichnen Mund
        }
    }
    
    class MyWindowListener     // Lokale Klasse (Inner class)
    extends WindowAdapter      // Adapter-Klasse benutzen, somit muss nur die
                               // Methode windowClosing() ueberschreiben werden
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
}
