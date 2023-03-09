
package acme.form;

import javax.validation.constraints.NotNull;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistic extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	int							count;

	Double						average;

	Double						minimum;

	Double						maximum;

	Double						deviation;

}
