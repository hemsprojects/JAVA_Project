package day_3_task;

class SbiAcc {
	private String Accholder;
	private int balance;
	SbiAcc(String Accholder, int balance){
		this.Accholder=Accholder;
		this.balance=balance;
	}
	public String getAccholder() {
		return Accholder;
	}
	public int getbalance() {
		return balance;
	}
	public void Deposit(int dep) {
		if(balance>0) {
			balance+=dep;
			System.out.println("Deposit Amount:"+dep);
			System.out.println("Now current Balance:" +balance);
		}
	}
	public void setAccholder(String Accholder) {
		this.Accholder=Accholder;
	}
}
	public class Task2 {
	public static void main(String args[]) {
	SbiAcc ac=new SbiAcc("Jhon",2000);
	System.out.println("Account Holder Name"+ac.getAccholder());
	ac.setAccholder("PAVI");
	System.out.println("update account"+ac.getAccholder());
	System.out.println("Balance"+ac.getbalance());
	ac.Deposit(30000);
	//ac.setwithdraw(20000);
	}
}

