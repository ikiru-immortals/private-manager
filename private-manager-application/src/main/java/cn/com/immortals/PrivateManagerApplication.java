package cn.com.immortals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author panzhuowen
 * @version 1.0.0
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, WebMvcAutoConfiguration.class})
@ImportResource({"/META-INF/**/*.xml"})
public class PrivateManagerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrivateManagerApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(PrivateManagerApplication.class);
        application.setWebEnvironment(true);
        application.run(args);
        LOGGER.info("startup finish");
    }

}
