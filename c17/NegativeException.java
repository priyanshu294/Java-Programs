package excep;
public class NegativeException extends Exception
	{
	public String reason;
	public NegativeException(String reason)
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
		return "excep.NegativeException : "+reason;
		}
	}
