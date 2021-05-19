import javax.swing.*;
import java.awt.*;

public class TextWindow extends JPanel {

    protected static JInternalFrame textWindow;

    public static JTextArea textArea = new JTextArea();

    JScrollPane scrollPane = new JScrollPane(textArea);

    TextWindow() {

        //перенос строки
        textArea.setLineWrap(true);
        //шрифт, размер по умолчанию
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.green);
        //-----------------------------
        textWindow = new JInternalFrame("Назначение", true, false, true, true);
        textWindow.setSize(650, 530);
        textWindow.setLocation(181, Keywords.yLocationWindow);
        textWindow.setBackground(Color.white);

        this.add(scrollPane);

        textWindow.add(textArea);
        textArea.setEditable(false);

        textWindow.setVisible(true);
    }
}
