package class1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivTest 
{ 
	@Test
	void test()
	{
		JunitClass junit=new JunitClass();
		int result=junit.div(8,2);
		assertEquals(4,result);
	}
}