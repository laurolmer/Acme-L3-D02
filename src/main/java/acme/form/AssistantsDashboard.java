
package acme.form;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssistantsDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private int					totalTutorials;
	private double				avgSessionTime;
	private double				devSessionTime;
	private double				minSessionTime;
	private double				maxSessionTime;
	private double				avgTutorialTime;
	private double				devTutorialTime;
	private double				minTutorialTime;
	private double				maxTutorialTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
