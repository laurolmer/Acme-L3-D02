
package acme.form;

import java.util.Map;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorsDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	// Total number of principals with each role.
	private Integer				numOfAssistants;
	private Integer				numOfAuditors;
	private Integer				numOfCompanies;
	private Integer				numOfConsumers;
	private Integer				numOfProviders;
	private Integer				numOfLecturers;

	// Ratio of peeps with both an email address and a link.
	private double				linkAndEmailPeepsRatio;

	// Ratios of critical and non-critical bulletins.
	private double				criticalBulletinsRatio;
	private double				nonCriticalBulletinsRatio;

	// Average, minimum, maximum, and standard deviation of the budget in the offers grouped by currency.
	private Map<String, Double>	avgBudgetByCurrency;
	private Map<String, Double>	minBudgetByCurrency;
	private Map<String, Double>	maxBudgetByCurrency;
	private Map<String, Double>	devBudgetByCurrency;

	// Average, minimum, maximum, and standard deviation of the number of notes posted over the last 10 weeks.
	private double				avgNotesInLast10Weeks;
	private double				minNotesInLast10Weeks;
	private double				maxNotesInLast10Weeks;
	private double				devNotesInLast10Weeks;
}
