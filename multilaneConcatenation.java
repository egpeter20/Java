import javax.swing.JOptionPane; // Library

public class Message {

	public static void main(String[] args) {
		
		String out;
		out="Today is a good day.\n";
		out=out + "I am learning Java programming.\n";
		out=out + "It’s a lot of fun.\n";
		JOptionPane.showMessageDialog (null, out);
	}
}
