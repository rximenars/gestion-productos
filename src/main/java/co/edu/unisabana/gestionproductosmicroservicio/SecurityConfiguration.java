package co.edu.unisabana.gestionproductosmicroservicio;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;

@Configuration

public class SecurityConfiguration extends WebSecurityConfigurerAdapter 
{
    @Override
    public void configure(HttpSecurity HttpSecurity) throws Exception
    {
        HttpSecurity.authorizeRequests(authorize -> authorize.anyRequest().authenticated())
            .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
    }    
}
