package com.model;
import java.util.*;
public class Bank{
	ArrayList<Branch> branchs;
	public Bank(){
		branchs=new ArrayList<>();
	}
	public void addBranch(Branch b){
		branchs.add(b);
	}
	public void addCustomer(int idBranch,Customer c){
		Branch b = branchs.get(branchs.indexOf(idBranch));
		if(b!=null) 
			b.addCustomer(c);
	}
	@Override
	public String toString(){
		String txt ="********* List Branchs *********\n";
		for(Branch b:branchs)
			txt+= b +"\n";
		txt 	  += "*******************************\n";
		return txt;
	}
}