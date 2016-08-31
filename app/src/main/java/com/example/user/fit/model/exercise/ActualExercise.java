package com.example.user.fit.model.exercise;

import java.io.File;

public class ActualExercise extends Exercise {
	private String name;
	private String info;//??
	private int timeForCompletion;

	public ActualExercise(String name,int timeForCompletion,File file, int repetitions, int sets){
		super(file,repetitions,sets);
		setName(name);
		setTimeForCompletion(timeForCompletion);
	}


	public void setName(String name) {
		if(!name.isEmpty() && name != null)
		this.name = name;
	}
	public void setTimeForCompletion(int timeForCompletion) {
		if(timeForCompletion>0)
		this.timeForCompletion = timeForCompletion;
	}
	public boolean equalsExercise(ActualExercise e){
		if(this.name.equals(e.getName())&&this.getRepetitions()==e.getRepetitions()&&this.getSets()==e.getSets())
			return true;
		return false;
	}



	public int getTimeForCompletion() {
		return timeForCompletion;
	}


	private String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
