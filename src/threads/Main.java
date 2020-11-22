package threads;

class PrintDemo {
private int i;
   public void printCount() {
	 
	   
      try {
         for (i = 5; i > 0; i--) {
            System.out.println("Selected number is: "  + i );
         }
      } catch (Exception e) {
         System.out.println("Thread has been interrupted.");
      }
   }
public int getI() {
	return i;
}
}

class ThreadDemo implements Runnable {
   private Thread thread;
   private String threadName;
   PrintDemo printDemo;

   ThreadDemo(String threadName, PrintDemo printDemo) {
      this.threadName = threadName;
      this.printDemo = printDemo;
   }
   
   public void run() {
      printDemo.printCount();
      System.out.println("Thread " +  threadName + " finishing.");
   }

   public void start () {
      System.out.println("Starting " +  threadName);
      if (thread == null) {
         thread = new Thread (this, threadName);
         thread.start ();
      }
   }
}

public class Main {
   public static void main(String args[]) {

      PrintDemo printDemo = new PrintDemo();

      ThreadDemo firstThread = new ThreadDemo("Thread 1", printDemo);
      ThreadDemo secondThread = new ThreadDemo("Thread 2", printDemo);

      try {
    	  System.out.println("first i: " + printDemo.getI());
         firstThread.start();
         System.out.println("second i: " + printDemo.getI());
         secondThread.start();
      } catch( Exception e) {
         System.out.println("Interrupted");
      }
      
      try {
		Thread.sleep(1);
		System.out.println("Third i: " + printDemo.getI());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
   }
}