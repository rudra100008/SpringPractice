package com.springCore.SpringCore.SICollection;

import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<String> answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String question, List<String> answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("\nQuestionID: ").append(id).append("\nQuestion:\n\t ").append(question)
		.append("\nAnswer: ");
		for(String s:answer) {
			sb.append("\n\t").append(s);
		}
		return sb.toString();
	}

}
