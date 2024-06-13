package com.springCore.SpringCore.CICollection;

import java.util.List;

public class Question {
private int questionID;
private String questions;
private List<String> answers;

public Question(int id,String questions,List<String> answers) {
	super();
     this.questionID=id;
     this.questions=questions;
     this.answers=answers;
}
public void displayAnswer() {
	for(String s:answers) {
		System.out.println(s);
	}	
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
