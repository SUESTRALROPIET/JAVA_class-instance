import javax.swing.JOptionPane;

public class AuthApp5_1 {

	public static void main(String[] args) {
		
		String[][] users = {
				{"egoing", "1111"},
				{"jinhyuck", "2222"},
				{"youbin", "3333"},
				{"sue", "4444"},
				{"jake", "1234"}				
		};
				
		String inputId = JOptionPane.showInputDialog("Enter a ID");
		 
		boolean CorrectId = false;
		boolean CorrectPass = false;

		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputId)) {
				CorrectId = true;
				
				String inputPass = JOptionPane.showInputDialog("Enter a Password");
				if(current[1].equals(inputPass)) {
					CorrectPass = true;
					break;
				}
			}
		}
		
		if(CorrectId && CorrectPass) {
			System.out.println("Welcome, " + inputId);
		}
		else if(CorrectId) {
			System.out.println("Incorrect Password");
		}
		else
			System.out.println("Incorrect ID");
	}
}