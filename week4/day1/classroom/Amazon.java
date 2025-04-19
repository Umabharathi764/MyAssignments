package week4.day1.classroom;

public class Amazon extends CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment Method is COD");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Payment method is UPI");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment method is Card");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment method is Internet Banking");
		
	}

	 public void recordPaymentDetails() {
		super.recordPaymentDetails();
		System.out.println("Choosing UPI");
		
	}
	
	public static void main (String[] args)
	{
		Amazon paymentOptions = new Amazon();
		paymentOptions.cashOnDelivery();
		paymentOptions.upiPayments();
		paymentOptions.cardPayments();
		paymentOptions.internetBanking();
		paymentOptions.recordPaymentDetails();
	}

}

