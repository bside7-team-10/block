package com.block.server.domain.user;

import com.block.server.domain.User;
import com.block.server.domain.repository.UserRepository;
import com.block.server.helper.TestUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByEmail_should_work() {
        var user = TestUser.U1().toUser();
        userRepository.save(user);

        var result = userRepository.findByEmail(user.getEmail());

        assertTrue(result.isPresent());
        assertEquals(user, result.get());
    }
}
