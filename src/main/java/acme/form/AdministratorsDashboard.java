
package acme.form;

import java.util.Map;

import acme.framework.data.AbstractForm;
import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorsDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long			serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	// Total number of principals with each role.
	private Map<AbstractRole, Integer>	totalUsers;

	// Ratio of PEEPS with both an email address and a link.
	private double						linkAndEmailPeepsRatio;

	// Ratios of critical and non-critical BULLETINS.
	private double						criticalBulletinsRatio;
	private double						nonCriticalBulletinsRatio;

	// Average, minimum, maximum, and standard deviation of the budget in the OFFERS grouped by currency.
	private Statistic					budgetByCurrencyOfferData;

	// Average, minimum, maximum, and standard deviation of the number of NOTES posted over the last 10 weeks.
	private Statistic					notesInLast10WeeksData;

}
