package Multithreading;

public class Bank {

	private Account account;

	public Bank() {
		account = new Account();
		account.setBalance(500.00);
	}

	public void transferMoney(double amount) {

		double currentBalance = account.getBalance();
		System.out.println(
				"Clark: " + Thread.currentThread().getName() + " reads current account balance of " + currentBalance);
		double newBalance = currentBalance + amount;
		account.setBalance(newBalance);
		System.out.println("Clark: " + Thread.currentThread().getName() + " reads account balance of "
				+ account.getBalance() + " after transfering " + amount + " Euro");
	}

	public static void main(String[] args) throws InterruptedException {

		Bank starBank = new Bank();

		Clerk c1 = new Clerk("Oliver", starBank, 1000.0);
		Clerk c2 = new Clerk("Klaus", starBank, -500.0);

		c1.start();
		c2.start();

		c1.join();
		c2.join();

		System.out.println("Bank account " + starBank.account.getBalance());
	}
}
