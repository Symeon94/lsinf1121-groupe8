/**
 * Token de type Variable
 */
public class Variable extends Token
{
	// Nom de la variale
	private String name;

	/**
	 * Initialise un nouveau token de type variable
	 * @param name le nom de la nouvelle variable
	 * @pre name != null
	 */
	public Variable(String name)
	{
		this.name = name;
	}
	
	/** @return le nom de la variable*/
	public String getName() {return name;}
}