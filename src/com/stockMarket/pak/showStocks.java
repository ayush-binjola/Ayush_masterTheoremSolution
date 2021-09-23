package com.stockMarket.pak;

public class showStocks {
	
public  void binarySearching(Double []arr,int left,int right,Double key)	
{
	int mid;
	mid = (left + right)/2;
	while(left<=right)
	{
		if(arr[mid] < key)
		{
			left = mid+1;
		}
		else if(arr[mid] == key)
		{
				System.out.println("Stock of value"+ key +"is present ");
		}
		else
		{
			right = mid -1;
		}
		mid = (right + left)/2;
		
	}
	if(left>right)
	{
		System.out.println("Element not present");
	}
}
	
	

 public void merge(Double arr[],int left,int right,int ch)
 {
	 int mid;
	
	 if(left<right)
	 {
		 mid = (left + (right-1))/2;
		 merge(arr,left,mid,ch);
		 merge(arr,mid+1,right,ch);
		 mergesort(arr,left,mid,right,ch);
	 }
 }

public void mergesort(Double[] arr, int left, int mid, int right, int ch) {
	int len1 = mid-left+1;
	int len2 = right-mid;
	Double leftArr[] = new Double[len1];
	Double rightArr[] = new Double[len2];
	for(int i=0;i<len1;i++)
	{
		leftArr[i] = arr[left + i];
	}
	for(int j=0;j<len2;j++)
	{
		rightArr[j]= arr[mid+j+1];
	}
	int i=0;
	int j=0;
	int k=left;
	if(ch == 1)
	{
		while(i < len1 && j < len2)
		{
			if(leftArr[i] <= rightArr[j])
			{
				arr[k]=leftArr[i];
				i++;
			}else
			{
				arr[k]= rightArr[j];
				j++;
			}
			k++;
		}
		while(i<len1)
		{
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<len2)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		
		
	}
	if(ch == 0){
	

		while(i < len1 && j < len2)
		{
			if(leftArr[i] >= rightArr[j])
			{
				arr[k]=leftArr[i];
				i++;
			}else
			{
				arr[k]= rightArr[j];
				j++;
			}
			k++;
		}
		while(i<len1)
		{
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<len2)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		
	}
}
}
