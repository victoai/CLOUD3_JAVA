package day17;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
ArrayList<Score> list = new ArrayList<>();
		
		
		
		list.add(new Score("홍길동",100));
		list.add(new Score("홍길동",90));		
		list.add(new Score("홍길동",100));		
		list.add(new Score("홍길동",100));
		
		
		Runnable a  = new Runnable() {

			@Override
			public void run() {
				  try {
					 Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  list.add( new Score("aaa",100));
				
			}};
			
			Runnable b=new Runnable() {

			@Override
			public void run() {
				  try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  list.add( new Score("bbb",100));
				
			}};
			
			Thread t  = new Thread( a);
			Thread t2 = new Thread (b);
			
			t.start();
			t2.start();
			
			
			
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("=====>");
			for( Score s: list) {
				System.out.println(s);
			}
			

	}

}
