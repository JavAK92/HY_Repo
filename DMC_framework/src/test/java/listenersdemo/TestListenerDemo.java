package listenersdemo;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


@Listeners(listenersdemo.TestNGListeners.class)
public class TestListenerDemo {

	@Test
	public void test1()
	{
		
		System.out.println("I am in Test1");
		
		
	}
	@Test
	public void test2()
	{
		
		System.out.println("I am in Test2");
	}
	
	@Test
	public void test3()
	{
		
		
		System.out.println("I am in test3");
	}



	
	
	
	
	
	
	
	
}
