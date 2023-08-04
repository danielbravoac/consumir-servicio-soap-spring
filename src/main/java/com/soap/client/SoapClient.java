package com.soap.client;

import com.soap.wsdl.Add;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.Subtract;
import com.soap.wsdl.SubtractResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SoapClient extends WebServiceGatewaySupport {
    /**
     * Metodo que se encarga de sumar 2 numeros
     * @param numberA
     * @param numberB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numberA,int numberB){
        Add addRequest= new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);
        //Hace el llamado al metodo definido en el WSDL
        SoapActionCallback soapActionCallback= new SoapActionCallback("http://tempuri.org/Add");
        //Se conecta al servicio y trae una respuesta
        AddResponse addResponse= (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest,soapActionCallback);
        return  addResponse;
    }

    /**
     * Metodo para restar 2 numeros
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */

    public SubtractResponse getSubstractResponse(int numberA, int numberB){
        Subtract subtractRequest= new Subtract();
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);
        //Hace el llamado al metodo definido en el WSDL
        SoapActionCallback soapActionCallback= new SoapActionCallback("http://tempuri.org/Subtract");
        //Se conecta al servicio y trae una respuesta
        SubtractResponse subtractResponse= (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest,soapActionCallback);
        return subtractResponse;
    }

}
