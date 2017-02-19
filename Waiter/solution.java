import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String [] args){
    	Scanner in=new Scanner(System.in);
    	int init=in.nextInt();
    	int iter=in.nextInt();
    	int k=1;
    	boolean flag=false;
    	Stack<Integer> seven= new Stack<Integer>();
    	Stack<Integer> sodd= new Stack<Integer>();
    	Stack<Integer> s=new Stack<Integer>();
    	for(int i=0;i<init;i++){
    		seven.push(in.nextInt());
    	}
    	

    	for(int i=1;i<=iter;i++){
    		
    		k=ithprime(k);
    		if(i%2==1){
    		    for(int j=seven.size();j>0;j--){
    		        if(seven.peek()%k==0)s.push(seven.pop());
    		        else sodd.push(seven.pop());
    		       }
    		    flag=false;
    		    }
    		else if(i%2==0){
    			for(int j=sodd.size();j>0;j--){
    			    if(sodd.peek()%k==0)s.push(sodd.pop());
        		    else seven.push(sodd.pop());
    			   }
    			flag=true;
    		   }
    		    while(!s.isEmpty())
    		    System.out.println(s.pop());
    	       
    	}
    	if(flag==false){
    		while(!sodd.isEmpty())
    		    System.out.println(sodd.pop());
    	}
    	else {
    		while(!seven.isEmpty())
    		    System.out.println(seven.pop());
    	}
    	in.close();

    }

    static int ithprime(int k){
    	while(true){
    		if(isPrime(++k))return k;
    	}

    }
    static boolean isPrime(int num){
    	for(int i=2;i*i<=num;i++){
    		if(num%i==0)return false;

    	}
    	return true;
    }
}