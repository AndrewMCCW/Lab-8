
public class CMDGetNetWorth implements Command {
	private Aggregator agg;
	private double net_worth;
	private double ta;
	private double tl;
	
	public CMDGetNetWorth(Aggregator agg)
	{
		this.agg = agg;
	}
	
	@Override
	public void execute() 
	{
		
		int asset_size = agg.getAssets().size();
		int liability_size = agg.getLiabilities().size();
		int max;
		if (asset_size > liability_size)
			max = asset_size;
		else
			max = liability_size;
		
		for (int i = 0; i < max; i++)
		{
			if (i > asset_size)
				tl = tl + agg.getLiabilities().get(i).getAmount();
			if(i > liability_size)
				ta = ta + agg.getAssets().get(i).getAmount();
			
			if (i <= asset_size && i <= liability_size)
			{
				tl = tl + agg.getLiabilities().get(i).getAmount();
				ta = ta + agg.getAssets().get(i).getAmount();
			}
		}
		
		net_worth = ta - tl;
		System.out.println("With Total Assets Amounting to: " + ta + " and  Total Liabilities Amount to: " + tl + "\n You're current/total Net Worth is: " + net_worth);
		
	}
	
}
