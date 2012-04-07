package contrats;

public class ErreurInvariant extends ErreurContrat {
	private static final long serialVersionUID = 2050146913131637445L;

	public ErreurInvariant(String message) {
		super("Invariant failed: "+message);
	}

}
