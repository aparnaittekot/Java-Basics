package Multithreading;

public class Clerk extends Thread {
	
	private Bank bank;
	private double transferAmount;
	
	public Clerk(String name, Bank bank, double transferAmount){
		super(name);
		this.bank = bank;
		this.transferAmount = transferAmount;
	}
	
	public void run(){
		bank.transferMoney(transferAmount);
	}
	
	 
}
