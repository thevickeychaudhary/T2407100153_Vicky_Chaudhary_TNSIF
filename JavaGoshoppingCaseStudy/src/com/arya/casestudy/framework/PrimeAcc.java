package com.arya.casestudy.framework;

public abstract class PrimeAcc extends ShopAcc{

	private boolean isPrime;
	private static final float DELIVERY_CHARGES = 0;
	
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public static float getDeliveryCharges() {
		return DELIVERY_CHARGES;
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime= " + isPrime + " accNo=" + getAccNo() + ", accName=" + getAccName() + ", charges=" + getCharges() +"]";
	}
	
	
}
