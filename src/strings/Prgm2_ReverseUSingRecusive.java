package strings;

import java.util.Scanner;

public class Prgm2_ReverseUSingRecusive {

	public static void reverse(String str){
		if(str.isEmpty())
		{
			return ;
		}
		else
			System.out.print(str.charAt(str.length()-1));
		 reverse(str.substring(0,str.length()-1));
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String s1=sc.next();
		sc.close();
		reverse(s1);
		
	}

}
