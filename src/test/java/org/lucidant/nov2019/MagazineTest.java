package org.lucidant.nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagazineTest {

	@BeforeEach
	void setUp() {

	}

	@Test
	void testStringManipulation() {
		String s = "abc";
		s = s + 1 + 2; // 1 and 2 are boxed to strings and concatenated -> abc12
		s = s + (2 + 2); // 2 and 2 are numeric, + is the addition operator in this case -> abc124
		s.concat("1").concat("2"); // String is immutable, concat returns a new string which is ignored -> abc124
		s.concat("" + 2 + 2); // Again, the result of concat is ignored -> abc124
		assertEquals("abc124", s);
	}

}
