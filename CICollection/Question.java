package com.springCore.SpringCore.CICollection;

import java.util.List;

public class Question {
private int questionID;
private String questions;
private List<String> answers;


public Question() {
	super();
}
public Question(int id,String questions,List<String> answers) {
	super();
     this.questionID=id;
     this.questions=questions;
     this.answers=answers;
}



  public int getQuestionID() {
	return questionID;
}



public void setQuestionID(int questionID) {
	this.questionID = questionID;
}



public String getQuestions() {
	return questions;
}



public void setQuestions(String questions) {
	this.questions = questions;
}



public List<String> getAnswers() {
	return answers;
}



public void setAnswers(List<String> answers) {
	this.answers = answers;
}



public String toString() {
	  StringBuilder sb=new StringBuilder();
	  sb.append("\t-----Quiz-----\n")
	  .append("\nQuestion Id: ").append(questionID)
	  .append("\nQuestion: ").append(questions)
	  .append("\nAnswer: ").append("\n");
	  for(String s:answers) {
			sb.append("\t").append(s).append("\n");
		}	
	  
	  return sb.toString();
  }
}
