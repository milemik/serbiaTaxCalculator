


public class CalcTax{

	public void taxEmployed(Double earning, Double basic, Double pdv, Double pio){
		Double sum = pdv + pio;
		Double procent = sum/earning * 100;
		
		this.printEarning(earning);
		this.printBasic(basic);
		this.printPdv(pdv);
		this.printPio(pio);
		this.printSum(sum);
		this.printProcent(procent);
	}

	public void taxUnemployed(Double earning, Double basic, Double pdv, Double pio, Double zdr){
		Double sum = pdv + pio + zdr;
		Double procent = sum/earning * 100;
		
		this.printEarning(earning);
		this.printBasic(basic);
		this.printPdv(pdv);
		this.printPio(pio);
		this.printZdr(zdr);
		this.printSum(sum);
		this.printProcent(procent);
	}

	public void printEarning(Double earning) {
		System.out.println("Zarada koju ste uneli: " + earning);
	}
	public void printBasic(Double basic){
		System.out.println("Osnovica za obracunavanje poreza: " + basic);
	}
	public void printPdv(Double pdv){
		System.out.println("Porez na dohodak (PDV): " + pdv);
	}
	public void printPio(Double pio){
		System.out.println("Penziono osiguranje (PIO): " + pio);
	}
	public void printZdr(Double zdr){
		System.out.println("Zdravstveno osiguranje: " + zdr);
	}
	public void printSum(Double sum) {
		System.out.println("Ukupno za uplatu: " + sum); 
	}
	public void printProcent(Double procent){
		System.out.println("Procenat od zarade koji dajemo drzavi: " + procent);
	}

}
