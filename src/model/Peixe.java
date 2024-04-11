package model;

public class Peixe extends Animal {
	
	private String caracteristica;
	
	public Peixe () {
		super();
		this.setPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		
	}
	
	public String getCaracteristicas() {
		return caracteristica;
	}

	public void setCaracteristicas(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
	
	public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
	
}
