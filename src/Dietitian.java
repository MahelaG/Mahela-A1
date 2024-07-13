public class Dietitian extends HealthProfessional {
    private String WorkArea;

    public Dietitian() {
        this.setId(0);
        this.setName(null);
        this.setGender(null);
        this.setWorkArea(null);
    }

    public Dietitian(int id, String name, String gender, String WorkArea) {
        this.setId(id);
        this.setName(name);
        this.setGender(gender);
        this.WorkArea = WorkArea;
    }

    public boolean isAnyEmpty() {
        return this.getId() == 0 || this.getName() == null || this.getGender() == null || this.getWorkArea() == null;
    }

    public String getWorkArea() {
        return WorkArea;
    }

    public void setWorkArea(String workArea) {
        WorkArea = workArea;
    }

    public String Details() {
        return "Dietition, id: " + getId() + ", name: " + getName() + ", gender: " + getGender() + ", work area: " + getWorkArea() + ".";
    }
}
