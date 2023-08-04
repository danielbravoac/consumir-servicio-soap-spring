package com.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSoapApplication {

	//private static final Logger LOGGER= LoggerFactory.getLogger(SpringBootSoapApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}
/*
	@Bean
	CommandLineRunner init(SoapClient soapClient){
		return args -> {
			AddResponse addResponse= soapClient.getAddResponse(20,3);
			LOGGER.info("El resultado de la suma de los numeros {} y {} segun el servicio es {}",20,3,addResponse.getAddResult());
		};
	}
 */

}
