package sg.ctx.core.security.repository;

import org.springframework.stereotype.Repository;
import sg.ctx.core.security.domain.User;

@Repository
public interface UserRepository {
    User getUserByUserName(String userName);
}
