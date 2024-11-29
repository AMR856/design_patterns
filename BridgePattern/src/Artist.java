public class Artist {
    private String name;
    private String bandName;
    private String image;
    private String bandUrl;
    private String description;
    public Artist(String name, String bandName, String image, String bandUrl, String description){
        this.name = name;
        this.bandName = bandName;
        this.image = image;
        this.bandUrl = bandUrl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBandUrl() {
        return bandUrl;
    }

    public void setBandUrl(String bandUrl) {
        this.bandUrl = bandUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
