public abstract class HealthProfessional {
    private int id;
    private String name;
    private String gender;

    public String Details() {
        return "HealthProfessional, id: " + getId() + ", name: " + getName() + ", gender: " + getGender();
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
