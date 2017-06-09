package zhab.model;

/**
 * Created by HASEE on 2017/6/8.
 */
public class BasePointModel {

    private int pointId;
    private double latitude;
    private double longitude;
    private String az;
    private String compare;
    private String lapNum;
    private String liveStatus;
    private String selfWeak;

    public BasePointModel(int pointId, double latitude, double longitude, String az, String compare, String lapNum,
                          String liveStatus, String selfWeak) {
        this.pointId = pointId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.az = az;
        this.compare = compare;
        this.lapNum = lapNum;
        this.liveStatus = liveStatus;
        this.selfWeak = selfWeak;
    }

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public String getLapNum() {
        return lapNum;
    }

    public void setLapNum(String lapNum) {
        this.lapNum = lapNum;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public String getSelfWeak() {
        return selfWeak;
    }

    public void setSelfWeak(String selfWeak) {
        this.selfWeak = selfWeak;
    }
}
