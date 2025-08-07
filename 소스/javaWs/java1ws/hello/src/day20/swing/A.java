package day20.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class A  extends JFrame implements ActionListener{

	 private JButton btnPlus;
	 
	 public A() {
		// TODO Auto-generated constructor stub
		    btnPlus = new JButton();
	        btnPlus.setText("Plus");
	        add(btnPlus, BorderLayout.SOUTH);
	        btnPlus.addActionListener(this);
	        
	        setTitle("test");
	        setSize(300,400);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//현재 발생한 이벤트의 정보를 얻어옴 , 누가 이벤트를 발생시켰는지를 알 수 있음 		
        if(btnPlus.equals(e.getSource())){    //
            
              System.out.println("버튼 클릭");     
            //  JOptionPane.showMessageDialog(this, "버튼이 클릭되었습니다!", "알림", JOptionPane.INFORMATION_MESSAGE);
        
          
        }
	}
	
	public static void main(String[] args) {
		new A();
	}

}
