
public class main {

	public static void main(String[] args) {
		
		Phone a = new Phone ();
		System.out.println ("Phone 1");
		System.out.println ("Detail Information");
		System.out.println ("Merk :"+a.merk);
		System.out.println ("Type of phone :"+a.typeHp);
		System.out.println ("Ram :"+a.Ram+"GB");
		System.out.println ("Price per Item :"+"RM"+a.price);
		System.out.println ("Total units to buy:"+a.units);
		System.out.println ("Total price :"+a.totalPrice);

		System.out.println ();
		
		Phone b = new Phone ();
		System.out.println ("Phone 2");
		System.out.println ("Detail Information");
		System.out.println ("Merk :"+b.merk);
		System.out.println ("Type of phone :"+b.typeHp);
		System.out.println ("Ram :"+b.Ram+"GB");
		System.out.println ("Price per Item :"+"RM"+b.price);
		System.out.println ("Total units to buy:"+b.units);
		System.out.println ("Total price :"+b.totalPrice);
		
	
		
	}

}
