package Practise;

import java.util.Scanner;

public class Convert_DecimalToRoman {
	 
private static String toRoman(int num) {
String[] ch = { "M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I" };
int[] val = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
String result = "";
 
for (int i = 0; i < val.length; i++) {
int numberInPlace = num / val[i];
if (numberInPlace == 0) 
{
	continue;
}
result += numberInPlace == 4 && i > 0? ch[i] + ch[i - 1]:
new String(new char[numberInPlace]).replace("\0",ch[i]);
num = num % val[i];
}
return result;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number : ");
int decimal = scanner.nextInt();
System.out.println(toRoman(decimal));
}
 
}