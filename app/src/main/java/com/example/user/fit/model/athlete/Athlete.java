package com.example.user.fit.model.athlete;
import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class Athlete {
	private static final int IMPERIAL_CONSTANT=703;
	private enum Gender{
		MALE,FEMALE
	}
	private enum Type{
		IMPERIAL,METRIC
	}
	private Profile profile;
	private Gender gender;
	private Type metricType;
	private File photo ;
//	private List<Goal> allGoals;
//	private Goal activeGoal;
	private double weigth ; 
	private double height;
//	public Athlete(ProfileActivity profile, Gender gender,Type metricType, File f, List<Goal> allGoals, Goal activeGoal, double weigth,double height) {
//		if(profile!=null){
//			this.profile = profile;
//		}
//		setGender(gender);
//		setPhoto(f);
//		this.allGoals = new ArrayList<>();
//		setActiveGoal(activeGoal);
//		setWeigth(weigth);
//		setHeight(height);
//	}
	
	public void setMetricType(Type metricType) {
		this.metricType = metricType;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setPhoto(File photo) {
		if(!photo.exists()){
			//photo=new File("photo.jpg");
		}
		this.photo=photo;
	}
//	public void setActiveGoal(Goal activeGoal) {
//		if(activeGoal!=null){
//			this.allGoals.add(this.activeGoal);
//			this.activeGoal=activeGoal;
//		}
//	}
	public void setWeigth(double weigth) {
		if(weigth>0){
			this.weigth = weigth;
		}
	}
	public void setHeight(double height) {
		if(height>0){
			this.height = height;
		}
	}
	
	/**
	 * 
	 * @return BMI,depending on the metric system used
	 */
	public double calculateBMI(){
		double BMI=0;
		if(this.metricType.equals("IMPERIAL")){
			BMI=(this.weigth/this.height)*IMPERIAL_CONSTANT;
		}else{
			BMI=this.weigth/this.height;
		}
		return BMI;
		
	}
	
	

	
	
	
}
