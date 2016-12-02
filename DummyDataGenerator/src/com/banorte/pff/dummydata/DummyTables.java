package com.banorte.pff.dummydata;

public enum DummyTables {
	DETALLE_CONTRATOS("PFF_CONTRACTDETAILS"), DETALLE_CLIENTES("PFF_CUSTOMERDETAILS"), 
	RELACION_CONTRATOS_Y_CLIENTES("PFF_CONTRACTCUSTOMER"), MONITOREO_MENSUAL("PFF_MONITOREOMENSUAL");
	
	private String fileName;
	
	private DummyTables(String fileName){
		this.fileName = fileName;
	}
	
	public String getFileName(){
		return fileName;
	}
}
