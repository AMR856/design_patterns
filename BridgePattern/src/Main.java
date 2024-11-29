
public class Main {
    public static void main(String[] args) {
            Artist artist = new Artist(
                    "Chrissy Costanza",
                    "Against the Current",
                    "Image for ATC here",
                    "https://atcofficial/",
                    "Pop-Punk American band from New Jersey I guess"

            );
            Book book = new Book(
                    "A book about a boy who lived from being killed by a dark wizard" +
                            "and his life after being taken to wizard school",
                    "https://www.amazon.eg/-/en/Bloomsbury-Harry-Potter-Philosophers-Stone/dp/1408855658",
                    "Book's image here",
                    "Harry Potter and the Philosopher's Stone"
            );
            Resource artistResource = new ArtistResource(artist);
            Resource bookResource = new BookResource(book);
            View longViewArtist = new LongView(artistResource);
            View shortViewArtist = new ShortView(artistResource);
            View longViewBook = new LongView(bookResource);
            View shortViewBook = new ShortView(bookResource);
            longViewArtist.show();
            shortViewArtist.show();
            longViewBook.show();
            shortViewBook.show();
        }
}
