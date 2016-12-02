package com.mjacobo.abstractfactory.client;

import com.mjacobo.abstractfactory.factories.FacturaAbstractFactory;
import com.mjacobo.abstractfactory.factories.NormalFacturaFactory;
import com.mjacobo.abstractfactory.products.FacturaAbstract;

public class ClientFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacturaAbstractFactory factory = new NormalFacturaFactory();

		FacturaAbstract facturaImms = factory.createFactura();

		facturaImms.generateFactura();

	}

}

	
