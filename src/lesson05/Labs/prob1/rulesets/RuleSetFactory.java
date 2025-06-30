package lesson05.Labs.prob1.rulesets;

import lesson05.Labs.prob1.gui.BookWindow;
import lesson05.Labs.prob1.gui.CDWindow;

import java.awt.Component;
import java.util.HashMap;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}
	public static RuleSet getRuleSet(Component c){
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) throw new IllegalArgumentException("No ruleset found!");
		return map.get(cl);
	}
	
}