package computingIncomeTax;
/**
 * This is a program to determine change over 9 yrs in income tax 
 * Before and after the passage of the Tax Cuts and Job Act (TCJA)
 * Which went into effect January 1, 2018.
 * This program will not take into account deductions, exemptions etc
 * @author nitrocyborc
 * @version 9/4/2018
 * */
import java.util.Scanner;

public class ComputeIncomeTax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type in 1 [single], 2 [married filing jointly], 3 [married filing separately], 4 [Head of household]: ");
		int filingStatus = scan.nextInt();
		if (filingStatus > 4) {
			System.out.println("Please type in a number btween 1 and 4!");
			System.exit(filingStatus);
		}
		System.out.print("Type in your Income: ");
		double income = scan.nextDouble();
		double taxPay = 0;
		double taxPay2 = 0;
		// 2009 tax bracket difference
		int singleTaxRate10 = 8350;
		int singleTaxRate15 = 25600;
		int singleTaxRate25 = 48300;
		int singleTaxRate28 = 89300;
		int singleTaxRate33 = 201400;
		
		int marriedTaxRate10 = 16700;
		int marriedTaxRate15 = 51200;
		int marriedTaxRate25 = 69150;
		int marriedTaxRate28 = 71800;
		int marriedTaxRate33 = 164100;
		
		int separateTaxRate10 =  8350;
		int separateTaxRate15 = 25600;
		int separateTaxRate25 = 34575;
		int separateTaxRate28 = 35900;
		int separateTaxRate33 = 82050;
		
		int headTaxRate10 = 11950;
		int headTaxRate15 = 33550;
		int headTaxRate25 = 71950;
		int headTaxRate28 = 72750;
		int headTaxRate33 = 182750;
		
		if (filingStatus == 1) {
			// 10% rate
			if (income <= 8350) {
				taxPay = income * .1;
			}
			// 15% rate
			else if (income > 8350 && income <= 33950) {
				taxPay = (singleTaxRate10 * .1) + ((income - singleTaxRate10) * .15);
			}
			// 25% rate
			else if (income > 33950 && income <= 82250) {
				taxPay = (singleTaxRate10 * .1) + (singleTaxRate15 * .15) + ((income - (singleTaxRate15 + singleTaxRate10)) * .25);
			}
			// 28% rate
			else if (income > 82250 && income <= 171550) {
				taxPay = (singleTaxRate10 * .1) + (singleTaxRate15 * .15) + (singleTaxRate25 * .25) + ((income - (singleTaxRate15 + singleTaxRate10 + singleTaxRate25)) * .28);
			}
			// 33% rate
			else if (income > 171550 && income <= 372950) {
				taxPay = (singleTaxRate10 * .1) + (singleTaxRate15 * .15) + (singleTaxRate25 * .25) + (singleTaxRate28 * .28) + ((income - (singleTaxRate15 + singleTaxRate10 + singleTaxRate25 + singleTaxRate28)) * .33);
			}
			// 35% rate
			else {
				taxPay = (singleTaxRate10 * .1) + (singleTaxRate15 * .15) + (singleTaxRate25 * .25) + (singleTaxRate28 * .28) + (singleTaxRate33 * .33) + ((income - 372950) * .35);
			}
		}
		else if (filingStatus == 2) {
			// 10% rate
			if (income <= 16700) {
				taxPay = income * .1;
			}
			// 15% rate
			else if (income > 16700 && income <= 67900) {
				taxPay = (marriedTaxRate10 * .1) + ((income - marriedTaxRate10) * .15);
			}
			// 25% rate
			else if (income > 67900 && income <= 137050) {
				taxPay = (marriedTaxRate10 * .1) + (marriedTaxRate15 * .15) + ((income - (marriedTaxRate10 + marriedTaxRate15)) * .25);
			}
			// 28% rate
			else if (income > 137050 && income <= 208850) {
				taxPay = (marriedTaxRate10 * .1) + (marriedTaxRate15 * .15) + (marriedTaxRate25 * .25) + ((income - (marriedTaxRate15 + marriedTaxRate10 + marriedTaxRate25)) * .28);
			}
			// 33% rate
			else if (income > 208850 && income <= 372950) {
				taxPay = (marriedTaxRate10 * .1) + (marriedTaxRate15 * .15) + (marriedTaxRate25 * .25) + (marriedTaxRate28 * .28) + ((income - (marriedTaxRate15 + marriedTaxRate10 + marriedTaxRate25 + marriedTaxRate28)) * .33);
			}
			// 35% rate
			else {
				taxPay = (marriedTaxRate10 * .1) + (marriedTaxRate15 * .15) + (marriedTaxRate25 * .25) + (marriedTaxRate28 * .28) + (marriedTaxRate33 * .33) + ((income - 372950) * .35);
			}
		}
		else if (filingStatus == 3) {
			// 10% rate
			if (income <= 8350) {
				taxPay = income * .1;
			}
			//15% rate
			else if (income > 8350 && income <= 33950) {
				taxPay = (separateTaxRate10 * .1) + ((income - separateTaxRate10) * .15);
			}
			// 25% rate
			else if (income > 33950 && income <= 68525) {
				taxPay = (separateTaxRate10 * .1) + (separateTaxRate15 * .15) + ((income - (separateTaxRate10 + separateTaxRate15)) * .25);
			}
			// 28% rate
			else if (income > 68525 && income <= 104425) {
				taxPay = (separateTaxRate10 * .1) + (separateTaxRate15 * .15) + (separateTaxRate25 * .25) + ((income - (separateTaxRate15 + separateTaxRate10 + separateTaxRate25)) * .28);
			}
			// 33% rate
			else if (income > 104425 && income <= 186475) {
				taxPay = (separateTaxRate10 * .1) + (separateTaxRate15 * .15) + (separateTaxRate25 * .25) + (separateTaxRate28 * .28) + ((income - (separateTaxRate15 + separateTaxRate10 + separateTaxRate25 + separateTaxRate28)) * .33);
			}
			// 35% rate
			else {
				taxPay = (separateTaxRate10 * .1) + (separateTaxRate15 * .15) + (separateTaxRate25 * .25) + (separateTaxRate28 * .28) + (separateTaxRate33 * .33) + ((income - 372950) * .35);
			}
		}
		else if (filingStatus == 4) {
			// 10% rate
			if (income <= 11950) {
				taxPay = income * 0.1;
			}
			// 15% rate
			else if (income > 11950 && income <= 45500) {
				taxPay = (headTaxRate10 * .1) + ((income - headTaxRate10) * .15);
			}
			// 25% rate
			else if (income > 45500 && income <= 117450) {
				taxPay = (headTaxRate10 * .1) + (headTaxRate15 * .15) + ((income - (headTaxRate10 + headTaxRate15)) * .25);
			}
			// 28% rate
			else if (income > 117450 && income <= 190200) {
				taxPay = (headTaxRate10 * .1) + (headTaxRate15 * .15) + (headTaxRate25 * .25) + ((income - (headTaxRate15 + headTaxRate10 + headTaxRate25)) * .28);
			}
			// 33% rate
			else if (income > 190200 && income <= 372950) {
				taxPay = (headTaxRate10 * .1) + (headTaxRate15 * .15) + (headTaxRate25 * .25) + (headTaxRate28 * .28) + ((income - (headTaxRate15 + headTaxRate10 + headTaxRate25 + headTaxRate28)) * .33);
			}
			// 35% rate
			else {
				taxPay = (headTaxRate10 * .1) + (headTaxRate15 * .15) + (headTaxRate25 * .25) + (headTaxRate28 * .28) + (headTaxRate33 * .33) + ((income - 372950) * .35);
			}
		}
		else {
			System.out.println("Type in only one number from 1-4");
		}
		
		//2018 Tax bracket difference
		int single2018TaxRate10 = 9525;
		int single2018TaxRate12 = 29175;
		int single2018TaxRate22 = 43800;
		int single2018TaxRate24 = 75000;
		int single2018TaxRate32 = 42500;
		int single2018TaxRate35 = 300000;
		int single2018TaxRate37 = 500000;
		
		int joint2018TaxRate10 = 19050;
		int joint2018TaxRate12 = 58350;
		int joint2018TaxRate22 = 87600;
		int joint2018TaxRate24 = 150000;
		int joint2018TaxRate32 = 85000;
		int joint2018TaxRate35 = 200000;
		int joint2018TaxRate37 = 600000;
		
		int separate2018TaxRate10 = 9525;
		int separate2018TaxRate12 = 29175;
		int separate2018TaxRate22 = 43800;
		int separate2018TaxRate24 = 75000;
		int separate2018TaxRate32 = 42500;
		int separate2018TaxRate35 = 100000;
		int separate2018TaxRate37 = 300000;
		
		int head2018TaxRate10 = 13600;
		int head2018TaxRate12 = 38200;
		int head2018TaxRate22 = 30700;
		int head2018TaxRate24 = 75000;
		int head2018TaxRate32 = 42500;
		int head2018TaxRate35 = 300000;
		int head2018TaxRate37 = 500000;
		
		
		if(filingStatus == 1) {
			// 10% rate
			if (income <= 9525) {
				taxPay2 = income * .1;
			}
			// 12% rate
			else if (income > 9525 && income <= 38700) {
				taxPay2 = (single2018TaxRate10 * .1) + ((income - single2018TaxRate10) * .12);
			}
			// 22% rate
			else if (income > 38700 && income <= 82500) {
				taxPay2 = (single2018TaxRate10 * .1) + (single2018TaxRate12 * .12) + ((income - (single2018TaxRate10 + single2018TaxRate12)) * .22);
			}
			// 24% rate
			else if (income > 82500 && income <= 157500) {
				taxPay2 = (single2018TaxRate10 * .1) + (single2018TaxRate12 * .12) + (single2018TaxRate22 * .22) + ((income - (single2018TaxRate10 + single2018TaxRate12 + single2018TaxRate22)) * .24);
			}
			// 32% rate
			else if (income > 157500 && income <= 200000) {
				taxPay2 = (single2018TaxRate10 * .1) + (single2018TaxRate12 * .12) + (single2018TaxRate22 * .22) + (single2018TaxRate24 * .24) + ((income - (single2018TaxRate10 + single2018TaxRate12 + single2018TaxRate22 + single2018TaxRate24)) * .32);
			}
			// 35% rate
			else if (income > 200000 && income <= 500000) {
				taxPay2 = (single2018TaxRate10 * .1) + (single2018TaxRate12 * .12) + (single2018TaxRate22 * .22) + (single2018TaxRate24 * .24) + (single2018TaxRate32 * .32) + ((income - (single2018TaxRate10 + single2018TaxRate12 + single2018TaxRate22 + single2018TaxRate24 + single2018TaxRate32)) * .35);
			}
			// 37% rate
			else {
				taxPay2 = (single2018TaxRate10 * .1) + (single2018TaxRate12 * .12) + (single2018TaxRate22 * .22) + (single2018TaxRate24 * .24) + (single2018TaxRate32 * .32) + (single2018TaxRate35 * .35) +((income - (single2018TaxRate37)) * .37);
			}
			
		}
		else if (filingStatus == 2) {
			// 10% rate
			if (income <= 19050) {
				taxPay2 = income * .1;
			}
			// 12% rate
			else if (income > 19050 && income <= 77400) {
				taxPay2 = (joint2018TaxRate10 * .1) + ((income - joint2018TaxRate10) * .12);
			}
			// 22% rate
			else if (income > 77400 && income <= 165000) {
				taxPay2 = (joint2018TaxRate10 * .1) + (joint2018TaxRate12 * .12) + ((income - (joint2018TaxRate10 + joint2018TaxRate12)) * .22);
			}
			// 24% rate
			else if (income > 165000 && income <= 315000) {
				taxPay2 = (joint2018TaxRate10 * .1) + (joint2018TaxRate12 * .12) + (joint2018TaxRate22 * .22) + ((income - (joint2018TaxRate10 + joint2018TaxRate12 + joint2018TaxRate22)) * .24);
			}
			// 32% rate
			else if (income > 315000 && income <= 400000) {
				taxPay2 = (joint2018TaxRate10 * .1) + (joint2018TaxRate12 * .12) + (joint2018TaxRate22 * .22) + (joint2018TaxRate24 * .24) + ((income - (joint2018TaxRate10 + joint2018TaxRate12 + joint2018TaxRate22 + joint2018TaxRate24)) * .32);
			}
			// 35% rate
			else if (income > 400000 && income <= 600000) {
				taxPay2 = (joint2018TaxRate10 * .1) + (joint2018TaxRate12 * .12) + (joint2018TaxRate22 * .22) + (joint2018TaxRate24 * .24) + (joint2018TaxRate32 * .32) + ((income - (joint2018TaxRate10 + joint2018TaxRate12 + joint2018TaxRate22 + joint2018TaxRate24 + joint2018TaxRate32)) * .35);
			}
			// 37% rate
			else {
				taxPay2 = (joint2018TaxRate10 * .1) + (joint2018TaxRate12 * .12) + (joint2018TaxRate22 * .22) + (joint2018TaxRate24 * .24) + (joint2018TaxRate32 * .32) + (joint2018TaxRate35 * .35) +((income - (joint2018TaxRate37)) * .37);
			}
		}
		else if (filingStatus == 3) {
			// 10% rate
			if (income <= 9525) {
				taxPay2 = income * .1;
			}
			// 12% rate
			else if (income > 9525 && income <= 38700) {
				taxPay2 = (separate2018TaxRate10 * .1) + ((income - separate2018TaxRate10) * .12);
			}
			// 22% rate
			else if (income > 38700 && income <= 82500) {
				taxPay2 = (separate2018TaxRate10 * .1) + (separate2018TaxRate12 * .12) + ((income - (separate2018TaxRate10 + separate2018TaxRate12)) * .22);
			}
			// 24% rate
			else if (income > 82500 && income <= 157500) {
				taxPay2 = (separate2018TaxRate10 * .1) + (separate2018TaxRate12 * .12) + (separate2018TaxRate22 * .22) + ((income - (separate2018TaxRate10 + separate2018TaxRate12 + separate2018TaxRate22)) * .24);
			}
			// 32% rate
			else if (income > 157500 && income <= 200000) {
				taxPay2 = (separate2018TaxRate10 * .1) + (separate2018TaxRate12 * .12) + (separate2018TaxRate22 * .22) + (separate2018TaxRate24 * .24) + ((income - (separate2018TaxRate10 + separate2018TaxRate12 + separate2018TaxRate22 + separate2018TaxRate24)) * .32);
			}
			// 35% rate
			else if (income > 200000 && income <= 300000) {
				taxPay2 = (separate2018TaxRate10 * .1) + (separate2018TaxRate12 * .12) + (separate2018TaxRate22 * .22) + (separate2018TaxRate24 * .24) + (separate2018TaxRate32 * .32) + ((income - (separate2018TaxRate10 + separate2018TaxRate12 + separate2018TaxRate22 + separate2018TaxRate24 + separate2018TaxRate32)) * .35);
			}
			// 37% rate
			else {
				taxPay2 = (separate2018TaxRate10 * .1) + (separate2018TaxRate12 * .12) + (separate2018TaxRate22 * .22) + (separate2018TaxRate24 * .24) + (separate2018TaxRate32 * .32) + (separate2018TaxRate35 * .35) +((income - (separate2018TaxRate37)) * .37);
			}
		}
		else if (filingStatus == 4) {
			// 10% rate
			if (income <= 13600) {
				taxPay2 = income * .1;
			}
			// 12% rate
			else if (income > 13600 && income <= 51800) {
				taxPay2 = (head2018TaxRate10 * .1) + ((income - head2018TaxRate10) * .12);
			}
			// 22% rate
			else if (income > 51800 && income <= 82500) {
				taxPay2 = (head2018TaxRate10 * .1) + (head2018TaxRate12 * .12) + ((income - (head2018TaxRate10 + head2018TaxRate12)) * .22);
			}
			// 24% rate
			else if (income > 82500 && income <= 157500) {
				taxPay2 = (head2018TaxRate10 * .1) + (head2018TaxRate12 * .12) + (head2018TaxRate22 * .22) + ((income - (head2018TaxRate10 + head2018TaxRate12 + head2018TaxRate22)) * .24);
			}
			// 32% rate
			else if (income > 157500 && income <= 200000) {
				taxPay2 = (head2018TaxRate10 * .1) + (head2018TaxRate12 * .12) + (head2018TaxRate22 * .22) + (head2018TaxRate24 * .24) + ((income - (head2018TaxRate10 + head2018TaxRate12 + head2018TaxRate22 + head2018TaxRate24)) * .32);
			}
			// 35% rate
			else if (income > 200000 && income <= 500000) {
				taxPay2 = (head2018TaxRate10 * .1) + (head2018TaxRate12 * .12) + (head2018TaxRate22 * .22) + (head2018TaxRate24 * .24) + (head2018TaxRate32 * .32) + ((income - (head2018TaxRate10 + head2018TaxRate12 + head2018TaxRate22 + head2018TaxRate24 + head2018TaxRate32)) * .35);
			}
			// 37% rate
			else {
				taxPay2 = (head2018TaxRate10 * .1) + (head2018TaxRate12 * .12) + (head2018TaxRate22 * .22) + (head2018TaxRate24 * .24) + (head2018TaxRate32 * .32) + (head2018TaxRate35 * .35) +((income - (head2018TaxRate37)) * .37);
			}
		}
		else {
			System.out.println("Type in only one number from 1-4");
		}
		
		System.out.println("In 2009, before the Tax Cut and Job Act, you would have paid $" + taxPay + " in taxes.");
		System.out.println("For 2018, after the Tax Cut and Job Act, you will pay $" + taxPay2 + " in taxes.");
		scan.close();
	}
}
