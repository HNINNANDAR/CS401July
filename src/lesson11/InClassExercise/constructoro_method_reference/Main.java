package lesson11.InClassExercise.constructoro_method_reference;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main extends JFrame {
    public Main() throws HeadlessException {
        super("My Window");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        //create a vbutton
//        JButton jButton = new JButton("OK");
//        add(jButton);
        List<String> labelsForBtn = List.of("OK","CANCEL","CLEAR");
        labelsForBtn.stream()
//                .map(data -> new JButton(data));
                .map(JButton::new)
                .forEach(data -> add(data));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Main().setVisible(true));
    }
}
