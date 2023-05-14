
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin1 = new Administrador();
		gerente1.setClave("12345");
		admin1.setClave("12345");
		
		sistema.autentica(gerente1);
		sistema.autentica(admin1);	}

}
