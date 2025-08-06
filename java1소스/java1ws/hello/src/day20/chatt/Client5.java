package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client5 {
	
	Socket socket; 
	//보조 스트림
	DataInputStream dis;
	DataOutputStream dos;
	
	Scanner sc = new Scanner( System.in); 
	
	
	
	
	public Client5() {
		// TODO Auto-generated constructor stub
		
		try {
			socket = new Socket("localhost", 6100);
			dis = new DataInputStream( socket.getInputStream());
			dos = new DataOutputStream ( socket.getOutputStream());	
			
			
			//보내기
			sendMsg();
			
			//받기
			
			recvMsg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	private void sendMsg() {
		// TODO Auto-generated method stub
		
	
		try {
			String sendMsg  = sc.nextLine();
			dos.writeUTF(sendMsg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private void recvMsg() {
		// TODO Auto-generated method stub
     try {
		String msg=	dis.readUTF();
		System.out.println(msg);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public static void main(String[] args) {		 
		
		new Client5();

	}

}
