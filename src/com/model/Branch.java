package com.model;
import java.util.*;
public class Branch{
	private static int ctr = 0;
	private int id;
	ArrayList<Customer> customers;
	public Branch(){
		ctr++;
		id=ctr;
		customers = new ArrayList<>();
	}
	public void addCustomer(Customer c){
		customers.add(c);
	}
	public void addTransaction(Customer myCustomer,double amount){
		Customer c = customers.get(customers.indexOf(myCustomer));
		if(c!=null)
			c.addTransaction(amount);
	}
	@Override
	public String toString(){
		String txt = "Branche "+this.id+" :\n";
		for(Customer c: customers)
			txt += c +"\n";
		return txt;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Integer){
			int b = (int)obj;
			return this.id == b;
		}
		return false;
	}
	
}