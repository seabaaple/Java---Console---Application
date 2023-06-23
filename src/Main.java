// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.BufferedReader;
import java.util.ArrayList;
public class Main {
    // Green -> arrows on left for start of code to run
// Class just like in C#
    public static void main(String[] args) {
// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
//Commenting out code is the same as C#
// Methods in Java are lowercase instead of uppercase in C#
        //printExample1(); //Runs the method1 I created below the Main class
// Classwork practice Java Functions from teacher: https://github.com/WCramRTC/Prog_225_S23_L10_Intro_To_Java_Part2/blob/main/src/com/wcram/Main.java

        //public static void printExample1() {
        //System.out.println("Hello World! (testing println)"); //println goes to the next line
        //System.out.printf("testing printf (DOESN'T GO TO NEXT LINE!) ");
        //System.out.println("");
        //System.out.print("testing the minimal wording 'print' ");
        //}
        // main


        //java.io.BufferedReader reader = new java.io.BufferedReader();


        ArrayList<Team> team = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to Team Manager 2023");
            System.out.println("\nSelect an option:\n");
            System.out.println("1 - List Teams and Players");
            System.out.println("2 - Add a Team");
            System.out.println("3 - Add a Player");
            System.out.print("Option: ");

            int option;
            try {
                option = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                option = 0;
            }

            if (option == 1) {
                System.out.println();
                for (Team t : team) {
                    System.out.println(t.getName());
                    for (Player player : t.getPlayers()) {
                        System.out.println(player.getFirstName() + " " + player.getLastName() + " - " + player.getNumber());
                    }
                    System.out.println();
                }
            }
            else if (option == 2) {
                System.out.println("\nAdding a Team\n");
                System.out.print("Enter team name: ");
                String teamName;
                try {
                    teamName = reader.readLine();
                } catch (Exception e) {
                    teamName = "";
                }
                Team t = new Team(teamName);
                team.add(t);
                System.out.println("Team added successfully!");
            }
            else if (option == 3) {
                System.out.println("\nAdding a Player\n");
                System.out.print("Enter name: ");
                String playerName;
                try {
                    playerName = reader.readLine();
                } catch (Exception e) {
                    playerName = "";
                }
                System.out.print("Enter a number: ");
                int playerNumber;
                try {
                    playerNumber = Integer.parseInt(reader.readLine());
                }
                catch (Exception e) {
                    playerNumber = 0;
                }

                System.out.println("\nChoose a team:\n");
                for (int i = 0; i < team.size(); i++) {
                    System.out.println(i + " - " + team.get(i).getName());
                }

                System.out.print("Team: ");
                int teamIndex;
                try {
                    teamIndex = Integer.parseInt(reader.readLine());
                }
                catch (Exception e) {
                    teamIndex = 0;
                }

                if (teamIndex >= 0 && teamIndex < team.size()) {
                    Team selectedTeam = team.get(teamIndex);
                    Player player = new Player(playerName, playerNumber);
                    selectedTeam.addPlayer(player);
                    System.out.println("Player added successfully!");
                }
                else {
                    System.out.println("Invalid team index!");
                }
            }
        }
    }
}