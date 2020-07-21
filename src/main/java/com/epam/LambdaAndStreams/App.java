package com.epam.LambdaAndStreams;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IntStream list = IntStream.of(100,200,300,400); 
    	OptionalDouble var = list.average(); 
		if (var.isPresent()) { 
			System.out.println(var.getAsDouble()); 
		} 
		else { 
			System.out.println("-1"); 
		} 

    }
}
