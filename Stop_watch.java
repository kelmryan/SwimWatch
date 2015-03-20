Enter file contents here
import java.text.DecimalFormat;

public class Stop_Watch {
	private static int second = 0;
	private static int tenthSecond = 0;
	private static final int SECOND = 10;
	
	public void SecondCounter(){
		DecimalFormat fmt = new DecimalFormat("00");
		tenthSecond++;
		if(tenthSecond == SECOND)
		{
			second++;
			System.out.println(second);
		}
		
	}
	//TODO need to create a GUI using JFRAME or JSwing
	//TODO Create Intervals and Multipliers for the intervals
	//TODO Timer option that can count down
	//TODO SPlit taker during sets
	//TODO Create Lane interface to display multiple instances of specific lanes and their sets
	
}
