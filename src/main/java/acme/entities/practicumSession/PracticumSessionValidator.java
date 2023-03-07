
package acme.entities.practicumSession;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PracticumSessionValidator implements Validator {

	@Override
	public boolean supports(final Class<?> clazz) {
		return PracticumSession.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(final Object target, final Errors errors) {

		final PracticumSession ps = (PracticumSession) target;
		//Obtiene la la hora de la zona 
		final ZoneId zoneId = ZoneId.systemDefault();
		//Obtener el tiempo de inicio y fin 
		final LocalDateTime start = LocalDateTime.ofInstant(ps.getStartDate().toInstant(), zoneId); // 2023-03-07T05:15:30
		final LocalDateTime finish = LocalDateTime.ofInstant(ps.getFinishDate().toInstant(), zoneId);
		final LocalDateTime now = LocalDateTime.now();

		if (start.isBefore(now.plusWeeks(1)))
			errors.rejectValue("start", "start.beforeNow", "Start date must be at least one week in the future");
		else if (finish.isAfter(start.plusWeeks(1)))
			errors.rejectValue("end", "end.afterStart", "End date must be at least one week after start");
	}

}
