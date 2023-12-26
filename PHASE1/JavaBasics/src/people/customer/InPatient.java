package people.customer;

public class InPatient extends Patient{

	int roomId;
	int bedId;
	
	public InPatient() {super();};
	
	public InPatient(int id, String name,float age,int roomId, int bedId ) {
	
//		this.name=name;
//		this.age=age;
//		this.id=id;	
		
		super(id,name,age);
		System.out.println("Inside InPatient constructor ");
		
		this.roomId=roomId;
		this.bedId=bedId;
		
	}
	
	void adminsterMedicine(String med){
		System.out.println(" Gave medicine "+med + " to the in-patient");
	}
	
//	@Override
//	public void disease(){
//		System.out.println("Disease found. It is being treated..");
//	}
	
	@Override
	public void disease(){
		super.disease();
		System.out.println("It is being treated..");
	}
	
}
