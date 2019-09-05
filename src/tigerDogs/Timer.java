/*
package tigerDogs;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ll {
    public static void main(String[] args) {
        JFrame frame = new JFrame("规则");
        Container ct = frame.getContentPane();
        JPanel panel = new JPanel();
        JButton button = new JButton("规则");
        panel.add(button);
        ct.add(panel);
        frame.setVisible(true);
        String rule="1、本棋供两人玩，四周摆猎犬，中间摆虎.\n"+"" +
                "2、由猎犬先走，双方每次只走一步。猎犬不能吃虎，只能围逼虎至陷井致死或当猎犬仅剩四只时把虎围至任何角落无法走动致死，猎犬可在陷井走动 。\n"+
                "3、当两只猎犬在一条线上，中间空位时，老虎走入中间，可以吃掉两边一对猎犬"+
                "(但如果猎犬走动形成这种局面时，虎不能吃掉两边猎犬）。老虎吃到只剩两只猎犬时算胜。";
        frame.setSize(300, 200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, rule, "规则",JOptionPane.ERROR_MESSAGE);
            }
        });
        frame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });}
}
*/
