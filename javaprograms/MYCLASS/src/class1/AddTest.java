package class1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddTest 
{
	@Test
	void test()
	{
		JunitClass junit=new JunitClass();
		int result=junit.add(10,10);
		assertEquals(200,result);
	}
}
