package ca.ualberta.cs.travelexpense;

import java.util.ArrayList;
import java.util.Collection;

//video around 27:45

public class ExpenseList {

	protected ArrayList<Expense>expenseList;
	
	public ExpenseList(){
		
		expenseList = new ArrayList<Expense>();
		
	}
	
	
	public Collection<Expense> getExpenses() {
		// TODO Auto-generated method stub
		return expenseList;
	}

	public void addExpense(Expense testExpense) {
		// TODO Auto-generated method stub
		expenseList.add(testExpense);
	}


	public void deleteExpense(Expense testExpense) {
		
		expenseList.remove(testExpense);
		
	}


	public Expense chooseExpense() throws EmptyExpenseListException {
		int size = expenseList.size();
		if(size <=0)
		{
			throw new EmptyExpenseListException();
		}
		return expenseList.get(0);
	}


	public int size() {
		// TODO Auto-generated method stub
		return expenseList.size();
	}


	public boolean contains(Expense testExpense) {
		// TODO Auto-generated method stub
		return expenseList.contains(testExpense);
	}

}
