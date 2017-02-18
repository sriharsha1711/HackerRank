import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String []args){
		Stack<Character> s= new Stack<Character>();
		Scanner in= new Scanner(System.in);
		int q=in.nextInt();
		while(q>0){
			String input=in.next();
			boolean match=true;
			for (int i=0;(i<input.length() && match==true);i++){
				if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{'){
					s.push(input.charAt(i));
				    
				}
				else if ((!s.isEmpty())&&((input.charAt(i)==')' && s.peek()=='(') || (input.charAt(i)==']' && s.peek()=='[') || (input.charAt(i)=='}' && s.peek()=='{'))){
					s.pop();
				
			}
				else match=false;
			}
			if((match==true)&& (s.isEmpty()))System.out.println("YES");
			else System.out.println("NO");
			q--;
            s.clear();
		}
		in.close();
	}
}

