package training;

public class Test8Encapsulation {
	public static void main(String[] args) {
		Amazon customer = new Amazon();
		float payableAmount = customer.Transaction(1000);
		System.out.println("Total Payable = " + payableAmount);
	}

}

class Amazon {
	float Transaction(float amt) {
		GPay gpayObj = new GPay();
		gpayObj.setTxnCharge(0.07f);
		float totalAmount = amt + (amt * gpayObj.getTxnCharge());
		return totalAmount;
	}
}

class GPay {
	private float txnCharge = 0.05f;
	public void setTxnCharge(float newcharge) {
		if (newcharge <= 0.05f) {
			System.out.println("Invalid TxnCharge");
			return;
		}
		txnCharge = newcharge;
	}
	public float getTxnCharge() {
		return txnCharge;
	}
}