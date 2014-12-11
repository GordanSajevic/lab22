package lab22;

public class Zoo {
	private Zivotinja[] zivotinje;
	private int brojZivotinja;
	public static int brojac;
	
	public Zoo()
	{
		zivotinje = new Zivotinja[10];
		brojZivotinja = 0;
	}
	
	public void dodajZivotinju(String ime, String vrsta, int brojNogu)
	{
		brojac++;
		zivotinje[brojZivotinja] = new Zivotinja(ime, vrsta, brojNogu);
		brojZivotinja++;
		if(brojZivotinja == zivotinje.length)
		{
			resizeZivotinje();
		}
	}
	
	public void resizeZivotinje() {
		int novaDuzina = 2 * zivotinje.length;
		Zivotinja[] pomocna = new Zivotinja[novaDuzina];
		for (int i=0; i<zivotinje.length; i++)
		{
			pomocna[i] = zivotinje[i];
		}
		zivotinje = pomocna;
	}

	public void dodajZivotinju(String ime, String vrsta)
	{
		dodajZivotinju(ime, vrsta);
	}
	
	public String toString()
	{
		String strZoo = "";
		for (int i=0; i<brojZivotinja; i++)
		{
			strZoo += zivotinje[i].toString() + "\n";
		}
		return strZoo;
	}
}
