package core;

import common.Commands;
import members.Child;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

//            Commands commands = new Commands();

            List<String> commands = Arrays.asList("insertChild", "insertFather", "insertMother",
                    "removeFather","removeMother","removeChild",
                    "insertGrandFatherOne","insertGrandFatherTwo","removeGrandFatherOne","removeGrandFatherTwo",
                    "insertGrandMotherOne","insertGrandMotherTwo",
                    "removeGrandMotherOne","removeGrandMotherTwo",
                    "viewAllChilds","viewAllMothers","viewAllFathers",
                    "viewAllGrandMotherOnes","viewAllGrandMotherTwos",
                    "viewAllGrandFatherOnes","viewAllGrandFatherTwos",
                    "viewEntireFamilyById");


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

                        System.out.println(controller.getChilds());

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


                    case "removeFather":

                        System.out.println(FATHER_REMOVE_REQUIREMENTS);

                        line = scanner.nextLine();

                        String[] newLine = line.split("\\s");

                        int idToRemove = Integer.parseInt(newLine[0]);

                        controller.removeFather(idToRemove);

                        System.out.println(FATHER_REMOVED_MESSAGE);

                    case  "removeMother":

                        System.out.println(MOTHER_REMOVE_REQUIREMENTS);

                        line = scanner.nextLine();

                        String[] line1 = line.split("\\s");

                        int removeId = Integer.parseInt(line1[0]);

                        controller.removeMother(removeId);

                        System.out.println(MOTHER_REMOVED_MESSAGE);

                    case  "removeChild":

                        System.out.println(CHILD_REMOVE_MESSAGE);

                        line = scanner.nextLine();

                        String[] childline = line.split("\\s");

                        int childl = Integer.parseInt(childline[0]);

                        controller.removeChild(childl);

                        System.out.println(CHILD_REMOVED_MESSAGE);

                    case "insertGrandFatherOne":

                        System.out.println(INSERT_FATHER_REQUIREMENTS_MESSAGE);

                        line = scanner.nextLine();

                        String[] tokens1 = line.split("\\s");

                        int grandfatheoneId = Integer.parseInt(tokens1[0]);

                        String grandFatherName = tokens1[1];

                        String grandFatherCityName = tokens1[2];

                        controller.insertGrandFatherOne(grandfatheoneId,grandFatherName,grandFatherCityName);

                        System.out.println(GRAND_FATHER_ONE_ADDED);

                    case "insertGrandFatherTwo":

                        System.out.println(INSERT_FATHER_REQUIREMENTS_MESSAGE);

                        line = scanner.nextLine();

                        String[] tokens2 = line.split("\\s");

                        int grandfathetwoId = Integer.parseInt(tokens2[0]);

                        String grandFatherTwoName = tokens2[1];

                        String grandFatherTwoCityName = tokens2[2];

                        controller.insertGrandFatherOne(grandfathetwoId,grandFatherTwoName,grandFatherTwoCityName);

                        System.out.println(GRAND_FATHER_TWO_ADDED);

                    case  "insertGrandMotherOne":

                        System.out.println(INSERT_MOTHER_REQUIREMENTS_MESSAGE);

                        line = scanner.nextLine();

                        String[] tokens3 = line.split("\\s");

                        int grandmotherOneId = Integer.parseInt(tokens3[0]);

                        String grandmotherOneName = tokens3[1];

                        String grandMotherOneCityName = tokens3[2];

                        controller.insertGrandFatherOne(grandmotherOneId,grandmotherOneName,grandMotherOneCityName);

                        System.out.println(GRAND_MOTHER_ONE_ADDED);

                    case  "insertGrandMotherTwo":

                        System.out.println(INSERT_MOTHER_REQUIREMENTS_MESSAGE);

                        line = scanner.nextLine();

                        String[] tokens4 = line.split("\\s");

                        int grandmotherTwoId = Integer.parseInt(tokens4[0]);

                        String grandmotherTwoName = tokens4[1];

                        String grandMotherTwoCityName = tokens4[2];

                        controller.insertGrandFatherOne(grandmotherTwoId,grandmotherTwoName,grandMotherTwoCityName);

                        System.out.println(GRAND_MOTHER_TWO_ADDED);


                    case  "removeGrandMotherOne":

                        System.out.println(MOTHER_REMOVE_REQUIREMENTS);

                        line = scanner.nextLine();

                        String[] line2 = line.split("\\s");

                        int removeMotherId = Integer.parseInt(line2[0]);

                        controller.removeGrandMotherOne(removeMotherId);

                        System.out.println(GRAND_MOTHER_REMOVED_MESSAGE);

                    case  "removeGrandMotherTwo":

                        System.out.println(MOTHER_REMOVE_REQUIREMENTS);

                        line = scanner.nextLine();

                        String[] line3 = line.split("\\s");

                        int removeMotherTwoId = Integer.parseInt(line3[0]);

                        controller.removeGrandMotherTwo(removeMotherTwoId);

                        System.out.println(GRAND_MOTHER_REMOVED_MESSAGE);

                    case  "removeGrandFatherOne":

                        System.out.println(FATHER_REMOVE_REQUIREMENTS);

                        line = scanner.nextLine();

                        String[] line4 = line.split("\\s");

                        int removeGrandFarherOneId = Integer.parseInt(line4[0]);

                        controller.removeGrandMotherOne(removeGrandFarherOneId);

                        System.out.println(GRAND_FATHER_REMOVED_MESSAGE);

                    case  "removeGrandFatherTwo":

                        System.out.println(FATHER_REMOVE_REQUIREMENTS);

                        line = scanner.nextLine();

                        String[] line5 = line.split("\\s");

                        int removeGrandFarherTwoId = Integer.parseInt(line5[0]);

                        controller.removeGrandMotherTwo(removeGrandFarherTwoId);

                        System.out.println(GRAND_FATHER_REMOVED_MESSAGE);

                    case "viewAllChilds":

                        controller.viewAllChilds();

                    case "viewAllFathers":
                        controller.viewAllFathers();

                    case "viewAllMothers":
                        controller.viewAllMothers();

                    case "viewAllGrandMotherOnes":
                        controller.viewAllGrandMotherOnes();

                    case "viewAllGrandMotherTwos":
                        controller.viewAllGrandMotherOnes();

                    case "viewAllGrandFatherOnes":
                        controller.viewAllGrandFatherOnes();

                    case "viewAllGrandFatherTwos":
                        controller.viewAllGrandFatherTwos();

                    case "viewEntireFamilyById":

                        line = scanner.nextLine();

                        String[] line6 = line.split("\\s");

                        int FamilyId = Integer.parseInt(line6[0]);

                        controller.viewEntireFamilyById(FamilyId);


                        default:

                        System.out.println(INVALID_INPUT);

                }


            } else {
                System.out.println("Please type help to see all the commands");

            }
        }

    }

}
