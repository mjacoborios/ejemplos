package com.mjacobo.abstractfactory.products;

public abstract class FacturaAbstract {
	
	protected abstract void createHeader();
	
	protected abstract void createBody();
	
	protected abstract void createFooter();
	
	public void generateFactura(){
		createHeader();
		createBody();
		createFooter();
	}

}
