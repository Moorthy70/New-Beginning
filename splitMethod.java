import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class splitMethod
{
public void split(String s,char jl)
{
String jk ="";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)!=jl)
jk = jk+s.charAt(i);
else
jk=jk+" ";
}
int y = jk.length();
for(int r=0;r<y;r++)
{
if(jk.charAt(r)!=' ')
System.out.print(jk.charAt(r));
else
System.out.print(" \n");
}
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter your word or sentence");
String f =in.nextLine();
System.out.println("Enter the delimeter");
String hj = in.next();
char u=hj.charAt(0);
splitMethod j  = new splitMethod();
j.split(f,u);
}
}

