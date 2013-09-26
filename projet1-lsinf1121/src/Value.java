public class Value<E> extends Token
{
	private E element;

	public Value(E element)
	{
		this.element = element;
	}
	
	public E getElement()
	{
		return element;
	}

}