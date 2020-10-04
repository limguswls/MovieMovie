package hj.MovieMovie.dto;

import java.util.List;

public class Theater {

    private long theaterId;
    private List<Long> screeningList;
    private long grade;
    private long branchId;

    public long getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(long theaterId) {
        this.theaterId = theaterId;
    }

    public List<Long> getScreeningList() {
        return screeningList;
    }

    public void setScreeningList(List<Long> screeningList) {
        this.screeningList = screeningList;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }
}
