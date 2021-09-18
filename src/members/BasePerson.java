package members;

public class BasePerson implements InterfacePerson {

    int personId;
    String personName;
    String cityName;

    public BasePerson(int personId,String personName, String cityName) {
        this.setPersonId(personId);
        this.setPersonName(personName);
        this.setCityName(cityName);
    }

    public void setPersonId(int personId){
        this.personId = personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int getPersonId() {
        return personId;
    }

    @Override
    public String getPersonName() {
        return personName;
    }

    @Override
    public String getCityName() {
        return cityName;
    }
}
