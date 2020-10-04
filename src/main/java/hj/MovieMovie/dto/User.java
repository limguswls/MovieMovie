package hj.MovieMovie.dto;

import java.util.List;

public class User {

    private long userId;
    private String name;
    private long points;
    private List<Long> viewList;
    private long preferedBranch;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public List<Long> getViewList() {
        return viewList;
    }

    public void setViewList(List<Long> viewList) {
        this.viewList = viewList;
    }

    public long getPreferedBranch() {
        return preferedBranch;
    }

    public void setPreferedBranch(long preferedBranch) {
        this.preferedBranch = preferedBranch;
    }
}
