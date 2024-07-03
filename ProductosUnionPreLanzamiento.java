import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class compras_union {
    Scanner union = new Scanner(System.in);
    String[] menus = {"PRODUCTOS", "PUNTOS DE VENTA", "DELIVERY", "ELIJO SER SALUDABLE"};
    String[] productos = {"PANES", "BOLLERIA", "CEREALES", "BEBIDAS", "GALLETAS", "SNACK", "UNTABLES", "PANETONES"};
    // array de los productos
    String[] panes = {"Pan Americano Sandwich", "Pan  Blanco Superbom Familiar", "Pan Fibra Integral", "Pan multisemillas miel de abeja", "Fan Integral Familiar Superbom", "Pan Granos y Semillas", "Pan Fuente", "Pan Integral Sándwich Clásico"};
    String [] bolleria={"Pan pita integral granos andinos","Pan pita semillas chia y linaza","Pre Pizza Union","Rollo de Canela","Pionono x 7"};
    String [] cereales={"Cereal Premium x 350 g","Germen de Trigo","Granola  con Granos Andinos","Granola con Pasas y Almendras","Granola Lonchera x 400 gr","Salvado de Trigo"};
    String [] bebidas={"Bebida con pulpa de durazno 475 ml","Bebida con pulpa de mango 475 ml","Bebida con pulpa de manzana 475 ml","Bebida con pulpa de piña 475 ml","Duo Pack D Vine","Zumo de  Uva 295 mll"};
    String [] galletas={"Galleta Lonchera de Coco x 42 gr","Galleta Lonchera de Kiwicha x 42 gr","Galleta Lonchera de Naranja x 42 gr"," Mega Galleta  de Kiwicha"," Mega Galleta de Naranja","Mega Galleta Integral de Coco"};
    String [] snack={"Palitos con ajonjoli y linaza","Palitos con Especias x 65 gr","Tostada Blanca X 10","Tostada Integral X 10"};
    String [] untables={"Mant. de Mani 1 Kg","Mermelada de Uva Frasco","Mantequilla de Mani Sachet 200 gr","Mant. de Mani Frasco 410 gr"};
    String [] panetones={"Paneton Diet T/L 500 gr","Paneton Integral T/B 900","Paneton Integral T/C 900 gr","Paneton Union T/L 1kg","Paneton Vita Rey con Arádanos T/C 900 gr"};
    // array de la descripcion de de los productos
    String [] descricionPanes = {"Energético y delicioso pan, elaborado en base de harina fortificada con hierro y vitaminas del complejo B. Libre de bromato. Fundamental para el desarrollo y fortalecimiento de los músculos, ideal para complementar tus desayunos. Consumido en las cantidades adecuadas no altera el peso ideal.", "Delicioso pan, elaborado en base de harina fortificada con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y colesterol. El pan es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.", "Delicioso y saludable pan, Libre de bromato y colesterol. Elaborado en base de harina integral fortificada y granos como la Quinua y la Cañihua. Así mismo, contiene una semilla altamente nutritiva y saludable como el ajonjolí. Pan fortificado con alto en Hierro, contiene fuente de fibra y fuente de proteínas del organismo.", "Delicioso y saludable pan con miel de abeja. Libre de bromato y colesterol. Elaborado en base de harina integral fortificada con hierro y vitaminas del complejo B. Así mismo, contiene semillas altamente nutritivas por su valor funcional para el organismo humano como el Chía, girasol y ajonjolí . Pan fortificado con alto en Hierro, contiene fuente de fibra y fuente de proteínas del organismo.", "Delicioso pan, elaborado en base de harina integral fortificada con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y colesterol. El pan es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.", "Pan delicioso y saludable, elaborado a base de harina fortificada con hierro y vitaminas del complejo B. Así mismo, contiene semillas altamente nutritivas por su valor funcional para el organismo humano como el girasol, ajonjolí y linaza. Pan fortificado con alto en Hierro, contiene fuente de fibra y fuente de proteínas del organismo.", "Energético y delicioso pan, elaborado en base de harina fortificada con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y colesterol. El pan es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.", "Delicioso pan, elaborado en base de harina integral fortificada con hierro y vitaminas del complejo B. Libre de colesterol. El pan integral es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal."};
    String [] descricionBolleria = {"Delicioso pan pita integral elaborado con semillas de linaza, kiwicha y quinua. Bajo en Colesterol.Contiene Omega 9 y Omega 3.", "Delicioso pan pita elaborado con semillas de chía, linaza y quinua. Libre de grasas trans y colesterol.Contiene Omega 9 y Omega 3.", "Delicioso pan relleno de una mezcla de maní y canela molida. Elaborado en base a harina fortificada con hierro y vitaminas del complejo B. Libre de bromato. Este producto es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.", "NO TIENE"};
    String [] descricionCereales = {"NO TIENE", "El Germen de trigo es rico en fibra insoluble ideal para el control de la glucosa en sangre, reducción del colesterol y protección del corazón. Así también para promover el movimiento intestinal, protección del cáncer de colon y control del peso ideal.", "Energético y delicioso preparado, elaborado a base de una mezcla de frutos secos, semillas y cereales altamente nutritivos. Contiene ajonjolí, linaza, maní, almendras, quinua y kañihua. Fortificada con Zinc y Magnesio.", "Energético y delicioso preparado, elaborado a base de una mezcla de cereales y frutos secos nutritivos. Contiene hojuelas de avena, ajonjolí, pasas y almendras. Fortificada con Zinc y Magnesio. Fuente de Fibra.", "Energético y delicioso preparado, elaborado a base de una mezcla de cereales y semillas nutritivas. Contiene hojuelas de avena, maní, ajonjolí y miel de abeja. Fortificada con Zinc y Magnesio. Fuente de Fibra y de proteínas.", "El Salvado de trigo es rico en fibra insoluble ideal para el control de la glucosa en sangre, reducción del colesterol y protección del corazón. Así también para promover el movimiento intestinal, protección del cáncer de colon y control del peso ideal."};
    String [] descricionBebidas = {"Bebida refrescante e hidratante, elaborada con seleccionada y deliciosa pulpa de Durazno de 475 ml. Así mismo, esta bebida contiene ingredientes saludables los cuales nos brindan vitaminas, minerales y fibra prebiótica.", "Bebida refrescante e hidratante, elaborada con seleccionada y deliciosa pulpa de Mango de 475 ml. Así mismo, esta bebida contiene ingredientes saludables los cuales nos brindan vitaminas, minerales y fibra prebiótica.", "Bebida refrescante e hidratante, elaborada con seleccionada y deliciosa pulpa de Manzana de 475 ml. Así mismo, esta bebida contiene ingredientes saludables los cuales nos brindan vitaminas, minerales y fibra prebiótica.", "Bebida refrescante e hidratante, elaborada con seleccionada y deliciosa pulpa de piña de 475 ml. Así mismo, esta bebida contiene ingredientes saludables los cuales nos brindan vitaminas, minerales y fibra prebiótica.", "La uva borgoña posee propiedades nutricionales valiosas por su contenido de fitoquímicos o fitoprotectores, como lo son los antioxidantes. En este caso nos brinda polifenoles, ideales para prevenir el cáncer y fortalecer el sistema inmunológico.", "Delicioso zumo, concentrado de uva borgoña. Contiene antioxidantes que contribuye con el fortalecimiento del sistema inmunológico. Libre de azúcar agregada, así también de colorantes y saborizantes artificiales."};
    String [] descricionGalletas = {"Energética y deliciosa galleta, elaborada en base a la mezcla de harina especial fortificada con hierro y vitaminas del complejo B y coco rallado Libre de colorantes artificiales", "Energética y deliciosa galleta, elaborada en base a la mezcla de harina integral de Kiwicha especial fortificada con hierro. Libre de colorantes artificiales", "Deliciosa galleta sabor a Naranja, elaborada con harina especial fortificada con hierro y vitaminas del complejo B. Deliciosa al paladar por su textura y sabor tradicional.Libre de colorantes artificiales", "Energética y deliciosa galleta, elaborada en base a la mezcla de harina integral especial fortificada con hierro y vitaminas del complejo B y coco rallado. Libre de colorantes artificiales"};
    String [] descricionSnack = {"Estos deliciosos palitos, están elaborados en base a harina fortificada con hierro. Libre de bromato y colesterol. Este producto es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Contiene Omega 9, 6 y 3.", "Estos deliciosos palitos con ajonjolí, chía, kión y ajo, están elaborados en base a harina fortificada con hierro y vitaminas B12. Libre de bromato y colesterol. Este producto es un alimento fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Contiene Omega 9, 6 y 3.", "Deliciosas y clásicas tostadas, elaboradas en base a harina fortificada con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y libre de colesterol. Las tostadas son fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.", "Deliciosas y clásicas tostadas, elaboradas en base a harina integral fortificada con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y libre de colesterol. Las tostadas son fuente de hidratos de carbono complejos, principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal."};
    String [] descricionUntables = {"Elaborado en base a puro maní, fruto seco rico en proteínas. Dos cucharas de este producto aportan el 10% del requerimiento diario de este nutriente. Contiene Omega 6 y 9.", "Fuente de antioxidantes, mermelada clásica. Fuente de energía. Elaborado con uva borgoña.", "Elaborado en base a puro maní, fruto seco rico en proteínas. Dos cucharas de este producto aportan el 10% del requerimiento diario de este nutriente. Contiene Omega 6 y 9.", "Elaborado en base a puro maní, fruto seco rico en proteínas. Dos cucharas de este producto aportan el 10% del requerimiento diario de este nutriente. Contiene Omega 6 y 9."};
    String [] descricionPanetones = {"Deliciosa y nutritiva receta elaborada a partir de la selección de los mejores ingredientes, como harina integral fortificada con nutrientes a la cual se adiciona higos deshidratados y pecanas. Atractivo al paladar por su miga suave y crujientes, frescas pecanas. Contiene Omega 9. Fuente de proteínas, libre de colorantes artificiales.", "Deliciosa y nutritiva receta elaborada a partir de la selección de los mejores ingredientes, como harina integral fortificada con nutrientes a la cual se adiciona pasas y castañas. Atractivo al paladar por su miga suave y crujientes frescas castañas. Fortificado con Hierro, contiene fuente de fibra y fuente de proteínas. Contiene Omega 6 y 9.", "Deliciosa y nutritiva receta elaborada a partir de la selección de los mejores ingredientes, como harina integral fortificada con nutrientes a la cual se adiciona pasas y castañas. Atractivo al paladar por su miga suave y crujientes frescas castañas. Fortificado con Hierro, contiene fuente de fibra y fuente de proteínas. Contiene Omega 6 y 9.", "\n" +
            "Receta tradicional elaborada a partir de la selección de los mejores ingredientes, como harina fortificada con nutrientes a la cual se adiciona pasas, frutas confitadas y almendras. Atractivo al paladar por su característica miga suave y fresca.", "Deliciosa y nutritiva receta elaborada a partir de la selección de los mejores ingredientes, como harina integral fortificada con nutrientes a la cual se adiciona arándanos deshidratados y castañas. Atractivo al paladar por su miga suave y crujientes, frescas Castañas."};
    // array de los precios de los productos
    double[] precioPanes = {7.80,6.40,8.90,9.30,6.50,8.90,8.90,9.30};
    double[] precioBolleria = {7.60,7.60,8.90,11.10,19.00};
    double[] precioCereales = {21.50,9.99,14.50,15.20,13.30,5.99};
    double[] precioBebidas = {5.50,5.50,5.50,5.50,73.50,7.20};
    double[] precioGalletas = {2.50,2.50,2.50,5.10,5.10,5.10};
    double[] precioSnack = {2.30,2.30,5.30,5.30};
    double[] precioUntables = {36.00,8.40,10.50,19.90};
    double[] precioPanetones = {24.40,23.00,24.00,32.40,26.00};

    String [] ubicacion = {"Salida | Universidad de la Unión Peruana","Av. La Marina 123, Cayma, Arequipa","Carretera Salida a Arequipa Km. 6 Chullunquiani,Av. Héroes de la Guerra del Pacífico","Jr. 2 de Mayo 456, Huanuco","Av. Centenario 123, Pucallpa, Ucayali","Av. José Gálvez 345, Chimbote, Ancash","Jr. Independencia 456, Trujillo, La Libertad","Av. Sullana 123, Piura","Jr. Amazonas 345, Jaèn, Cajamarquilla","Av. Tarapoto 456, Tarapoto, San Martín","Av. La Marina 123, Iquitos, Loreto"};
    String [] lugar = {"Lima","Arequipa","Juliaca","Huanuco","Pucallpa","Chimbote","Trujillo","Piura","Jaèn","Tarapoto","Iquitos"};

    String[] productosdel = {"Pionono", "Cereal Premium", "Mantequilla de Mani Sachet", "Mant. de Mani 1 Kg.", "Mermelada de Uva Frasco", "Palitos con Especias", "Palitos con ajonjoli y linaza", "Tostada Integral X 10", "Tostada Blanca X 10", "Paneton Diet T/L 500 gr", "Paneton Integral T/C 900 gr", "Pan pita integral granos andinos", "Pan pita semillas chia y linaza", "Pan Integral Sandwich", "Pan Integral Mediano Union", "Pan Blanco Familiar Superbom", "Pan Fuente", "Pan Integral Familiar Superbom", "Mega Galleta Integral de Naranja", "Mega Galleta Integral de Coco", "Mega Galleta de Naranja", "Mega Galleta de Kiwicha", "Mega Galleta de Coco"};
    double[] preciodel = {19.00,21.50,10.50,36.00,8.40,2.30,2.30,5.30,5.30,24.40,24.00,7.60,7.60,8.50,4.70,6.40,9.50,6.50,5.10,5.10,5.10,5.10,5.10};
    int[] carritod = new int[productosdel.length];

    private double total = 0,subtotal=0, precio,precio1,total1=0;
    private static String opcion_de_pago;
    String direccion;
    private static String opcionU,codigoU;
    private int cantidad,cantidad1,opcion;
    private float peso,talla,rpt_imc;   // este dato estoy usando
    private static String numero_factura;
    private String contra_vende;
    private static String nombre_vende; //este mas
    private static int contador_factura = 0;
    double[] subtotal_extra = new double[23];
    float totalPagado;
    int[] carrito = new int[productos.length];
    String respuesta;
    private static String nombre, apellido, dni, nombreconvertido, apellidoconvertido;
    private char[] correo, contraseña;
    private String correoComp, contraseñaComp;

    public String fdatos() { //MIJAEL
        Scanner datos = new Scanner(System.in);
        String codigoU, opcion, opcionconvertido;

        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("SI/NO");
        opcion = datos.nextLine();
        opcionconvertido = opcion.toUpperCase();

        switch (opcionconvertido) {
            case "SI":
                System.out.println("Ingrese sus nombres: ");
                nombre = datos.nextLine();
                nombreconvertido = nombre.toUpperCase();
                System.out.println("Ingrese sus apellidos: ");
                apellido = datos.nextLine();
                apellidoconvertido = apellido.toUpperCase();
                do {
                    System.out.print("Introduce tu numero de DNI (8 dígitos): ");
                    dni = datos.nextLine();
                } while (dni.length() != 8);
                System.out.println("Ingrese su correo: ");
                correo = datos.nextLine().toCharArray();
                System.out.println("Ingrese su contraseña: ");
                contraseña = datos.nextLine().toCharArray();
                System.out.println("Ingrese su codigo univercitario: ");
                codigoU = datos.nextLine();
                break;
            case "NO":
                System.out.println("Ingrese sus nombres: ");
                nombre = datos.nextLine();
                nombreconvertido = nombre.toUpperCase();
                System.out.println("Ingrese sus apellidos: ");
                apellido = datos.nextLine();
                apellidoconvertido = apellido.toUpperCase();
                do {
                    System.out.print("Introduce tu numero de DNI (8 dígitos): ");
                    dni = datos.nextLine();
                } while (dni.length() != 8);
                System.out.println("Ingrese su correo: ");
                correo = datos.nextLine().toCharArray();
                System.out.println("Ingrese su contraseña: ");
                contraseña = datos.nextLine().toCharArray();
                break;
        }

        System.out.println("INICIE SESION EN PRODUCTOS UNION");
        System.out.println("INGRESE SU CORREO");
        correoComp = datos.nextLine();
        System.out.println("INGRESE SU CONTRASEÑA");
        contraseñaComp = datos.nextLine();

        if (correoComp.equals(String.valueOf(correo)) && contraseñaComp.equals(String.valueOf(contraseña))) {
            System.out.println("BIENVENIDO A PRODUCTOS UNION");
            System.out.println("Sr(a): " + nombreconvertido + " " + apellidoconvertido);
            this.fpregunta();
        }
        return null;
    }
    // CODIGO DE JUANA
    public String fpregunta(){ // Muestra las opciones de la pagina union
        System.out.println("\033[96m");
        System.out.println("------------ Bienvenido a Productos Union -----------");
        System.out.println("Selecione alguna de las siguientes opciones");

        for (int i = 0; i < menus.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + menus[i]);
        }


        opcion = union.nextInt();
        union.nextLine();
        switch (opcion) {
            case 1:
                this.fproductos();
                break;
            case 2:
                this.puntosdeventa();
                break;
            case 3:
                this.delivery();
                break;
            case 4:
                this.IMC();

            default:
                System.out.println("Opcion no válida");
                this.fpregunta();
                break;
        }
        return null;
    }

    public String fproductos() {
        System.out.println("\033[96m");
        System.out.println("------ PRODUCTOS------------");
        System.out.println("Seleccione productos a comprar");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + productos[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        switch (opcion) {
            case 1:
                this.fpanes();
                break;
            case 2:
                this.fbolleria();
                break;
            case 3:
                this.fcereales();
                break;
            case 4:
                this.fbebidas();
                break;
            case 5:
                this.fgalletas();
                break;
            case 6:
                this.fsnack();
                break;
            case 7:
                this.funtables();
                break;
            case 8:
                this.fpanetones();
                break;
            default:
                System.out.println("Opcion no válida");
                this.fpregunta();
                break;
        }
        return null;
    }
    public void fpanes() {
        System.out.println("------ PANES------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Pan", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < panes.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), panes[i], "S/. " + precioPanes[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= panes.length) {
            System.out.println("Usted va caomprar"+""+panes[opcion - 1]+"su precio es "+"S/."+precioPanes[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionPanes[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioPanes[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + panes[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fpanes();
            }
        } else {
            System.out.println("Opción no válida");
            this.fpanes();
        }
    }
    public void fbolleria() {
        System.out.println("------ BOLLERIA------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Bolleria", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < bolleria.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), bolleria[i], "S/. " + precioBolleria[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= bolleria.length) {
            System.out.println("Usted va caomprar"+""+bolleria[opcion - 1]+"su precio es "+"S/."+precioBolleria[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionBolleria[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioBolleria[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + bolleria[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fbolleria();
            }
        } else {
            System.out.println("Opción no válida");
            this.fbolleria();
        }
    }
    public void fcereales() {
        System.out.println("------ CEREALES------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Cereales", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < cereales.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), cereales[i], "S/. " + precioCereales[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= cereales.length) {
            System.out.println("Usted va caomprar"+""+cereales[opcion - 1]+"su precio es "+"S/."+precioCereales[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionCereales[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioCereales[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + cereales[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fcereales();
            }
        } else {
            System.out.println("Opción no válida");
            this.fcereales();
        }
    }
    public void fbebidas() {
        System.out.println("------ BEBIDAS------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Bebidas", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < bebidas.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), bebidas[i], "S/. " + precioBebidas[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= bebidas.length) {
            System.out.println("Usted va caomprar"+""+bebidas[opcion - 1]+"su precio es "+"S/."+precioBebidas[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionBebidas[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioBebidas[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + bebidas[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fbebidas();
            }
        } else {
            System.out.println("Opción no válida");
            this.fbebidas();
        }
    }
    public void fgalletas() {
        System.out.println("------ GALLETAS------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Galletas", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < galletas.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), galletas[i], "S/. " + precioGalletas[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= galletas.length) {
            System.out.println("Usted va caomprar"+""+galletas[opcion - 1]+"su precio es "+"S/."+precioGalletas[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionGalletas[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioGalletas[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + galletas[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fgalletas();
            }
        } else {
            System.out.println("Opción no válida");
            this.fgalletas();
        }
    }
    public void fsnack() {
        System.out.println("------ SNACK------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Snack", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < snack.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), snack[i], "S/. " + precioSnack[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= snack.length) {
            System.out.println("Usted va caomprar"+""+snack[opcion - 1]+"su precio es "+"S/."+precioSnack[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionSnack[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioSnack[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + snack[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fsnack();
            }
        } else {
            System.out.println("Opción no válida");
            this.fsnack();
        }
    }
    public void funtables() {
        System.out.println("------ UNTABLES------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Untables", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < untables.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), untables[i], "S/. " + precioUntables[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= untables.length) {
            System.out.println("Usted va caomprar"+""+untables[opcion - 1]+"su precio es "+"S/."+precioUntables[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionUntables[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioUntables[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + untables[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.funtables();
            }
        } else {
            System.out.println("Opción no válida");
            this.funtables();
        }
    }
    public void fpanetones() {
        System.out.println("------ PANETONES------------");
        System.out.println("Seleccione panes a comprar");
        // Imprimir encabezado de la tabla
        System.out.printf("%-10s %-40s %-10s\n", "Opción", "Panetones", "Precio");
        System.out.println("=".repeat(60)); // Línea divisoria
        // Imprimir las filas de la tabla
        for (int i = 0; i < panetones.length; i++) {
            System.out.printf("%-10s %-40s %-10s\n", "Opción " + (i + 1), panetones[i], "S/. " + precioPanetones[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= panetones.length) {
            System.out.println("Usted va caomprar"+""+panetones[opcion - 1]+"su precio es "+"S/."+precioPanetones[opcion - 1]);
            System.out.println("-------------------------DESCRIPCION------------------------");
            String descripcion = descricionPanetones[opcion - 1];
            String[] lineas = descripcion.split("(?<=\\G.{60})"); // Dividir en líneas de 40 caracteres

            // Imprimir cada línea de la descripción
            for (String linea : lineas) {
                System.out.println(linea);
            }
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioPanetones[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + panetones[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI / 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opción no válida");
                this.fpanetones();
            }
        } else {
            System.out.println("Opción no válida");
            this.fpanetones();
        }
    }
    public void puntosdeventa() { //JULIO
        Scanner direc = new Scanner(System.in);
        System.out.println("PUNTOS DE VENTA");
        System.out.println("Conoce las ubicaciones donde puedes encontrar nuestros productos");
        System.out.println("\uD83D\uDED2Supermercados");
        System.out.println("⛟Bodegas y distribuidores");
        System.out.println(" Conoce más");
        for (int i = 0; i < lugar.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + lugar[i]);
        }
        opcion = direc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("su ubicacion es:" + ubicacion[0]);
                break;
            case 2:
                System.out.println("su ubicacion es:" + ubicacion[1]);
                break;
            case 3:
                System.out.println("su ubicacion es:" + ubicacion[2]);
                break;
            case 4:
                System.out.println("su ubicacion es:" + ubicacion[3]);
                break;
            case 5:
                System.out.println("su ubicacion es:" + ubicacion[4]);
                break;
            case 6:
                System.out.println("su ubicacion es:" + ubicacion[5]);
                break;
            case 7:
                System.out.println("su ubicacion es:" + ubicacion[6]);
                break;
            case 8:
                System.out.println("su ubicacion es:" + ubicacion[7]);
                break;
            case 9:
                System.out.println("su ubicacion es:" + ubicacion[8]);
                break;
            case 10:
                System.out.println("su ubicacion es:" + ubicacion[9]);
                break;
            case 11:
                System.out.println("su ubicacion es:" + ubicacion[10]);
                break;
            case 12:
                System.out.println("su ubicacion es:" + ubicacion[11]);
                break;
            default:
        }
    }
    public void delivery() { //JULIO
        Scanner union = new Scanner(System.in);
        int opcion;
        System.out.println("DELIVERY");
        System.out.println("Visita la tienda virtual y conoce las ofertas\n" +
                "que tenemos para ti");
        System.out.println("¿Deseas ingresar a WEB DELIVERY?");
        System.out.println("SI | NO");
        String respuesta = union.nextLine();
        String respuesta1=respuesta.toUpperCase();
        switch (respuesta1) {
            case "SI":
                System.out.println("\033[38;5;203m");
                System.out.println("Productos disponibles:");
                System.out.println("┌──────────────────────────────────────────────────────────┐");
                System.out.println("│ Nº │ Producto                        │ Precio │ Cantidad │");
                System.out.println("├────┼─────────────────────────────────┼────────┼──────────┤");
                System.out.println("│ 1  | "+productosdel [0]+"                         | "+preciodel [0]+"   | 7        │");
                System.out.println("│ 2  | "+productosdel [1]+"                  | "+preciodel [1]+"   | 350g     │");
                System.out.println("│ 3  | "+productosdel [2]+"      | "+preciodel [2]+"   | 200g     │");
                System.out.println("│ 4  | "+productosdel [3]+"             | "+preciodel [3]+"   | 1000g    │");
                System.out.println("│ 5  | "+productosdel [4]+"         | "+preciodel [4]+"    | 1        │");
                System.out.println("│ 6  | "+productosdel [5]+"            | "+preciodel [5]+"    | 65g      │");
                System.out.println("│ 7  | "+productosdel [6]+"   | "+preciodel [6]+"    | 65g      │");
                System.out.println("│ 8  | "+productosdel [7]+"           | "+preciodel [7]+"    | 10       │");
                System.out.println("│ 9  | "+productosdel [8]+"             | "+preciodel [8]+"    | 10       │    ┌──────────────────────────────────────────────────────────┐");
                System.out.println("│ 10 | "+productosdel [9]+"         | "+preciodel [9]+"   | 500g     │    │                                                        X │ ");
                System.out.println("│ 11 | "+productosdel [10]+"     | "+preciodel [10]+"   | 900g     │    │                           AVISO                          │");
                System.out.println("│ 12 | "+productosdel [11]+"| "+preciodel [11]+"    | 1        │    │      Días de entrega                  Monto Mínimo       │");
                System.out.println("│ 13 | "+productosdel [12]+" | "+preciodel [12]+"    | 1        │    │   El día de entrega es          El monto mínimo para las │");
                System.out.println("│ 14 | "+productosdel [13]+"           | "+preciodel [13]+"    | 1        │    │          jueves                    compras es de S/. 58  │");
                System.out.println("│ 15 | "+productosdel [14]+"      | "+preciodel [14]+"    | 1        │    │                                       incluye Delivery   │");
                System.out.println("│ 16 | "+productosdel [15]+"    | "+preciodel [15]+"    | 1        │    │                                                          │");
                System.out.println("│ 17 | "+productosdel [16]+"                      | "+preciodel [16]+"    | 1        │    │                           Además                         │");
                System.out.println("│ 18 | "+productosdel [17]+"  | "+preciodel [17]+"    | 1        │    │      Recuerda usar la aplicación para encontrar muchas   │");
                System.out.println("│ 19 | "+productosdel [18]+"| "+preciodel [18]+"    | 1        │    │      promociones y ofertas                               │");
                System.out.println("│ 20 | "+productosdel [19]+"   | "+preciodel [19]+"    | 1        │    │                                                          │");
                System.out.println("│ 21 | "+productosdel [20]+"         | "+preciodel [20]+"    | 1        │    │                                                          │");
                System.out.println("│ 22 | "+productosdel [21]+"         | "+preciodel [21]+"    | 1        │    │      App: Tienda Unión                                   │");
                System.out.println("│ 23 | "+productosdel [22]+"            | "+preciodel [22]+"    | 1        │    └──────────────────────────────────────────────────────────┘");
                System.out.println("└──────────────────────────────────────────────────────────┘    ");
                System.out.println("Seleccione opción:");
                opcion=union.nextInt();
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad1=union.nextInt();
                carritod[0]+=cantidad1;
                System.out.println("Ud ha pedido "+carritod[0]+ " productos de "+productosdel[opcion - 1]);
                subtotal = preciodel[opcion - 1] * cantidad1;
                if (subtotal>= 58.00) {
                    System.out.println(" se le sumara S/. 8.00 soles por el delivery");
                    subtotal_extra[opcion - 1] = subtotal + 8;
                } else if (subtotal_extra[opcion - 1] < 58) {
                    System.out.println("Todavia no supera el monto mínimo");
                    this.delivery();
                } else {
                    System.out.println("opcion no valida");
                }
                System.out.println("¿Desea elegir otro producto más?  1 SI/ 2 NO / 3 Volver a Menú");
                opcion=union.nextInt();
                union.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.delivery();
                }
                else if (opcion==2){
                    for (int i=0; i<lugar.length;i++){
                        System.out.println("Opcion "+(i+1)+ " : " +lugar[i]);
                    }
                    System.out.println("¿de que ciudad es?");
                    int opcionci=union.nextInt();
                    System.out.println(lugar[opcionci - 1]);
                    System.out.println("¿Cual es su direccion?");
                    direccion=union.next();
                    this.fTipoDePago();
                }
                else if (opcion==3){
                    this.fpregunta();
                }
                else {
                    System.out.println("Opcion no válida");
                }

            case "NO":
                System.out.println("\033[38;5;226m");
                System.out.println("¡DESCARGA NUESTRA APP!");
                System.out.println("┌─────────────────┐        ┌─────────────────┐");
                System.out.println("│  descargalo en  │        │  DISPONIBLE EN  │");
                System.out.println("│   App STORE     │        │   Google play   │");
                System.out.println("└─────────────────┘        └─────────────────┘");
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
    public void IMC(){ //mio may
        Scanner imc = new Scanner(System.in);
        System.out.println("\033[38;5;226m----------BIENVENIDO ESTAS SON LAS RECOMENDACIONES DE UNIÓN----------");
        System.out.println("Por favor ingrese su peso en Kg: ");
        peso = imc.nextFloat();
        System.out.println("Por favor ingrese su talla en centímetros: ");
        talla = imc.nextFloat();
        talla = talla / 100; // convercion en metros
        rpt_imc = peso / (talla * talla);
        String[][] recomendaciones = {
                {"Mega Galleta de Coco", "Producto saludable contra la anemia"},
                {"Mega Galleta de Kiwicha", "Producto saludable contra la anemia"},
                {"Mega Galleta de Naranja", "Producto saludable contra la anemia"},
                {"Mega Galleta Integral de Coco", "Producto saludable contra la anemia"},
                {"Mega Galleta Integral de Naranja", "Producto saludable contra la anemia"},
                {"Mega Galleta Integral de Coco", "Producto saludable contra la anemia"},
                {"Palitos con Especias", "Producto saludable contra la anemia"},
                {"Palitos con ajonjoli y linaza", "Producto saludable contra la anemia"},
                {"Paneton Integral T/C 900 gr", "Producto saludable contra la anemia"}};
        String[][] recomendacionesPesoNormal = {
                {"Palitos con Especias", "Producto veganos con ingesta de hierro y vitamina de b12"},
                {"Palitos con ajonjoli y linaza", "Producto veganos con ingesta de hierro y vitamina de b12"}};
        String[][] recomendacionesExcesoPeso = {
                {"Palitos con Especias", "Producto que considera los antioxidantes"},
                {"Palitos con ajonjoli y linaza", "Producto que considera los antioxidantes"}};
        String[][] recomendacionesObeso = {
                {"Paneton Integral T/C 900 gr", "Variedad de producto sin azucar añadida"},
                {"Paneton Diet T/L 500 gr", "Variedad de producto sin azucar añadida"}};
        String[][] recomendacionesObesoExtremo = {
                {"Mega Galleta de Coco", "Producto sin presencia de octógonos de alerta"},
                {"Mega Galleta de Kiwicha", "Producto sin presencia de octógonos de alerta"},
                {"Mermelada de Uva Frasco", "Producto sin presencia de octógonos de alerta"},
                {"Mantequilla de Mani Sachet", "Producto sin presencia de octógonos de alerta"},
                {"Tostada Integral X 10", "Producto sin presencia de octógonos de alerta"},
                {"Tostada Blanca X 10", "Producto sin presencia de octógonos de alerta"}};
        if (rpt_imc < 18.5) {
            mostrarRecomendaciones("bajo peso", recomendaciones);
        } else if (rpt_imc >= 18.5 && rpt_imc <= 24.9) {
            mostrarRecomendaciones("peso normal", recomendacionesPesoNormal);
        } else if (rpt_imc >= 25 && rpt_imc <= 29.9) {
            mostrarRecomendaciones("exceso de peso", recomendacionesExcesoPeso);
        } else if (rpt_imc >= 30 && rpt_imc <= 34.9) {
            mostrarRecomendaciones("obeso o ebesa", recomendacionesObeso);
        } else if (rpt_imc > 35 && rpt_imc <= 100) {
            mostrarRecomendaciones("obeso/a extremo/a", recomendacionesObesoExtremo);
        }
    }
    private void mostrarRecomendaciones(String categoria, String[][] recomendaciones) { //mio may
        System.out.println("Ud. cuenta con " + categoria + " con un IMC de: " + rpt_imc);
        System.out.println("Unión recomienda los siguientes productos: ");
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│ Producto                                         │ Informe Nutricional recomendaciones nutricional             │");
        System.out.println("├──────────────────────────────────────────────────┼─────────────────────────────────────────────────────────────┤");
        for (String[] producto : recomendaciones) {
            System.out.printf("│ %-40s         │ %-56s    │%n", producto[0], producto[1]);
        }
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.println(" ----------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
        this.fproductos();
    }
   private String fTipoDePago() { //MIJAEL
        double total = Arrays.stream(subtotal_extra).sum();
        System.out.println("El total a pagar es: " + total);
        System.out.println("Vaya a caja a pagar");
        System.out.println("ingrese el tipo de pago?");
        System.out.println("TARJETA ");
        System.out.println("EFECTIVO");
        String opcion_de_pago = union.nextLine().toUpperCase();
        switch (opcion_de_pago) {
            case "TARJETA":
                this.opcion_de_pago = "TARJETA";
                String tarjeta, fechacaducidad, dni, cvv;
                System.out.println("ingrese el nombre completo del titular de la tarjeta");
                String titulartarjeta=union.nextLine();
                do {
                    System.out.println("ingrese el numero de DNI del titular de la tarjeta (8 digitos)");
                    dni = union.nextLine();
                } while (dni.length() !=8);
                do {
                    System.out.print("Introduce tu numero de tarjeta (16 dígitos): ");
                    tarjeta = union.nextLine();
                } while (tarjeta.length() != 16);
                boolean formatoValido = false;
                do {
                    System.out.print("Introduce la fecha de caducidad de la tarjeta (MM/YY): ");
                    fechacaducidad = union.nextLine();
                    if (fechacaducidad.matches("\\d{2}/\\d{2}")) {
                        formatoValido = true;
                    } else {
                        System.out.println("Formato de fecha no válido. Debe ser MM/YY.");
                    }
                } while (!formatoValido);
                do {
                    System.out.print("Ingrese el numero de CVV ( 3 digitos) ");
                    cvv = union.nextLine();
                } while (cvv.length() != 3);
                System.out.println("pago realizado exitosamente con su tarjeta");
                System.out.println("PRODUCTOS UNION");
                función_de_impresion_de_cobro();
                break;
            case "EFECTIVO":
                this.opcion_de_pago = "EFECTIVO";
                System.out.println("El monto a pagar es de: " + total);
                System.out.println("Ingrese el pago de los productos:");
                totalPagado = union.nextFloat();
                while (totalPagado < total) {
                    System.out.println("Monto insuficiente. Faltan " + (total - totalPagado) + " para completar el pago.");
                    System.out.println("Ingrese el monto adicional que va a pagar:");
                    double pagoAdicional = union.nextDouble();
                    if (pagoAdicional <= 0) {
                        System.out.println("Ingrese un monto válido, por favor. No puede consumir los productos gratis.");
                    } else {
                        totalPagado += pagoAdicional;
                    }
                }
                if (totalPagado > total) {
                    double vuelto = totalPagado - total;
                    System.out.println("Pago recibido. Su vuelto es de: " + vuelto);
                } else {
                    System.out.println("Pago completado. Gracias por su compra.");
                }
                función_de_impresion_de_cobro();
                break;

            default:
                System.out.println("Opcion no válida");
                this.fpregunta();
                break;
        }
        return  null;
    }
    public void función_de_impresion_de_cobro(){
        Scanner union_m= new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        double[] cantidades_productos1 = new double[10];
        double[] precios_productos2 = new double[10];
        String[][][] productos_pro = new String[10][2][1];

        // Inicializar datos de ejemplo
        for (int i = 0; i < 10; i++) {
            productos_pro[i][0][0] = "Producto " + (i + 1); // Nombre del producto
            productos_pro[i][1][0] = "Descripción " + (i + 1); // Descripción del producto
            precios_productos2[i] = (i + 1) * 10.0; // Precio del producto
        }

        double op_gratuitas=0.00;
        double op_exoneradas=0.00;
        double op_gravadas=totalPagado ;
        double descuento_total=0.00;
        double tasaIGV = 0.18;
        double igv = totalPagado * tasaIGV;
        double sub_total = totalPagado-igv;
        double icbper = 0.00;
        double importe_Total = sub_total + igv + icbper;
        double detraccion = 0.00;
        double importe_Neto = importe_Total-detraccion;

        do {
            System.out.println("\u001B[31m|-----------CUENTA DEL CAJERO-------------|");
            System.out.println("|Ingrese nombre del vendedor:_____________|");
            nombre_vende = union_m.nextLine();
            System.out.println("|Ingrese nsu contraseña:__________________|");
            contra_vende = union_m.nextLine();
            System.out.println("|------------INICIANDO SESIÓN-------------|");
            System.out.println("|Ingrese nuevamente su contraseña:________|");
            String contra_vende_com = union_m.nextLine();
            if (contra_vende_com.equals(contra_vende)) {
                System.out.println("\u001B[35m");
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.println("|----- BIENVENIDO(A) A PRODUCTOS UNION"+" Srta.:  "+nombre_vende+" 🌟 ----------|");
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.println("|1| GENERAR BOLETA      	       	   -----------------------------------------|");
                System.out.println("|2| GENERAR FACTURA               	   -----------------------------------------|");
                System.out.println("|3| EXPORTAR BOLETA            	       -----------------------------------------|");
                System.out.println("|4| EXPORTAR FACTURA      	       	   -----------------------------------------|");
                System.out.println("|0| SALIR                              -----------------------------------------|");
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.print("|INGRESAR LA OPCION DEL (1 AL 4): ");
                opcion = union_m.nextInt();
                union_m.nextLine();
                switch (opcion) {
                    case 1:
                        numero_factura = "BROE - 00000" + (++contador_factura);
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|---------------------------- UNIÓN ---------------------------|");
                        System.out.println("|-------------------- Saludable por naturaleza ----------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|");
                        System.out.println("|--------- Centro de prod. de Bienes  Productos union ---------|");
                        System.out.println("|---------------- C. central Km. 19 Villa union ---------------|");
                        System.out.println("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|");
                        System.out.println("|------------------ Telef. 618-6309 - 618-6310 ----------------|");
                        System.out.println("|------------------------ RUC 20138122256 ---------------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|===================== BOLETA ELECTRONICA =====================|");
                        System.out.println("|=-- Numero: -----------------------------------  " + numero_factura + "|");
                        System.out.println("|=-- Cliente: --------------------------  " + nombre + " " + apellido + " |");
                        System.out.println("|=-- Doc. ident: -----------------------------------  " + dni + "|");
                        System.out.println("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|");
                        System.out.println("|=-- Dirección: --------------------------------- Juliaca- Perú|");
                        System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                        System.out.println("| N° | PRODUCTOS           | PRECIOS  | CANTIDAD |");
                        for (int i = 0; i < 10; i++) {
                            System.out.println((i + 1) + ". " + productos_pro[i][0][0] + " - $" + precios_productos2[i]);
                        }
                        System.out.println("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |");
                        System.out.println("|=== Op. Exoneradas: ============================= S/  " + op_exoneradas + "        |");
                        System.out.println("|=== Op. Gravadas: =============================== S/. " + op_gravadas + "        |");
                        System.out.println("|=== Total de descuento: ========================= S/. " + descuento_total + "        |");
                        System.out.println("|=== Sub-Total: ================================== S/. " + sub_total + "        |");
                        System.out.println("|=== IGV: ======================================== S/. " + igv + "          |");
                        System.out.println("|=== ICBPER: ===================================== S/. " + icbper + "       |");
                        System.out.println("|=== Importe total: ============================== S/. " + importe_Total + " |");
                        System.out.println("|=== Detracción: ================================= S/. " + detraccion + "|");
                        System.out.println("|=== Importe neto: =============================== S/. " + importe_Neto + " |");
                        System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Medio de Pago: ==============================  " + this.opcion_de_pago+ "   |");
                        System.out.println("|=== Vendedor(a) :================================  " + nombre_vende + "     |");
                        System.out.println("|==============================================================|");
                        System.out.println("|==== Representación Impresa de documento, el cual puede ser ==|");
                        System.out.println("|==========  descargado de la pagina WWW.upeu.pe   ============|");
                        System.out.println("|==============================================================|");
                        System.out.println("|==============================================================|");
                        union_m.nextLine();
                        break;
                    case 2:
                        System.out.println("\033[91mTexto en rojo claro\033[0m");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|---------------------------- UNIÓN ---------------------------|");
                        System.out.println("|-------------------- Saludable por naturaleza ----------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|");
                        System.out.println("|--------- Centro de prod. de Bienes  Productos union ---------|");
                        System.out.println("|---------------- C. central Km. 19 Villa union ---------------|");
                        System.out.println("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|");
                        System.out.println("|------------------ Telef. 618-6309 - 618-6310 ----------------|");
                        System.out.println("|------------------------ RUC 20138122256 ---------------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|======================= FACTURA DE UNIÓN =====================|");
                        System.out.println("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|");
                        System.out.println("|=-- Facturado a Cliente: " + nombre + " " + apellido + "-----------|");
                        System.out.println("|=-- DNI: " + dni + "-------------------------------------------|");
                        System.out.println("|=-- Correo: " + correo + "--------------------------------------------------|");
                        System.out.println("|=-- Contraseña: " + contraseña + "----------------------------------------------|");
                        System.out.println("|=-- codigo universitario: " + codigoU + "------------------------------------|");
                        System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                        System.out.println("| N° | PRODUCTOS           | PRECIOS  | CANTIDAD |");
                        for (int i = 0; i < 10; i++) {
                            System.out.println((i + 1) + ". " + productos_pro[i][0][0] + " - $" + precios_productos2[i]);
                        }
                        System.out.println("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |");
                        System.out.println("|=== Op. Exoneradas: ============================= S/  " + op_exoneradas + "        |");
                        System.out.println("|=== Op. Gravadas: =============================== S/. " + op_gravadas + "        |");
                        System.out.println("|=== Total de descuento: ========================= S/. " + descuento_total + "        |");
                        System.out.println("|=== Sub-Total: ================================== S/. " + sub_total + "        |");
                        System.out.println("|=== IGV: ======================================== S/. " + igv + "          |");
                        System.out.println("|=== ICBPER: ===================================== S/. " + icbper + "       |");
                        System.out.println("|=== Importe total: ============================== S/. " + importe_Total + " |");
                        System.out.println("|=== Detracción: ================================= S/. " + detraccion + "|");
                        System.out.println("|=== Importe neto: =============================== S/. " + importe_Neto + " |");
                        System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Medio de Pago: ==============================  " + this.opcion_de_pago+ "   |");
                        System.out.println("|=== Vendedor(a) :================================  " + nombre_vende + "     |");
                        System.out.println("|==============================================================|");
                        System.out.println("|==== Representación Impresa de documento, el cual puede ser ==|");
                        System.out.println("|==========  descargado de la pagina WWW.upeu.pe   ============|");
                        System.out.println("|==============================================================|");
                        System.out.println("|==============================================================|");
                        union_m.nextLine();
                        break;
                    case 3:
                        EXPO_BOLETA(fechaActual, horaActual, op_gratuitas, op_exoneradas, op_gravadas,
                                descuento_total, sub_total, igv, icbper, importe_Total, detraccion,importe_Neto, productos_pro, precios_productos2);
                        System.out.println("✨🌟Felicidades exportación de la boleta se realizo exitozamente🌟✨");
                        union_m.nextLine();
                        break;
                    case 4:
                        EXPO_FACTURA(fechaActual, horaActual, productos_pro, precios_productos2, op_gratuitas,
                                op_exoneradas, op_gravadas, descuento_total, sub_total, importe_Neto, importe_Total, icbper, igv, detraccion);
                        System.out.println("✨🌟Felicidades exportación de la factura se realizo exitozamente🌟✨");
                        union_m.nextLine();
                        break;
                    case 0:
                        System.out.println("\u001B[31m🌟✨ Gracias por usar nuestro servicio. ✨🌟");
                        break;
                    default:
                        System.out.println("\u001B[31m😒❌ OPCIÓN NO VÁLIDA ❌😒");
                        break;
                }
            }
        } while (opcion != 0);
    }
    public void EXPO_BOLETA(LocalDate fechaActual, LocalTime horaActual, double op_gratuitas,
                            double op_exoneradas, double op_gravadas , double descuento_total, double sub_total,
                            double igv, double icbper , double importe_Total, double detraccion, double importe_Neto,
                            String[][][] productos_pro, double[] precios_productos2) {
        String nombreArchivo = "D:\\Boleta.txt"; // Ruta donde se guardará el archivo de boleta
        try (FileWriter impri = new FileWriter(nombreArchivo)) {
            impri.write(" \u001B[31m");
            impri.write("|--------------------------------------------------------------|\n");
            impri.write("|---------------------------- UNIÓN ---------------------------|\n");
            impri.write("|-------------------- Saludable por naturaleza ----------------|\n");
            impri.write("|--------------------------------------------------------------|\n");
            impri.write("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|\n");
            impri.write("|--------- Centro de prod. de Bienes  Productos union ---------|\n");
            impri.write("|---------------- C. central Km. 19 Villa union ---------------|\n");
            impri.write("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|\n");
            impri.write("|------------------ Telef. 618-6309 - 618-6310 ----------------|\n");
            impri.write("|------------------------ RUC 20138122256 ---------------------|\n");
            impri.write("|--------------------------------------------------------------|\n");
            impri.write("|===================== BOLETA ELECTRONICA =====================|\n");
            impri.write("|=-- Numero: -----------------------------------  " + numero_factura + "|\n");
            impri.write("|=-- Cliente: --------------------------  " + nombre + " " + apellido + " |\n");
            impri.write("|=-- Doc. ident: -----------------------------------  " + dni + "|\n");
            impri.write("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|\n");
            impri.write("|=-- Dirección: --------------------------------- Juliaca- Perú|");
            impri.write("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
            impri.write("| N° | PRODUCTOS           | PRECIOS  | CANTIDAD |");
            for (int i = 0; i < 10; i++) {
                impri.write((i + 1) + ". " + productos_pro[i][0][0] + " - $" + precios_productos2[i]);
            }
            impri.write("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |\n");
            impri.write("|=== Op. Exoneradas: ============================= S/  " + op_exoneradas + "        |\n");
            impri.write("|=== Op. Gravadas: =============================== S/. " + op_gravadas + "        |\n");
            impri.write("|=== Total de descuento: ========================= S/. " + descuento_total + "        |\n");
            impri.write("|=== Sub-Total: ================================== S/. " + sub_total + "        |\n");
            impri.write("|=== IGV: ======================================== S/. " + igv + "          |\n");
            impri.write("|=== ICBPER: ===================================== S/. " + icbper + "       |\n");
            impri.write("|=== Importe total: ============================== S/. " + importe_Total + " |\n");
            impri.write("|=== Detracción: ================================= S/. " + detraccion + "|\n");
            impri.write("|=== Importe neto: =============================== S/. " + importe_Neto + " |\n");
            impri.write("|================= GRACIAS POR SU COMPRA ======================|\n");
            impri.write("|==============================================================|");
            impri.write("|=== Medio de Pago: ==============================  " + this.opcion_de_pago+ "   |");
            impri.write("|=== Vendedor(a) :================================  " + nombre_vende + "     |");
            impri.write("|==============================================================|");
            impri.write("|==== Representación Impresa de documento, el cual puede ser ==|\n");
            impri.write("|==========  descargado de la pagina WWW.upeu.pe   ============|\n");
            impri.write("|==============================================================|\n");
            impri.write("|==============================================================|\n");

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void EXPO_FACTURA(LocalDate fechaActual, LocalTime horaActual, String[][][] productos_pro, double[] precios_productos2, double op_gratuitas, double op_exoneradas, double op_gravadas, double descuento_total, double sub_total, double importe_Neto, double importe_Total, double icbper, double igv, double detraccion){
        String nombreArchivo = "D:\\Factura_impri.txt";//ruta de la factura
        try (FileWriter impri = new FileWriter(nombreArchivo)) {
            impri.write("\u001B[34m");
            impri.write("|--------------------------------------------------------------|\n");
            impri.write("|---------------------------- UNIÓN ---------------------------|\n");
            impri.write("|-------------------- Saludable por naturaleza ----------------|\n");
            impri.write("|--------------------------------------------------------------|\n");
            impri.write("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|\n");
            impri.write("|--------- Centro de prod. de Bienes  Productos union ---------|\n");
            impri.write("|---------------- C. central Km. 19 Villa union ---------------|\n");
            impri.write("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|\n");
            impri.write("|------------------ Telef. 618-6309 - 618-6310 ----------------|\n");
            impri.write("|------------------------ RUC 20138122256 ---------------------|\n");
            impri.write("|--------------------------------------------------------------|\n");
            impri.write("|======================= FACTURA DE UNIÓN =====================|");
            impri.write("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|");
            impri.write("|=-- Facturado a Cliente: " + nombre + " " + apellido + "-----------|");
            impri.write("|=-- DNI: " + dni + "-------------------------------------------|");
            impri.write("|=-- Correo: " + correo + "--------------------------------------------------|");
            impri.write("|=-- Contraseña: " + contraseña + "----------------------------------------------|");
            impri.write("|=-- codigo universitario: " + codigoU + "------------------------------------|");
            impri.write("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
            impri.write("| N° | PRODUCTOS           | PRECIOS  | CANTIDAD |");
            for (int i = 0; i < 10; i++) {
                impri.write((i + 1) + ". " + productos_pro[i][0][0] + " - $" + precios_productos2[i]);
            }
            impri.write("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |\n");
            impri.write("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |\n");
            impri.write("|=== Op. Exoneradas: ============================= S/  " + op_exoneradas + "        |\n");
            impri.write("|=== Op. Gravadas: =============================== S/. " + op_gravadas + "        |\n");
            impri.write("|=== Total de descuento: ========================= S/. " + descuento_total + "        |\n");
            impri.write("|=== Sub-Total: ================================== S/. " + sub_total + "        |\n");
            impri.write("|=== IGV: ======================================== S/. " + igv + "          |\n");
            impri.write("|=== ICBPER: ===================================== S/. " + icbper + "       |\n");
            impri.write("|=== Importe total: ============================== S/. " + importe_Total + " |\n");
            impri.write("|=== Detracción: ================================= S/. " + detraccion + "|\n");
            impri.write("|=== Importe neto: =============================== S/. " + importe_Neto + " |\n");
            impri.write("|================= GRACIAS POR SU COMPRA ======================|\n");
            impri.write("|==============================================================|");
            impri.write("|=== Medio de Pago: ==============================  " + this.opcion_de_pago+ "   |");
            impri.write("|=== Vendedor(a) :================================  " + nombre_vende + "     |");
            impri.write("|==============================================================|");
            impri.write("|==== Representación Impresa de documento, el cual puede ser ==|\n");
            impri.write("|==========  descargado de la pagina WWW.upeu.pe   ============|\n");
            impri.write("|==============================================================|\n");
            impri.write("|==============================================================|\n");

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        compras_union todo= new compras_union();
        todo.fdatos();
    }
}
