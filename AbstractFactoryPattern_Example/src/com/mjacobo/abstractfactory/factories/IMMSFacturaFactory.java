package com.mjacobo.abstractfactory.factories;

import com.mjacobo.abstractfactory.products.FacturaAbstract;
import com.mjacobo.abstractfactory.products.IMMSFactura;

public class IMMSFacturaFactory extends FacturaAbstractFactory{

	@Override
	public FacturaAbstract createFactura() {
		// TODO Auto-generated method stub
		return new IMMSFactura();
	}

}
