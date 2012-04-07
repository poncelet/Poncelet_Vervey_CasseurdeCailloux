package impl;

import services.EtatJeu;
import services.TypeBloc;
import services.TypeDirection;

public class MoteurJeu {
	private Terrain Jeu;
	private int PasMax;
	private int Pas;
	private int NbDiamant;
	private EtatJeu etat;
	
	public MoteurJeu() {
		Jeu = null;
		PasMax = 0;
		Pas = 0;
		NbDiamant = 0;
		etat = EtatJeu.INIT;
	}
	
	/**
	 * Cette méthode controle la validite du Jeu (Jeu et PasMax) NbHero & NbPorte aussi ?? << TODO
	 * Met le nombre de Diamant présent dans NbDiamant
	 * Passe l'état de INIT à ENCOURS (si bon)
	 * (Si fonction de test (observateurs) à simplifier dans inv)
	 */
	public void LancementDeJeu() {
		if(Jeu != null && PasMax != 0) {
			
			// Attention bornes (test Terrain ?)
			for(int x = 1; x < Jeu.PrendreX()+1; x++) {
				for(int y = 1 ; y < Jeu.PrendreY()+1; y++) {
					if(Jeu.PrendreBloc(x, y).PrendreType() == TypeBloc.DIAMANT)
						NbDiamant ++;
				}
			}
			
			etat = EtatJeu.ENCOURS;
		}
	}
	
	/**
	 * Cette méthode ne peut etre lancée que si le Jeu est Encours
	 * A savoir : Jeu != null, PasMax != 0 (Donc Etat = ENCOURS) fonction de test ?
	 * 
	 */
	public void Calcul(TypeDirection d) {
		// Attention bornes (test Terrain ?)
		for(int x = 1; x < Jeu.PrendreX()+1; x++) {
			for(int y = 1 ; y < Jeu.PrendreY()+1; y++) {
				//Mettre à jour le Terrain (chutes)
				Jeu.Chutes(x, y);
			}
		}
		// Tester en fonction de la direction le héro (Estavançable) << TODO (attention pousser rocher)
		// Tester si il peut avancer la case d'arriver (porte_o : Gagné,
		//												diamant :NbDiamant-1 si 0 Porte Ouvrir, (ajouter fonction ouvrir porte terrain ?)
		//												NbPas + 1 si = Max : perdu)
		// S'il ne peut avancer, tester si case hero != hero : Perdu (écrasement)
	}
}
