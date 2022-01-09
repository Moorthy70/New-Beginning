import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Passwordverify
{
String pass,Pass2;
public static void main(String args[])
{
Passwordverify j = new Passwordverify();
j.verify();
if(j.pass.equals(j.Pass2))
{
System.out.println("'Your Password changed successfully'. \nRemember your password "+"'"+j.Pass2 +"'");
}
else
{
System.out.println("Your Password doesn't change.\n Note this,\n   Your password must be atleast 7 characters.\n   Your password  first letter should be a Capital letter.\n   Your password should end with a 1 or more number(Max 5).\n   Your password should not contain any special characters and spaces.");
j.verify();
if(j.pass.equals(j.Pass2))
System.out.println("'Your Password changed successfully'. \nRemember your password "+"'"+j.Pass2 +"'");
else
System.out.println("Your password doesn'tchange.\n You have 0 attempts left.\n Please try some other time.");
}
}
private void verify()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter your Password :");
 pass =in.next();
Pattern p=Pattern.compile("[A-Z][a-z]{5,8}[0-9]{1,5}");
Matcher m = p.matcher(pass);
Pass2 ="";
while(m.find())
{
Pass2 =Pass2+m.group();
} 
}
}
