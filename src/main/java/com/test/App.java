package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	test(101, 200);
    }
    
    
    public static void  test(int a, int b){
    	List<Integer> list = new ArrayList<Integer>();
    	int i, j;
    	for(i = a; i <= b; i++ ){
    		int m = (int)Math.sqrt(i);
    		for(j = 2; j <= m; j++){
    			if(i%j == 0){
    				break;
    			}
    		}
    		if(j > m){
				list.add(i);
    		}
    	}
    	
    	System.out.print("101-200间总共有" + list.size() + "个素数，分别是：");
    	for(int k: list){
    		System.out.print(k + ", ");
    	}
    }
}
