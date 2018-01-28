package ch5;

public class Dog extends Animal {
	
	private String breed;
	
	public Dog(String name,String breed) {
		super(name);
		setBreed(breed);
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(String[] args) {		
		Dog fido = new Dog("Princess","Spitz");
    	System.out.println("Name: " + fido.getName() + " is a " + fido.getBreed() );
	}
}

