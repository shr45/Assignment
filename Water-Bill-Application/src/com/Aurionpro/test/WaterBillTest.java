package com.Aurionpro.test;

import java.util.Scanner;

import com.Aurionpro.model.WaterBill;

public class WaterBillTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("Enter the Water meter reading :");
		WaterBill  bill=new WaterBill(sc.nextDouble());
		bill.calculate();
		System.out.println("Your water bill is :"+bill.getBill());
		System.out.println("Want  calculate another  water bill y/n:");
		if(!sc.next().toLowerCase().equals("y")) {
			flag=false;
		}
		
		}
       
        }
    
}


