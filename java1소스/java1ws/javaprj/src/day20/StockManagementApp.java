package day20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StockManagementApp {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    // 화면 1: 주식 목록을 보여주는 패널
    private JPanel panel1;
    // 화면 2: 주식 구매하는 패널
    private JPanel panel2;
    
    // 주식 데이터를 저장할 ArrayList
    private ArrayList<String> stockList;
    
    public StockManagementApp() {
        stockList = new ArrayList<>();  // 주식 목록 초기화
        
        frame = new JFrame("주식 관리 프로그램");
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // 화면 1: 주식 목록 화면
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        // 주식 목록을 표시할 JTextArea
        JTextArea stockTextArea = new JTextArea(10, 30);
        stockTextArea.setEditable(false);
        updateStockList(stockTextArea);  // 주식 목록 갱신
        JScrollPane scrollPane = new JScrollPane(stockTextArea);
        panel1.add(scrollPane, BorderLayout.CENTER);
        
        // 주식 구매 버튼
        JButton goToPanel2Button = new JButton("주식 구매");
        goToPanel2Button.addActionListener(e -> cardLayout.show(cardPanel, "panel2"));
        panel1.add(goToPanel2Button, BorderLayout.SOUTH);

        // 화면 2: 주식 구매 화면
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        // 주식 선택 필드
        JTextField stockInputField = new JTextField(20);
        panel2.add(stockInputField, BorderLayout.CENTER);

        // 수량 입력 필드
        JTextField quantityInputField = new JTextField(20);
        panel2.add(quantityInputField, BorderLayout.NORTH);

        // 뒤로가기 버튼
        JButton backButton = new JButton("뒤로가기");
        backButton.addActionListener(e -> cardLayout.show(cardPanel, "panel1")); // 뒤로가기 버튼 클릭 시 panel1로 돌아감
        panel2.add(backButton, BorderLayout.SOUTH);

        // 주식 구매 버튼
        JButton purchaseButton = new JButton("주식 구매");
        purchaseButton.addActionListener(e -> {
            String stockName = stockInputField.getText();
            String quantityText = quantityInputField.getText();
            if (!stockName.isEmpty() && !quantityText.isEmpty()) {
                try {
                    int quantity = Integer.parseInt(quantityText);
                    stockList.add(stockName + " - " + quantity + "주");  // 주식 목록에 구매한 주식 추가
                    updateStockList(stockTextArea);  // 주식 목록 갱신
                    stockInputField.setText("");  // 입력 필드 초기화
                    quantityInputField.setText("");  // 수량 필드 초기화
                    cardLayout.show(cardPanel, "panel1");  // 주식 목록 화면으로 돌아가기
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "수량을 숫자로 입력하세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel2.add(purchaseButton, BorderLayout.EAST);

        // 카드 패널에 화면 추가
        cardPanel.add(panel1, "panel1");
        cardPanel.add(panel2, "panel2");

        // JFrame 설정
        frame.add(cardPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // 주식 목록을 갱신하는 메소드
    private void updateStockList(JTextArea stockTextArea) {
        StringBuilder stockListText = new StringBuilder();
        for (String stock : stockList) {
            stockListText.append(stock).append("\n");
        }
        stockTextArea.setText(stockListText.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StockManagementApp());
    }
}
