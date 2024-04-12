package Projetos.Two;

import Projetos.Two.Exercicio02Commnet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exercicio02Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Exercicio02Commnet> commnets = new ArrayList<>();

    public Exercicio02Post(){}

    public Exercicio02Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Exercicio02Commnet> getCommnets() {
        return commnets;
    }

    public void addComment(Exercicio02Commnet comment){
        commnets.add(comment);
    }

    public void removeComment(Exercicio02Commnet comment){
        commnets.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for (Exercicio02Commnet c : commnets) {
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
