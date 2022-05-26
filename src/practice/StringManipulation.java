package practice;

public class StringManipulation {

public static void main(String aa[])
{
String text="The rain have started here";
String text1="The rain have started here";
System.out.println(text.length());

System.out.println(text.indexOf('r')+"---- position of r ");
System.out.println(text.charAt(5)+"----char at position 5");
System.out.println(text.indexOf('r',text.indexOf('r')+1));

System.out.println(text.substring(0, 10));
}
}

