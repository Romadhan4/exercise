import java.util.Scanner;
public class Phone {
	String merk,typeHp;
	int Ram,units ;
	double price, totalPrice;
	
	Scanner scan = new Scanner (System.in);
	
	Phone(){
		System.out.println ("Please enter the merk ( Vivo and Samsung only) ");
		this.merk=scan.nextLine ();
		System.out.println ("Please enter the type of handphone (V17,Reno4/Galaxy S21+,Galaxy S21");
		this.typeHp=scan.nextLine();
		System.out.println ("please enter the Ram 8GB and 12GB");
		this.Ram=scan.nextInt();
			if (merk.equalsIgnoreCase("Vivo") ) {
				if (typeHp.equalsIgnoreCase("V17")) {
					if (Ram == 8) {
						this.price = 1699;
					}
					else if (Ram==12) {
						this.price=1800;
					}
				}
				else if (typeHp.equalsIgnoreCase("Reno4")) {
					if (Ram == 8 ) {
						this.price=1799;
					}
					else if (Ram==12) {
						this.price=1999;
					}
				}
			}
			else if (merk.equalsIgnoreCase("Samsung")) {
				if (typeHp.equalsIgnoreCase("Galaxy S21+")) {
					if (Ram == 8) {
						this.price = 3250;
					}
					else if (Ram==12) {
						this.price=3800;
					}
				}
				else if (typeHp.equalsIgnoreCase("Galaxy S21")) {
					if (Ram == 8 ) {
						this.price=3000;
					}
					else if (Ram==12) {
						this.price=3500;
					}
			}
			}
		System.out.println (" Please how many phone you want to buy ?");
		this.units=scan.nextInt();
		this.totalPrice=this.price * this.units;
		
		System.out.println ();
		
	}
	Phone (String merk, String typeHp, int Ram, int units ){
		this.merk=merk;
		this.typeHp=typeHp;
		this.Ram=Ram;
		this.units=units;
		
		
	
	this.units=scan.nextInt();
	this.totalPrice=this.price * this.units;
	System.out.println ();
		
	}
		
	}
