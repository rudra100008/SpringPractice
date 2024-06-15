package com.springCore.SpringCore.CICollection2;

import java.util.List;

public class Question {
  private int questionID;
  private String question;
  private List<Answer> answers;
  public Question() {
	  super();
  }
  public Question(int id,String question,List<Answer> answers) {
	  super();
	  this.questionID=id;
	  this.question=question;
	  this.answers=answers;
  }
  public String toString() {
	  StringBuilder sb=new StringBuilder();
	  sb.append("\t--------Quiz App-------\n")
	  .append("\nQuestion ID: ").append(questionID)
	  .append("\nQuestion: ").append(question)
	  .append("\nAnswers: ");
	  for(Answer s:answers) {
		  sb.append("\n\t").append(s.toString());
	  }
	  return sb.toString();
  }
}
