import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        CarPark carPark = new CarPark();

        boolean x = true;

        while(x){
            System.out.println("---------------------------------------");
            System.out.println("1.Add a vehicle to the car park");
            System.out.println("2.Search a vehicle in the car park");
            System.out.println("3.Remove a vehicle from the car park");
            System.out.println("4.See all vehicles");
            System.out.println("5.Exit");
            System.out.print("\nWhat do you want to do: ");
            int choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice){
                case 1:
                    Vehicle vehicle;
                    System.out.println("---------------------------------------");
                    System.out.println("\t1.Add a Car");
                    System.out.println("\t2.Add a Motorbike");
                    System.out.print("\nWhat kind of vehicle do you want to add: ");
                    choice = userInput.nextInt();
                    if (choice == 1){
                        System.out.print("Enter car brand: ");
                        userInput.nextLine();
                        String brand = userInput.nextLine();
                        System.out.print("Enter car model: ");
                        String model = userInput.nextLine();
                        System.out.print("Enter car license plate: ");
                        String licensePlate = userInput.nextLine();
                        System.out.print("Enter car horse power: ");
                        int hp = userInput.nextInt();
                        System.out.print("Enter car weight: ");
                        float weight = userInput.nextFloat();
                        System.out.print("Enter the number of doors the car has: ");
                        int doorNr = userInput.nextInt();
                        vehicle = new Car(brand, model, licensePlate, hp, weight, doorNr);
                    }
                    else if (choice == 2) {
                        System.out.print("Enter bike brand: ");
                        userInput.nextLine();
                        String brand = userInput.nextLine();
                        System.out.print("Enter bike model: ");
                        String model = userInput.nextLine();
                        System.out.print("Enter bike license plate: ");
                        String licensePlate = userInput.nextLine();
                        System.out.print("Enter bike horse power: ");
                        int hp = userInput.nextInt();
                        System.out.print("Enter bike weight: ");
                        float weight = userInput.nextFloat();
                        System.out.print("Enter bike cc: ");
                        int cc = userInput.nextInt();
                        System.out.print("Bike has a sidecar: (true or false) ");
                        boolean sideCar = userInput.nextBoolean();
                        vehicle = new Motorbike(brand, model, licensePlate, hp, weight, cc, sideCar);
                    }
                    else {
                        System.out.println("Invalid choice.");
                        break;
                    }

                    carPark.addVehicle(vehicle);
                    break;
                case 2:
                    System.out.print("Enter the license plate of the vehicle you're looking for: ");
                    Vehicle temp = carPark.searchVehicle(userInput.nextLine());
                    if (temp == null)
                        System.out.println("\nVehicle not found.");
                    else
                        System.out.println("\n" +temp.toString());
                    break;
                case 3:
                    System.out.print("Enter the license plate of the vehicle you want to remove: ");
                    if(carPark.removeVehicle(userInput.nextLine()) == 0)
                        System.out.println("Vehicle removed succesfully.");
                    else
                        System.out.println("\nVehicle not found.");
                    break;
                case 4:
                    if("".equals(carPark.toString()))
                        System.out.println("\nVehicle park is empty.");
                    else
                        System.out.println(carPark);
                    break;
                case 5:
                    x = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}