/**
 * Esta clase sirve para crear métodos que se aplicaran en un programa de venta de productos.
 * @author USER
 */
public class Tarea6EDClase_Refactorizado {
    
    /**
     * Para el método extraido aplicar descuento contamos con la siguiente documentación.
     * @param precioProducto Es el precio original del producto.
     * @param numProductos Es la cantidad de productos que se van a comprar.
     */
    
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        agregarDescuento(numProductos, precioProducto);

    }
    
    /**
     * Para el método agregarDescuento tenemos como parámetros y return la siguiente información.
     * @param numProductos Es la cantidad de productos que se van a comprar.
     * @param precioProducto Es el precio original del producto.
     */

    public void agregarDescuento(int numProductos, double precioProducto) {
        double Total;
        //Si el número de productos supera la cantidad de 3 el precio se reduce a su precio menos 5.
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        //Si el número de productos es distinto de 0 se aplica un descuento del 0.95.
        //En caso contrario se aplica un descuento de 0.8.
        if (numProductos != 0) {
            Total = precioProducto * DESCUENTO1;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * DESCUENTO2;
            
            //Imprimimos por pantalla un mensaje mostrando el total a pagar.
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }
    private static final double DESCUENTO2 = 0.95;
    private static final double DESCUENTO1 = 0.8;
}
