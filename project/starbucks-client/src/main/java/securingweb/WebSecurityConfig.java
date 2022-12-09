package securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    /*
        Using BCryptPasswordEncoder
        Created encrypted string from: https://bcrypt-generator.com/
     */
    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
                .username("user")
                .password("$2a$12$FsbbfQcIWh8kJEhdB9TDrO9ME6ERgUkkSalWIWlDBEXrpM4Djyit2")
                .roles("USER")
                .build();

        /* UserDetails admin = User.builder()
                .username("admin")
                .password("admin")
                .roles("USER", "ADMIN")
                .build();
        */
        return new InMemoryUserDetailsManager(user/*, admin */);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        SecurityFilterChain ret = http
                .formLogin(
                        form -> form
                                .loginPage("/login")
                                .permitAll()
                )
                .authorizeRequests()
                .antMatchers("/console").hasRole("USER")
                .antMatchers("/").permitAll()
                .and()
                .build() ;
        return ret ;
    }

}

