public class GeneralPractitioner extends HealthProfessional {
    private int YearsOfExpertise;

    public GeneralPractitioner() {
        this.setId(null);
        this.setName(null);
        this.setGender(null);
        this.setYearsOfExpertise(null);
    }

    public GeneralPractitioner(int id, String name, String gender, int YearsOfExpertise) {
        this.setId(id);
        this.setName(name);
        this.setGender(gender);
        this.YearsOfExpertise = YearsOfExpertise;
    }

    public boolean isAnyEmpty() {
        return this.getId() == 0 || this.getName() == null || this.getGender() == null || this.getYearsOfExpertise() == 0;
    }

    public int getYearsOfExpertise() {
        return YearsOfExpertise;
    }

    public void setYearsOfExpertise(Integer yearsOfExpertise) {
        YearsOfExpertise = yearsOfExpertise;
    }

    public String Details() {
        return "General Practitioner, id: " + getId() + ", name: " + getName() + ", gender: " + getGender() + ", Years of expertise: " + getYearsOfExpertise();
    }
}
