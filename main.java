class Main{

	public static void main(String[] args) {
		InputEarning userInp = new InputEarning();
		userInp.setEraning();
		userInp.setStatus();
		String stat = userInp.getStatus();
		Double earning = userInp.getErning();
		Taxes tax = new Taxes();

		tax.inputEarning(earning);
		tax.setBasic();
		Double basic = tax.getBasic();
		Double pdv = tax.calcPdv();
		Double pio = tax.calcPio();
		
		CalcTax calctax = new CalcTax();
		if (stat.equals("E")) {
			calctax.taxEmployed(earning=earning, basic=basic, pdv=pdv, pio=pio);
		}
		else if (stat.equals("U")){
			Double zdr = tax.calcZdr();
			calctax.taxUnemployed(earning=earning, basic=basic, pdv=pdv, pio=pio, zdr=zdr);
		}
	}
}
