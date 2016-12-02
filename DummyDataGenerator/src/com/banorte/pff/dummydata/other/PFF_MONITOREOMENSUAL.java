package com.banorte.pff.dummydata.other;

import java.util.concurrent.atomic.AtomicLong;

public class PFF_MONITOREOMENSUAL implements Generable{
	
	private AtomicLong idMonitoreoMensual;
	private long idTDC;
	
	public static final String HEADERS = "IDMONITOREOMENSUAL,NUMCOMPRASREALIZADAS,NUMPAGOSVENCIDOSMES,PAGOBXI,INICIOCORTE,FINCORTE,CONTRACTDETAILS_ID";
	
	public PFF_MONITOREOMENSUAL() {

	}
	
	public PFF_MONITOREOMENSUAL(AtomicLong idMonitoreoMensual, long idTDC) {
		super();
		this.idMonitoreoMensual = idMonitoreoMensual;
		this.idTDC = idTDC;
	}

	public AtomicLong getIdMonitoreoMensual() {
		return idMonitoreoMensual;
	}

	public void setIdMonitoreoMensual(AtomicLong idMonitoreoMensual) {
		this.idMonitoreoMensual = idMonitoreoMensual;
	}

	public long getIdTDC() {
		return idTDC;
	}

	public void setIdTDC(long idTDC) {
		this.idTDC = idTDC;
	}

	@Override
	public String[] generate() {
		String[] data = new String[4];
		
		/*
		 Insert into PFF_DB_ADMIN.PFF_MONITOREOMENSUAL (IDMONITOREOMENSUAL,NUMCOMPRASREALIZADAS,NUMPAGOSVENCIDOSMES,PAGOBXI,INICIOCORTE,FINCORTE,CONTRACTDETAILS_ID) values (SEQ_PFF_MONITOREOMENSUAL.nextval,'17','0','1',to_timestamp('24/04/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('23/05/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),'1');
		  
		 */
		/*
		data[0] = idMonitoreoMensual.getAndIncrement()+",'17','0','1',to_timestamp('25/03/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('24/04/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),'"+idTDC+"'";
		data[1] = idMonitoreoMensual.getAndIncrement()+",'0','0','1',to_timestamp('25/04/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('24/05/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),'"+idTDC+"'";
		data[2] = idMonitoreoMensual.getAndIncrement()+",'17','2','1',to_timestamp('25/05/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),to_timestamp('24/06/16 00:00:00,000000000','DD/MM/RR HH24:MI:SS,FF'),'"+idTDC+"'";
		*/
		
		data[0] = "11111"+idMonitoreoMensual.getAndIncrement()+",17,2,1,2016-02-25 00:00:00.00,2016-03-24 00:00:00.00,11111"+idTDC+"";
		data[1] = "11111"+idMonitoreoMensual.getAndIncrement()+",2,0,0,2016-03-25 00:00:00.00,2016-04-24 00:00:00.00,11111"+idTDC+"";
		data[2] = "11111"+idMonitoreoMensual.getAndIncrement()+",0,0,1,2016-04-25 00:00:00.00,2016-05-24 00:00:00.00,11111"+idTDC+"";
		data[3] = "11111"+idMonitoreoMensual.getAndIncrement()+",17,1,1,2016-05-25 00:00:00.00,2016-06-24 00:00:00.00,11111"+idTDC+"";
				
		return data;
	}

	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return "PFF_MONITOREOMENSUAL.csv";
	}

	
}
