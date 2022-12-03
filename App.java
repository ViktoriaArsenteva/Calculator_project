import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class App extends JFrame{
    public float result = 0;
    public float calc(String operation,float x1, float x2){
        float res = 1;
        if (operation == "+") res = x1 + x2;
        if (operation == "-") res = x1 - x2;
        if (operation == "*") res = x1 * x2;
        if (operation == "/") res = x1 / x2;
        if (operation == "°") {
            for (int j = 0;j<x2;j++){ 
                res *= x1;
            }
        }
        if (operation == "!") {
            for (int j = 1; j<=x1;j++){
                res *= j;
            }
        }
        if (operation == "√") {
        Double x_2 = Double.parseDouble(Float.toString(x2));
        Double x_1 = Double.parseDouble(Float.toString(x1));
        x_1 = 1/x_1;
        Double result = Double.parseDouble(Float.toString(res));
        result = Math.pow(x_2, x_1);
        res *= result;
        }
        return res;
    }
    public App(){
        setTitle("Калькулятор");
        JPanel buttons = new JPanel();
        JPanel mainPanel = new JPanel();
        JLabel res = new JLabel("result");
        JTextField x1 = new JTextField(4);
        JTextField x2 = new JTextField(4);
        String operations[] = new String[]{"+", "-", "*", "/","°","!","√"};
        
        for (int i = 0; i<operations.length;i++){
            JButton oper = new JButton(operations[i]);
            oper.setPreferredSize(new Dimension(100,50));
            buttons.add(oper);
            String op = operations[i];
            oper.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    Float x_1 = Float.parseFloat(x1.getText());
                    Float x_2 = Float.parseFloat(x2.getText());
                    result = calc(op, x_1, x_2);
                    if (op == "!"){
                        res.setText(String.valueOf(x_1) + " " + op + " " + " = " +
                                String.valueOf(result));
                    }
                    else{
                    res.setText(String.valueOf(x_1) + " " + op + " " + 
                                String.valueOf(x_2) + " = " +
                                String.valueOf(result));
                    }
                    
                }
            });
        }

        
        GridLayout btns = new GridLayout(4,4);
        buttons.setLayout(btns);
        buttons.setSize(new Dimension(400,400));
        add(mainPanel);
        mainPanel.add(x1);
        mainPanel.add(x2);
        mainPanel.add(res);
        mainPanel.add(buttons);
        
        setPreferredSize(new Dimension(400,400));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
    
}
