package com.example.user.fit.model.exercise;

import java.io.File;

public abstract class Exercise implements IUpperBody,ILowerBody,IHiit,ICardio {
	private File file;
	private int repetitions=0;
	private int sets=0;

	public Exercise(File file, int repetitions, int sets) {
		if(!file.exists()){
			//File f = new File(..);
		}
		this.file = file;
		setRepetitions(repetitions);
		setSets(sets);
	}

	public void setRepetitions(int repetitions) {
		if(repetitions>0)
		this.repetitions = repetitions;
	}
	public void setSets(int sets) {
		if(sets>0){
			this.sets = sets;
		}
	}

	public int getRepetitions() {
		return repetitions;
	}
	public int getSets() {
		return sets;
	}
}
