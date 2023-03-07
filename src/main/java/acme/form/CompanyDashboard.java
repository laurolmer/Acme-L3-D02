
package acme.form;

import java.time.Month;
import java.util.Map;

import acme.framework.data.AbstractForm;

public class CompanyDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private int					totalPractica;

	private Map<Month, Double>	avgSessionLength;
	private Map<Month, Double>	devSessionLength;
	private Map<Month, Double>	minSessionLength;
	private Map<Month, Double>	maxSessionLength;

	private Map<Month, Double>	avgPracticaLength;
	private Map<Month, Double>	devPracticaLength;
	private Map<Month, Double>	minPracticaLength;
	private Map<Month, Double>	maxPracticaLength;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
