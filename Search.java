import java.io.*;
import java.util.*;
public class Search
{
public static int LinearSearch(int arr[], int tar)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i] == tar)
{
System.out.println("element found at index:" + i);
return i;
}
}
System.out.println("element not found");
return -1;
}
public static void main(String args[])
{
int arr[]={10,45,67,87,90};
int tar=90;
LinearSearch(arr, tar);
}
}
