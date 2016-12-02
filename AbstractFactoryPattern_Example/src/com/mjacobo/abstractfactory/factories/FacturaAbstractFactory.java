package com.mjacobo.abstractfactory.factories;

import com.mjacobo.abstractfactory.products.FacturaAbstract;

public abstract class FacturaAbstractFactory {
	protected FacturaAbstract factura;
	public abstract FacturaAbstract createFactura();
	
}
