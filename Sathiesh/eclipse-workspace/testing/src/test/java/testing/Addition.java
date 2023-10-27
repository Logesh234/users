package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AddtionTest {

	@Test
	public void test() {
		org.junit.Assert.assertEquals(2, Addtion.add(1, 1));
	}

}