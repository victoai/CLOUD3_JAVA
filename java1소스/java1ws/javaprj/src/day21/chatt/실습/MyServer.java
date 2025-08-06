package day21.chatt.실습;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버 
//서버소켓 


//클라이언트  - 서버  (1 : 1 채팅)  
public class MyServer {
	
	
	ServerSocket  serverSocket;  //서버소켓
	Socket  clienctSocket;   // 클라이언트와 통신할 소켓  (전화기역할- 기반스트림(나가는 통로, 들어오는 통로) // 
	                         // 바이트스트림입니다 
	
	
	
	//보조스트림 	
	DataInputStream dis;
	DataOutputStream dos;	
	Scanner sc = new Scanner( System.in);
	
	
	
	public MyServer() {
		
		                            //포트번호   ( 5000 ~9000사이)
		try {
			serverSocket =  new ServerSocket(6100);
			System.out.println("서버 기다리는 중");
			clienctSocket = serverSocket.accept();
			System.out.println("서버 start!!");			
			
			String clinetIp  =clienctSocket.getInetAddress().toString();
			
			dis  = new DataInputStream( clienctSocket.getInputStream()); //들어오는 길 
			dos  = new DataOutputStream( clienctSocket.getOutputStream());  // 나가는 길						
			
			//받기 			
			recvMsg();			
			//보내기
			
			sendMsg();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 
	}
	
	
	

	private void sendMsg() {
		// TODO Auto-generated method stub
		
		//
		Thread th  = new Thread(  new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					
					while(true) {				
						String msg = sc.nextLine();
						dos.writeUTF(msg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
		
		th.start();
		
		
		
		/*
		try {
			
			while(true) {				
				String msg = sc.nextLine();
				dos.writeUTF(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	} 


	private void recvMsg() {
		// TODO Auto-generated method stub
		
	Thread th  = new Thread( new Runnable() {

		@Override
		public void run() {
			try {
		    	 
		    	 while(true) {
						String msg =dis.readUTF();
						System.out.println( msg);
		    	 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}});
	
	
	th.start();
		
	/*	
     try {
    	 
    	 while(true) {
				String msg =dis.readUTF();
				System.out.println( msg);
    	 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	*/
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyServer s = new MyServer();
		

	}

}
