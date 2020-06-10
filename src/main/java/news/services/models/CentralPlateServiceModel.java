package news.services.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CentralPlateServiceModel {

    private String id;
    private String imageUrl;
    private String category;
    private String title;
    private String Author;
    private LocalDateTime date;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Image must be size 1000x840 for perfect view.
     */



    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
