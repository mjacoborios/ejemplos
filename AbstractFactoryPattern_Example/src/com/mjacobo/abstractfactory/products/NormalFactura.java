package com.mjacobo.abstractfactory.products;

public class NormalFactura extends FacturaAbstract{

	
	
	
	@Override
	public void createHeader() {
		// TODO Auto-generated method stub
		System.out.println("Creando HEADER de Factura NORMAL");
	}

	@Override
	public void createBody() {
		// TODO Auto-generated method stub
		System.out.println("Creando BODY de Factura NORMAL");
	}

	@Override
	public void createFooter() {
		// TODO Auto-generated method stub
		System.out.println("Creando FOOTER de Factura NORMAL");
	}

}
