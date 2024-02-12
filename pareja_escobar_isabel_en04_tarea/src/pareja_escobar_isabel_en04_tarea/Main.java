package pareja_escobar_isabel_en04_tarea;

public class Main { 

    public static void main(String[] args) {

        nuevoMetodo();

    }

	public static void nuevoMetodo() {
		Bag bag;

        bag = new Bag("Apellidos del alumno",100, "dni del alumno", 10);

        try 
       

        {

            bag.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }

        try

        {

            System.out.println("Solicitar actualización de bono");

            bag.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }

        double bonoActual = bag.bonificacion();

        System.out.println("Su bono actual es  "+ bonoActual );
	}

}
