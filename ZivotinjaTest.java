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
		IUS.dodajZivotinju("Amra", "macka", 4);
		IUS.dodajZivotinju("Sanela", "riba", 0);
		IUS.dodajZivotinju("Davor", "pas", 4);
		System.out.println(IUS.toString());
		System.out.println("Ukupno zivotinja: " + Zoo.brojac);
		int brojVrsta = IUS.izbrojVrste("pas");
		System.out.println("U skladištu IUS imate " + brojVrsta + " psa.");
		IUS.eliminisi("Haris");
		System.out.println(IUS.toString());
	
	}
}
