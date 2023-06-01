package barbershop.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Класс регистрация пользователя. Создаётся в момент регистрации нового пользователя на сайте.
 * Не позволяет создать некорректного пользователя.
 */

@Getter
@Setter
public class UserRegistration {
    /** Поле логина. Пользователь не может появиться без этого поля*/
    @NotNull
    private String login;
    @NotNull
    private String phone;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String name;
}
