package Part_I.Module_04.Ex_17_Items;

import java.time.LocalDateTime;

public class Item {
    private String name;
    private LocalDateTime creationTime;

    public Item (String name) {
        this.name = name;
        this.creationTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return this.name + " (created at: " +
                this.creationTime.getDayOfMonth() + "." +
                this.creationTime.getMonthValue() + "." +
                this.creationTime.getYear() + " " +
                this.creationTime.getHour() + ":" +
                this.creationTime.getMinute() + ":" +
                this.creationTime.getSecond() + ")";
    }
}
