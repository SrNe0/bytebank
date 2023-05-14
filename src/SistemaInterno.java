
public class SistemaInterno {

	private String clave = "12345";

	public boolean autentica(FuncionarioAutenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Error en el Login");
			return false;
		}
	}

}
 