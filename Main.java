import javax.swing.*;
import java.awt.*;
import vistas.LoginPanel;

public class Main {
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        // Banner
        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(300, 800));
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner, BorderLayout.WEST);

        // LoginPanel
        LoginPanel loginPanel = new LoginPanel();
        miVentana.add(panelBanner, BorderLayout.WEST);

        // Mostrar
        miVentana.setVisible(true);
    }
}
