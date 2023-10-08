package com.QuizProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionService {
    List<Question> questions = new ArrayList<>();
    int score = 0;
    QuestionService(){
    	Question que1 = new Question(1, "Capital of india is :",new String[]{"Delhi","Mumbai","Chennai","Kolkata"},"Delhi");
    	questions.add(que1);
    	
    	Question que2 = new Question(2, "1+1=",new String[]{"1","2","3","4"},"2");
    	questions.add(que2);
    }
    
    public void displayQuestions() {
    	Scanner sc = new Scanner(System.in);
    	questions.forEach(question -> {
    		System.out.println(question.getId()+": "+question.getQuestion());
    		System.out.println(printOptions(question));
    		System.out.println("Answer is : ");
    		String answer = sc.next();
    		System.out.println(isCorrect(answer,question));
    		System.out.println("your score is :" + score);
    		System.out.println();
    	});
    	
    	System.out.println("Thank you for playing");
    	sc.close();
    }

	private boolean isCorrect(String answer, Question question) {
		// TODO Auto-generated method stub
		if(question.getAnswer().equals(answer)) {
			updateScore();
			return true;
		}
		return false;
	}

	private void updateScore() {
		// TODO Auto-generated method stub
		score++;
	}

	private String printOptions(Question question) {
		// TODO Auto-generated method stub
		String rt = "";
		String[] options = question.getOptions();
		char num = 'A';
		for(String option : options) {
			rt= rt+num+") "+option+"  ";
			num++;
		}
		return rt;
	}
}
