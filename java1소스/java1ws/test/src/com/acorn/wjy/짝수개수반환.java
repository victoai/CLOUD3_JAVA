package com.acorn.wjy;

public class 짝수개수반환 {

	public static int even(int num[]) {
		int cnt=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) 
				cnt++;
		}
		return cnt;
	}
	
}
	

