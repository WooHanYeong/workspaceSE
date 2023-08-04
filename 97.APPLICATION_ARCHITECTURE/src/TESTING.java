import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TESTING extends JFrame {

    public TESTING() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Hotel Reservation Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(523, 615);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);
        
        JButton btnNewButton = new JButton("New button");
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("New button");
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("New button");
        panel.add(btnNewButton_2);
        
        JPanel panel_1 = new JPanel();
        getContentPane().add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(new BorderLayout(0, 0));
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        panel_1.add(tabbedPane, BorderLayout.NORTH);
        
        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("New tab", null, panel_2, null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TESTING().setVisible(true);
            }
        });
    }
}