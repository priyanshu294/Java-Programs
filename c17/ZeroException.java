package excep;
public class ZeroException extends Exception
	{
	public String reason;
	public ZeroException(String reason)
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
		return "excep.ZeroException : "+reason;
		}
	}


	
