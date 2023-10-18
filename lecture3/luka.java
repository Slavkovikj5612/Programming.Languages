package myNumber;

public class myNumberr {
	private int num;
	public int num2;
	public myNumberr() {
		num=0 ;
		num2=100;
	}
	int getNum() {
		return num;
	}
	void SetNum(int i) {
		num=i;
		num2=10*i;
	}


public class myclass {
		public static void main (String[]ar) {
			myNumberr A=new myNumberr();
			System.out.println(A.getNum());
			A.SetNum(10);
			System.out.println(A.getNum());
			System.out.println(A.num2);
		}
}
}
