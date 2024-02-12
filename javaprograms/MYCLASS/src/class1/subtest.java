package class1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class subtest 
{
	@Test
	void test()
	{
		JunitClass junit=new JunitClass();
		int result=junit.sub(10,5);
		assertEquals(5,result);
	}
}
