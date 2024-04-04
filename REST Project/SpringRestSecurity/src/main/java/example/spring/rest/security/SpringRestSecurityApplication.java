package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity  //Enables security customization done using SecurityFilterChai
public class SpringRestSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityApplication.class, args);
	}
	
	@Bean
	public UserDetailsService getUserDetailsService() {
		UserDetails adminUser = User.withUsername("admin").password("{noop}Admin@123").roles("ADMIN").build();  //{noop} : is use to make password encoding
		UserDetails regularUser = User.withUsername("regular").password("{noop}Regular@123").roles("USER").build(); 
		
		InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(adminUser,regularUser);
		
		return userDetailsManager;
	}
	
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(
				auth -> {
					auth.requestMatchers("/hello-world").permitAll();
					auth.requestMatchers("/regular-work").hasAnyRole("ADMIN","USER").requestMatchers("/admin-work").hasAnyRole("ADMIN").anyRequest().authenticated();
				}
				);
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		return http.build();
		
	}

}
