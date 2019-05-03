package day6;

public class MSWord implements MicrosoftOffice{

	@Override
	public void save() {
		System.out.println("Save Method from MS Word");
		
	}

	@Override
	public void saveAs() {
		System.out.println("Save as Method from MS word");
		
	}

	@Override
	public void open() {
		System.out.println("Open Method from MS Word");
		
	}
	
	public void copy(){
		System.out.println("Copy method from MS word");
	}

}
