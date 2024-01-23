//Isaac Abeyta, 1/16/24, Chapter 1 Web Assist Assignment 1
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Random {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Type a number between 1 and 10");
		String user_number = userinput.nextLine();
		JOptionPane.showMessageDialog(null,"You said" + user_number);
		JOptionPane.showMessageDialog(null,"The number is "+(1 + (int)(Math.random() * 10)));
	}

}
