package Jan23;

public class book {

    String title;
    String author;
    int publicationYear;

    public book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void printInfo(){
        System.out.println("The author of the " + this.title + " is " + this.author + ". and the book was published in " + this.publicationYear);
    }
}
