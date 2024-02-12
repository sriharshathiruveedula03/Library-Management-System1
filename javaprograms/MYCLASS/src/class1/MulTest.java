package class1;
	
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MulTest 
{

	@Test
	void test()
	{
		JunitClass junit=new JunitClass();
		int result=junit.mul(10,5);
		assertEquals(50,result);
	}
}


