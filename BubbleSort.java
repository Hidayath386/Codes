import java.io.*;
import java.util.*;
public class BubbleSort
{
public static void bubble(int[] arr)
{
int n=arr.length;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
public static void main(String args[])
{
int[] arr={11,32,23,45,65,45};
for(int num : arr)
{
System.out.print(num+ " ");
}
bubble(arr);
System.out.println(" ");
for(int num : arr)
{
System.out.print(num+ " ");
}
}
}