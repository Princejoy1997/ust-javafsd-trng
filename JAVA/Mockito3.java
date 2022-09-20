package Testing;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class Mockito3 {
	@Test
	
	public void test() {
		List s = Mockito.spy(new ArrayList());
		s.add("Vishnu");
		Mockito.verify(s).add("Vishnu");
		
	}
	

}
