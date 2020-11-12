package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg [] innleggtabell;
	private int nesteLedig;

	public Blogg() {
	innleggtabell = new Innlegg [20];
	nesteLedig = 0;
	
		
		
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteLedig = 0;
		
		
	}

	public int getAntall() {
		
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		
		
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		int funnet = -1;
		
		for (int i = 0; i < nesteLedig-1; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				funnet = i;
			}
			}
		
			return funnet;
	}	

	public boolean finnes(Innlegg innlegg) {
		
		
					for (Innlegg i : innleggtabell) {
						
					if (i !=null && i.erLik(innlegg)) {
						return true;
			}
			
		}
		return false;
		
		
	}
		
	public boolean ledigPlass() {
		
	
		if (nesteLedig < innleggtabell.length) {
			return true;
		} else {
			return false;
		}
		}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (!(finnes(innlegg)) && ledigPlass()) {
			innleggtabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		} else {
			return false;
		}
		}
	
	public String toString() {
		String svar = "";
		
		for (int i = 0; i < nesteLedig; i++) {
			svar +=innleggtabell[i].toString();
			
	}
		return nesteLedig + "\n" + svar;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
	Innlegg [] nytabell = new Innlegg [innleggtabell.length*2];
		
	for (int i = 0 ; i < nytabell.length; i++) {
		nytabell[i] = innleggtabell[i];
	}
	}
	
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
		}
	
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}