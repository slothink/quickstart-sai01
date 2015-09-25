package world.sai.misc.quickstart.sai01.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import world.sai.misc.quickstart.sai01.core.user.UserService;
import world.sai.misc.quickstart.sai01.core.user.UserServiceImpl;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Created by sai on 15. 9. 25..
 */
@Configuration
@ComponentScan(basePackages = "world.sai.misc.quickstart.sai01.core")
@EnableLoadTimeWeaving
//@ImportResource("classpath:/com/acme/properties-config.xml")
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("classpath:com/bank/config/sql/schema.sql")
                .addScript("classpath:com/bank/config/sql/test-data.sql")
                .build();
    }

    @Bean
    @Profile("production")
    public DataSource productionDataSource() throws Exception {
        Context ctx = new InitialContext();
        return (DataSource) ctx.lookup("java:comp/env/jdbc/datasource");
    }
}
