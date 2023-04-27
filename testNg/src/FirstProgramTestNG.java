import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstProgramTestNG {
	@Test
	public void testAdd() {
		String str = "TestNG is working properly";
		Assert.assertEquals("TestNg is working properly",str);

}
}