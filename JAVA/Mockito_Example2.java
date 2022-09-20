package mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mockito_Example2 {
	
	@Mock
	List<String> mockList;
	
	//@BeforeEach
	public void setup() {
		
		MockitoAnnotations.initMocks(this);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("Hi");
		when(mockList.get(0)).thenReturn("Sample");
		assertEquals("Sample",mockList.get(0));
		System.out.println("World");
		
	}

}
