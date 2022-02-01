import java.util.List;

public class JobOffer {

     private String city;
     private int offerSalary;
     private double requiredYearsExperience;
     private List<String> requiredSkill;

    public JobOffer(String city, int offerSalary, int requiredYearsExperience, List<String> requiredSkill) {
        this.city = city;
        this.offerSalary = offerSalary;
        this.requiredYearsExperience = requiredYearsExperience;
        this.requiredSkill = requiredSkill;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getOfferSalary() {
        return offerSalary;
    }

    public void setOfferSalary(int offerSalary) {
        this.offerSalary = offerSalary;
    }

    public double getRequiredYearsExperience() {
        return requiredYearsExperience;
    }

    public void setRequiredYearsExperience(double requiredYearsExperience) {
        this.requiredYearsExperience = requiredYearsExperience;
    }

    public List<String> getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(List<String> requiredSkill) {
        this.requiredSkill = requiredSkill;
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "city='" + city + '\'' +
                ", offerSalary=" + offerSalary +
                ", requiredYearsExperience=" + requiredYearsExperience +
                ", requiredSkill=" + requiredSkill +
                '}';
    }
}
