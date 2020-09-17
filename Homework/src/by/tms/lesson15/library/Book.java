package by.tms.lesson15.library;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Book {

    private int ID;
    private String name;
    private String author;
    private boolean isAvailable;
    private boolean isOnlyReadingRoom;

    public Book(String name, String author, boolean isAvailable, boolean isOnlyReadingRoom) {
        this.ID = Library.getID();
        Library.incID();
        this.name = name;
        this.author = author;
        this.isAvailable = isAvailable;
        this.isOnlyReadingRoom = isOnlyReadingRoom;
    }

    @Override
    public String toString() {
        return "name: " + name + ", author: " + author + ", available: " + (isAvailable ? "yes" : "no") +
                ", only reading room: " + (isOnlyReadingRoom ? "yes" : "no") + ".";
    }
}
