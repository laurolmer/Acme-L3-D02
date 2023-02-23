
package acme.entities.sessionsPracticum;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.practicum.Practicum;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "sessionsPracticum")
@Getter
@Setter
public class SessionsPracticum extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Length(max = 75)
	protected String title;

	@NotBlank
	@Length(max = 100)
	protected String abstractt;

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date startDate;

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date finishDate;
	
	@URL
	protected String link;
	
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	@ManyToOne()
	private Practicum			practicum;
}
