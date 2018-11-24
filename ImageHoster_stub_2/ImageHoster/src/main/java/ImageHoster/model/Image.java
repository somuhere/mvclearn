package ImageHoster.model;
import java.util.Date;

public class Image {

    //id of the image
    private Integer id;

    //title of the image
    private String title;

    //The image in Base64 format
    private String imageFile;

    //Description of the image
    private String description;

    //Date on which the image is posted
    private Date date;

    //Write the constructor for id, title, imageFile, and date

    public Image(Integer id, String title, String imageFile, Date date) {
        this.id = id;
        this.title = title;
        this.imageFile = imageFile;
        this.date = date;
    }

    //Write getter and setter for all the attributes

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageFile() {
        return imageFile;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }


}
