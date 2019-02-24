package code.datas;

public class Teacher extends Students{
	
	private Lectures processingLecture = null;
	
	public Teacher(String name) {
		super(name);
		
		
		
	}

	public Lectures getProcessingLecture() {
		return processingLecture;
	}

	public void setProcessingLecture(Lectures processingLecture) {
		this.processingLecture = processingLecture;
	}

}
