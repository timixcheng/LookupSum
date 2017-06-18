package com.timcheng.LookupSum;
import java.util.*;
public class MethodMap implements MethodInterface {

	public void Invoke(int[] sources, int target, OutputInterface output) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0; i<sources.length; i++){
			hm.put(sources[i], i);
		}
		for (int i=0; i<sources.length; i++){
			if (sources[i] <= target/2 && hm.containsKey(target - sources[i])){
				output.outputResult(sources, i, hm.get(target-sources[i]));
			}
		}
	}

}
