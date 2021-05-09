package orthae.com.github.umcs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Pesel is not unique.")
public class PeselNotUniqueException extends RuntimeException {
}
