package core;

import common.Commands;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static common.ExceptionMessages.*;
import static common.OutputMessages.*;

public class Engine implements InterfaceEngine {

    @Override
    public void run() {

        while (true) {

            Controller controller = new Controller();

            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            List<String> commands = Arrays.asList("insertChild", "insertFather", "insertMother");

            if (line.equals("help")) {
                for (String command : commands) {
                    System.out.println(command);
                }

                System.out.println(SELECT_ANY_COMMAND_MESSAGE);

                line = scanner.nextLine();

                switch (line) {

                    case "insertChild":

                        System.out.println(CHILD_INSERT_MESSAGE);

                        line = scanner.nextLine();

                        String[] tokens = line.split("\\s");

                        int personId = Integer.parseInt(tokens[0]);

                        String personName = tokens[1];

                        String cityName = tokens[2];

                        controller.insertChild(personId, personName, cityName);

                        System.out.println(CHILD_ADDED_MESSAGE);

                        break;

                    case "insertFather":

                        System.out.println(INSERT_FATHER_REQUIREMENTS_MESSAGE);

                        line = scanner.nextLine();

                        String[] lineFather = line.split("\\s");

                        int fatherId = Integer.parseInt(lineFather[0]);

                        String fatherName = lineFather[1];

                        String fatherCityName = lineFather[2];

                        controller.insertFather(fatherId, fatherName, fatherCityName);

                        System.out.println(FATHER_ADDED_MESSAGE);

                        break;

                    case "insertMother":
                        System.out.println(INSERT_MOTHER_REQUIREMENTS_MESSAGE);

                        line = scanner.nextLine();

                        String[] lineMother = line.split("\\s");

                        int motherId = Integer.parseInt(lineMother[0]);

                        String motherName = lineMother[1];

                        String motherCityName = lineMother[2];

                        controller.insertMother(motherId, motherName, motherCityName);

                        System.out.println(MOTHER_ADDED_MESSAGE);

                        break;

                    default:
                        System.out.println(INVALID_INPUT);

                }


            } else {
                System.out.println("Please type help to see all the commands");

            }
        }

    }

}
