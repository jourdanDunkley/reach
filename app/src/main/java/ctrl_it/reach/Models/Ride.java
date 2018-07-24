package ctrl_it.reach.Models;

public class Ride {
    private String date;
    private String description;
    private String label;
    private String image;
    private int imageURL;

    public Ride(){

    }
    public Ride(String date, String description, String label, int imageURL) {
        this.date = date;
        this.description = description;
        this.label = label;
        this.imageURL = imageURL;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }

    public int getImageURL() {
        return imageURL;
    }
}
