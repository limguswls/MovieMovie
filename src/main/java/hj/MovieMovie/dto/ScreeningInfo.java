package hj.MovieMovie.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScreeningInfo {

    private long screeningId;
    private LocalDate screenDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private long movieId;
    private long theaterId;
    private long numSeats;

    public long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(long screeningId) {
        this.screeningId = screeningId;
    }

    public LocalDate getScreenDate() {
        return screenDate;
    }

    public void setScreenDate(LocalDate screenDate) {
        this.screenDate = screenDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public long getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(long theaterId) {
        this.theaterId = theaterId;
    }

    public long getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(long numSeats) {
        this.numSeats = numSeats;
    }
}
