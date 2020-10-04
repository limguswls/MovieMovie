package hj.MovieMovie.dto;

import java.util.List;

public class Branch {

    private long branchId;
    private List<Long> theaterList;
    private String name;

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public List<Long> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(List<Long> theaterList) {
        this.theaterList = theaterList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
