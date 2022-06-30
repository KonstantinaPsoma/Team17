import java.util.ArrayList;

public abstract class Katalogos_Aitiseon {
	private ArrayList<Aitisi> aitiseis = new ArrayList<Aitisi>();
	
	
	public void Apothikefsi_Stoixeion(int ID, String aitwn, String Hmeromhnia) {
		// TODO - implement Katalogos_Aitiseon.Apothikefsi_Stoixeion
		throw new UnsupportedOperationException();
	}

	public void Kataxorisi_Aitisis(Aitisi ait) {
		aitiseis.add(ait);
	}

	public ArrayList<Aitisi> getAitiseis() {
		return aitiseis;
	}

	public void setAitiseis(ArrayList<Aitisi> aitiseis) {
		this.aitiseis = aitiseis;
	}

	public void GetProtokolimenes() {
		// TODO - implement Katalogos_Aitiseon.GetProtokolimenes
		throw new UnsupportedOperationException();
	}

	public void GetAitiseisEisigiti() {
		// TODO - implement Katalogos_Aitiseon.GetAitiseisEisigiti
		throw new UnsupportedOperationException();
	}

}