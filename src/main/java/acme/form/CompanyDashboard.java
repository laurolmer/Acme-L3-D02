
package acme.form;

import java.util.List;

import acme.framework.data.AbstractForm;

public class CompanyDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	//Numero Total de prácticas
	private List<Integer>		numTotalPractica;

	private Double				avgSessionLength;
	private Double				devSessionLength;
	private Double				minSessionLength;
	private Double				maxSessionLength;

	private Double				avgPracticaLength;
	private Double				devPracticaLength;
	private Double				minPracticaLength;
	private Double				maxPracticaLength;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
