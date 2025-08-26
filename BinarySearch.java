import java.io.*;
import java.util.*;
public class BinarySearch
{
public static int binarysearch(int[] arr,int x)
{
int left=0,right=arr.length-1;
while(left<=right)
{
int mid=(left+right)/2;
if(arr[mid]==x)
{
return mid;
}
else if(arr[mid]<=x)
{
left=mid-1;
}
else
{
right=mid+1;
}
}
return -1;
}
public static void main(String args[])
{
int[] arr={12,23,34,56,67,87,89,97,123};
int x=89;
int result=binarysearch(arr,x);
if(result==-1)
{
System.out.print("Element not found:");
}
else
{
System.out.println("element found: at "+ result);
}
}
}
