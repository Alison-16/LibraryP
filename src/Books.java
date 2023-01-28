public class Books {

    //year,gender,title,author,isInStock//

    private int year;
    private String genre;
    private String title;
    private String author;
    private boolean isInStock;

    public Books(int year, String genre, String title, String author,
                 boolean isInStock) {
        this.year = year;
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.isInStock = isInStock;
    }


}
