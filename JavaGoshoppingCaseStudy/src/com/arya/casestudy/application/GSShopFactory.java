package com.arya.casestudy.application;

import com.arya.casestudy.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{
	
	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime)
	{
		return new GSPrimeAcc(accNo, accName, charges, isPrime);
	}

	@Override
	public GSNormalAcc getnewNormalAccount(int accNo, String accName, float charges, float DELIVERY_CHARGES)
	{
		
		return new GSNormalAcc(accNo, accName, charges, DELIVERY_CHARGES);
	}
}
