package lab22;

public class Zoo {
	private Zivotinje[] zivotinje;
	private int brojZivotinja;
	public static int brojac;
	
	public Zoo()
	{
		zivotinje = new Zivotinje[10];
		brojZivotinja = 0;
	}
	
	public void dodajZivotinju(String ime, String vrsta, int brojNogu)
	{
		brojac++;
		zivotinje[brojZivotinja] = new Zivotinje(ime, vrsta, brojNogu);
		brojZivotinja++;
		if(brojZivotinja == zivotinje.length)
		{
			resizeZivotinje();
		}
	}
	
	public void resizeZivotinje() {
		int novaDuzina = 2 * zivotinje.length;
		Zivotinje[] pomocna = new Zivotinje[novaDuzina];
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
	
	public int izbrojVrste(String vrsta)
	{
		int broj = 0;
		for (int i=0; i<brojZivotinja; i++)
		{
			if (zivotinje[i].getVrsta().equals(vrsta))
			{
				broj++;
			}
		}
		return broj;
	}
	
	public void eliminisi(String ime)
	{
		Zivotinje[] pomocna = new Zivotinje[zivotinje.length-1];
		for (int i=0; i<zivotinje.length; i++)
		{
			if (zivotinje[i].getIme() != ime);
			{
				pomocna[i] = zivotinje[i];
			}
		}
		zivotinje = pomocna;
	}
}
