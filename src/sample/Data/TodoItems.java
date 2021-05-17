package sample.Data;

import java.time.LocalDate;

public class TodoItems {
    private final String description;
    private final String details;
    private final LocalDate date;

    public TodoItems(String description, String details, LocalDate date) {
        this.description = description;
        this.details = details;
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }


    public String getDetails() {
        return this.details;
    }


    public LocalDate getDate() {
        return this.date;
    }


    public String toString() {
        return this.description;
    }
}
