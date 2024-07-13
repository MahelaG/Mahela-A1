public class Patient {
    private String name;
    private String mobile;

    public Patient() {
        this.name = "";
        this.mobile = "";
    }

    public Patient(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String Details() {
        return "Patient name:" + name + ", mobile: " + mobile + " |";
    }
}