package com.mjacobo.monitoreorules;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.ContractDetailsODMVO;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.MonitoreoMensualODMVO;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.PffMonitoreo123RulesDecisionService;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.PffMonitoreo123RulesException;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.PffMonitoreo123RulesRequest;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.PffMonitoreo123RulesResponse;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.PffMonitoreo123RulesSoapFault;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.param.Monitoreo123XMi;


public class MainCXFClient_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ClassPathXmlApplicationContext classPathXmlAppContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
		classPathXmlAppContext.start();

		com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi monitoreo123xMi = new com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi();







		//monitoreo123xMi.setClaveDefinitiva(value);
		monitoreo123xMi.setClaveEmpaquetamiento("B100");
		//monitoreo123xMi.setClavePagosBxI(value);
		//monitoreo123xMi.setClavePagosVencidos(value);
		//monitoreo123xMi.setClavePenalizacion(value);
		//monitoreo123xMi.setClaveTransacciones(value);

		ContractDetailsODMVO contractDetails = new ContractDetailsODMVO();
		contractDetails.setAccountStatusCode("A");
		monitoreo123xMi.setContractDetails(contractDetails);

		//monitoreo123xMi.setCumpleCondiciones(value);
		//monitoreo123xMi.setDescripcionError(value);
		monitoreo123xMi.setEsBaja(false);
		//monitoreo123xMi.setEsCuentaActiva(true);
		monitoreo123xMi.setEstaEnUltimos3Meses(false);

		GregorianCalendar c1 = (GregorianCalendar) GregorianCalendar.getInstance();
		c1.set(1900, Calendar.JANUARY, 1);
		try {
			monitoreo123xMi.setFechaCancelacion(DatatypeFactory.newInstance().newXMLGregorianCalendar(c1));
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		//monitoreo123xMi.setFechaFinCorteAnteriorMonitoreo();
		monitoreo123xMi.setMes1Antes(5);
		monitoreo123xMi.setMes2Antes(4);


		monitoreo123xMi.setMesFechaCancelacion(1);

		monitoreo123xMi.setMesMonitoreoActual(6);
		monitoreo123xMi.setMesMonitoreoAnterior(3);

		MonitoreoMensualODMVO monitoreoMensualMes1 = new MonitoreoMensualODMVO();
		monitoreoMensualMes1.setNumComprasRealizadas(0);
		monitoreoMensualMes1.setPagoBxI(true);
		monitoreoMensualMes1.setNumPagosVencidosMes(0);
		monitoreo123xMi.setMonitoreoMensualMes1(monitoreoMensualMes1);

		MonitoreoMensualODMVO monitoreoMensualMes2 = new MonitoreoMensualODMVO();
		monitoreoMensualMes2.setNumComprasRealizadas(0);
		monitoreoMensualMes2.setPagoBxI(true);
		monitoreoMensualMes2.setNumPagosVencidosMes(0);
		monitoreo123xMi.setMonitoreoMensualMes2(monitoreoMensualMes2);

		MonitoreoMensualODMVO monitoreoMensualMes3 = new MonitoreoMensualODMVO();
		monitoreoMensualMes3.setNumComprasRealizadas(0);
		monitoreoMensualMes3.setPagoBxI(true);
		monitoreoMensualMes3.setNumPagosVencidosMes(0);
		monitoreo123xMi.setMonitoreoMensualMes3(monitoreoMensualMes3);

		monitoreo123xMi.setNumTrimestreSigAnualidad(4);
		monitoreo123xMi.setTieneCuentaCaptacionBxI(true);


		Monitoreo123XMi monitoreo123xMiWrapper = new Monitoreo123XMi();

		monitoreo123xMiWrapper.setMonitoreo123XMi(monitoreo123xMi);


		PffMonitoreo123RulesDecisionService sampleWebService = (PffMonitoreo123RulesDecisionService)classPathXmlAppContext.getBean("client");
		PffMonitoreo123RulesRequest pffMonitoreo123RulesRequest = new PffMonitoreo123RulesRequest();
		pffMonitoreo123RulesRequest.setDecisionID("1");

		pffMonitoreo123RulesRequest.setMonitoreo123XMi(monitoreo123xMiWrapper);
		try {
			PffMonitoreo123RulesResponse monitoreo123RulesResponse = sampleWebService.pffMonitoreo123Rules(pffMonitoreo123RulesRequest);

			Monitoreo123XMi monitoreo123xMiWrapperResponse = monitoreo123RulesResponse.getMonitoreo123XMi();

			com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi monitoreo123xMiResponse = monitoreo123xMiWrapperResponse.getMonitoreo123XMi();
			toXML(monitoreo123xMiResponse);
		} catch (PffMonitoreo123RulesSoapFault e) {
			// TODO Auto-generated catch block
			PffMonitoreo123RulesException re = e.getFaultInfo();
			System.out.println(re.getException());
		}		
		catch (Exception eg) {
			System.out.println(eg.getMessage() + " " );
			eg.printStackTrace();
		}


	}

	public static void toXML(Object obj){
		try {

			File file = new File("C:\\AD\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(obj, file);
			jaxbMarshaller.marshal(obj, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
