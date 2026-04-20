package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass
 */
public class Planet {

	// Define your instance variables here
	private String name;
	private double mass;
	
	// Write the constructor for the Planet class
	public Planet(String name, double mass){
		this.name = name;
		this.mass = mass;
	}

	public String getName () {
		return name;
	}
	
	public double getMass () {
		return mass;
	}
	
	public String toString () {
		return name + " has a mass of " + mass;
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide ( Planet other ) {
		String creation_name = this.getName() + "-" + other.getName();
		double creation_mass = this.getMass() + other.getMass();
		Planet creation = new Planet(creation_name, creation_mass);
		return creation;
	}
	
	
}
