package java11;

import java.util.ArrayList;
import java.util.Arrays;

public class quest3 {
public static void main(String args[])
{
	String s="A quick brown fox jumps over the lazy dog";
	
	ArrayList<String> arr=new ArrayList<>(Arrays.asList(s.split(" ")));
	System.out.println(arr);
}
}
