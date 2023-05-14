package SandWich.BuilderPattern;

import javax.swing.*;

public class Pane {
	
	public static String abdulmalikPrint(String message){
		JOptionPane.showMessageDialog(null, message);
		return message;
	}
	public static String abdulmalikInput(String message){
		return JOptionPane.showInputDialog(message);
	}
	public static Object abdulmalikPrint(Object message){
		JOptionPane.showMessageDialog(null, message);
		return message;
	}
	public static int abdulmalikInput(int message){
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
}
