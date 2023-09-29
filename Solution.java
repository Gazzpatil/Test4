package ctp;

class Myntra{
	void purchase(String brand) {
		System.out.println("Brand :"+brand);
	}
	void purchase(int cost) {
		System.out.println("Cost :"+cost);
	}
	void purchase(String brand,int cost)
	{
		System.out.println("Brand :"+brand+" cost:"+cost);
	}
	void purchase(int cost,String brand) {
		System.out.println("cost :"+cost+" brand:"+brand);
	}
}
public class Solution {
	public static void main(String[] args) {
		Myntra myntra=new Myntra();
		myntra.purchase("Laptop",50000);
		myntra.purchase("mobile");
		myntra.purchase(10000);
		myntra.purchase(20000, "Watch");

	}

}

