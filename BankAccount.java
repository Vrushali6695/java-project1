package bank;

import java.util.Scanner;

public class BankAccount {
	
	int Balance;
	void Account(){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Name=");
		String name=sc.next();
		System.out.println("Enter Balance=");
		Balance=sc.nextInt();
	}
	void AmmountWithdraw(){
		
		int Amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Withdraw Ammount=");
		Amount=sc.nextInt();
		if(Amount<	Balance){
			System.out.println("Sufficient Amount.. ");
		}else{
			System.out.println("Not Sufficient");
		}
		Balance=Balance-Amount;
		System.out.println("Withdraw Amount="+Balance);	
		
	}
	void Diposit(){
		
		int deposit;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Deposit Ammount=");
		deposit=sc.nextInt();
        if(deposit%100==0){
			Balance=deposit+100;
		}
		//Balance=Balance+deposit;
		System.out.println("Deposit Ammount="+Balance);
		
	}
public static void main(String[] args) {
	BankAccount ba=new BankAccount();
	ba.Account();
	ba.AmmountWithdraw();
	ba.Diposit();
}
}




