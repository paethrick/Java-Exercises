package exercises.complex.intelligenceCenter.src.main.java.com.Intelligence.Center;

import java.time.LocalTime;

public class Mission {

    private String codeName;
    private LocalTime deadline;

    public Mission(String codeName, LocalTime deadline) {
        this.codeName = codeName;
        this.deadline = deadline;
    }

    public String getCodeName() {
        return codeName;
    }

    public LocalTime getDeadline() {
        return deadline;
    }
}
