import java.text.NumberFormat;
import java.util.Scanner;

public class BudgetCalc {

	public static void main(String[] args) {
		double annualIncome;

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			
		
		// enter yearly income
		System.out.println("Enter Yearly Income");
		annualIncome = Integer.parseInt(sc.nextLine().replaceAll(",", ""));

		 //Double.parseDouble(annualIncome());
		

		// guidelines for spending and saving

		double housingBudget = annualIncome * .30;

		System.out.println("Housing:");
		System.out.print("You should be spending no more than:  ");
		cashFormat(housingBudget);
		System.out.print(" a year or ");
		cashFormat(housingBudget / 12);
		System.out.println(" a month on housing.");
		System.out.println();

		double utilities = annualIncome * .08;

		System.out.println("Utilities");
		System.out.println("You should be spending no more than:  ");
		cashFormat(utilities);
		System.out.println(" a year or ");
		cashFormat(utilities / 12);
		System.out.println(" monthly on utility  cost");
		System.out.println();

		double transportation = annualIncome * .10;

		System.out.println("Transportation");
		System.out.print("You should be spending no more than:  ");
		cashFormat(transportation);
		System.out.println(" a year or ");
		cashFormat(transportation/12);
		System.out.println(" monthly on Transportation  cost");
		System.out.println();

		double healthCare = annualIncome * .10;
		
System.out.println("Healthcare");
		System.out.println("You should be spending no more than:  ");
		cashFormat(healthCare);
		System.out.println(" a year or ");
		cashFormat(healthCare / 12);
		System.out.println(" monthly on Health Care  cost");
		System.out.println();

		double foodCost = annualIncome * .10;
		
System.out.println("Food");
		System.out.println("You should be spending no more than:  ");
		cashFormat(foodCost);
		System.out.println(" a year or ");
		cashFormat(foodCost / 12);
		System.out.println(" monthly on food spending  cost");
		System.out.println();

		double invest = annualIncome * .10;
		
System.out.println("Retirement");
		System.out.println("You should be saving at least:  ");
		cashFormat(invest);
		System.out.println(" a year or ");
		cashFormat(invest / 12);
		System.out.println(" monthly on investing for your retirement");
		System.out.println();

		double debt = annualIncome * .10;
		
System.out.println("Debt Payoff");
		System.out.println("You should be paying no more than:  ");
		cashFormat(debt);
		System.out.println(" a year or ");
		cashFormat(debt / 12);
		System.out.println(" monthly on debt. Try to minimize or eliminate "
				+ "debt to increase other areas of spening or saving");
System.out.println();
		
		double charity = annualIncome * .10;
		
System.out.println("Charity");
		System.out.println("You can invest:  ");
		cashFormat(charity);
		System.out.println(" a year or ");
		cashFormat(charity / 12);
		System.out.println(" monthly into your tithes or any chairities you care about.");
		System.out.println();

		double entertainment = annualIncome * .01;
		
System.out.println("Entertainment");
		System.out.println("You can spend:  ");
		cashFormat(entertainment);
		System.out.println(" a year or ");
		cashFormat(entertainment / 12);
		System.out.println(" monthly on entertainment, this can increase greatly as you pay debt off");
System.out.println();

		double miscSpend = annualIncome * .01;

		System.out.println("Misc Personal Spending");
		System.out.println("You can spend:  ");
		cashFormat(miscSpend);
		System.out.println(" a year or ");
		cashFormat(miscSpend / 12);
		System.out.println(" monthly on Misc Personal , this can increase greatly as you pay debt off");
		System.out.println();
		System.out.print("Contine y/n?: ");
		choice = sc.nextLine();
		}
		sc.close();

	}

	public static void cashFormat(double value) {

		// NumberFormat.getCurrencyInstance().format(value);

		System.out.print(NumberFormat.getCurrencyInstance().format(value));
	}
}
