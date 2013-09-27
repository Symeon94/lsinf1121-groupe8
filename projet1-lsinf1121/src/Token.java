import java.util.*;

abstract public class Token
{
	private static Hashtable<String, Operator> operations;
	
	public static void init()
	{
		operations = new Hashtable<String,Operator>();
		//operations.put("add", new Add());
		// TODO ADD OPERATIONS
	}
	
	public static Operator getOperation(String op)
	{
		return operations.get(op);
	}
}