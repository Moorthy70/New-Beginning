import java.io.*;
import java.util.Scanner;
public class Binary
{
int y;
public static void main(String args[])
{
Binary jj = new Binary();
Binary.bubble j  = jj.new bubble();
j.sort();
int jh =j.search();
System.out.println(jh);
if(jh>0)
System.out.println("Yes,"+jj.y+" is Present in the Array.The No's position is "+jh);
else
System.out.println(jj.y + " is Not Present in the Array");
}
class bubble
{
int[] s ={2,4,1,6,4,8,4,9,3,75,100,34};
public void sort()
{
int h = s.length-1;
for(int  j =0;j<s.length;j++)
{
for(int i =0;i<h;i++)
{
if(s[i]>s[i+1])
{
int temp  =s[i];
s[i]=s[i+1];
s[i+1]=temp;
}
}
h--;
}
for(int y:s)
System.out.print("|"+y);
}
public int search()
{
Scanner in = new Scanner(System.in);
System.out.println("\nEnter the Number you want to search");
y = in.nextInt();
int mid=0,min=0,max=s.length-1;
while(min<=max)
{
mid=(min+max)/2;
if(y==s[mid])
{
return mid;
}
else if(y>s[mid])
{
min =mid+1;
}
else
{
max=mid-1;
}
}
return -1;
}
}
}

