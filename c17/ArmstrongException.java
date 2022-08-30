package excep;
public class ArmstrongException extends Exception
	{
	public String reason;
	public ArmstrongException(String reason) 
		{
		super(reason);
		this.reason=reason;
		}
	@Override
	public String getMessage()
		{
		return reason;
		}
	@Override
	public String toString()
		{
		return "excep.ArmstrongException : "+reason;
		}
	}
