// TestStatistics.java
/*
* This program inputs decimal numbers as a String separated by commas/spaces, 
* then it separates them into tokens one at a time.
* It converts each token received (as String) into a double
* and stores it in the corresponding array data element
**/

import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStatistics {
	
	public static void main(String[] args) {
		String in, out;
		in = JOptionPane.showInputDialog("Enter data seprated by comma");
		String delim = ",";
		StringTokenizer stk = new StringTokenizer(in, delim);
		int itemCount = stk.countTokens();
		double [] x = new double [itemCount];
		for(int i=0; i<x.length; i++) {
			String token= stk.nextToken().trim();
			x[i]=Double.parseDouble(token);
		}
		
		Statistics stat = new Statistics (x);
		double []origData = stat.getOrigData();
		double []sortedData = stat.getSortedData();

		double min = stat.findMin();
		double max = stat.findMax();
		double mean = stat.findMean();
		double median = stat.findMedian();
		
		double min2 = Statistics.computeMin(x);
		double max2 = Statistics.computeMax(x);
		double mean2 = Statistics.computeMean(x);
		double [] sortedData2 = Statistics.computeSortedData(x);
		
		double objectCount = Statistics.count;
		String pattern = ".0000";
		// Build output
		DecimalFormat df = new DecimalFormat(pattern);
		out="";
		
		out+="Original Data:"+"\n";
		out+=origData[0];
		for(int i=1; i<origData.length;i++) {
			out+=", "+origData[i];
		}
		out+="\n";
		
		out+="Sorted Data:"+"\n";
		out+=sortedData[0];
		for(int i=1; i<sortedData.length;i++) {
			out+=", "+sortedData[i];
		}
		out+="\n";
		
		out+="Min:"+df.format(min2)+"\n";
		out+="Max:"+df.format(max2)+"\n";
		out+="Mean:"+df.format(mean2)+"\n";
		out+="Median:"+df.format(median)+"\n";
		out+="The Total Number of Statistics objects created during execution: " + objectCount;

		JOptionPane.showMessageDialog(null, out);
		// display objectCount
	}
}

// Statistics
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
