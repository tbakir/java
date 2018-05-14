package beispiele;
import javax.swing.JDialog;
import javax.swing.JLabel;
public class Dialog {
    public static void main(String[] args) {
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("Mein JDialog Beispiel");
        meinJDialog.setSize(200,200);
        meinJDialog.setModal(true);
        meinJDialog.add(new JLabel("Beispiel JLabel"));
        meinJDialog.setVisible(true);
    }
}
