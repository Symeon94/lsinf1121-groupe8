abstract public class Token
{
	private static HashTable<String, Operator> operations;
	
	public static void init()
	{
		operations = new HashTable<String,Operator>();
		//operations.put("add", new Add());
		// TODO ADD OPERATIONS
	}
	
	public static Operator getOperation(String op)
	{
		return operations.get(op);
	}
}