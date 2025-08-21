import java.io.*;
import java.util.*;
public class ReverseString
{
public static void main(String args[])
{
String str="Hello_ ______World";
String[] words=str.split(" ");
StringBuilder result=new StringBuilder();
for(String word : words)
{
StringBuilder sb=new StringBuilder(word);
result.append(sb.reverse().toString()).append(" ");
}
System.out.print(result.toString().trim());
}
}
