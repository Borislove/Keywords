import javax.swing.*;
import java.awt.*;

public class Navi extends JPanel {

    public static JList<String> listMenu = new JList<>(TextNavi.navigationString);
    protected static JInternalFrame navigation;

    Navi() {

        NaviPanel listMenu = new NaviPanel();
        //-----------------------------
        //навигация настройки окна
        navigation = new JInternalFrame("Ключевое слово", true, false, true, true);
        //Container nav = navigation.getContentPane();
        //  nav.setLayout(new FlowLayout());
        navigation.setSize(180, 530);
        navigation.setLocation(0, Keywords.yLocationWindow);
        navigation.setBackground(Color.white);
        navigation.add(listMenu);

        navigation.setVisible(true);
    }

    class NaviPanel extends JPanel {

        public NaviPanel() {
            listMenu.setLayout(null);
            listMenu.setBackground(Color.white);
            //-----------------------------
            //скроллинг навигации
            JScrollPane sp = new JScrollPane(listMenu);
            sp.setPreferredSize(new Dimension(140, 500));

            //слушатель события
            listMenu.addMouseListener(new ListenerNavi());
            add(sp);
        }
    }
}
