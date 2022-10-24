package com.model;
import java.util.*;

public class Customer{
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name){
		this.name=name;
		transactions = new ArrayList<>();
	}
	public Customer(String name,double initTransac){
		this.name=name;
		if(initTransac>=0){
			transactions=new ArrayList<>();
			transactions.add(initTransac);
		}
	}
	public void addTransaction(double transaction){
		if(totalTransac()+transaction<0)
			System.out.println("Failed operation ! No enough solde ");
		else transactions.add(transaction);
	}
	public double totalTransac(){
		double sum=0;
		for(double d : transactions)
			sum+=d;
		return sum;
	}
	@Override 
	public boolean equals(Object obj){
		if(obj instanceof Customer){
			Customer c = (Customer)obj;
			return this.name.toLowerCase().equals(c.name.toLowerCase());
		}
		return false;
	}
	@Override
	public String toString(){
		String txt="\tCustomer : "+this.name+"\n";
		txt+="\t\tTransactions :\n";
		for(double transac : transactions)
			txt+= "\t\t\t"+transac + " Dh\n";
		return txt;
	}
}