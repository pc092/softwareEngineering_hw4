package hw4Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class boundaryTest {

	@Test
	public void test() {
		LetterGrade junitTest = new LetterGrade();
		assertEquals('X', junitTest.letterGrade(101));
		assertEquals('X', junitTest.letterGrade(-1));
        assertEquals('A', junitTest.letterGrade(100));
        assertEquals('A', junitTest.letterGrade(90));
        assertEquals('B', junitTest.letterGrade(89));
        assertEquals('B', junitTest.letterGrade(80));
        assertEquals('C', junitTest.letterGrade(79));
        assertEquals('C', junitTest.letterGrade(70));
        assertEquals('D', junitTest.letterGrade(69));
        assertEquals('D', junitTest.letterGrade(60));
        assertEquals('F', junitTest.letterGrade(59));
        assertEquals('F', junitTest.letterGrade(0));
	}

}
