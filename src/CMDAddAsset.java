
public class CMDAddAsset implements Command {
	private Aggregator agg;
	private String desc;
	private double value;
	
	public CMDAddAsset (String desc, double value, Aggregator agg)
	{
		this.agg = agg;
		this.desc = desc;
		this.value = value;
	}

	@Override
	public void execute() {
		Asset asset = new Asset(desc, value);
		agg.getAssets().add(asset);
		System.out.println ("Asset: " + desc + " of the amount: " + value + " has been added!");
	}

}
