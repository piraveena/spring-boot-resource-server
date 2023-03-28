package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
public class ServerSecurity extends WebSecurityConfigurerAdapter {

    Logger logger = LoggerFactory.getLogger(ServerSecurity.class);

//    protected void configure(HttpSecurity http) throws Exception {
//
//        logger.info("Configuring security");
//        http
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .antMatchers("/hello").permitAll()
//                .anyRequest().authenticated();
//    }

//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorizeRequests -> authorizeRequests
//                        .antMatchers("/hello").permitAll()
//                        .mvcMatchers("/contacts/**").hasAuthority("SCOPE_contacts")
//                        .mvcMatchers("/messages/**").hasAuthority("SCOPE_messages")
//                        .anyRequest().authenticated()
//                )
//                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::opaqueToken);
//    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests -> authorizeRequests
                        .antMatchers("/products").permitAll()
                        .anyRequest().authenticated()
                )
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::opaqueToken);
    }
}
