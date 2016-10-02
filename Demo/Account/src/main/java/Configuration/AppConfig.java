package Configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;


/**
 * Created by ed_ao on 01.10.2016.
 */
    @Import({RepositoryConfig.class})
    @Configuration
    public class AppConfig
    {
        //<context:property-placeholder location="classpath:application.properties"></context:property-placeholder>
        @Bean
        public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
        {
            PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
            ppc.setLocation(new ClassPathResource("application.properties"));
            ppc.setIgnoreUnresolvablePlaceholders(true);
            return ppc;
        }
    }

