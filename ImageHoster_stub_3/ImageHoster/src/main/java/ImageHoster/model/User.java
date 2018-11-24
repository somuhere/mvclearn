package ImageHoster.model;


public class User {

    private Integer id;
    private String username;
    private String password;
    private UserProfile profile;

   //Generate getters and setters for all the attributes


    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }
}

