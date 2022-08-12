package corejava;

import java.util.Scanner;

public class Demo {
	
	int accountNo;
	String name;
	int amount;
	
	public void details() {
		Scanner sc=new Scanner(System.in);
		accountNo =sc.nextInt();
		name=sc.next();
		amount=sc.nextInt();
	}
	public void checkBalance() {
		if(amount<1000) {
			System.out.println("Insufficient balance");
		}
	}
	public void display() {
		System.out.println("Account No "+accountNo+"\nName "+name+"\nAmount "+amount);
	}
	public static void main(String[] args) {
		
		Demo demo=new Demo();
		demo.details();
		demo.checkBalance();
		demo.display();
	}

}
