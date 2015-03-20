public class StopWatchMain {
    
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
   
    
    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    
    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    
    //elaspsed time in milliseconds
    public long getElapsedTime() {
        long elapsed;
        if (running) {
             elapsed = (System.currentTimeMillis() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
    
    
    //elaspsed time in seconds
    public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }
        else {
            elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }
    //sample usage
    public static void main(String[] args) {
    	int MIN , SEC = 0;
    	long MIL = 0;
    	long Milli = 0;
    	int Second = 0;
    	int Minute = 0;
        StopWatchMain s = new StopWatchMain();
        DecimalFormat fmt = new DecimalFormat("00");
        s.start();
        while(Second != 60)
        	{
        	Milli = s.getElapsedTime()/10;
        	if ( Milli >= 99)
            	{       			       		
        	    	Second = Second + 1;
        	    	s.start();
        	    	if (Second >= 59)
        	        	{
        	        		Minute = Minute + 1;
        	        		Second = SEC;
        	        	}
            	}
        	System.out.println("elapsed time : " + fmt.format(Minute) + ":" + fmt.format(Second) + "." + fmt.format(Milli));
        s.stop();
              }
}
