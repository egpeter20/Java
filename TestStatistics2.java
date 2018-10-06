/*
* Part1.(TestStatistics)
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
		JOptionPane.showMessageDialog(null, out);
		// display objectCount
	}
}
