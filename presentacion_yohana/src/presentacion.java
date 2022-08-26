public class presentacion{
    public static void main(String[] args) {
        Main presentacion = new Main ("Leidy Yohana Hurtado",
                "vivo en Barbosa Santander, estudio Tecnología en Electrónica Industrial, me gusta la programacion",
                "leyhurta12214@gmail.com");

        System.out.println("Mi nombre es: ");
        System.out.println(presentacion.getName());
        System.out.println("Presentacion: ");
        System.out.println(presentacion.getPresentation());
        System.out.println("e-mail: ");
        System.out.println(presentacion.getEmail());
    }

}
