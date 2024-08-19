package login.and.registration.login.and.registration.auth.user;

import org.hibernate.dialect.function.DB2SubstringFunction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token,Long> {
    Optional<Token> findByToken(String token);
}
