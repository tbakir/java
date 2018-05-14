package beispiele;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
public class FileChooser {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        // Erzeugung eines neuen Frames mit dem Titel "Dateiauswahl"
        JFrame meinJFrame = new JFrame("Dateiauswahl");
        // Wir setzen die Breite auf 450 und die Höhe 300 pixel
        meinJFrame.setSize(450,300);
        // Hole den ContentPane und füge diesem unseren JFileChooser hinzu      
        meinJFrame.getContentPane().add(chooser);
        // Wir lassen unseren Frame anzeigen
        
//chooser.setDialogType(JFileChooser.SAVE_DIALOG);        
        
        
        meinJFrame.setVisible(true);
    }
}

