package com.timcheng.LookupSum;

public class ConsoleOutput implements OutputInterface {
	public void outputResult(int[] sources, int left, int right) {
		System.out.printf("index: %d, %d; value: %d %d\n", left, right, sources[left], sources[right]);
	}

	
}
