import java.util.List;

public class JobApplication {
    private String fullName;
    private int wantedSalary;
    private String city;
    private int phoneNo;
    private boolean relocatePositive;
    private String email;
    private int experience;
    private List<String> skills;


    public JobApplication(String fullName, int wantedSalary, String city, int phoneNo, boolean relocatePositive, String email, int experience, List<String> skills) {
        this.fullName = fullName;
        this.wantedSalary = wantedSalary;
        this.city = city;
        this.phoneNo = phoneNo;
        this.relocatePositive = relocatePositive;
        this.email = email;
        this.experience = experience;
        this.skills = skills;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getWantedSalary() {
        return wantedSalary;
    }

    public void setWantedSalary(int wantedSalary) {
        this.wantedSalary = wantedSalary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isRelocatePositive() {
        return relocatePositive;
    }

    public void setRelocatePositive(boolean relocatePositive) {
        this.relocatePositive = relocatePositive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int compareOffers(JobApplication other, List<String> requiredSkills) {
        long sameSkillsOur = requiredSkills.stream().filter(skills::contains).count();
//        for (String s : requiredSkills) {
//            if (other.getSkills().contains(s)) {
//                // inkrementuj
//            }
//        }
        long sameSkillsTheir = requiredSkills.stream().filter(s -> other.getSkills().contains(s)).count();
        if (sameSkillsTheir == sameSkillsOur) {
//            2. bierzemy tego, który chce mniej
//            3. bierzemy kogoś, kto ma większe doświadczenie
//            4. losowanie osoby spęłniających kryteria
            if (wantedSalary == other.getWantedSalary()) {
                if(experience == other.getExperience()){
                    // jefnolinijkowy if ? - zwrot w przypadku true : zwrtoe else
                    return Math.random() <0.5 ? 1 : -1;
//                    if (Math.random() < 0.5) {
//                        return 1;
//                    }
//                    return -1;
                }
                return experience - other.getExperience();
            }
            return other.getWantedSalary() - wantedSalary;
        }
        return Long.compare(sameSkillsOur, sameSkillsTheir);
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "fullName='" + fullName + '\'' +
                ", wantedSalary=" + wantedSalary +
                ", city='" + city + '\'' +
                ", phoneNo=" + phoneNo +
                ", relocatePositive=" + relocatePositive +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                ", skills=" + skills +
                '}';
    }
}
