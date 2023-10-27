import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumTest {
	int a[]=new int[5];

	@Test
	public void test() {
		Assert.assertEquals(9, MaxNum.max(a));
	}

}

  
 