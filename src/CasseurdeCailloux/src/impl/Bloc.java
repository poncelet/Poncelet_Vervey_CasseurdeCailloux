package impl;

import services.TypeBloc;

public class Bloc {
	private TypeBloc type;
	
	public Bloc() {type = TypeBloc.VIDE;}
	
	public TypeBloc PrendreType() {return type;}
	
	public void MettreType(TypeBloc t) {type = t;}
	
}
