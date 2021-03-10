package magacin;

import java.util.LinkedList;

import artikli.Artikal;
import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	private LinkedList<Artikal> artikli=new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		if(!artikli.contains(artikal)) {
			artikli.add(artikal);
		}else {
			for(Artikal a:artikli) {
				if(a.equals(artikal)) {
					a.setKolicina(a.getKolicina() + artikal.getKolicina());
				}
			}
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		for(Artikal a:artikli) {
			if(a.equals(artikal)) {
				a.setKolicina(a.getKolicina() - artikal.getKolicina());
			}
		}
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for(Artikal artikal:artikli) {
			if(artikal.getSifra()==sifra) {
				return artikal;
			}
		}
		return null;
	}

}
