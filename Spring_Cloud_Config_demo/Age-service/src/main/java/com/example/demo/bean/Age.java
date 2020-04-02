package com.example.demo.bean;

public class Age {

	private int maxAge;
	private int minAge;
	
	
	
	public Age() {
		super();
	}



	public Age(int maxAge, int minAge) {
		super();
		this.maxAge = maxAge;
		this.minAge = minAge;
	}



	public int getMaxAge() {
		return maxAge;
	}



	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}



	public int getMinAge() {
		return minAge;
	}



	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}



	@Override
	public String toString() {
		return "Age [maxAge=" + maxAge + ", minAge=" + minAge + "]";
	}
	
	
	
	
}
