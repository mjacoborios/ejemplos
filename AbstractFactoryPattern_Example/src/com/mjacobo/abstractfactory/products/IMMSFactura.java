package com.mjacobo.abstractfactory.products;

public class IMMSFactura extends FacturaAbstract{

	@Override
	public void createHeader() {
		// TODO Auto-generated method stub
		System.out.println("Creando HEADER de Factura IMMS");
		
		StringBuilder builder = null;
	}

	@Override
	public void createBody() {
		// TODO Auto-generated method stub
		System.out.println("Creando BODY de Factura IMMS");
	}

	@Override
	public void createFooter() {
		// TODO Auto-generated method stub
		System.out.println("Creando FOOTER de Factura IMMS");
	}

}
