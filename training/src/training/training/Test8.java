package training;

public class Test8 {
	
	interface olaCustomer{
		void bookCab();
		void findARide();
		void rentCab();
		void rateDriver();
		void scheduleCab();
		void cancelCab();
		void addMoneyToWallet();
		void raiseTicket();
		void signUp();
		void signIn();
	}
	
	interface olaDriver {
		void acceptBooking();
		void getCustomerLocation();
		void setAvailableStatus();
		void getMyCommission();
		void raiseMoneyTransferRequest();
		void callCustomer();
		void setUpYourVehicle();
		void customerFeedback();
	}
	
	interface olaOwner {
		void getDRiverRecords();
		void getReportByDriverId();
		void getReportByRegion();
		void getTotalRevenue();
		void getCustomerFeedback();
		void addDriver();
		void changeDriverStatus();
	}
	
public class Test8 implements olaOwner,olaDriver,olaCustomer {
	public static void main(String[] args) {
		olaCustomer cust = new Test8();
		olaDriver harsha = new Test8();	
	}
		
		
	@Override
	public void bookCab() {
	}
		
	@Override
	public void findARide() {
	}
	@Override
	public void rentCab() {
	}


	@Override
	public void rateDriver() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void scheduleCab() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cancelCab() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addMoneyToWallet() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void raiseTicket() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void acceptBooking() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getCustomerLocation() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setAvailableStatus() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getMyCommission() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void raiseMoneyTransferRequest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void callCustomer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setUpYourVehicle() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void customerFeedback() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getDRiverRecords() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getReportByDriverId() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getReportByRegion() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getTotalRevenue() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getCustomerFeedback() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addDriver() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void changeDriverStatus() {
		// TODO Auto-generated method stub
	}
}
}
