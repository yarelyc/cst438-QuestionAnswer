package edu.csumb.yarely;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionsAnswersTest {

	@Test
	public void testAnswerMethod() {
		QuestionsAnswers.put("How many bits in a byte?", "8");
		QuestionsAnswers.put("The brain of a computer is the?", "cpu");
		QuestionsAnswers.put("What is 5 in binary?", "101");
		
		//correct answers
	    assertTrue(QuestionsAnswers.testAnswer("How many bits in a byte?", "8"));
	    assertTrue( QuestionsAnswers.testAnswer("The brain of a computer is the?", "cpu"));
	    assertTrue(QuestionsAnswers.testAnswer("What is 5 in binary?", "101"));
	    
	    //incorrect answers
	    assertFalse(QuestionsAnswers.testAnswer("How many bits in a byte?", "9"));
	    assertFalse(QuestionsAnswers.testAnswer("The brain of a computer is the?", "8"));
	    assertFalse(QuestionsAnswers.testAnswer("What is 5 in binary?", "102"));
	    
	    //invalid question
	    assertEquals(false, QuestionsAnswers.testAnswer("What color is the sky?", "yellow"));
	    
		
	}

}
