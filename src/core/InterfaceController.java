package core;

public interface InterfaceController {

    String insertChild(int childId ,String name, String cityName);

    String insertMother(int motherId,String name, String cityName );

    String insertFather(int fatherId,String name, String cityName);

    String removeChild(int id);

    String removeMother(int id);

    String removeFather(int id);

}
