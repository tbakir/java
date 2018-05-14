
package awt_uebungen;

import java.awt.*;
public class MainMenu1 
extends MenuBar
{
    private MenuItem            miRueck;
    private CheckboxMenuItem    miFarbe;
    
    public MainMenu1()
    {
        Menu m;
        
        // Menu: Datei
        m = new Menu("Datei");
        m.add(new MenuItem("Neu"));
        m.add(new MenuItem("Laden"));
        m.add(new MenuItem("Speichern"));
        m.addSeparator();
        m.add(new MenuItem("Beenden"));
        add(m);
        
        // Menu: Bearbeiten
        m = new Menu("Bearbeiten");
        m.add(miRueck = new MenuItem("Rueckgaengig"));
        m.addSeparator();
        m.add(new MenuItem("Ausschneiden"));
        m.add(new MenuItem("Kopieren"));
        m.add(new MenuItem("Einfuegen"));
        m.add(new MenuItem("Loeschen"));
        add(m);
        
        // Menu: Optionen
        m = new Menu("Optionen");
        m.add(new MenuItem("Einstellungen"));
        m.add(miFarbe = new CheckboxMenuItem("Farbe"));
        add(m);
        
        // Rueckgaengig deaktivieren
        enableRueckgaengig(false);
        
        // Farbe anschalten
        
        setfarbe(true);
        
    }
    
    public void enableRueckgaengig(boolean ena)
    {
        if (ena)
        {
            miRueck.setEnabled(true);
        }
        else
        {
            miRueck.setEnabled(false);
        }
    }
    
    public void setfarbe(boolean on)
    {
        miFarbe.setState(on);
    }
}
