import java.io.*;
import java.util.*;
public class InsertionSort
{
public static void insertion(int[] arr)
{
int n=arr.length;
for(int i=0;i<n;i++)
{
int key=arr[i];
int j=i-1;
while(j>=0 && arr[j]>key)
{
arr[j+1]=arr[j];
j--;
}
arr[j+1]=key;
}
}
public static void main(String args[])
{
int[] arr={12,6,43,23,67};
for(int num : arr)
{
System.out.print(num + " ");
}
insertion(arr);
System.out.println(" ");
for(int num : arr)
{
System.out.print(num + " ");
}
}
}