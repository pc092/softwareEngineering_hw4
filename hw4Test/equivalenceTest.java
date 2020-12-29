package hw4Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class equivalenceTest {

	@Test
	public void test() {
		LetterGrade junitTest = new LetterGrade();
		assertEquals('X', junitTest.letterGrade(105));
		assertEquals('X', junitTest.letterGrade(-5));
        assertEquals('A', junitTest.letterGrade(95));
        assertEquals('B', junitTest.letterGrade(85));
        assertEquals('C', junitTest.letterGrade(75));
        assertEquals('D', junitTest.letterGrade(65));
        assertEquals('F', junitTest.letterGrade(55));
	}

}
