
public class Asset {
	private String desc;
	private double amount;
	
	public Asset (String desc, double amount)
	{
		this.desc = desc;
		this.amount = amount;
	}
	
	public void setDesc(String value)
	{
		desc = value;
	}
	
	public void setAmount (double amount)
	{
		this.amount = amount;
	}
	
	public Double getAmount ()
	{
		return this.amount;
	}
	
	public String getDesc()
	{
		return this.desc;
	}
}
