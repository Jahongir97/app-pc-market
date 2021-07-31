package uz.pdp.apppcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("super_admin").password(passwordEncoder().encode("super_admin")).roles("SUPER_ADMIN").authorities(
                "READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator")).roles("MODERATOR").authorities(
                "READ", "ADD", "EDIT", "READ_ONE")
                .and()
                .withUser("operator").password(passwordEncoder().encode("operator")).roles("OPERATOR").authorities(
                "READ_ONE", "ADD"
        );

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.DELETE, "/api/address/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/address/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/address/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/attachment/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/attachment/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/attachment/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/attachmentContent/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/attachmentContent/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/attachmentContent/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/basket/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/basket/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/basket/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/basketProduct/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/basketProduct/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/basketProduct/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/blog/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/blog/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/blog/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/category/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/category/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/category/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/character/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/character/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/character/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/feedback/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/feedback/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/feedback/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/measurement/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/measurement/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/measurement/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/order/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/order/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/order/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/product/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/product/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/product/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/property/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/property/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/property/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "/api/supplier/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/supplier/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/supplier/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")
                .antMatchers(HttpMethod.DELETE, "api/user/**").hasAnyAuthority("SUPER_ADMIN")
                .antMatchers(HttpMethod.GET, "api/user/**").hasAnyAuthority("ADD", "READ_ONE")
                .antMatchers("api/user/**").hasAnyAuthority("READ", "ADD", "DELETE", "EDIT", "READ_ONE")

                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
