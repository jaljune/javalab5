package kr.ac.kookmin.pet;

import kr.ac.kookmin.pet.Animal;

public class Pet extends Animal{
	private String name;
	private int age; //in year
	private double weight; //in pounds
	
	//�������̵�
	public String toString() {
			return ("Name: " + name +" Age: " + age + " years"
							+"\nWeight: "+ weight + " pounds"); 				
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {
			//�����Ͻÿ�.
		super(iniGender);
			if(initialAge <0 &&initialWeight<0)
			System.exit(0);
		
		name = initialName;
		age = initialAge;
		weight =initialWeight;
	}
	//�����ε�
	public Pet(String initialName) {
			name = initialName;
			age = 0;
			weight = 0;
	}
	
	public Pet( int initialAge) {
			name = "No name yet.";
			weight = 0;
			if (initialAge<0) {
					System.out.println("Error: Negative age.");
					System.exit(0);	
			} else
					age = initialAge;
	}
	public Pet() {
			name = " No name yet.";
			age = 0;
			weight = 0;
	}
	public void set(String newName, int newAge, double newWeight) {
		//�����Ͻÿ�.
		name = newName;
		age = newAge;
		weight =newWeight;
	}
	
	public void setAge (int newAge) {
		//�����Ͻÿ�.
		age = newAge;
	}
	public void setWeight( double newWeight) {
	      // �����Ͻÿ�.
		weight = newWeight;
     }
	
	public String getName() {
		// �����Ͻÿ�.
		return name;
	}
	
	public int getAge() {
		// �����Ͻÿ�.
		return age;
	}
	
	public double getWeight() {
		// �����Ͻÿ�.
		return weight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}