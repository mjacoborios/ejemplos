package com.banorte.pff.dummydata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.banorte.pff.dummydata.other.Generable;
import com.banorte.pff.dummydata.other.PFF_CONTRACTCUSTOMER;
import com.banorte.pff.dummydata.other.PFF_CONTRACTDETAILS;
import com.banorte.pff.dummydata.other.PFF_CUSTOMERDETAILS;
import com.banorte.pff.dummydata.other.PFF_MONITOREOMENSUAL;

public class App_DummyDataGenerator {

	public static void main(String[] args) {

		AtomicLong idTDC = new AtomicLong(110000001); //Indice = 1
		AtomicLong idCAP = new AtomicLong(220000001); //Indice = 1
		AtomicLong idBXI = new AtomicLong(330000001); //Indice = 1

		AtomicLong idCliente = new AtomicLong(440000001); //Indice = 1

		AtomicLong idClienteContrato = new AtomicLong(550000001); // (5 x 3) + 1

		AtomicLong idMonitoreoMensual = new AtomicLong(880000001);// (5 x 4) + 1

		PFF_CONTRACTDETAILS contractdetails = new PFF_CONTRACTDETAILS();
		PFF_CUSTOMERDETAILS customerdetails = new PFF_CUSTOMERDETAILS();
		PFF_CONTRACTCUSTOMER contractcustomer = new PFF_CONTRACTCUSTOMER();
		PFF_MONITOREOMENSUAL monitoreomensual = new PFF_MONITOREOMENSUAL();
		
		writeUsingBufferedWriter(PFF_CONTRACTDETAILS.HEADERS, "C:/AD/SQLLoader_II/data/" + contractdetails.getFileName());
		writeUsingBufferedWriter(PFF_CUSTOMERDETAILS.HEADERS, "C:/AD/SQLLoader_II/data/" + customerdetails.getFileName());
		writeUsingBufferedWriter(PFF_CONTRACTCUSTOMER.HEADERS, "C:/AD/SQLLoader_II/data/" + contractcustomer.getFileName());
		writeUsingBufferedWriter(PFF_MONITOREOMENSUAL.HEADERS, "C:/AD/SQLLoader_II/data/" + monitoreomensual.getFileName());
		
		List<Generable> generators = null;
		for (long i=1; i<=100282; i++){
			generators = new ArrayList<Generable>();

			contractdetails =  new PFF_CONTRACTDETAILS(idTDC.getAndIncrement(), idCAP.getAndIncrement(), idBXI.getAndIncrement());
			generators.add(contractdetails);

			customerdetails = new PFF_CUSTOMERDETAILS(idCliente.getAndIncrement());
			generators.add(customerdetails);

			contractcustomer = new PFF_CONTRACTCUSTOMER(idClienteContrato, customerdetails.getIdCliente(), 
					contractdetails.getIdTDC(), contractdetails.getIdCAP(), contractdetails.getIdBXI());
			generators.add(contractcustomer);

			monitoreomensual = new PFF_MONITOREOMENSUAL(idMonitoreoMensual, contractdetails.getIdTDC());
			generators.add(monitoreomensual);

			//System.out.println( "*********************************************************" );
			for(int m=0; m<generators.size() ; m++ ){
				Generable gen = generators.get(m);
				String[] data = gen.generate();

				//	System.out.println( "---------------------------------------------------------" );
				for(String d : data){
					//System.out.println( d );
					writeUsingBufferedWriter(d, "C:/AD/SQLLoader_II/data/" + gen.getFileName());
				}
				if(((long) (i%100000)) == 0){
					System.out.println("Registros Generados = " + i);
				}
			}
		}
	}



	private synchronized static void writeUsingBufferedWriter(String data, String fileName) {
		File file = new File(fileName);
		FileWriter fr = null;
		BufferedWriter br = null;
		//String dataWithNewLine=;
		try{
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);           
			br.write(data+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
