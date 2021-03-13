import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class User {
    public static final String GENDER_MALE = "M";
    public static final String GENDER_FEMALE = "F";

    private String Name;
    private String SurName;
    private String email;
    private String gender;
    private String password;
    private String country;
    private String courses;
    private List<String> roles;


    public User(String Name, String SurName,String email, String password, String gender,String courses, String country, String... roles) {
        this.Name = Name;
        this.SurName = SurName;
        this.email = email;
        this.country = country;
        this.courses = courses;
        this.password = password;
        this.gender = gender;

        this.roles = new ArrayList<String>();
        if (roles != null) {
            Collections.addAll(this.roles, roles);
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}