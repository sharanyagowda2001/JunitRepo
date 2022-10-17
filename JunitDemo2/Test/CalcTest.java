import static org.junit.Assert.*;

import org.junit.Test;

import com.av.junit2.Calculator;

public class CalcTest {

	//@Test
	public void testAdd() {
		assertEquals("error in add()",3,Calculator.add(1, 2));
		assertEquals("error in add()",-3,Calculator.add(-1, -2));
		assertEquals("error in add()",9,Calculator.add(9, 0));
		
	}
	
	public void calcTestFail() {
		assertEquals("error in aad()", 0,Calculator.add(1,2));
	}
	//@Test
	
	public void calcTestSubPass() {
		assertEquals("error in sub()",-1,Calculator.sub(1, 2));
		assertEquals("error in sub()",1,Calculator.sub(-1, -2));
		assertEquals("error in sub()",1,Calculator.sub(2, 1));
	}
	@Test
	public void calcTestMul() {
		assertEquals("error in mul()",2,Calculator.mul(1, 2));
		assertEquals("error in mul()",2,Calculator.mul(-1, -2));
		assertEquals("error in mul()",-2,Calculator.mul(2, -1));
	}
}
