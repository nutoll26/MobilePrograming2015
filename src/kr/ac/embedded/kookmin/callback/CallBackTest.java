package kr.ac.embedded.kookmin.callback;

public class CallBackTest implements OnMaxNumberCb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallBackTest callTest = new CallBackTest();
		Sum total = new Sum();
			
		total.setMaxNumber(50);
		total.setOnMaxNumberCb(callTest);
		
		for ( int i=1; i<=11; i++) {
			total.addNumber(i);
		}
		
		System.out.println("Total is " + total.getTotal());
	}

	@Override
	public void onMaxNumber(int number, int exceed) {
		// TODO Auto-generated method stub
		System.out.println("Current sum is " + number + " and exceeds " + exceed);
	}
	

}