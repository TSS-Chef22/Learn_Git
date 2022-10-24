package com;
import com.model.*;

class Main{
	 
	public static void main(String[] args){
		Customer c1 = new Customer("ali",1500);
		Customer c2 = new Customer("hajar",500);
		Customer c3 = new Customer("salima",8000);
		Customer c4 = new Customer("oussma",200);
		Customer c5 = new Customer("kawter",5000);
		
		Branch b1 = new Branch();
		b1.addCustomer(c1);
		b1.addTransaction(c1,900);
		b1.addTransaction(c1,100);
		b1.addCustomer(c2);
		b1.addTransaction(c2,800);
		b1.addTransaction(c2,200);
		b1.addTransaction(c2,400);
		
		Branch b2 = new Branch();
		b2.addCustomer(c3);
		b2.addTransaction(c3,1200);
		b2.addTransaction(c3,300);
		b2.addCustomer(c4);
		b2.addCustomer(c5);
		
		Bank bk = new Bank();
		bk.addBranch(b1);
		bk.addBranch(b2);
		bk.addCustomer(1,new Customer("Sanaa",1900));
		
		System.out.println(bk);
		
	}
}