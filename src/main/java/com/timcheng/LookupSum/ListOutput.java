package com.timcheng.LookupSum;
import java.util.LinkedList;
public class ListOutput implements OutputInterface {
	private LinkedList<OutputItem> buffer;
	
	public ListOutput(){
		buffer = new LinkedList<OutputItem>();
	}

	public void outputResult(int[] sources, int left, int right) {
		buffer.add(new OutputItem(left, right, sources[left], sources[right]));
	}
	
	public LinkedList<OutputItem> GetResult(){
		return buffer;
	}

}
