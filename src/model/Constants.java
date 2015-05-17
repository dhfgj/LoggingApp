package model;

import javafx.util.Duration;

public class Constants {
	public static final boolean debug = false;
	public static final double volumeGain = 0.1;
	public static Duration rewindGain = new Duration(5000); //5 seconds
	public static Duration fastforwardGain = new Duration(5000);
	public static Double playbackRate = new Double(1.0);
	public static final int displayTimeDigits = 8; //how many digits is displayed in the timeStamp (decimal counts as a digit)
	public static String nullPath = "@@@@@@@@@@@@@";
	
	public enum FileAction {
		OPEN, SAVE, SAVE_AS, NEW
	}
}
