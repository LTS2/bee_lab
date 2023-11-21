package com.bee.beelab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : jiny
 * @fileName : RestTemplateConfig
 * @since : 11/22/23
 */
@Configuration
public class RestTemplateConfig {

	/**
	 * @fileName    : RestTemplateConfig.java
	 * @author      : jiny
	 * @since       : 11/22/23
	 * @implNote    : 싱글톤 패턴으로 스프링 IoC 컨테이너에 의해 단일 인스턴스로 생성되고, 이후에 동일한 빈이 여러번 요청되어도 해당 빈의 동일한 인스턴스가 반환되므로 애플리케이션 전반에 걸쳐 하나의 인스턴스만 사용됨.
	 */
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
