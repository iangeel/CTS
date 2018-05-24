package ro.ase.cts_boja;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import ro.ase.exception.OperationsException;

public class BankAccountTest {

//	Fiind dat codul din clasa BankAccount, sa se implmenenteze un 
//	sistem de testare automata, bazat pe JUnit, care sa verifice urmatoarele conditii:
//		- la retragerea unei sume de bani nu se accepta sume mai mari 
// 	decat limita stabilita pentru cont sau mai mari decat valoarea curenta a soldului
//		- la retragerea unei sume de bani nu sunt accepate valori aberante
//		- la depunere nu sunt acceptate valori aberante
//
//		Testul trebuie sa permita integrarea acestuia intr-un set mai mare (Test Suite) de teste
//
//		Pregatirea sesiunii de testare presupune utilizarea unor fisiere
//		de test din care sa fie preluate valorile de intrare si cele asteptate. 

	BankAccount bankAccount;
	String line;
	Double withdrawSum, expectedResult, initialBalance, negativeValue, inversionWithdrawSum,
		withdrawExpectedResult, withdrawSumMoreThanLB;
	
	@Before
	public void init() {
		FileReader fileReader;
		try {
			fileReader = new FileReader("/home/angel/EclipseProjects/cts_boja_input.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//while(!(bufferedReader.readLine().equals(null))) {
				line = bufferedReader.readLine();
			//}
			
			bankAccount = new BankAccount(Double.parseDouble(line.split(" ")[0]), 
					Double.parseDouble(line.split(" ")[1]), 
					Double.parseDouble(line.split(" ")[2]));
			
			withdrawSum = Double.parseDouble(line.split(" ")[3]);
			negativeValue = Double.parseDouble(line.split(" ")[4]);
			inversionWithdrawSum = Double.parseDouble(line.split(" ")[5]);
			withdrawExpectedResult = Double.parseDouble(line.split(" ")[6]);
			withdrawSumMoreThanLB = Double.parseDouble(line.split(" ")[7]);
			
			initialBalance = bankAccount.getBalance();
			
			fileReader.close();
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void boundaryWithdrawTest()  {
		try {
			bankAccount.withdraw(withdrawSum);
		} catch(OperationsException e) {
			assertTrue(true);
		}
		assertEquals(initialBalance, bankAccount.getBalance(), 0);
		
		try {
			bankAccount.withdraw(withdrawSumMoreThanLB);
		} catch(OperationsException e) {
			assertTrue(true);
		}
		assertEquals(initialBalance, bankAccount.getBalance(), 0);
		
		try {
			bankAccount.withdraw(Double.NaN);
		} catch(OperationsException e) {
			
			assertTrue(true);
		}
		assertEquals(initialBalance, bankAccount.getBalance(), 0);
		
	}
	
	@Test(expected = OperationsException.class) 
	public void errorWithdrawTest() throws OperationsException {
		bankAccount.withdraw(negativeValue);
	}
	
	@Test
	public void inversionWithdrawTest() throws OperationsException {
		bankAccount.withdraw(inversionWithdrawSum);
		assertEquals(withdrawExpectedResult, bankAccount.getBalance(), 0);
		double amount = initialBalance - withdrawExpectedResult;
		assertEquals(inversionWithdrawSum, amount, 0);
	}
	
	@Test(timeout = 100)
	public void performanceWithdrawTest() throws OperationsException {
		bankAccount.withdraw(200);
	}
	
	@Test
	public void inversionDepositTest() {
		bankAccount.deposit(300);
		assertEquals(2500, bankAccount.getBalance(), 0);
		double amount = bankAccount.getBalance() - initialBalance;
		assertEquals(300, amount, 0);
	}
	
//	@Test
//	public void crossCheckTest() throws OperationsException {
//		BankAccount copy1 = new BankAccount(bankAccount.getBalance(), bankAccount.getLimit(), 
//				bankAccount.getLowestBalance());
//		BankAccount copy2 = new BankAccount(bankAccount.getBalance(), bankAccount.getLimit(), 
//				bankAccount.getLowestBalance());
//		BankAccount copy3 = new BankAccount(bankAccount.getBalance(), bankAccount.getLimit(), 
//				bankAccount.getLowestBalance());
//		
//		bankAccount.withdraw(200);
//		assertEquals(200, bankAccount.getBalance(), 0);
//		copy1.deposit(200);
//		assertEquals(2400, copy1.getBalance(), 0);
//		
//		
//		
//	}
}
	

