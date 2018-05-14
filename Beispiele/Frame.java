package beispiele;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Frame {
    public static void main(String[] args) {
        JFrame meinFrame = new JFrame("Beispiel JFrame");
        meinFrame.setSize(500,500);
        meinFrame.add(new JLabel("Beispiel JLabel"));
        meinFrame.setVisible(true);        
    }
}