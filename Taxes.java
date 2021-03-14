public class Taxes {
	Double earning;
	Double basic = 0.0;

	public void inputEarning(Double earning) {
		this.earning = earning;
	}

	public void setBasic(){
		 this.basic = this.earning * 80/100;
	}
	
	public Double getBasic(){
		return this.basic;
	}

	public Double calcPio(){
		if (this.basic != 0) {
			return this.basic * 25.5/100;
		}
		else {
			System.out.println("Please calculate basic");
			return this.basic;
		}
	}

	public Double calcPdv() {
		if (this.basic != 0) {
			return this.basic * 20/100;
		}
		else {
			System.out.println("Please calculate basic");
			return this.basic;
		}
	}

	public Double calcZdr(){
		if (this.basic != 0) {
			return this.basic * 11.6/100;
		}
		else {
			System.out.println("Please calculate basic");
			return this.basic;
		}
	}


	public void endSpeach(){
		Double percent = (this.calcPdv() + this.calcPio())/this.earning * 100;
		System.out.println("You just give your goverment " + percent + "% of your earnings");
	}
	
}
