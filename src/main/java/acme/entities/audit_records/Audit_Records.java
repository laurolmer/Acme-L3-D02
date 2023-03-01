
package acme.entities.audit_records;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Audit_Records {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 70)
	protected String			subject;

	@NotBlank
	@Length(max = 100)
	protected String			assessment;

	@NotNull
	protected MarkType			mark;

	@PastOrPresent
	//Falta la custom @ asi que aun no se puede.	
	@NotBlank
	protected Date				period;

	@URL
	protected String			link;

}