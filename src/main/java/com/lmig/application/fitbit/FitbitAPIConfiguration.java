package com.lmig.application.fitbit;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;

//@EnableOAuth2Sso
//@Configuration
public class FitbitAPIConfiguration {

//    @Bean
//    OAuth2RestTemplate fitbitOAuthRestTemplate(UserInfoRestTemplateFactory uir) {
//        return uir.getUserInfoRestTemplate();
//    }
}