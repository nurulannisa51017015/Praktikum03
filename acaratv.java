class acaratv {
	public String Stasiuntv;
	public String acara;
	
	public String getStasiuntv(){
		return Stasiuntv;
	}
	public void setStasiuntv(String Stasiuntv){
		this.Stasiuntv=Stasiuntv;
	}
	public String getacara(){
		return acara;
	}
	public void setacara(String acara){
		this.acara=acara;
	}
	public void cetak(){
		System.out.println("Acara" +acara+"Stasiun Tv"+Stasiuntv);
	}
	
}
