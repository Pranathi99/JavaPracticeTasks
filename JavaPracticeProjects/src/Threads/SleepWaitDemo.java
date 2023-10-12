package Threads;

public class SleepWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread td=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(this)
				{
					for(int i=1;i<=10;i++)
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
					this.notify();
				}
			}
		});
		td.start();
		synchronized(td)
		{
			try {
				td.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Done");
		}
	}

}
