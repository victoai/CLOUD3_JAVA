package day20.swing;

 

import javax.swing.*;
import java.awt.*;

public class CountdownFrame extends JFrame implements Runnable {
    private JLabel label;
    private JButton startButton;

    public CountdownFrame() {
        setTitle("카운트다운 예제");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        label = new JLabel("10", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));
        add(label);

        startButton = new JButton("Start Countdown");
        add(startButton);

        startButton.addActionListener(e -> {
            Thread thread = new Thread(this);
            thread.start();
        });

        setVisible(true);
    }

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            final int count = i;  // 람다식 사용을 위한 final 변수
            SwingUtilities.invokeLater(() -> label.setText(String.valueOf(count)));
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(this, "카운트다운 완료!", "알림", JOptionPane.INFORMATION_MESSAGE));
    }

    public static void main(String[] args) {
        new CountdownFrame();
        new CountdownFrame();
    }
}
