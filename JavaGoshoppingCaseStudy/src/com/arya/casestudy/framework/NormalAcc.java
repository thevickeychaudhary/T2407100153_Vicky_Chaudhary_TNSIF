package com.arya.casestudy.framework;

public abstract class  NormalAcc extends ShopAcc {
	
	private final float DELIVERY_CHARGES;

	public NormalAcc(int accNo, String accName, float charges, float deliveryCharges) {
		
		super(accNo, accName, charges);
		this.DELIVERY_CHARGES = deliveryCharges;
		
	}

	public float getDELIVERY_CHARGES() {
		return DELIVERY_CHARGES;
	}

	@Override
	public String toString() {
		return "NormalAcc [DELIVERY_CHARGES= " + DELIVERY_CHARGES + " accNo= " + getAccNo() + ", accName=" + getAccName() + ", charges=" + getCharges() + "]";
	}
	
	
}
