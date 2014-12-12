package lab22;

public class Zivotinja {

	private String ime;
	private String vrsta;
	private int brojNogu;
	
	/**
	 * Konstruktor bez parametara, dodjeljuje default vrijednosti
	 */
	
	public Zivotinja()
	{
		this("Nepoznato", "Nepoznato", 0);
	}

	/**
	 * Konstruktor sa svim parametrima
	 * @param ime
	 * @param vrsta
	 * @param brojNogu
	 */
	
	public Zivotinja(String ime1, String vrsta1, int brojNogu1) 
	{
		ime = ime1;
		vrsta = vrsta1;
		brojNogu = brojNogu1;
	}
	
	/**
	 * Copy konstruktor
	 * @param other
	 */
	
	public Zivotinja(Zivotinja other)
	{
		this.ime = other.ime;
		this.vrsta = other.vrsta;
		this.brojNogu = other.brojNogu;
	}
	
	/**
	 * 
	 * @param ime
	 * @param vrsta
	 */
	
	public Zivotinja(String ime1, String vrsta)
	{
		if (vrsta.equals("konj") || vrsta.equals("pas") || vrsta.equals("macka"))
		{
			this.brojNogu = 4;
		}
		else if (vrsta.equals("ptica"))
		{
			this.brojNogu = 2;
		}
		else
		{
			this.brojNogu = 0;
		}
		this.ime = ime;
		this.vrsta = vrsta;
	}
	
	/**
	 * Funkcija kreira string za ispis u koji smješta sve varijable
	 * srtZivotinja
	 */
	
	public String toString()
	{
		String strZivotinja = "";
		strZivotinja = "Ime: " + ime + "\nVrsta: " + vrsta + "\nBroj nogu: " + brojNogu;
		return strZivotinja;
	}
	
	/**
	 * Getter za varijablu ime
	 * @return ime
	 */
	
	public String getIme()
	{
		return ime;
	}
	
	/**
	 * Getter za varijablu vrsta
	 * @return vrsta
	 */
	
	public String getVrsta()
	{
		return vrsta;
	}
	
	/**
	 * Getter za varijablu brojNogu
	 * @return brojNogu
	 */
	
	public int getBrNogu()
	{
		return brojNogu;
	}
	
	/**
	 * Setter za varijablu ime
	 */
	
	public void setIme()
	{
		this.ime = ime;
	}
	
	/**
	 * Setter za varijablu vrsta
	 */
	
	public void setVrsta()
	{
		if (vrsta != "pas"  && vrsta != "macka" && vrsta != "konj" && vrsta != "ptica" && vrsta != "riba")
		{
			throw new IllegalArgumentException("Niste unijeli validnu vrstu!");
		}
		else
		{
			this.vrsta = vrsta;
		}
	}
	
	/**
	 * Setter za varijablu brojNogu
	 */
	
	public void setBrNogu()
	{
		if (this.vrsta.equals("pas") || this.vrsta.equals("macka") || this.vrsta.equals("konj"))
		{
			if (this.brojNogu > 4 || this.brojNogu < 0)
			{
				throw new IllegalArgumentException("Niste unijeli ispravan broj nogu!");
			}
			this.brojNogu = 4;
		}
		if (this.vrsta.equals("ptica"))
		{
			if (this.brojNogu < 0 || this.brojNogu > 2)
			{
				throw new IllegalArgumentException("Niste unijeli ispravan broj nogu!");
			}
			this.brojNogu = 2;
		}
		if (this.vrsta.equals("riba"))
		{
			if (this.brojNogu != 0)
			{
				throw new IllegalArgumentException("Niste unijeli ispravan broj nogu!");
			}
			this.brojNogu = 0;
		}
	
	}
	

}
