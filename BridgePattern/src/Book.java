public class Book {
    private String title;
    private String image;
    private String bookUrl;
    private String description;

    public Book(String description, String bookUrl, String image, String title) {
        this.description = description;
        this.bookUrl = bookUrl;
        this.image = image;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
