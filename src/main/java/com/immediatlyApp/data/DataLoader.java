package com.immediatlyApp.data;

import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.models.entity.UserDidServiceType;
import com.immediatlyApp.models.entity.UserImpression;
import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import com.immediatlyApp.models.lookups.LKPImpression;
import com.immediatlyApp.models.lookups.LKPServiceType;
import com.immediatlyApp.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class DataLoader implements InitializingBean {

    private final UserRepository userRepository;
    private final LKPRepository lkpServiceRepository;
    private  final UserOfferedServiceTypeRepository userOfferedServiceTypeRepository;
    private final LKPCityRepository lkpCityRepository;
    private final LKPCountryRepository lkpCountryRepository;
    private final LKPImpressionRepository lkpImpressionRepository;
    private final UserDidServiceTypeRepository userDidServiceTypeRepository;
    private final UserImpressionRepository userImpressionRepository;


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
        LKPCountry country = LKPCountry.builder().name("Bosna i Hercegovina").key("k1").build();
        lkpCountryRepository.save(country);
        LKPCity city = LKPCity.builder().name("Sarajevo").key("k1").country(country).build();
        lkpCityRepository.save(city);
        User u1 = User.builder().username("imanb").firstName("iman").password("salhdfiluasdghulhdfih").lastName("Bekkaye")
                .address("Hendekusa").email("imanbekkaye@hotmail.com")
                .dateOfBirth(new Date()).city(city).country(country).build();
        userRepository.save(u1);
        LKPServiceType s1 = LKPServiceType.builder().name("Usluga1").key("k1").build();
        lkpServiceRepository.save(s1);
        UserOfferServiceType us1= UserOfferServiceType.builder().user(u1).lkpServiceType(s1).description("Testna usluga usera").maxPerson(10).build();
        userOfferedServiceTypeRepository.save(us1);

        LKPImpression im = LKPImpression.builder().name("Pozitivan").key("1").build();
        lkpImpressionRepository.save(im);

        UserImpression ui = UserImpression.builder().lkpImpression(im).user(u1).impression("Sve je super").build();
        userImpressionRepository.save(ui);

        UserDidServiceType uds = UserDidServiceType.builder().user(u1).lkpServiceType(s1).number(1).build();
        userDidServiceTypeRepository.save(uds);

    }
}