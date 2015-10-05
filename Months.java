import javax.swing.JOptionPane;
public class Months {
public enum MONTH {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) {
			MONTH[] choices = {MONTH.January, MONTH.February, MONTH.March, MONTH.April, MONTH.May, MONTH.June, MONTH.July, MONTH.August, MONTH.September, MONTH.October, MONTH.November, MONTH.December};
MONTH select = (MONTH) JOptionPane.showInputDialog(null, "Choose a month", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
		while (select!=null) {
			switch (select) {
				case January:
				select = (MONTH) JOptionPane.showInputDialog(null, "Do you wanna build a snowman?", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case February:
				select = (MONTH) JOptionPane.showInputDialog(null, "Do you wanna build a snowman?", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case December:
				select = (MONTH) JOptionPane.showInputDialog(null, "Do you wanna build a snowman?", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case May:
				select = (MONTH) JOptionPane.showInputDialog(null, "Happy Spring Days!", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case April:
				select = (MONTH) JOptionPane.showInputDialog(null, "Happy Spring Days!", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case March:
				select = (MONTH) JOptionPane.showInputDialog(null, "Happy Spring Days!", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case June:
				select = (MONTH) JOptionPane.showInputDialog(null, "It is now the time of summer.", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case July:
				select = (MONTH) JOptionPane.showInputDialog(null, "It is now the time of summer.", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case August: 
				select = (MONTH) JOptionPane.showInputDialog(null, "It is now the time of summer.", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case September:
				select = (MONTH) JOptionPane.showInputDialog(null, "Welcome to the months of dead leaves on the road", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case October:
				select = (MONTH) JOptionPane.showInputDialog(null, "Welcome to the months of dead leaves on the road", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				case November:
				select = (MONTH) JOptionPane.showInputDialog(null, "Welcome to the months of dead leaves on the road", "MONTH", JOptionPane.CANCEL_OPTION, null, choices, choices[11]);
				break;
				default:																	
				}
			}
		}
	}
