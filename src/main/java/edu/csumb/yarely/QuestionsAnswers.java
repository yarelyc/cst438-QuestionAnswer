package edu.csumb.yarely;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class QuestionsAnswers {
	
	private static HashMap<String, String> quesAnswer = new HashMap<String, String>();
	
	public static void put(String	question, String answer){
		quesAnswer.put(question, answer);
	}
	
	public static boolean testAnswer(String question, String answer) {
		String ans = quesAnswer.get(question);
		
		if(ans != null && ans.equals(answer)){
			return true;	
		}
		return false;
	}
	
	public static String getRandomQuestion(){
		int size = quesAnswer.size();
		if(size >0){
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(size);
			return new ArrayList<String>(quesAnswer.values()).get(randomInt);
		}
		return "";
		
		
	}

}
