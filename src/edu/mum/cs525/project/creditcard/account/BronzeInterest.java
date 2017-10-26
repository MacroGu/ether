package edu.mum.cs525.project.creditcard.account;

import edu.mum.cs525.framework.transaction.Interestable;

public class BronzeInterest implements Interestable {

	@Override
	public double compute(double balance) {
		return 0.1 * (balance > 0 ? balance : 0);
	}

}
