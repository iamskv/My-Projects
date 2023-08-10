
public class BankFactory {
	public Bank getBank(String name)
	{
		if(name.equals("kodnest"))
		{
		return KodnestBank.getInstance();
		}
		else
		{
			return OmkarBank.getInstance();
		}
	}
}
