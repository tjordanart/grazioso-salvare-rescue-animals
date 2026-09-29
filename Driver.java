import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static final String[] VALID_MONKEY_SPECIES = {
            "Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"
    };

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        
        while (!choice.equals("q")) {
        	displayMenu();
        	choice = scanner.nextLine().trim().toLowerCase();
        	
        	switch (choice) {
        	case "1":
        		intakeNewDog(scanner);
        		break;
        	case "2":
                intakeNewMonkey(scanner);
                break;
            case "3":
                reserveAnimal(scanner);
                break;
            case "4":
                printAnimals("dog");
                break;
            case "5":
                printAnimals("monkey");
                break;
            case "6":
                printAnimals("available");
                break;
            case "q":
            	System.out.println("Exiting the Rescue Animal System. Goodbye!");
            	break;
            default:
            	System.out.println("\nThat is not a valid menu option. Please try again.");
            	break;
        	}
        }
        
        scanner.close();

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date? (MM-DD-YYYY)");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What country was the dog acquired in?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved? (true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("What country is the dog in service in?");
        String inServiceCountry = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        
        System.out.println("\n" + name + " has been added to the dog list.\n");
        
    }

        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }
        }
        	
        	String species = "";
            boolean validSpecies = false;
            while (!validSpecies) {
                System.out.println("What is the monkey's species? (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin)");
                species = scanner.nextLine();
                for (String allowedSpecies : VALID_MONKEY_SPECIES) {
                    if (allowedSpecies.equalsIgnoreCase(species)) {
                        species = allowedSpecies;
                        validSpecies = true;
                        break;
                	}
                }
                if (!validSpecies) {
                	System.out.println("That is not a species Grazioso Salvare currently trains. Please try again.");
                }
        	}
        	
            System.out.println("What is the monkey's tail length (inches)?");
            double tailLength = Double.parseDouble(scanner.nextLine());

            System.out.println("What is the monkey's height (inches)?");
            double height = Double.parseDouble(scanner.nextLine());

            System.out.println("What is the monkey's body length (inches)?");
            double bodyLength = Double.parseDouble(scanner.nextLine());

            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the monkey's acquisition date? (MM-DD-YYYY)");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What country was the monkey acquired in?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is the monkey reserved? (true/false)");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("What country is the monkey in service in?");
            String inServiceCountry = scanner.nextLine();

            Monkey newMonkey = new Monkey(name, species, tailLength, height, bodyLength,
                    gender, age, weight, acquisitionDate, acquisitionCountry,
                    trainingStatus, reserved, inServiceCountry);
            monkeyList.add(newMonkey);

            System.out.println("\n" + name + " has been added to the monkey list.\n");
        	
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("What type of animal would you like to reserve? (dog/monkey)");
        String animalType = scanner.nextLine().trim().toLowerCase();

        System.out.println("What country should the animal be in service in?");
        String country = scanner.nextLine().trim();

        boolean found = false;

        if (animalType.equals("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceCountry().equalsIgnoreCase(country)
                        && dog.getTrainingStatus().equalsIgnoreCase("in service")
                        && !dog.getReserved()) {
                    dog.setReserved(true);
                    System.out.println("\n" + dog.getName() + " has been reserved.\n");
                    found = true;
                    break;
                }
            }
        } else if (animalType.equals("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceCountry().equalsIgnoreCase(country)
                        && monkey.getTrainingStatus().equalsIgnoreCase("in service")
                        && !monkey.getReserved()) {
                    monkey.setReserved(true);
                    System.out.println("\n" + monkey.getName() + " has been reserved.\n");
                    found = true;
                    break;
                }
            }
        } else {
            System.out.println("\nThat is not a valid animal type.\n");
            return;
        }

        if (!found) {
            System.out.println("\nNo " + animalType + " is currently available in " + country + ".\n");
        }
    }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(String listType) {
        System.out.println();
        switch (listType) {
            case "dog":
                for (Dog dog : dogList) {
                    System.out.println("Name: " + dog.getName()
                            + " | Status: " + dog.getTrainingStatus()
                            + " | Acquisition Country: " + dog.getAcquisitionLocation()
                            + " | Reserved: " + dog.getReserved());
                }
                break;
            case "monkey":
                for (Monkey monkey : monkeyList) {
                    System.out.println("Name: " + monkey.getName()
                            + " | Status: " + monkey.getTrainingStatus()
                            + " | Acquisition Country: " + monkey.getAcquisitionLocation()
                            + " | Reserved: " + monkey.getReserved());
                }
                break;
            case "available":
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                        System.out.println("Name: " + dog.getName()
                                + " | Type: Dog"
                                + " | Status: " + dog.getTrainingStatus()
                                + " | Acquisition Country: " + dog.getAcquisitionLocation()
                                + " | Reserved: " + dog.getReserved());
                    }
                }
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                        System.out.println("Name: " + monkey.getName()
                                + " | Type: Monkey"
                                + " | Status: " + monkey.getTrainingStatus()
                                + " | Acquisition Country: " + monkey.getAcquisitionLocation()
                                + " | Reserved: " + monkey.getReserved());
                    }
                }
                break;
            default:
                System.out.println("Invalid list type requested.");
        }
    }
}

