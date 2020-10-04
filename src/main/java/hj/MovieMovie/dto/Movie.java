package hj.MovieMovie.dto;

public class Movie {

    private long movieId;
    private String title;
    private String summary;
    private String director;
    private String actors;
    private long stars;
    private long numOfViewers;

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public long getStars() {
        return stars;
    }

    public void setStars(long stars) {
        this.stars = stars;
    }

    public long getNumOfViewers() {
        return numOfViewers;
    }

    public void setNumOfViewers(long numOfViewers) {
        this.numOfViewers = numOfViewers;
    }
}
