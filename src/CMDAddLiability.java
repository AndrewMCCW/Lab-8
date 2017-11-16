
public class CMDAddLiability implements Command {
	private Aggregator agg;
	private String desc;
	private double value;
	
	public CMDAddLiability(String desc, double value, Aggregator agg)
	{
		this.agg = agg;
		this.value = value;
		this.desc = desc;
	}
	
	@Override
	public void execute()
	{
		Liability l = new Liability(desc, value);
		agg.getLiabilities().add(l);
		System.out.println ("Liability: " + desc + " of the amount: " + value + " has been added!");
	}

}
