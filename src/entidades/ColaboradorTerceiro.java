package entidades;

public class ColaboradorTerceiro extends Colaborador {

	private Double horaAdicional;
	
	public ColaboradorTerceiro() {
		super();
	}

	public ColaboradorTerceiro(String nome, Integer horas, Double valorPorHora, Double horaAdicional) {
		super(nome, horas, valorPorHora);
		this.horaAdicional = horaAdicional;
	}

	public Double getCargaAdicional() {
		return horaAdicional;
	}

	public void setCargaAdicional(Double horaAdicional) {
		this.horaAdicional = horaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + horaAdicional * 1.1;
	}
}
