package lab22;

public class ZivotinjaTest {

	public static void main(String[] args) {
		Zoo skloniste = new Zoo();
		skloniste.dodajZivotinju("Pujdo", "pas", 4);
		skloniste.dodajZivotinju("Cicko", "macka", 4);
		skloniste.dodajZivotinju("Rex", "pas", 4);
		skloniste.dodajZivotinju("Mrva", "ptica", 2);
		skloniste.dodajZivotinju("Molly", "ptica", 2);
		System.out.println(skloniste.toString());
		System.out.println();
		Zoo IUS = new Zoo();
		IUS.dodajZivotinju("Haris", "pas", 4);
		IUS.dodajZivotinju("Jesenko", "macka", 4);
		IUS.dodajZivotinju("Necko", "pas", 4);
		IUS.dodajZivotinju("Edib", "ptica", 2);
		IUS.dodajZivotinju("Gordan", "konj", 4);
		System.out.println(IUS.toString());
		System.out.println("Ukunpno zivotinja: " + Zoo.brojac);
	
	}
}
