package MockitoTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import Mockitoimp.CalculatorService;
import Mockitoimp.MainApplication;
@RunWith(MockitoJUnitRunner.class)

public class MainAppTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	 @InjectMocks 
     MainApplication mathApplication = new MainApplication();

     //@Mock annotation is used to create the mock object to be injected
     @Mock
     CalculatorService calcService;


	@Test
	public void test() {
        when(calcService.add(10.00,20.0)).thenReturn(30.00);
        
        //test the add functionality
        org.junit.Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	}

}
