package com.arya.casestudy.framework;

public abstract class ShopFactory {

	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime);
	
	public abstract NormalAcc getnewNormalAccount(int accNo, String accName, float charges, float DELIVERY_CHARGES);
}
