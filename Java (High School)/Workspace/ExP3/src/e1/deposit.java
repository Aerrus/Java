package e1;

import account.bankACCOUNT;

public class deposit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankACCOUNT b1 = new bankACCOUNT(1000,0);
		
		b1.setDeposit(500);
		b1.addBalance();
		b1.setDeposit(400);
		b1.addBalance();
		
		
		System.out.println(b1.getBalance());
		
		
		
		/*
		 * 1900.0
		 */
	}

}
