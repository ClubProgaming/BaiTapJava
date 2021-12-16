package phimtat;
//

import java.util.Scanner;

//import java.util.jar.Attributes.Name;

public class pimtat {
	private int stt;
	private String name;

	/**
	 * @param stt
	 * @param name
	 */
	public pimtat(int stt, String name) {
		this.stt = stt;
		this.name = name;
	}

	/**
	 * @return the stt
	 */
	public int getStt() {
		return stt;
	}

	/**
	 * @param stt the stt to set
	 */
	public void setStt(int stt) {
		this.stt = stt;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	int ss1() {
		return this.stt * 2;
	}
	

	@Override
	public String toString() {
		return "pimtat [stt=" + stt + ", name=" + name + "]";
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		pimtat n1 = new pimtat(1, "bi");
		pimtat n2 = new pimtat(2, "heo");
		System.out.println(n1);
		System.out.println(n2);
			
		Scanner input = new Scanner(System.in);
		System.out.print("nhap vao so a = ");
		int a = input.nextInt();
		System.out.print("nhap vao so b = ");
		int b = input.nextInt();
		System.out.println("so a="+a+", so b ="+b);
		System.out.println("a + b= "+(a+b));
		
	}
}


