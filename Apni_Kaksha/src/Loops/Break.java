package Loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		for(;;)
		{
			int t=s.nextInt();
			if(t<0)
				break;
		}
	}

}
