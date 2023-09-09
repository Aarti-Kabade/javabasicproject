package com;

class Stock
{
	private long code;
	private int qty;
	private double price;
	private double total, discount,netprice;
	
	Stock(long n, int q, double p)
	{
		code=n;
		qty=q;
		price=p;
		
	}
	public void compute()
	{
		total= qty*price;
		discount=total*0.25;
		netprice= total-discount;
		
		
	}
	public void Display()
	{
		System.out.println("Display details of the product:");
		System.out.println("Code=" +code);
		System.out.println("Quantity=" +qty);
		System.out.println("Price=" +price);
		System.out.println("Discount=" +discount);
		System.out.println("NetPrice=" +netprice);
		
	}
}

public class TestStock {

	public static void main(String[] args)
	{
		Stock s= new Stock(101 ,5, 5000.05);
		s.compute();
		s.Display();
	}

}
