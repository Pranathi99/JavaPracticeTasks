package Threads;

public class ThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 dm1=new Demo1();
		dm1.start();
		Thread td=new Thread(new Demo2());
		td.start();
	}

}

class Demo1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=20;i++)
		{
			Utils.printMessage(""+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
}

class Demo2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i++)
		{
			Utils.printMessage(""+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
	
}