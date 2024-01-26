package bstAgaco;

public class Dugum {
	int icerik;
	Dugum sag;
	Dugum sol;
	
	public Dugum(int icerik) {
		sag = null;
		sol = null;
		this.icerik = icerik;
		
	}
	
	public void OnGezinti() {
		System.out.println(icerik);
		
		if(sol != null) {
			sol.OnGezinti();
		}
		
		if(sag != null) {
			sag.OnGezinti();
		}
	}
	
	public void AraGezinti() {
		
		if(sol != null) {
			sol.OnGezinti();
		}
		
		System.out.println(icerik);
		
		if(sag != null) {
			sag.OnGezinti();
		}
	}
	
	
	public void Ekle(Dugum yeni) {
		
		if(yeni.icerik > this.icerik) {
			if(this.sag == null) {
				this.sag = yeni;
				System.out.println(yeni.icerik + " düğümü " + this.icerik + " sağına eklendi");
			}else {
				sag.Ekle(yeni);
			}
		}else {
			if(this.sol == null) {
				this.sol = yeni;
				System.out.println(yeni.icerik + " düğümü " + this.icerik + " soluna eklendi");
			}else {
				sol.Ekle(yeni);
			}
		}
	}
	
	
	public void sil(Dugum parent, int veri) {
		if(this.icerik == veri) {
			System.out.println("Silinecek Değer= " + this.icerik);
			System.out.println("Parentin Değeri= " + parent.icerik);
			
			if((sag == null) && (sol == null)) {
				System.out.println("silinecek deger: " + this.icerik + " yapraktı");
				if(this.icerik > parent.icerik) {
					parent.sag = null;
				}else {
					parent.sol = null;
				}
				
			}
			
			else if((sag != null) && (sol == null)) {
				System.out.println("silinecek deger: " + this.icerik + " bir tane sağ çocuğu varedır");
				if(this.icerik > parent.icerik) {
					parent.sag = this.sag;
				}else {
					parent.sol = this.sag;
				}
			}
			
			else if((sag == null) && (sol != null)) {
				System.out.println("silinecek deger: " + this.icerik + " bir tane sol çocuğu varedır");
				if(this.icerik > parent.icerik) {
					parent.sag = this.sol;
				}else {
					parent.sol = this.sol;
				}
			}
			
			else if((sag != null) && (sol != null)) {
				Dugum min = this.sag.min(); //sağ çocuğunun en küçük düğümü elde ediyor
				System.out.println("Sağın en küçüğü: " + min);
				
				this.icerik = min.icerik; //sağın en küçüğünü silmek istediğimiz düğüme kopyalıyoruz
				this.sag.min().sil(parent, veri); //önce sağın en küçüğünü siliyoruz
				
				int x = min.icerik;
				this.sag.sil(this, x);
				this.icerik = x;
			}
			
		}else {
			if(this.icerik<veri) {
				if(sag == null) {
					return;
				}else {
					parent = this;
					sag.sil(parent, veri);
				}
			}else {
				if(sol == null) {
					return;
				}else {
					parent = this;
					sol.sil(parent, veri);
				}
			}
		}
	}
	
	public Dugum min() {
		Dugum tmp =this;
		while (tmp.sol != null) {
			if(tmp != null) {
				tmp = tmp.sol;
			}
		}
		return tmp;
	}
	
	public Dugum max() {
		Dugum tmp =this;
		while (tmp.sag != null) {
			if(tmp != null) {
				tmp = tmp.sag;
			}
		}
		return tmp;
	}
	
	
}
