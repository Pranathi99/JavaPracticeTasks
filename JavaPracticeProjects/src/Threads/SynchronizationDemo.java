package Threads;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m=new Monitor();
		MonitorWorker m1=new MonitorWorker(m);
		MonitorWorker m2=new MonitorWorker(m);
		m1.start();
		m2.start();
	}

}


class MonitorWorker extends Thread{
	
	Monitor mon;
	
	MonitorWorker(Monitor mon)
	{
		this.mon=mon;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		mon.greeting();
	}
}

class Monitor{
	void greeting() {
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				Utils.printMessage(""+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
