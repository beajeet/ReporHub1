package MyMavenGroupID.MyMavenProjectName;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	 System.out.println("smoke app test");
    }
    
    public void AppTest2( String testName )
    {
    	 System.out.println("2nd test case of smoke");
    }
    
    public void AppTest3( String testName )
    {
    	 System.out.println("3rd test case of smoke");
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}
