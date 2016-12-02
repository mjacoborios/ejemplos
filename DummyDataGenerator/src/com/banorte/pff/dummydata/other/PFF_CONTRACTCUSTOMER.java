package com.banorte.pff.dummydata.other;

import java.util.concurrent.atomic.AtomicLong;

public class PFF_CONTRACTCUSTOMER implements Generable{
	
	private AtomicLong idClienteContrato;
	public static final String HEADERS = "contractDetails_id,PARTYID,entity,participantType,partyContractRelStatus,mainPartyId,id,DATAVERSION,SEQUENCE,enddate";
	
	private long idCliente;
	
	private long idTDC;
	private long idCAP;
	private long idBXI;
	
	public PFF_CONTRACTCUSTOMER() {
		
	}
	
	public PFF_CONTRACTCUSTOMER(AtomicLong idClienteContrato, long idCliente, long idTDC, long idCAP, long idBXI) {
		super();
		this.idClienteContrato = idClienteContrato;
		this.idCliente = idCliente;
		this.idTDC = idTDC;
		this.idCAP = idCAP;
		this.idBXI = idBXI;
	}

	public AtomicLong getIdClienteContrato() {
		return idClienteContrato;
	}

	public void setIdClienteContrato(AtomicLong idClienteContrato) {
		this.idClienteContrato = idClienteContrato;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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

	@Override
	public String[] generate() {
		String[] data = new String[3];
		/*
		data[0] = "Insert into PFF_ContractCustomer (contractDetails_id,PARTYID,entity,participantType,partyContractRelStatus,mainPartyId,id,DATAVERSION,SEQUENCE)"
				+ "values ('"+idTDC+"','"+idCliente+"','0161','00','A', '"+idCliente+"','"+idClienteContrato.getAndIncrement()+"',1,1);";
		data[1] = "Insert into PFF_ContractCustomer (contractDetails_id,PARTYID,entity,participantType,partyContractRelStatus,mainPartyId,id,DATAVERSION,SEQUENCE)"
				+ "values ('"+idCAP+"','"+idCliente+"','0161','00','A', '"+idCliente+"','"+idClienteContrato.getAndIncrement()+"',1,1);";
		data[2] = "Insert into PFF_ContractCustomer (contractDetails_id,PARTYID,entity,participantType,partyContractRelStatus,mainPartyId,id,DATAVERSION,SEQUENCE)"
				+ "values ('"+idBXI+"','"+idCliente+"','0161','00','A', '"+idCliente+"','"+idClienteContrato.getAndIncrement()+"',1,1);";
		*/
		
		data[0] = "11111"+idTDC+",11111"+idCliente+",0161,00,A,11111"+idCliente+",11111"+idClienteContrato.getAndIncrement()+",1,1,9999-12-31";
		data[1] = "11111"+idCAP+",11111"+idCliente+",0161,00,A,11111"+idCliente+",11111"+idClienteContrato.getAndIncrement()+",1,1,9999-12-31";
		data[2] = "11111"+idBXI+",11111"+idCliente+",0161,00,A,11111"+idCliente+",11111"+idClienteContrato.getAndIncrement()+",1,1,9999-12-31";
		
		return data;
	}

	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return "PFF_CONTRACTCUSTOMER.csv";
	}
	
	

}
