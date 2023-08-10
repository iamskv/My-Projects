import java.util.Scanner;
public class BankApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Where do you have your Account?");
	String bankname=scan.next();
	BankFactory bankf=new BankFactory();
	Bank ref=null;
	if(bankname.equals("kodnest"))
	{	
	 ref=(KodnestBank) bankf.getBank("kodnest");
	 System.out.println("WELCOME TO KODNEST BANK");
	}
	else
	{
		ref=(OmkarBank) bankf.getBank("omkar");
		System.out.println("WELCOME TO OMKAR  BANK");
	}
	while(true){
	
	System.out.println("Choose From Below Menu");
	System.out.println("1=======>REGISTRATION");
	System.out.println("2=======>LOGIN");
	System.out.println("3=======>CHECK BALANCE");
	System.out.println("4=======>TRANSFER AMOUNT");
	System.out.println("5=======>UPDATE PASSWORD");
	System.out.println("6=======>UPDATE PROFILE");
	System.out.println("7=======>DELETE ACCOUNT");
	System.out.println("8=======>CHECK PROFILE");
	System.out.println("9=======>STOP ");
	int choice=scan.nextInt();
	switch(choice)
	{
	case 1:
	ref.regiter();
		break;
	case 2:
		ref.login();
		break;
	case 3:
		ref.checkBalance();
		break;
	case 4:
		ref.transferAmount();
		break;
	case 5:
		ref.changePassword();
		break;
	case 6:
		ref.updateProfile();
		break;
	case 7:
		ref.delete();
		break;
	case 8:
		ref.checkProfile();
		break;
	default:
		System.out.println("Thank You For Using Kodnest Online Bank Services...Tata Bye Bye....");
		System.exit(0);
	}
	
}
}
}
