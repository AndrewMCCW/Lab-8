import java.util.ArrayList;

public class Aggregator {
	private ArrayList<Asset> total_assets;
	private ArrayList<Liability> total_liabilities;
	
	public Aggregator ()
	{
		total_assets = new ArrayList<Asset>();
		total_liabilities = new ArrayList<Liability>();
	}
	
	public ArrayList<Asset> getAssets()
	{
		return total_assets;
	}
	
	public ArrayList<Liability> getLiabilities()
	{
		return total_liabilities;
	}
	
	
}
