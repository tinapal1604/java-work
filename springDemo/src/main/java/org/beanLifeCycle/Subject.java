package org.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
	
	private String score;
	
	public Subject() {
		super();
	}
	public Subject(String score) {
		this.score = score;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		System.out.println("inside setter..........");
		this.score = score;
	}
	@Override
	public String toString() {
		return "Subject [maths=" + this.score + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("start..............");
	}
	@PreDestroy
	public void end() {
		System.out.println("end..............");
	}
	
	

}
