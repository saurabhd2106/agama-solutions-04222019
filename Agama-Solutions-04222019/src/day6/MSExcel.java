package day6;

public class MSExcel implements MicrosoftOffice{

	@Override
	public void save() {
		System.out.println("Save Method from MS Excel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("Save As Method from MS Excel");
		
	}

	@Override
	public void open() {
		System.out.println("Open Method from MS Excel");
		
	}

}
