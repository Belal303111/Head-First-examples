public class Movie {
    private String title;
    private String genre;
    private int rating;
    public Movie(){
        title="without title";
        genre="without genre";
        rating=0;
    }
    public Movie(String t,String g,int r)
    {
        title=t;
        genre=g;
        rating=r;
    }
    public void setTitle(String t)
    {
        title=t;
    }
    public void setgenre(String g)
    {
        genre=g;
    }
    public void setrating(int r)
    {
        rating=r;
    }
    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getRating()
    {
        return rating;
    }
    public void playIt()
    {
        System.out.println("playing the movie");
    }
    public void pringInfo()
    {
        System.out.println("Title:"+title+"|Genre:"+genre+"|Rating:"+rating);
    }
}
