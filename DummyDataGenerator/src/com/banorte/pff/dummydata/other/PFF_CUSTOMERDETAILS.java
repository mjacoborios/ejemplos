package com.banorte.pff.dummydata.other;

public class PFF_CUSTOMERDETAILS implements Generable {
	
	private long idCliente;
	public static final String HEADERS = "partyId,entity,EXTERNALPARTYID,registrationBranch,registrationChannel,status,segment,banca,type,DATAVERSION,RESIDENTFLAG";
	
	public PFF_CUSTOMERDETAILS() {

	}
	
	public PFF_CUSTOMERDETAILS(long idCliente) {
		super();
		this.idCliente = idCliente;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String[] generate() {
		String[] data = new String[1];
		//data[0] = "Insert into PFF_CustomerDetails (partyId,entity,EXTERNALPARTYID,registrationBranch,registrationChannel,status,segment,banca,type,DATAVERSION,RESIDENTFLAG)values ( "+idCliente+",0161,"+idCliente+",2000,All,1,ALL,ALL,PER,1,1);";
		data[0] = "11111"+idCliente+",0161,11111"+idCliente+",2000,All,1,ALL,ALL,PER,1,1";
		return data;
	}

	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return "PFF_CUSTOMERDETAILS.csv";
	}
	

	
}
