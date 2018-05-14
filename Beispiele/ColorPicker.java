package beispiele;
import java.awt.Color;
import javax.swing.JColorChooser;
public class ColorPicker {
    public static void main(String[] args) {
        Color ausgewaehlteFarbe = JColorChooser.showDialog(null, "Farbauswahl", null);
        System.out.println(ausgewaehlteFarbe);        
    }
}

