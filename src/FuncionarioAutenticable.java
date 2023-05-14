
public class FuncionarioAutenticable extends Funcionario {
	private String clave;
	
	

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		if (this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
