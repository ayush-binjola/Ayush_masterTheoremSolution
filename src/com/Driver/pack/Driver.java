package com.Driver.pack;
import com.stockMarket.pak.*;
import java.util.Scanner;



public class Driver {
public static void main(String args[]) 
{
	showStocks show = new showStocks();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of companies");
	int stocks = sc.nextInt();
	Double Stock[] = new Double[stocks];
	int countIn=0,countDe=0;
	int choice;
	for(int i=0;i<Stock.length;i++)
	{
		System.out.println("Enter current stock price of the company " +(i+1));
		Stock[i] = sc.nextDouble();
		System.out.println("Whether company's stock price rose today compare to yesterday? ");
		Boolean b=sc.nextBoolean();
		if(b == true)
		{
			countIn++;
		}else
		{
			countDe++;
		}
		
	}
do {
	System.out.println("**********************************************");
	System.out.println("Enter the operation that you want to perform....... ");
	System.out.println("\n1.  Display the companies stock prices in ascending order \n2.  Display the companies stock prices in descending order \n3.  Display the total no of companies for which stock prices rose today \n4. Display the total no of companies for which stock prices declined today \n5. Search a specific stock price");
	 choice= sc.nextInt();

	switch(choice)
	{
	case 1:
		show.merge(Stock,0,Stock.length-1,1);
		for(int i=0;i<Stock.length;i++)
		{
			System.out.println(Stock[i]);
		}
		break;
	case 2:
		show.merge(Stock,0,Stock.length-1,0);
		for(int j=0;j<Stock.length;j++)
		{
			System.out.println(Stock[j]);
		}
		break;
	case 3:
		System.out.println("Total no of companies whose stock price rose today : "+countIn);
		break;
	case 4:
		System.out.println("Total no of companies whose stock price declined today :"+countDe);
		break;
	case 5:
		System.out.println("enter the key value");
		Double key = sc.nextDouble();
		show.binarySearching(Stock,0,Stock.length,key);
		break;
	default: 
		System.out.println("Please select valid option or press 0 to exit");
	}
}while(choice!=0);
sc.close();
}
}
