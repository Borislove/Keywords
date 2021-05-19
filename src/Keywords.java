import javax.swing.*;
import java.awt.*;

//текст String
public class Keywords {

    protected static JDesktopPane desktop;
    protected static int width = 850;
    protected static int height = 600;

    protected static int yLocationWindow = 30;

    protected static JFrame frame = new JFrame();

    public Keywords() {
        Container c = frame.getContentPane();
        desktop = new JDesktopPane();
        c.add(desktop);

        //setup window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setTitle("Keywords");
        frame.setLocationRelativeTo(null);
        //  setLayout(null);

        //класс  навигации
        this.desktop.add(new Navi().navigation);

        //класс текстового окна
        this.desktop.add(new TextWindow().textWindow);

        //класс настроек панели
        this.desktop.add(new SettingsPanel());

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new Keywords();
    }
}

