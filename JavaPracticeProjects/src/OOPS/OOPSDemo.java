package OOPS;

public class OOPSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung sm=new Samsung(false,true,false,6,100);
		System.out.println(sm.getRAM()+" "+sm.getStorage()+" "+Samsung.model);
	}

}

class Mobile{
	private boolean dualSim;
	private boolean hasCamera;
	private boolean isSmartPhone;

	Mobile(boolean dualSim,boolean hasCamera, boolean isSmartPhone){
		this.dualSim=dualSim;
		this.hasCamera=hasCamera;
		this.isSmartPhone=isSmartPhone;
	}
}

class Samsung extends Mobile{
public static String model="Samsung";
private int ram,storage;
	Samsung(boolean dualSim, boolean hasCamera, boolean isSmartPhone,int ram,int storage) {
		super(dualSim, hasCamera, isSmartPhone);
		this.ram=ram;
		this.storage=storage;
		// TODO Auto-generated constructor stub
	}
	
	int getRAM()
	{
		return this.ram;
	}
	int getStorage()
	{
		return this.storage;
	}
}