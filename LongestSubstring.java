import java.io.*;
import java.util.*;
public class LongestSubstring
{
public static int longestsubstring(String s)
{
int left=0;
int maxlength=0;
Set<Character> set =new HashSet<>();
for(int right=0;right<s.length();right++)
{
char c=s.charAt(right);
while(set.contains(c))
{
set.remove(s.charAt(left));
left++;
}
set.add(c);
maxlength=Math.max(maxlength,right-left+1);
}
return maxlength;
}
public static void main(String args[])
{
String s="abcabcd";
System.out.print("longest sub string:"+longestsubstring(s));
}
}