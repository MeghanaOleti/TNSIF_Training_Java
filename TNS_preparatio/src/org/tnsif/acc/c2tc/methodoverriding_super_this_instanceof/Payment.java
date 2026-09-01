package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}
class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment is done using UPI");
	}
}
