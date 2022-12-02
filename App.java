import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

public class App extends JFrame{
    public int result = 0;
    public App(){
        setTitle("Калькулятор");
        JPanel panel = new JPanel();
        JButton plus = new JButton("+"); 
        JButton minus = new JButton("-"); 
        JButton multiply = new JButton("*"); 
        JButton divide = new JButton("/");
        JLabel res = new JLabel("result");
        JTextField x1 = new JTextField("1");
        JTextField x2 = new JTextField("2");
        plus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                result = x_1 + x_2;
                res.setText(String.valueOf(result));
            }
        });
        minus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                result = x_1 - x_2;
                res.setText(String.valueOf(result));
            }
        });
        multiply.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                result = x_1 * x_2;
                res.setText(String.valueOf(result));
            }
        });
        divide.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                result = x_1 + x_2;
                res.setText(String.valueOf(result));
            }
        });

        panel.setSize(new Dimension(500,500));
        add(panel);
        panel.add(res);
        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);
        panel.add(x1);
        panel.add(x2);
        setPreferredSize(new Dimension(600,600));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
    
}
