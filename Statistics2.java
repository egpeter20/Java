import java.util.Arrays;

public class Statistics {
	private double [] data;
	private static double [] sdata;
	public static int count = 0;
	
	public Statistics(double[] d) {
		
		super();
		data = d.clone();
		sdata = d.clone();
		Arrays.sort(sdata);
		Statistics.count++;
	}
	
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
	
	public static double findMean() {
		double mean, sum = 0;
		for(int i=0; i<sdata.length; i++) {
			sum = sum+sdata[i];
		}
		mean = sum/sdata.length;
		return mean;
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
	
	public double [] getOrigData() {
		return data.clone();
	}
	public double [] getSortedData() {
		return sdata.clone();
	}
	
	public static double computeMin(double []d) {
		Statistics st = new Statistics(d);
		double min = st.findMin();
		return min;
	}
	
	public static double computeMax(double []d) {
		Statistics st = new Statistics(d);
		double max = st.findMax();
		return max;
	}
	
	public static double computeMean(double []d) {
		Statistics st = new Statistics(d);
		double mean = st.findMean();
		return mean;
	}
	
	public static double [] computeSortedData(double []d) {
		Statistics st = new Statistics(d);
		double [] sortedData= st.getSortedData();
		return sortedData;
	}
	
	public static double [] computeOrigData(double []d) {
		Statistics st = new Statistics(d);
		double [] origData= st.getOrigData();
		return origData;
	}
}
