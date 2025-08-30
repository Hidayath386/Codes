import java.io.*;
import java.util.*;
public class Large
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={10,20,39,40,50};
int lar=arr[0];
int slar=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>lar)
slar=lar;
lar=arr[i];
}
System.out.println(slar);
}
}
