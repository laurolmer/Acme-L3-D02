
package acme.entities.enrolment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import acme.framework.data.AbstractEntity;
import acme.roles.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Enrolment extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@NotNull
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	protected String			code;

	@Max(value = 75)
	@NotBlank
	protected String			motivation;

	@Max(value = 100)
	@NotBlank
	protected String			goals;

	@Temporal(TemporalType.TIME)
	protected Date				work_time;

	@Valid
	@NotNull
	@OneToOne
	protected Student			student;

}
