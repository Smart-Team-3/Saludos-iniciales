public class presentacion {
    public static void main(String[] args) {
        Presentacion_gabrielricor resume = new Presentacion_gabrielricor( "Gabriel Rico Ramirez",
                "Soy administrador de empresas y estudiante de programacion y desarrollo de software",
                "gabrielricor@hotmail.com");
        System.out.println("my name is ");
        System.out.println(resume.getName());
        System.out.println("presentation");
        System.out.println(resume.getPresentation());
        System.out.println("email");
        System.out.println(resume.getEmail());
    }
}
