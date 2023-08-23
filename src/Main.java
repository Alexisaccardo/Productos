import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****PRODUCTOS*****");

        System.out.print("¿Vas ingresar un producto?: ");
        String respuesta = scanner.nextLine();

        int j = 0;
        List<Producto> Listaproducto = new ArrayList<>(5);

        while (respuesta.equals ("si")){

        System.out.print("Ingrese el ID del producto: ");
        String ID = scanner.nextLine();

        System.out.print("Ingrese nombre del producto: ");
        String nombre =  scanner.nextLine();

        System.out.print("Ingrese el tipo de producto: ");
        String tipo =  scanner.nextLine();

        System.out.print("Ingrese la fecha de vencimiento del producto: ");
        String fechavencimiento =  scanner.nextLine();
        String fechahoy = "23/08/2023";

        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaactual = formato.parse(fechahoy);
        Date fecha = formato.parse(fechavencimiento);


        if (tipo.equals("comestible")||tipo.equals("no comestible")){
            int i = fecha.compareTo(fechaactual);
            if (i>=0){

                Producto productos = new Producto(ID,nombre,tipo,fecha);
                Listaproducto.add(productos);

            }else {
                System.out.print("No se admiten productos caducados \n");
            }

        }else {
            System.out.print("No se admite productos de este tipo \n");
        }
            j = j + 1;

            System.out.print("¿Vas ingresar otro producto?: ");
            respuesta = scanner.nextLine();

            System.out.print("Estos son los productos: ");
            for (int i=0; i<Listaproducto.size();i++){
                System.out.print(Listaproducto.get(i).getNombre()+", ");
            }
        }


    }
}