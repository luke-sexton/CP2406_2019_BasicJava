package week8;

import java.util.Scanner;

public class TwoEventParticipants {
    public static void main(String[] args) {

        Participant[] marathonParticipants = new Participant[8];
        Participant[] divingParticipants = new Participant[8];
        System.out.println("Please enter marathon participant values: ");
        createParticipantArray(marathonParticipants);
        createParticipantArray(divingParticipants);

        for (Participant marathonParticipant : marathonParticipants) {
            for (Participant divingParticipant : divingParticipants) {
                if (marathonParticipant.equals(divingParticipant)) {
                    System.out.println(marathonParticipant.toString());
                }
            }
        }
    }

    public static void createParticipantArray(Participant[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Enter name: ");
            String name = input.nextLine();

            System.out.println("Enter age: ");
            int age = input.nextInt();

            System.out.println("Enter address: ");
            String address = input.nextLine();

            array[i] = new Participant(name, address, age);
            System.out.println("Participant added: " + array[i].toString());
        }
    }
}
