public class ArtistResource implements Resource{
    private Artist artist;
    public ArtistResource(Artist artist){
        this.artist = artist;
    }
    @Override
    public String url() {
        return this.artist.getBandUrl();
    }

    @Override
    public String image() {
        return this.artist.getImage();
    }

    @Override
    public String snippet() {
        return this.artist.getDescription();
    }

    @Override
    public String title() {
        return this.artist.getName() + " " + this.artist.getBandName();
    }
}
