package com.mjacobo.abstractfactory.factories;

import com.mjacobo.abstractfactory.products.FacturaAbstract;
import com.mjacobo.abstractfactory.products.NormalFactura;

public class NormalFacturaFactory extends FacturaAbstractFactory{

	@Override
	public FacturaAbstract createFactura() {
		// TODO Auto-generated method stub
		return new NormalFactura();
	}

}
