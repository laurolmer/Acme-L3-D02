
package acme.entities.sessions;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.tutorials.Tutorial;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "session")
@Getter
@Setter
public class Session extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@NotNull
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@NotNull
	@Length(max = 100)
	protected String			abstractSession;

	@NotBlank
	@NotNull
	protected SessionType		sessionType;

	@NotNull
	//@CustomConstraint
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				startPeriod;

	@NotNull
	//@CustomConstraint finishperiod - startperiod >= 1 horas && <= 5 horas
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				finishPeriod;

	@NotNull
	//@CustomConstraint creationMoment >= 1 horas 
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				creationMoment;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	@Valid
	@ManyToOne(optional = false)
	protected Tutorial			tutorial;

}
