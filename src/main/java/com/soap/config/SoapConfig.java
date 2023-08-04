package com.soap.config;

import com.soap.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    /**
     * Este servicio ayuda a deserializar-unmarshalling el servicio (Pasar de XML a Objeto) y también a serializar-marshalling (Convertir de Objeto a XML)
     *
     * @return marshaller
     */
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller= new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.wsdl");
        return marshaller;
    }

    @Bean
    public SoapClient getSoapClient(Jaxb2Marshaller marshaller){
        SoapClient soapClient = new SoapClient();
        soapClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        //Serializacion
        soapClient.setMarshaller(marshaller);
        //Deserializacion
        soapClient.setUnmarshaller(marshaller);

        return soapClient;
    }
}
