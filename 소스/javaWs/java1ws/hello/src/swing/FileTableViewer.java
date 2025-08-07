package swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTableViewer extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton loadButton;

    public FileTableViewer() {
        setTitle("파일 읽기 및 테이블 표시");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 테이블 초기화
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // 버튼 추가
        loadButton = new JButton("파일 열기");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadFile();
            }
        });

        // 레이아웃 설정
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(loadButton, BorderLayout.SOUTH);
    }

    private void loadFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            System.out.println(  file);
            readFile(file);
        }
    }

    private void readFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            tableModel.setRowCount(0);  // 기존 데이터 초기화
            tableModel.setColumnCount(0);

            boolean firstRow = true;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // CSV 형식 가정

                if (firstRow) {
                    tableModel.setColumnIdentifiers(data); // 첫 줄은 컬럼명으로 사용
                    firstRow = false;
                } else {
                    tableModel.addRow(data);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "파일을 읽는 중 오류 발생!", "오류", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FileTableViewer().setVisible(true));
    }
}
