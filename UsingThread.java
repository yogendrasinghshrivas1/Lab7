
//Write a program to prints numbers from 0 to 4 using thread

package Lab7;

public class UsingThread extends Thread {
	
	    private int start;
	    private int end;

	    public UsingThread(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }

	    @Override
	    public void run() {
	        for (int i = start; i <= end; i++) {
	            System.out.println(Thread.currentThread().getName() + ": " + i);
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	    	
	    	UsingThread uth = new UsingThread(0, 2);
	    	UsingThread uth1 = new UsingThread(3, 4);
	    	uth.start();
	    	uth1.start();
	    	
			
		}
		

}

	
	


