package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버


public class Server5 {

	ServerSocket serverSocket;   //서버용 소켓
	Socket clientSocket;	    // 클라이언트와 통신할 소켓 
	
	
	 //보조스트림  (소켓의 기반스트림에서 사용할)
	 //
	DataInputStream dis;
	DataOutputStream dos;	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public Server5() {
		// TODO Auto-generated constructor stub
		
		
		
		   // 5000~9000 사이  사용
					try {
						serverSocket  = new ServerSocket(6100);
						System.out.println(" server waiting");
						clientSocket = serverSocket.accept();
						System.out.println("server start");
						String clientIp = clientSocket.getInetAddress().toString();
						
						
						System.out.println( "clientIp="+ clientIp ) ;
						// 
						dis = new DataInputStream( clientSocket.getInputStream());
						dos = new DataOutputStream ( clientSocket.getOutputStream());	
						
						
						
						
						//받기
						recvMsg();
						//보내기
						
						sendMsg();
						 
					} catch (IOException e) {
						// TODO Auto-generated catch block
						
					}  // 서버가 port 포트를 지정함 !!!
				
					
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
		// TODO Auto-generated method stub
		
		
		new Server5();

	}

}
