package core;

import common.ExceptionMessages;
import core.InterfaceController;
import members.Child;
import members.Father;
import members.Mother;

import java.util.Map;
import java.util.TreeMap;

import static common.ExceptionMessages.*;

import static common.ExceptionMessages.EXISTING_FATHER;
import static common.OutputMessages.*;

public class Controller implements InterfaceController {

    private Map<Integer, Child> childs;
    private Map<Integer, Father> fathers;
    private Map<Integer, Mother> mothers;

    public Controller(){

        this.childs = new TreeMap<>();
        this.fathers = new TreeMap<>();
        this.mothers = new TreeMap<>();
    }


    @Override
    public String insertChild(int personId, String name, String cityName) {
        if(childs.containsKey(personId)){
            throw new IllegalArgumentException(EXISTING_CHILD);
        }

        Child child;

        child = new Child(personId,name,cityName);

        childs.put(personId,child);

        return CHILD_ADDED_MESSAGE;

    }

    @Override
    public String insertMother(int personId, String name, String cityName) {

        if(mothers.containsKey(personId)){
            throw new IllegalArgumentException(EXISTING_MOTHER);
        }

        Mother mother;

        mother = new Mother(personId,name,cityName);

        mothers.put(personId,mother);

        return MOTHER_ADDED_MESSAGE;

    }

    @Override
    public String insertFather(int personId, String name, String cityName) {
        if(fathers.containsKey(personId)){
            throw new IllegalArgumentException(EXISTING_FATHER);
        }

        Father father;

        father = new Father(personId,name,cityName);

        fathers.put(personId,father);

        return FATHER_ADDED_MESSAGE;
    }

    @Override
    public String removeChild(int id) {
        checkChildId(id);

        childs.remove(id);

        return CHILD_REMOVED_MESSAGE;

    }

    @Override
    public String removeMother(int id) {
        checkMotherId(id);

        mothers.remove(id);

        return MOTHER_REMOVED_MESSAGE;
    }

    @Override
    public String removeFather(int id) {
        checkFatherId(id);

        fathers.remove(id);

        return FATHER_REMOVED_MESSAGE;
    }

    public void checkChildId(int id){

        if(!this.childs.containsKey(id)){
            throw new IllegalArgumentException(NOT_EXISTING_CHILD);

        }

    }

    public void checkFatherId(int id){

        if(!this.fathers.containsKey(id)){
            throw new IllegalArgumentException(NOT_EXISTING_FATHER);

        }

    }

    public void checkMotherId(int id){

        if(!this.mothers.containsKey(id)){
            throw new IllegalArgumentException(NOT_EXISTING_MOTHER);
        }
    }
}



