package contrats;

public class ErreurPrecondition extends ErreurContrat {
	private static final long serialVersionUID = 9050050491786738283L;

	public ErreurPrecondition(String message) {
		super("Postcondition failed: "+message);
	}
}
