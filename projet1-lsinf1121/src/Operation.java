public class Operation extends Token
{
	private final Operator o;
	
	public Operation(final Operator o)
	{
		this.o = o;
	}
	
	public Operator getOperator()
	{
		return o;
	}
}