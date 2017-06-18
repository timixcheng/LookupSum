package com.timcheng.LookupSum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int max = 100;
		int length = 100;
		int [] sources = generateNumbers(length, max);
		int target = (int) (Math.random() * max * 2 + 1);
		
		System.out.println("target:" + target);
		System.out.println("original:");
		for (int i=0; i < sources.length; i++)
			System.out.print(sources[i] + " ");
		
		MethodInterface methodSort = new MethodSort();
		System.out.println("Sort Method:");
		RunMethod(methodSort, sources, target);
		MethodInterface methodMap = new MethodMap();
		System.out.println("HashMap Method:");
		RunMethod(methodMap, sources, target);
    }
    
    private static void RunMethod(MethodInterface method, int[] sources, int target){
    	long startTime = System.currentTimeMillis();
		method.Invoke(sources, target, new ConsoleOutput());
		long stopTime = System.currentTimeMillis();
		System.out.printf("Done. Used time: %dms", stopTime - startTime);
    }
    
    private static int[] generateNumbers(int length, int max){
		int[] buffer = new int[length];
		
		for(int i = 0; i < length; i++){
			buffer[i] = (int) (Math.random()* max + 1);
		}
		return buffer;
	}
}
