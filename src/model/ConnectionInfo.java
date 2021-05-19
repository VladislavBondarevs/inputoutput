package model;

public class ConnectionInfo {

    private Integer id;
    private Long Time;
    private String ConnectionIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTime() {
        return Time;
    }

    public void setTime(Long time) {
        Time = time;
    }

    public String getConnectionIp() {
        return ConnectionIp;
    }

    public void setConnectionIp(String connectionIp) {
        ConnectionIp = connectionIp;
    }

    public ConnectionInfo() {
    }


    public ConnectionInfo(Integer id, Long time, String connectionIp) {
        this.id = id;
        Time = time;
        ConnectionIp = connectionIp;

    }

    @Override
    public String toString() {
        return id + " " + Time + " " + ConnectionIp;
    }
}