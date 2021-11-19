package java11;

interface cal{
	int sum(int x,int y);
}
public class quest2 {
public static void main(String args[])
{
	cal c=(var x,var y)->x+y;
	System.out.println(c.sum(2, 4));
	
}
}
