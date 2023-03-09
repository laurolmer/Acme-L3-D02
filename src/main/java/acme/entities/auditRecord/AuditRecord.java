
package acme.entities.auditRecord;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.audit.Audit;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditRecord extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			subject;

	@NotBlank
	@Length(max = 100)
	protected String			assesment;

	@NotNull
	protected MarkType			mark;

	@PastOrPresent
	//Falta la custom @ asi que aun no se puede.	
	@NotBlank
	protected Date				period;

	@URL
	protected String			link;

	//Relaciones
	@Valid
	@NotNull
	@ManyToOne(optional = false)
	protected Audit				audit;
}
