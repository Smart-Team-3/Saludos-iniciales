public class Presentacion {


    public static void main(String[] args) {
        PresentacionJuan resume = new PresentacionJuan( "Juan David Piragauta B",
                "QUE TAL, SOY INGENIERO MECANICO BOYACENSE, RESIDIENDO EN ALEMANIA, Y CON MUCHAS GRANAS DE APRENDER A PROGRAMAR",
                "juanpiragauta93@gmail.com");
        System.out.println("Me llamo");
        System.out.println(resume.getName());
        System.out.println("presentacion");
        System.out.println(resume.getPresentation());
        System.out.println("email");
        System.out.println(resume.getEmail());
    }

}
