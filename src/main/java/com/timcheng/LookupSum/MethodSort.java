package com.timcheng.LookupSum;

import java.util.Arrays;

public class MethodSort implements MethodInterface {
public void Invoke(int[] sources, int target, OutputInterface output){
		// sort the array, then iterate head from start to end, and tail from end to start, calculate the head + tail
		Arrays.sort( sources );

		int head = 0, tail = sources.length-1;
		while (head < tail && head >= 0 && tail < sources.length){
			int sum = sources[head] + sources[tail];
			if (sum > target)
				tail -= 1; // decrease tail
			else if (sum < target)
				head += 1; // increase head
			else{
				output.outputResult(sources, head, tail);
				head+=1;
				tail -=1;
			}
		}
	}
}
