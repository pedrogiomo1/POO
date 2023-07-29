import java.time.LocalDate;

public class Pessoa {
    private String name;
    private LocalDate born_at;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public LocalDate getBorn_at() {
        return born_at;
    }

    public void setBorn_at(LocalDate born_at) {
        this.born_at = born_at;
    }

    public int getAge() {
        return calculateAge();
    }

    private int calculateAge() {
        if (born_at == null) {
            return 0; // or throw an exception if appropriate
        }
        return LocalDate.now().minusYears(born_at.getYear()).getYear();
    }
}
