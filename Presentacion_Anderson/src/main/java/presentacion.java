public class presentacion {
    public static void main(String[] args) {
        PresentacionAnderson resume = new PresentacionAnderson("Charles Anderson florez jaramillo",
                "Soy un chico atento, inteligente, con una gran imaginación y que ama todo lo relacionado a la tecnología y la computación e informática, soy estudiante de programación y desarrollo de software, soy vega hace 8 años y amo a todos los animales, hago parte del Smart team",
                "charles.florez@udea.edu.co");
        System.out.println("my name is ");
        System.out.println(resume.getName());
        System.out.println("presentation");
        System.out.println(resume.getPresentation());
        System.out.println("email");
        System.out.println(resume.getEmail());
    }
}
