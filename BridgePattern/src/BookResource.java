public class BookResource implements Resource{
    private Book book;
    public BookResource(Book book){
        this.book = book;
    }
    @Override
    public String url() {
        return this.book.getBookUrl();
    }

    @Override
    public String image() {
        return this.book.getImage();
    }

    @Override
    public String snippet() {
        return this.book.getDescription();
    }

    @Override
    public String title() {
        return this.book.getTitle();
    }
}
