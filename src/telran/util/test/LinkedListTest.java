package telran.util.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.Collection;
import telran.util.LinkedList;

public class LinkedListTest extends ListTest {
	@Override
	@BeforeEach
	void setUp() {
		collection = new LinkedList<Integer>(); 
		super.setUp();
		//Integer [] numbers = {10, -20, 8, 14, 30, 12, 100};
		
	}

	@Override
	protected Collection<Integer> getCollection(Integer[] ar) {
		LinkedList<Integer> res = new LinkedList<>();
		for(Integer num:ar) {
			res.add(num);
		}
		return res;
	}
	@Test
	void LinkedListAddTest() {
		
	}

}
