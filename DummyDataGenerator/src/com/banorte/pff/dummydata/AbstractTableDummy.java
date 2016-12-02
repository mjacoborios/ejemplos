package com.banorte.pff.dummydata;

public abstract class AbstractTableDummy {

	protected AbstractTableDummy nextTableDummy;
	protected DummyTables dummyTable;
	
	public void setNextTableDummy(AbstractTableDummy nextTableDummy) {
		this.nextTableDummy = nextTableDummy;
	}
	
	public String[] generate(DummyTables dummyTable, String[] parameters){
		if(this.dummyTable == dummyTable){
			String data = process(parameters);
			System.out.println("File: [" + dummyTable.getFileName()+ "] - Data: [" + data + "]");
			return parameters;
		}else{
			return nextTableDummy.generate(dummyTable, parameters);
		}	
	}
	
	protected abstract String process(String[] parameters);	
}
