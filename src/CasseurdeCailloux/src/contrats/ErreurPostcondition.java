package contrats;

public class ErreurPostcondition extends ErreurContrat {
	private static final long serialVersionUID = 9050050491786738283L;

	public ErreurPostcondition(String message) {
		super("Postcondition failed: "+message);
	}

}
