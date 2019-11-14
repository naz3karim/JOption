
import javax.swing.*;//importing all libraries of swing for user interface
public class Project0 {//making class

	public static void main(String[] args) {//declaring main,Program runs from there
		// TODO Auto-generated method stub
		while (true) {//infinite loop it runs until user type stop
		JFrame jfrme = new JFrame("Input");//initializing Jframe title with input
		String sentence = JOptionPane.showInputDialog(jfrme, "Please enter a sentence.");//binding input dialog with frame
	    if (sentence.equalsIgnoreCase("Stop")!=true ) {//it will run when user do not enter "stop" keyword
		int count_upper_E=0;//delaring variable for counting upper case
		int count_lower_e=0;//delaring variable for counting lower case
		for(int i=0;i<sentence.length();i++) {//for loop to iterate over the sentence string
			if (sentence.charAt(i)=='E') {//going over each character and check its upper case or not
				count_upper_E=count_upper_E+1;//adding 1 if its upper case E
			}
			else if (sentence.charAt(i)=='e') {////going over each character and check its lower case or not
				count_lower_e=count_lower_e+1;//adding 1 if its lower case e
			}
		}
		//adding 2 strings and converting integer to string and adding next line in between.
		String message="Number of lower case e's:"+String.valueOf(count_lower_e)+"\nNumber of upper case e's:"+String.valueOf(count_upper_E);
		JFrame jfrme1 = new JFrame("Message");//declaring title and initialize jframe
		JOptionPane.showMessageDialog(jfrme1, message);//showing message 
		}
	    else {
	    	System.exit(0);//program stops
	    }
	    }
		
	    
	}

}
