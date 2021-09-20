package core;

public interface InterfaceController {

    String insertChild(int childId , String name, String cityName);

    String insertMother(int motherId, String name, String cityName );

    String insertFather(int fatherId, String name, String cityName);

    String removeChild(int id);

    String removeMother(int id);

    String removeFather(int id);

    String insertGrandFatherOne(int grandFatherOneId, String name , String cityName);

    String insertGrandFatherTwo(int grandFatherOneId, String name , String cityName);

    String removeGrandFatherOne(int id);

    String removeGrandFatherTwo(int id);

    String insertGrandMotherOne(int grandMotherOneId, String name , String cityName);

    String insertGrandMotherTwo(int grandMotherOneId, String name , String cityName);

    String removeGrandMotherOne(int id);

    String removeGrandMotherTwo(int id);

    String viewAllChilds();

    String viewAllFathers();

    String viewAllMothers();

    String viewAllGrandMotherOnes();

    String viewAllGrandMotherTwos();

    String viewAllGrandFatherOnes();

    String viewAllGrandFatherTwos();

    String viewEntireFamilyById(int id);

}
