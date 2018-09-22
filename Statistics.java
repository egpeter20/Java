// The main class for the TestStatistics.java
package as6;

import java.util.Arrays;

public class Statistics {
	private double [] data; // Declaration an array in Java
	private double [] sdata;
	
	// Treat the public as a void.
	public Statistics(double[] d) {
		
		/*
		data = new double [d.length];
		System.arraycopy(d, 0, data, 0, d.length);
		*/
		
		data = d.clone();
		sdata = sdata.clone();
		Arrays.sort(sdata);
	};
	public double findMin() {
		double min;
		min = sdata[0];
		return min;
	}
	
	public double findMax() {
		double max;
		max = sdata[sdata.length-1];
		return max;
	}
	public double findMean(){
		double sum=0;
		
		for(int i=0; i < sdata.length; i++) {
			sum += sdata[i];
		}
		double avg = sum /sdata.length;
		return avg;
	}
	public double findMedian() {
		int loIndexMid, hiIndexMid, indexMid;
		double median;
		
		if ((sdata.length%2) == 0) { // Even case
			hiIndexMid=sdata.length/2;
			loIndexMid=hiIndexMid-1;
			median = (sdata[loIndexMid]+sdata[hiIndexMid])/2.0;
		}
		else {
			indexMid = sdata.length/2;
			median = sdata[indexMid];
		}
		return median;
	}
	public double [] findOrigData() {
		double [] origData;
		origData = data.clone();
		return origData;
	}
	public double [] findSortedData() {
		double [] sortedData;
		sortedData = sdata.clone();
		return sortedData;
	}
}
