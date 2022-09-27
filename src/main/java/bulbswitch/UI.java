package bulbswitch;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Switch switche;
    private static JTextField textField = new JTextField();

    public UI(Switch switche) {
        this.switche = switche;
    }

    public void init() {
        JFrame frame = new JFrame("Lighbulb");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);
        /*
         *création des boutons de l'interface
         */
        JButton on = new JButton("on");
        on.addActionListener(e -> textField.setText(switche.getState().oN()));
        JButton off = new JButton("off");
        off.addActionListener(e -> textField.setText(switche.getState().oFF()));

        /*
         *ajout des boutons on et off sur l'interface UI
         */
        buttons.add(on);
        buttons.add(off);

        frame.setVisible(true);
        frame.setSize(300, 100);
    }
}
