package com.immediatlyApp.data;

import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class DataLoader implements InitializingBean {

    private final UserRepository userRepository;

    /**
     * Invoked by the containing {@code BeanFactory} after it has set all bean properties
     * and satisfied {@link BeanFactoryAware}, {@code ApplicationContextAware} etc.
     * <p>This method allows the bean instance to perform validation of its overall
     * configuration and final initialization when all bean properties have been set.
     *
     * @throws Exception in the event of misconfiguration (such as failure to set an
     *                   essential property) or if initialization fails for any other reason
     */
    @Override
    @Validated
    public void afterPropertiesSet() throws Exception {
        User u1 = User.builder()
                .username("imanb")
                .firstName("iman")
                .password("salhdfiluasdghulhdfih")
                .lastName("Bekkaye")
                .address("Hendekusa")
                .email("imanbekkaye@hotmail.com")
                .dateOfBirth(new Date())

                .build();
        userRepository.save(u1);
    }
}