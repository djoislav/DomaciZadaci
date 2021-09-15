package ZooloskiVrt;

public class Sisari extends Zivotinje{
	
	private String bojaDlake;
	private String covekovaPodela;
	
	public Sisari(String vrsta, String ime, String ishrana, String bojaDlake, String covekovaPodela) {
		super(vrsta, ime, ishrana);
		this.bojaDlake = bojaDlake;
		this.covekovaPodela = covekovaPodela;
		
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getCovekovaPodela() {
		return covekovaPodela;
	}

	public void setCovekovaPodela(String covekovaPodela) {
		this.covekovaPodela = covekovaPodela;
	}
	public void stampanje() {
		super.stampanje();
		System.out.println("Boja dlake im je " + this.bojaDlake + ", a spadaju u " + this.covekovaPodela + " zivotinje");
	}
		
	}



