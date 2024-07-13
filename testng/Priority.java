package testng;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-1)
	public void startTheCar() {
		System.out.println("car started");
	}
	@Test(priority=-3,enabled=false)
	public void putFirstGear(){
		System.out.println("put first gear");
	}
	@Test(priority=-2,invocationCount=5)
	public void putSecondGear() {
		System.out.println("put second gear");
	}
	

}
