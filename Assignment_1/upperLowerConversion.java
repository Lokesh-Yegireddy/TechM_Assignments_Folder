// Upper to lower n vice versa

package Assignment_1;
import java.util.Scanner;
public class upperLowerConversion {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any String");
	String str=sc.next();
	String newstr="";
	char ch;
	 for (int i = 0; i < str.length(); i++) {
         ch = str.charAt(i);
       
         if (Character.isUpperCase(ch)) {
             ch = Character.toLowerCase(ch); 
         } else if (Character.isLowerCase(ch)) {
             ch = Character.toUpperCase(ch); 
         }
         newstr += ch; 
     }
	 System.out.print("Before Conversion : ");
	System.out.println(str);
	System.out.print("After Conversion : ");
	System.out.println(newstr);
}
}
