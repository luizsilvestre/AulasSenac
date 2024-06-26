package com.agricola.AnaliseSolo.AnaliseSolo.Model;

public class AnaliseSolo {
	private long id;
	 private Amostra amostra;
	    private double pH;
	    private double teorNitrogenio;
	    private double teorFosforo;
	    private double teorPotassio;
	    private double teorMateriaOrganica;
	    private double atividadeMicrobiologica;
	 
	    
	    
	    public AnaliseSolo(long id, Amostra amostra) {
			this.id =id;
			this.amostra = amostra;

}



		public long getId() {
			return id;
		}



		public void setId(double d) {
			this.id = id;
		}



		public Amostra getAmostra() {
			return amostra;
		}



		public void setAmostra(Amostra amostra) {
			this.amostra = amostra;
		}



		public double getpH() {
			return pH;
		}



		public void setpH(double pH) {
			this.pH = pH;
		}



		public double getTeorNitrogenio() {
			return teorNitrogenio;
		}



		public void setTeorNitrogenio(double teorNitrogenio) {
			this.teorNitrogenio = teorNitrogenio;
		}



		public double getTeorFosforo() {
			return teorFosforo;
		}



		public void setTeorFosforo(double teorFosforo) {
			this.teorFosforo = teorFosforo;
		}



		public double getTeorPotassio() {
			return teorPotassio;
		}



		public void setTeorPotassio(double teorPotassio) {
			this.teorPotassio = teorPotassio;
		}



		public double getTeorMateriaOrganica() {
			return teorMateriaOrganica;
		}



		public void setTeorMateriaOrganica(double teorMateriaOrganica) {
			this.teorMateriaOrganica = teorMateriaOrganica;
		}



		public double getAtividadeMicrobiologica() {
			return atividadeMicrobiologica;
		}



		public void setAtividadeMicrobiologica(double atividadeMicrobiologica) {
			this.atividadeMicrobiologica = atividadeMicrobiologica;
		}
	
		@Override
		public String toString() {
			return "AnaliseSolo{" +
	                "id=" + id +
	                ", pH=" + pH +
	                ", teorNitrogenio=" + teorNitrogenio +
	                ", teorFosforo=" + teorFosforo +
	                ", teorPotassio=" + teorPotassio +
	                ", teorMateriaOrganica=" + teorMateriaOrganica +
	                ", atividadeMicrobiologica=" + atividadeMicrobiologica +
	                '}';
		}
	
		
	}
