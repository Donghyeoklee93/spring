package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("Initialize password.")
    @Test
    void passwordTest() {
        //given
        User user = new User();;

        //when
        user.initPassword(new CorrectFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull();

    }


    @DisplayName("Password isn't initialized due to not meeting requirement.")
    @Test
    void passwordTest2() {
        //given
        User user = new User();;

        //when
        user.initPassword(new WrongFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNull();

    }
}