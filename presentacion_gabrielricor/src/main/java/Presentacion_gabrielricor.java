public class Presentacion_gabrielricor {
    private String name;
    private String presentation;
    private String email;

    public Presentacion_gabrielricor(String name,String presentation, String email){
        this.setName(name);
        this.setPresentation(presentation);
        this.setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}