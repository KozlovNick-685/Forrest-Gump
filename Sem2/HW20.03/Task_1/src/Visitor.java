import java.util.Objects;

public class Visitor {

    private String name;
    private String passId;

    public Visitor() {
        name = null;
        passId = null;
    }

    public Visitor(String name, String passId) {
        this.name = name;
        this.passId = passId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getPassId() {
        return passId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Visitor)) {
            return false;
        }
        Visitor visitor = (Visitor) o;
        return passId.equals(visitor.passId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(passId);
    }

}
