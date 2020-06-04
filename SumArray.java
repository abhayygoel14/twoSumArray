package myproject3;
import java.util.*;
public class SumArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int givenNumber[]= new int[size];
		System.out.print("Given number:");
		for(int i=0;i<size;i++) {
			givenNumber[i]=sc.nextInt();
		}
		System.out.print("target:");
		int target=sc.nextInt();
		int sum=0;
		for(int k=0;k<givenNumber.length;k++) 
		{
			for(int j=givenNumber.length-1;j>0;j--)
			{
				sum =givenNumber[k]+givenNumber[j];
				if(sum == target) 
				{
					  System.out.println(k+","+j);
					  System.exit(0);
			}
		}
	}
}

}
