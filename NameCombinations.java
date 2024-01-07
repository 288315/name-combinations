import java.util.Scanner;

public class NameCombinations {
    public static void main(String[] args) {

        String name1, name2, name3, chosenName, usernameSuggestion;
        int numberEntered;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter three first name:");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        
        String[] combinations = {
            name1 + " " + name2,
            name1 + " " + name3,
            name2 + " " + name1,
            name2 + " " + name3,
            name3 + " " + name1,
            name3 + " " + name2
        };
        
        System.out.println("Possible names are:");
        for (int i = 0; i < combinations.length; i++) {
            System.out.println((i + 1) + " - " + combinations[i]);
        }
        
        System.out.print("Enter 1-6 to select a name: ");
	    numberEntered = scan.nextInt();
        
        chosenName = combinations[numberEntered - 1];

        System.out.print("The initials for " + chosenName + " is ");
        for (String initials:chosenName.split(" ")) {
            System.out.print(initials.charAt(0));
        }
        System.out.println(".");
        
        usernameSuggestion = chosenName.toLowerCase().replace(" ", "_");
        
        System.out.print("Suggested username: " + usernameSuggestion);        
    }
}
