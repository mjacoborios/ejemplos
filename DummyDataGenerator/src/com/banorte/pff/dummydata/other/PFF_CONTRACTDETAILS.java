package com.banorte.pff.dummydata.other;

public class PFF_CONTRACTDETAILS implements Generable{

	private long idTDC;
	private long idCAP;
	private long idBXI;
	
	public static final String HEADERS = "id,entity,BASICPRODUCTCODE,accountStatusCode,currency,openingDate,internalContractNumber,FREQUENCYCHARGETYPE,nextFeeCalculationDate,PCT,"
			+ "percentageVariation,fechaEmpaquetamiento,CLAVESEMP_ID,DATAVERSION,OFFERINGENTITY,familiyProduct,anualidad";
	
	
	public PFF_CONTRACTDETAILS() {
	}
	
	public PFF_CONTRACTDETAILS(long idTDC, long idCAP, long idBXI) {
		super();
		this.idTDC = idTDC;
		this.idCAP = idCAP;
		this.idBXI = idBXI;
	}
	
	public long getIdTDC() {
		return idTDC;
	}
	public void setIdTDC(long idTDC) {
		this.idTDC = idTDC;
	}
	public long getIdCAP() {
		return idCAP;
	}
	public void setIdCAP(long idCAP) {
		this.idCAP = idCAP;
	}
	public long getIdBXI() {
		return idBXI;
	}
	public void setIdBXI(long idBXI) {
		this.idBXI = idBXI;
	}
	
	
	public String[] generate(){
		String[] data = new String[3];
		
		String openingDate = "2005-06-21";
		String fechaEmpaquetamiento = "2015-06-29";
		/*
		data[0] = "Insert into PFF_ContractDetails "
				+ "(id,entity,BASICPRODUCTCODE,accountStatusCode,currency,openingDate,internalContractNumber,FREQUENCYCHARGETYPE,nextFeeCalculationDate,PCT,percentageVariation,fechaEmpaquetamiento,CLAVESEMP_ID,DATAVERSION,OFFERINGENTITY,familiyProduct)values "
				+ "('"+idTDC+"','0161','210','A','MXN', TIMESTAMP '2005-04-21 00:00:00','"+idTDC+"','Y', TIMESTAMP '2015-02-05 00:00:00',NULL,NULL, TIMESTAMP '2015-06-29 00:00:00','A0','1','0161','TC');";
		data[1] = "Insert into PFF_ContractDetails "
				+ "(id,entity,BASICPRODUCTCODE,accountStatusCode,currency,openingDate,internalContractNumber,FREQUENCYCHARGETYPE,nextFeeCalculationDate,PCT,percentageVariation,fechaEmpaquetamiento,CLAVESEMP_ID,DATAVERSION,OFFERINGENTITY,familiyProduct)values "
				+ "('"+idCAP+"','0161','210','A','MXN', TIMESTAMP '2005-04-21 00:00:00','"+idCAP+"','Y', TIMESTAMP '2015-02-05 00:00:00',NULL,NULL, TIMESTAMP '2015-06-29 00:00:00','A0','1','0161','CAP');";
		data[2] = "Insert into PFF_ContractDetails "
				+ "(id,entity,BASICPRODUCTCODE,accountStatusCode,currency,openingDate,internalContractNumber,FREQUENCYCHARGETYPE,nextFeeCalculationDate,PCT,percentageVariation,fechaEmpaquetamiento,CLAVESEMP_ID,DATAVERSION,OFFERINGENTITY,familiyProduct)values "
				+ "('"+idBXI+"','0161','210','A','MXN', TIMESTAMP '2005-04-21 00:00:00','"+idBXI+"','Y', TIMESTAMP '2015-02-05 00:00:00',NULL,NULL, TIMESTAMP '2015-06-29 00:00:00','A0','1','0161','BXI');";
		*/
		
		/*
		data[0] = "'"+idTDC+"','0161','210','A','MXN', TIMESTAMP '" + openingDate + " 00:00:00','"+idTDC+"','Y', TIMESTAMP '2015-02-05 00:00:00',NULL,NULL, TIMESTAMP '" + fechaEmpaquetamiento + " 00:00:00','A0','1','0161','TC'";
		data[1] = "'"+idCAP+"','0161','210','A','MXN', TIMESTAMP '" + openingDate + " 00:00:00','"+idCAP+"','Y', TIMESTAMP '2015-02-05 00:00:00',NULL,NULL, TIMESTAMP '" + fechaEmpaquetamiento + " 00:00:00','A0','1','0161','CAP'";
		data[2] = "'"+idBXI+"','0161','210','A','MXN', TIMESTAMP '" + openingDate + " 00:00:00','"+idBXI+"','Y', TIMESTAMP '2015-02-05 00:00:00',NULL,NULL, TIMESTAMP '" + fechaEmpaquetamiento + " 00:00:00','A0','1','0161','BXI'";
		 */	
		data[0] = "11111"+idTDC+",0161,210,A,MXN," + openingDate + " 00:00:00.00,11111"+idTDC+",Y,2015-02-05 00:00:00.00,,," + fechaEmpaquetamiento + " 00:00:00.00,A0,1,0161,TC,1000";
		data[1] = "11111"+idCAP+",0161,210,A,MXN," + openingDate + " 00:00:00.00,11111"+idCAP+",Y,2015-02-05 00:00:00.00,,," + fechaEmpaquetamiento + " 00:00:00.00,A0,1,0161,CAP,1000";
		data[2] = "11111"+idBXI+",0161,210,A,MXN," + openingDate + " 00:00:00.00,11111"+idBXI+",Y,2015-02-05 00:00:00.00,,," + fechaEmpaquetamiento + " 00:00:00.00,A0,1,0161,BXI,1000";
		 
		
		return data;
	}

	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return "PFF_CONTRACTDETAILS.csv";
	}
	
}
