package bstAgaco;

public class AnaSinif {

	public AnaSinif() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
		Agac a1 = new Agac();
		
		Dugum d1 = new Dugum(10);
		Dugum d2 = new Dugum(5);
		Dugum d3 = new Dugum(15);
		Dugum d4 = new Dugum(25);
		Dugum d5 = new Dugum(13);
		Dugum d6 = new Dugum(3);
		Dugum d7 = new Dugum(7);
		
		a1.Ekle(d1);
		a1.Ekle(d2);
		a1.Ekle(d3);
		a1.Ekle(d4);
		a1.Ekle(d5);
		a1.Ekle(d6);
		a1.Ekle(d7);
		
		d1.OnGezinti();
		
	}

}
