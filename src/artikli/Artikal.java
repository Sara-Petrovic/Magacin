package artikli;

public class Artikal {
	//klasa Artikal
	
	private int sifra;
	private String naziv;
	private String opis;
	private int kolicina;
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra<0) {
			throw new RuntimeException("Sifra mora biti veca ili jednaka nuli.");
		}
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.isEmpty()) {
			throw new RuntimeException("Naziv ne sme biti null i mora sadrzati bar jedan karakter.");
		}
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis==null || opis.isEmpty()) {
			throw new RuntimeException("Opis ne sme biti null i mora sadrzati bar jedan karakter.");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina<0) {
			throw new RuntimeException("Kolicina ne sme biti manja od nule.");
		}
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina;
	}
	
	
	
	
	
}
