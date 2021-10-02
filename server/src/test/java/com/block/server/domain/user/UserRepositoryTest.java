package com.block.server.domain.user;

import com.block.server.domain.User;
import com.block.server.domain.repository.UserRepository;
import com.block.server.helper.TestUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("findByEmail이 정상적으로 작동해야 함")
    public void findByEmail_should_work() {
        var user = TestUser.U1().toUser();
        userRepository.save(user);

        var result = userRepository.findByEmail(user.getEmail());

        assertTrue(result.isPresent());
        assertEquals(user, result.get());
    }

    @Test
    @DisplayName("DB Save 시 CreatedAt과 ModifiedAt이 채워져야 함")
    public void save_should_update_CreatedAt_and_ModifiedAt() {
        var user = TestUser.U1().toUser();

        var result = userRepository.save(user);

        assertEquals(user.getEmail(), result.getEmail());
        assertEquals(user.getBirthday(), result.getBirthday());
        assertEquals(user.getGender(), result.getGender());
        assertEquals(user.getPassword(), result.getPassword());
        assertNotNull(result.getCreatedAt());
        assertNotNull(result.getModifiedAt());
        assertNotNull(result.getId());
    }
}
