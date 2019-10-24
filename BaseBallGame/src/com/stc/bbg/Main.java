package com.stc.bbg;

public class Main {

	public static void main(String[] args) {
		final int NO_COUNT = 3;
		
		int[] randomNoArray = new int [NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		//0~0.9999999999
		
		
		for( int i = 0; i< NO_COUNT; i++)
		{
			int randomValue = (int)(Math.random() * 9) + 1;	
			
			for(int j=0; j < i+1; j++ )
			{
				if(randomNoArray[j] == randomValue)
				{
					i--;
					break;
				}
				else if(randomNoArray[j]==0)
				{
					randomNoArray[j] = randomValue;
					break;
					}
			}
			System.out.printf("randomNoArray[%d] : %d\n",i,randomNoArray[i]);
		}
		
			
			

	}
}
		/* 무식 반복
		for(int i=0; i < NO_COUNT; i++)  
		{
			randomValue = (int)(Math.random() * 9) + 1;			
			randomNoArray[i] = randomValue; 
			if(i>0) {
				if(randomNoArray[i] == randomNoArray[i-1])
				{
					i--;
				}
			}
			if(i>1)
			{
				if(randomNoArray[i] == randomNoArray[i-2])
				{
					i--;
				}
			}			
		}
		*/

