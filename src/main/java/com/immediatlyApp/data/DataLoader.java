package com.immediatlyApp.data;

import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.models.lookups.LKPServiceType;
import com.immediatlyApp.repositories.LKPRepository;
import com.immediatlyApp.repositories.UserOfferedServiceTypeRepository;
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
    private final LKPRepository lkpServiceRepository;
    private  final UserOfferedServiceTypeRepository userOfferedServiceTypeRepository;


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
        User u1 = User.builder().username("imanb").firstName("iman").password("salhdfiluasdghulhdfih").lastName("Bekkaye").address("Hendekusa").email("imanbekkaye@hotmail.com").dateOfBirth(new Date()).build();
        userRepository.save(u1);
        LKPServiceType s1 = LKPServiceType.builder().name("Usluga1").key("k1").build();
        lkpServiceRepository.save(s1);
        UserOfferServiceType us1= UserOfferServiceType.builder().user(u1).lkpServiceType(s1).description("Testna usluga usera").maxPerson(10).build();
        userOfferedServiceTypeRepository.save(us1);
    }
}