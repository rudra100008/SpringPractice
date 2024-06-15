package com.springCore.SpringCore.CICollection2;

public class Answer {
    private int id;
    private String answer;
    private String by;
    
    public Answer() {
    	super();
    	}
    public Answer(int id,String answer,String by){
    	super();
    	this.id=id;
    	this.answer=answer;
    	this.by=by;
    }
    public String toString() {
    	return "\t-------Participaint-------"+"\nID:"+id+"\nAnswer: "+answer+"BY: "+by; 
    }
}
