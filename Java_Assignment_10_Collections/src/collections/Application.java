/**
 * 
 */
package collections;

import java.util.List;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Account acnt= new Account();
		
		List<Account> accounts= Account.createAccounts(5);
		for(Account account : accounts)
		{
			System.out.println(account);
			
		}
		
	}

}
