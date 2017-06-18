package com.timcheng.LookupSum;

public class OutputItem {
	public int LeftIndex;
	public int LeftValue;
	public int RightIndex;
	public int RightValue;
	
	public OutputItem(int leftIndex, int rightIndex, int leftValue, int rightValue){
		LeftIndex = leftIndex;
		LeftValue = leftValue;
		RightIndex = rightIndex;
		RightValue = rightValue;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
	        return false;
	    }
		if (obj instanceof OutputItem) {
			OutputItem t = (OutputItem) obj;
			return LeftIndex == t.LeftIndex && LeftValue==t.LeftValue && RightIndex ==t.RightIndex && RightValue == t.RightValue;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return LeftIndex + LeftValue + RightIndex + RightValue;
	}
}
