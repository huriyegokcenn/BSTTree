package bstAgaco;

public class Agac {
	Dugum kok;
	public Agac() {
		kok = null;
	}
	
	public void Ekle(Dugum dl) {
		//return-return-return düğüm ekle metodu
		Dugum tmp = kok;
		
		if(kok == null) {
			kok = dl;
			System.out.println(dl.icerik + " düğümü köke eklendi");
			return;
			
		}
		
		while(tmp != null) {
			Dugum ebeveyn = tmp;
			
			if(dl.icerik > tmp.icerik) {
				tmp = tmp.sag;
				if(tmp == null) {
					ebeveyn.sag = dl;
					System.out.println(dl.icerik + " sağa eklendi");
					return;
				}
			}
			
			else if(dl.icerik < tmp.icerik) {
				tmp = tmp.sol;
				if(tmp == null) {
					ebeveyn.sol = dl;
					System.out.println(dl.icerik + " sola eklendi");
					return;
				}
			}
		
		}

	}

}














