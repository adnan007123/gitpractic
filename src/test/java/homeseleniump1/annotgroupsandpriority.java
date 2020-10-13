package homeseleniump1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotgroupsandpriority {
	  @BeforeClass
	  public void beforeClass() {
	 System.out.println("beforeclass");
	  }

  @Test(groups = {"abc"},priority = 2)
  public void a() {
	  System.out.println("method a");
  }
  @Test(groups = {"abcd"},priority = 0)
  public void b() {
	  System.out.println("method ab");
  }
  @Test (groups = {"bc1"},priority = 1)
  public void c() {
	  System.out.println("method ac");
  }
  @Test(groups = {"c1"},priority = 3)
  public void d() {
	  System.out.println("method ad");
  }
  @Test(groups = {"qc"},priority = 4)
  public void e() {
	  System.out.println("method ae");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aftyerclass");
	  System.out.println("aftyerclass1");
	  System.out.println("aftyerclass2");
	  System.out.println("commited by gitxs2");
	  System.out.println("aftyergitxs22");
	  
	  
	  System.out.println("working oon develop branch");

  }



}
