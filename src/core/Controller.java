package core;

import common.ExceptionMessages;
import core.InterfaceController;
import members.*;

import java.util.Map;

import java.util.TreeMap;

import static common.ExceptionMessages.*;

import static common.ExceptionMessages.EXISTING_FATHER;

import static common.OutputMessages.*;

public class Controller implements InterfaceController {

    private Map<Integer, Child> childs;

    private Map<Integer, Father> fathers;

    private Map<Integer, Mother> mothers;

    private Map<Integer, GrandFatherOne> grandfatherone;

    private Map<Integer, GrandFatherTwo> grandfathertwo;

    private Map<Integer,GrandMotherOne> grandmotherone;

    private Map<Integer,GrandMotherTwo> grandmothertwo;


    public Controller() {

        this.childs = new TreeMap<>();

        this.fathers = new TreeMap<>();

        this.mothers = new TreeMap<>();

        this.grandfatherone = new TreeMap<>();

        this.grandfathertwo = new TreeMap<>();

        this.grandmotherone = new TreeMap<>();

        this.grandmothertwo = new TreeMap<>();

    }


    @Override
    public String insertChild(int personId, String name, String cityName) {

        if (childs.containsKey(personId)) {

            throw new IllegalArgumentException(EXISTING_CHILD);
        }

        Child child;

        child = new Child(personId, name, cityName);

        childs.put(personId, child);

        return CHILD_ADDED_MESSAGE;

    }

    @Override
    public String insertMother(int personId, String name, String cityName) {

        if (mothers.containsKey(personId)) {

            throw new IllegalArgumentException(EXISTING_MOTHER);
        }

        Mother mother;

        mother = new Mother(personId, name, cityName);

        mothers.put(personId, mother);

        return MOTHER_ADDED_MESSAGE;

    }

    @Override
    public String insertFather(int personId, String name, String cityName) {

        if (fathers.containsKey(personId)) {

            throw new IllegalArgumentException(EXISTING_FATHER);
        }

        Father father;

        father = new Father(personId, name, cityName);

        fathers.put(personId, father);

        return FATHER_ADDED_MESSAGE;
    }



    @Override
    public String insertGrandFatherOne(int personId, String name, String cityName) {

        if (grandfatherone.containsKey(personId)) {

            throw new IllegalArgumentException(EXISTING_GRAND_FATHER_ONE);
        }

        GrandFatherOne grandfatherOne;

        grandfatherOne = new GrandFatherOne(personId, name, cityName);

        grandfatherone.put(personId, grandfatherOne);

        return GRAND_FATHER_ONE_ADDED;

    }

    @Override
    public String insertGrandFatherTwo(int personId, String name, String cityName) {

        if (grandfathertwo.containsKey(personId)) {
            throw new IllegalArgumentException(EXISTING_GRAND_FATHER_TWO);
        }

        GrandFatherTwo grandfatherTwo;

        grandfatherTwo = new GrandFatherTwo(personId, name, cityName);

        grandfathertwo.put(personId, grandfatherTwo);

        return GRAND_FATHER_TWO_ADDED;

    }


    @Override
    public String removeGrandFatherOne(int id) {

        checkGrandFatherOneId(id);

        grandfatherone.remove(id);

        return GRAND_FATHER_REMOVED_MESSAGE;
    }


    @Override
    public String removeGrandFatherTwo(int id) {

        checkGrandFatherTwoId(id);

        grandfathertwo.remove(id);

        return GRAND_FATHER_REMOVED_MESSAGE;
    }


    @Override
    public String insertGrandMotherOne(int personId, String name, String cityName) {

        if (grandmotherone.containsKey(personId)) {

            throw new IllegalArgumentException(EXISTING_GRAND_MOTHER_ONE);
        }

        GrandMotherOne grandmotherOne;

        grandmotherOne = new GrandMotherOne(personId, name, cityName);

        grandmotherone.put(personId, grandmotherOne);

        return GRAND_MOTHER_ONE_ADDED;

    }


    @Override
    public String insertGrandMotherTwo(int personId, String name, String cityName) {

        if (grandmothertwo.containsKey(personId)) {

            throw new IllegalArgumentException(EXISTING_GRAND_MOTHER_TWO);
        }

        GrandMotherTwo grandmotherTwo;

        grandmotherTwo = new GrandMotherTwo(personId, name, cityName);

        grandmothertwo.put(personId, grandmotherTwo);

        return GRAND_MOTHER_ONE_ADDED;

    }


    @Override
    public String removeGrandMotherOne(int id) {

        checkGrandMotherOneId(id);

        grandmotherone.remove(id);

        return GRAND_MOTHER_REMOVED_MESSAGE;
    }


    @Override
    public String removeGrandMotherTwo(int id) {

        checkGrandMotherTwoId(id);

        grandmothertwo.remove(id);

        return GRAND_MOTHER_REMOVED_MESSAGE;
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

    public void checkChildId(int id) {

        if (!this.childs.containsKey(id)) {

            throw new IllegalArgumentException(NOT_EXISTING_CHILD);

        }
    }


    public void checkFatherId(int id) {

        if (!this.fathers.containsKey(id)) {

            throw new IllegalArgumentException(NOT_EXISTING_FATHER);
        }

    }

    public void checkMotherId(int id) {

        if (!this.mothers.containsKey(id)) {

            throw new IllegalArgumentException(NOT_EXISTING_MOTHER);
        }

    }

    public void checkGrandFatherOneId(int id){

        if(!this.grandfatherone.containsKey(id)){

            throw new IllegalArgumentException(NOT_EXISTING_GRAND_FATHER_ONE);
        }

    }

    public void checkGrandFatherTwoId(int id){

        if(!this.grandfathertwo.containsKey(id)){

            throw new IllegalArgumentException(NOT_EXISTING_GRAND_FATHER_TWO);
        }

    }

    public void checkGrandMotherOneId(int id){

        if (!this.grandmotherone.containsKey(id)){

            throw new IllegalArgumentException(NOT_EXISTING_GRAND_MOTHER_ONE);
        }

    }

    public void checkGrandMotherTwoId(int id){

        if (!this.grandmothertwo.containsKey(id)){

            throw new IllegalArgumentException(NOT_EXISTING_GRAND_MOTHER_TWO);
        }

    }



    public Map<Integer, Child> getChilds() {

        return childs;
    }

    public Map<Integer, Father> getFathers() {

        return fathers;
    }

    public Map<Integer, Mother> getMothers() {

        return mothers;
    }

    public Map<Integer, GrandFatherOne> getGrandfatherone() {

        return grandfatherone;
    }

    public Map<Integer, GrandFatherTwo> getGrandfathertwo() {

        return grandfathertwo;
    }

    public Map<Integer, GrandMotherOne> getGrandmotherone() {

        return grandmotherone;
    }

    public Map<Integer, GrandMotherTwo> getGrandmothertwo() {

        return grandmothertwo;
    }
}






