package CollectionFramework;

public abstract class Staf {
	String name;
    String address;

    Staf(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();

}

