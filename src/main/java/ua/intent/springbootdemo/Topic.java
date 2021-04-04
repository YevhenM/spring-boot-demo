package ua.intent.springbootdemo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Topic {
    private long id;
    private String name;
    private String theme;
    private Date date;

    public Topic(long id, String name, String theme, String date) {
        this.id = id;
        this.name = name;
        this.theme = theme;
        this.date = parseDate(date);
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setDate(String date) {

         this.date = parseDate(date);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public Date getDate() {
        return date;
    }

    private Date parseDate (String dateFormated){
        Date result = new Date();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            result = format.parse(dateFormated);
        } catch ( ParseException e){
            e.printStackTrace();
        }
        return result;
    }
}
