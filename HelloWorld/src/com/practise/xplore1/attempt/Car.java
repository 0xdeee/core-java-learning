package com.practise.xplore1.attempt;

public class Car {
	private int id;
	private String name;
	private String fuel;
	private int milage;
	
	public int getId(){
		return id;}
	public void setId(int id){
			this.id = id;
		}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getFuel(){
		return fuel;
	}
	public void setFuel(String fuel){
		this.fuel=fuel;
	}
	public int getMilage(){
		return milage;
	}
	public void setMilage(int milage){
		this.milage=milage;
	}
	
	public Car(int id,String name,String fuel,int milage){
		
		this.id=id;
		this.name=name;
		this.fuel=fuel;
		this.milage=milage;
	}

}
