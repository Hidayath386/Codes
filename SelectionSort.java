import java.io.*;
import java.util.*;
public class SelectionSort
{
public static void sort(int[] arr)
{
int n=arr.length;
for(int i=0;i<n-1;i++)
{
int minindex=i;
for(int j=i+1;j<n;j++)
{
if(arr[j]<arr[minindex])
{
minindex=j;
}
}
int temp=arr[minindex];
arr[minindex]=arr[i];
arr[i]=temp;
}
}
public static void main(String args[])
{
int[] arr={11,5,56,67,89,9,23};
System.out.println(" ");
for(int num : arr)
{
System.out.print(num + " ");
}
sort(arr);
System.out.println(" ");
for(int num : arr)
{
System.out.print(num + " ");
}
}
}
