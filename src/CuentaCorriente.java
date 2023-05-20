
public class CuentaCorriente extends Cuenta implements Tributacion {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}

	@Override
	public double getValorImpuesto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}

}
