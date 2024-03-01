package com.arya.casestudy;

import com.arya.casestudy.application.GSShopFactory;
import com.arya.casestudy.framework.ShopFactory;
import com.arya.casestudy.framework.ShopAcc;

public class App {

	public static void main(String[] args) {
		
		ShopFactory factory = new GSShopFactory();
		
		ShopAcc primeAcc = factory.getNewPrimeAccount(1234, "DBAccount", 20, true);
		
		ShopAcc normalAcc = factory.getnewNormalAccount(5678, "SYAccount", 40, 50);
		
		primeAcc.items();
		primeAcc.bookProduct(0);
		System.out.println(primeAcc);
		
		normalAcc.items();
		normalAcc.bookProduct(0);
		System.out.println(normalAcc);
	}

}
