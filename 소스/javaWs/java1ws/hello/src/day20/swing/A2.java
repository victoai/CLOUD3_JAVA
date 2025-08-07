package day20.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class A2 extends JFrame {

    private JButton btnPlus;

    public A2() {
        btnPlus = new JButton("Plus");
        add(btnPlus, BorderLayout.SOUTH);

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnPlus.equals(e.getSource())) {
                    System.out.println("버튼 클릭");
                    //JOptionPane.showMessageDialog(A2.this, "버튼이 클릭되었습니다!", "알림", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setTitle("test");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A2();
    }
}
