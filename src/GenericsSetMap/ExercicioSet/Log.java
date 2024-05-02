package GenericsSetMap.ExercicioSet;

import java.util.Date;
import java.util.Objects;

public class Log {
    private String username;
    private Date date;

    public Log(String username, Date date) {
        this.username = username;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(username, log.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }
}
