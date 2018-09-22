// This program compute a number of statistics for a set of data provided by the user and get and display their min, max, avg, and median 

package as6;

import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		String in, out;
		
		// input array length
		in=JOptionPane.showInputDialog("Enter data size: ");
		int dataLength = Integer.parseInt(in);
		
		// Create the array
		double [] data = new double[dataLength];
		
		// Populate the array
		for(int i = 0; i < dataLength; i++) {
			in=JOptionPane.showInputDialog("Enter data iteams: ");
			data[i]= Double.parseDouble(in);
		}
		
		// Create a statics of  objects
		Statistics stat = new Statistics(data);
		double[] origData = stat.findOrigData();
		double[] sortedData = stat.findSortedData();
		double min=stat.findMin();
		double max=stat.findMax();
		double avg=stat.findMean();
		double median=stat.findMedian();
		
		// Build Output
		out = "\nOriginal Data:\n";
		out += origData[0];
		
		for(int i=0; i<origData.length; i++) {
			out = out+", " + origData[i];
		}
		// Build Output
		out += "\nSorted Data:\n";
		out += sortedData[0];
		
		for(int i=1; i<sortedData.length; i++) {
			out=out+", " + sortedData[i];
		}

		out +="\nMin: "+min+"\n";
		out +="Max: "+max+"\n";
		out +="Mean: "+avg+"\n";
		out +="Median: "+median+"\n";
		JOptionPane.showMessageDialog(null, out);
	}
}
