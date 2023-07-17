package com.Aurionpro.model;

public class WaterBill {
	private double meter;
	private double bill;
	
	public WaterBill(double meter) {
	
		this.meter = meter;
		this.bill=75;
	}

	
	public double getBill() {
		return bill;
	}
	public double getMeter() {
		return meter;
	}

	public void setMeter(double meter) {
		this.meter = meter;
	}
	
	
	public  void calculate() {
		
		if(this.meter<=100) {
			this.bill+=meter*5;
			this.meter-=100;
		}
		else if(this.meter>100&& this.meter<=250) {
			this.bill+=this.meter*10;
			this.meter-=150;
		}
		else {
			this.bill+=this.meter*20;
			
		}
		
		
	}
}
