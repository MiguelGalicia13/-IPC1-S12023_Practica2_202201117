package menu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class GenerarReporte {
    String extension = ".html";
    iu hud = new iu();
    Simulacion sim = new Simulacion();
    public void CrearArchivo(String nombreArchivo){

        try{
            File f= new File(nombreArchivo+extension);
            boolean creado = f.createNewFile();

            if(creado){
                System.out.println("Archivo creado");
            }else System.out.println("Archivo existente");

        }catch(IOException e){
            System.out.println("Erro al crear archivo");
        }
    }
    public void Escribir(String archivo){
        try{
            FileWriter f = new FileWriter(archivo+extension);
            f.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Reporte</title>\n" +
                    "</head>\n" +
                    "<style>\n" +
                    "    body{\n" +
                    "        background-color: #2A2A2D;\n" +
                    "    }\n" +
                    "\t\th1 {\n" +
                    "            color: #fff;\n" +
                    "\t\t\tfont-size: 32px;\n" +
                    "\t\t\tfont-weight: bold;\n" +
                    "\t\t\ttext-align: center;\n" +
                    "\t\t}\n" +
                    "        table{\n" +
                    "            color: #fff;\n" +
                    "            margin: auto;\n" +
                    "\t\t\tborder-collapse: collapse;\n" +
                    "            \n" +
                    "        }\n" +
                    "        th, td {\n" +
                    "\t\t\tborder: 1px solid #ff0000; /* agrega un borde negro de 1px a las celdas */\n" +
                    "\t\t\tpadding: 8px; /* agrega un relleno de 8px a las celdas */\n" +
                    "\t\t\t /* cambia el color de fondo de las celdas */\n" +
                    "\t\t}\n" +
                    "\t</style>\n" +
                    "<body>\n" +
                    "    <h1>\n" +
                    "        Reporte de gastos generados \n" +
                    "    </h1>\n" +
                    "    <br>\n" +
                    "    <br>\n" +
                    "    <br>\n" +
                    "    <br>\n" +
                    "    <br>\n" +
                    "\n" +
                    "    <table>\n" +
                    "\t\t<thead>\n" +
                    "\t\t\t<tr>\n" +
                    "\t\t\t\t<th></th>\n" +
                    "\t\t\t\t<th>Costo (Q/s)</th>\n" +
                    "\t\t\t\t<th>Tiempo (s)</th>\n" +
                    "\t\t\t\t<th>Costo Total (Q)</th>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t</thead>\n" +
                    "\t\t<tbody>\n" +
                    "\t\t\t<tr>\n" +
                    "\t\t\t\t<td>Producción</td>\n" +
                    "\t\t\t\t<td>"+hud.getPproduccion()+"</td>\n" +
                    "\t\t\t\t<td>"+hud.getTproduccion()+"</td>\n" +
                    "\t\t\t\t<td>"+(hud.getPproduccion()*hud.getTproduccion()*30)+"</td>\n" +
                    "\t\t\t</tr>\n" +
                    "            <tr>\n" +
                    "\t\t\t\t<td>Inventario</td>\n" +
                    "\t\t\t\t<td>"+hud.getPinventario()+"</td>\n" +
                    "\t\t\t\t<td>"+hud.getTinventario()+"</td>\n" +
                    "\t\t\t\t<td>"+(hud.getPinventario()*hud.getTinventario()*30)+"</td>\n" +
                    "\t\t\t</tr>\n" +
                    "            <tr>\n" +
                    "\t\t\t\t<td>Empaquetado</td>\n" +
                    "\t\t\t\t<td>"+hud.getPempaquetado()+"</td>\n" +
                    "\t\t\t\t<td>"+hud.getTempaquetado()+"</td>\n" +
                    "\t\t\t\t<td>"+(hud.getPempaquetado()* hud.getTempaquetado()*30)+"</td>\n" +
                    "\t\t\t</tr>\n" +
                    "            <tr>\n" +
                    "\t\t\t\t<td>Salida</td>\n" +
                    "\t\t\t\t<td>"+hud.getPexit()+"</td>\n" +
                    "\t\t\t\t<td>+"+hud.getTexit()+"+</td>\n" +
                    "\t\t\t\t<td>"+(hud.getPexit()*hud.getTexit()*30)+"</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t</tbody>\n" +
                    "\t</table>\n" +
                    "</body>\n" +
                    "</html>");
            f.close();
        }catch(IOException e){

        }
    }
}
