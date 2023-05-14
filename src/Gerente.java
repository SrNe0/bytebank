
public class Gerente extends Funcionario implements Autenticable {

	private AutenticacionUtil util;

	public Gerente() {
		this.util = new AutenticacionUtil();
	}

	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return 2000;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);

	}

}
