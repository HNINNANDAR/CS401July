package lesson05.Labs.prob1.rulesets;

import lesson05.Labs.prob1.gui.BookWindow;

import java.awt.Component;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	BookWindow bookWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindow = (BookWindow) ob; //cast
		notEmpty();
		isbn_check();
		isbn_len_10_check();
		isbn_len_13_check();
		price_format_check();
		price_val_check();
	}
	public void notEmpty() throws RuleException{
		if(bookWindow.getIsbnValue().isEmpty() || bookWindow.getPriceValue().isEmpty() || bookWindow.getTitleValue().isEmpty())
			throw new RuleException("All fields should not be empty!");
	}
	public void isbn_check() throws RuleException{
		if(!bookWindow.getIsbnValue().matches("\\d+"))
			throw new RuleException("ISBN must be numeric!");
		if(bookWindow.getIsbnValue().length() != 10 && bookWindow.getIsbnValue().length() != 13)
			throw new RuleException("ISBN must be either 10 or 13 digits!");
	}
	public void isbn_len_10_check() throws RuleException{
		if(bookWindow.getIsbnValue().length() == 10 && !(bookWindow.getIsbnValue().startsWith("0") || bookWindow.getIsbnValue().startsWith("1")))
			throw new RuleException("10-digit ISBN must start with 0 or 1!");
	}
	public void isbn_len_13_check() throws RuleException{
		if(bookWindow.getIsbnValue().length() == 13 && !(bookWindow.getIsbnValue().startsWith("978") || bookWindow.getIsbnValue().startsWith("979")))
			throw new RuleException("13-digit ISBN must start with 978 or 979!");
	}
	public void price_format_check() throws RuleException{
		if(!bookWindow.getPriceValue().matches("\\d+\\.\\d{2}"))
			throw new RuleException("Price must be a floting point number with two decimal places!");
	}
	public void price_val_check() throws RuleException{
		double price = Double.parseDouble(bookWindow.getPriceValue());
		if(price <= 0.49)
			throw new RuleException("Price must be greater than 0.49!");
	}

}
