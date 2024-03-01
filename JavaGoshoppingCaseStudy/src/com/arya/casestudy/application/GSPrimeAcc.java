package com.arya.casestudy.application;

import com.arya.casestudy.framework.PrimeAcc;
import java.util.Scanner;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime)
	{
		super(accNo, accName, charges, isPrime);	
	}
	
	String[] items = {"Laptop", "Smartphone", "Headphones", "Tablet"};
	boolean[] itemAvailability = {true, true, false, true};
	float[] price = {45000, 10000, 2000, 6000};
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void bookProduct(float amount)
	{
		if(isPrime())
		{
			System.out.println("Which product you want to buy : ");
			int temp = sc.nextInt();
			
			for (int i = 0; i < itemAvailability.length; i++) {
				if(temp == i+1)
				{
					if(itemAvailability[i])
					{
						amount = price[i] + getCharges();
						
						System.out.println("Item Successfully Booked costing "+ amount);
					}
					else
					{
						System.out.println("Item not available");
						break;
					}
				}
			}
	                
		}
		else
		{
			System.out.println("Not a prime Account");
		}
	}
	
	@Override
	public void items()
	{	
		System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            String status = (itemAvailability[i] ? "Available" : "Not Available");
            System.out.println((i + 1) + ". " + items[i] + " - " + status + " - " + price[i]);
        }
	}
}
