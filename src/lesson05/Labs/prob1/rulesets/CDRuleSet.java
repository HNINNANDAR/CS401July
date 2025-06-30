package lesson05.Labs.prob1.rulesets;

import lesson05.Labs.prob1.gui.CDWindow;

import java.awt.Component;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	CDWindow cdWindow;
	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindow = (CDWindow) ob;
		notEmpty();
		price_format_check();
		price_val_check();

	}
	public void notEmpty() throws RuleException{
		if(cdWindow.getPriceValue().isEmpty() || cdWindow.getTitleValue().isEmpty() || cdWindow.getArtistValue().isEmpty())
			throw new RuleException("All fields should not be empty!");
	}
	public void price_format_check() throws RuleException{
		if(!cdWindow.getPriceValue().matches("\\d+\\.\\d{2}"))
			throw new RuleException("Price must be a floting point number with two decimal places!");
	}
	public void price_val_check() throws RuleException{
		double price = Double.parseDouble(cdWindow.getPriceValue());
		if(price <= 0.49)
			throw new RuleException("Price must be greater than 0.49!");
	}
	
}
