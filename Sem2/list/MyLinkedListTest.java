import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

	private MyList<String> list;

	@BeforeEach
	void setUp() {
		list = new MyLinkedList<>();
	}

	@Test 
	void testAddAndSize() {
		list.add("Пирожок");
		list.add("Молоко");
		Assertions.assertEquals(2, list.size());
	}

	@Test
	void testGet() {
		list.add("Java");
		Assertions.assertEquals("Java", list.get(0));
	}

	@Test
	void testIsEmpty() {
		Assertions.assertTrue(list.isEmpty());
		list.add("Python");
		Assertions.assertFalse(list.isEmpty());
	}

}