import java.util.Scanner;


public class InputEarning{
	Double earning;
	String status;
 
	public void setEraning(){
		while (true) {
			Scanner earning = new Scanner(System.in);
			System.out.println("Unesite vasu zaradu:");
			String strInput = earning.nextLine();
			try {
				Double doubleEarning = Double.parseDouble(strInput);
				this.earning = doubleEarning;
				break;
			}
			catch (NumberFormatException e) {
				System.out.println("Molimo unesite validan broj!");
			}
		}
	}	

	public Double getErning() {
		return this.earning;
	}

	public void setStatus(){

		while (true){
			Scanner userInp = new Scanner(System.in);
			System.out.println("Molimo ako ste u radnom odnosu unesite (E) ako niste u radnom odnosu unesite (U)");
			String strInput = userInp.nextLine();
			String inpStr = strInput.toString();
			String employe = "E";
			String unemploy = "U";
			if (inpStr.equals(employe) || inpStr.equals(unemploy)) {
				this.status = strInput;
				break;
			}
			else {
				System.out.println("Unos nije prepoznat, molimo unesite E ili U");
			}
		}
	}

	public String getStatus(){
		return this.status;
	}
}
