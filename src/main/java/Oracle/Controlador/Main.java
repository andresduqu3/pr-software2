package Oracle.Controlador;
import Oracle.DTO.DTO_Bitacora;
import Oracle.DTO.DTO_Empleado;
import Oracle.DTO.DTO_EAE;
import Oracle.DTO.DTO_Cargo;
import Oracle.DTO.DTO_EE;
import Oracle.Vista.GUI;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import Oracle.Generalidades.Constantes;
/**
 * @Autor Carlos Samuel
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        GUI gui = new GUI();
        System.out.println("¡Buenas noches ¿Que desea hacer?!");
        System.out.println("Activar interfaz grafica (1)");
        System.out.println("Informe empleados 1 (2)");
        System.out.println("Informe empleados 2 (3)");
        System.out.println("Informe Cargos (4)");
        System.out.println("Informe elementos asignados (5)");
        System.out.println("Informe elementos entregados (6)");
        System.out.println("Informe de Bitacora (7)");
        while(true){
            try{
                int n = Integer.parseInt(br.readLine());
                if(n==1){
                        
                    gui.setVisible(true);
                    break;
                }else{
                    int ventana = Constantes.getCont();
                    if(n==2){
                        for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado2(ventana)) {
                            System.out.println(dto.toString3());
                        }
                        System.out.println("Desea generar un PDF S/N");
                        String aux = br.readLine();
                        if ("S".equals(aux)){
                            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\empleados1.pdf";
                            Document document = new Document();
                            try {
                                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                                document.open();

                                Paragraph p = new Paragraph();
                                p.add("Informe Empleados 1");
                                p.setAlignment(Element.ALIGN_CENTER);
                                document.add(p);

                                Paragraph p2 = new Paragraph();
                                for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado2(ventana)) {
                                  p2.add(dto.toString3());
                                }
                                document.add(p2);

                                document.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }    
                        }
                    }else if(n==3){
                        for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado3(ventana)) {
                            System.out.println(dto.toString4());
                        }
                        System.out.println("Desea generar un PDF S/N");
                        String aux = br.readLine();
                        if ("S".equals(aux)){
                            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\empleados2.pdf";
                            Document document = new Document();
                            try {
                                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                                document.open();

                                Paragraph p = new Paragraph();
                                p.add("Informe Empleados 2");
                                p.setAlignment(Element.ALIGN_CENTER);
                                document.add(p);

                                Paragraph p2 = new Paragraph();
                                for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado3(ventana)) {
                                  p2.add(dto.toString4());
                                }
                                document.add(p2);

                                document.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }    
                        }                
                    }else if(n==4){
                        System.out.println("Ingrese buscador");
                        String aux1 = br.readLine();

                        for (DTO_Cargo dto: GUI.masterCargo.listarCargos2(ventana, aux1)){
                            System.out.println(dto.toString());
                        }
                        System.out.println("Desea generar un PDF S/N");
                        String aux = br.readLine();
                        if ("S".equals(aux)){
                            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\cargos.pdf";
                            Document document = new Document();
                            try {
                                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                                document.open();

                                Paragraph p = new Paragraph();
                                p.add("Informe Cargos");
                                p.setAlignment(Element.ALIGN_CENTER);
                                document.add(p);

                                Paragraph p2 = new Paragraph();
                                for (DTO_Cargo dto: GUI.masterCargo.listarCargos2(ventana, aux1)){
                                  p2.add(dto.toString());
                                }
                                document.add(p2);

                                document.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }    
                        }                
                    }else if(n==5){

                        for (DTO_EAE dto: GUI.masterElementos_Asignados.listarElementos_Asignados2(ventana)){
                            System.out.println(dto.toString());
                        }
                        System.out.println("Desea generar un PDF S/N");
                        String aux = br.readLine();
                        if ("S".equals(aux)){
                            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\elementos_asignados.pdf";
                            Document document = new Document();
                            try {
                                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                                document.open();

                                Paragraph p = new Paragraph();
                                p.add("Informe Elementos Asignados");
                                p.setAlignment(Element.ALIGN_CENTER);
                                document.add(p);

                                Paragraph p2 = new Paragraph();
                                for (DTO_EAE dto: GUI.masterElementos_Asignados.listarElementos_Asignados2(ventana)){
                                  p2.add(dto.toString());
                                }
                                document.add(p2);

                                document.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }    
                        }                
                    }else if(n==6){

                        for (DTO_EE dto: GUI.masterElementos_Asignados.listarElementos_Asignados3(ventana)) {
                            System.out.println(dto.toString());
                        }
                        System.out.println("Desea generar un PDF S/N");
                        String aux = br.readLine();
                        if ("S".equals(aux)){
                            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\elementos_asignados.pdf";
                            Document document = new Document();
                            try {
                                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                                document.open();

                                Paragraph p = new Paragraph();
                                p.add("Informe Elementos Entregados");
                                p.setAlignment(Element.ALIGN_CENTER);
                                document.add(p);

                                Paragraph p2 = new Paragraph();
                                for (DTO_EE dto: GUI.masterElementos_Asignados.listarElementos_Asignados3(ventana)) {
                                  p2.add(dto.toString());
                                }
                                document.add(p2);

                                document.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }    
                        }                
                    }else if(n==7){
 
                        for (DTO_Bitacora dto: GUI.masterBitacora.listarBitacoras(ventana)) {
                            System.out.println(dto.toString());
                        }
                        System.out.println("Desea generar un PDF S/N");
                        String aux = br.readLine();
                        if ("S".equals(aux)){
                            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\bitacora.pdf";
                            Document document = new Document();
                            try {
                                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                                document.open();

                                Paragraph p = new Paragraph();
                                p.add("Informe Bitacora");
                                p.setAlignment(Element.ALIGN_CENTER);
                                document.add(p);

                                Paragraph p2 = new Paragraph();
                                for (DTO_Bitacora dto: GUI.masterBitacora.listarBitacoras(ventana)) {
                                  p2.add(dto.toString());
                                }
                                document.add(p2);

                                document.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }    
                        }                
                    }
                }
            }catch (Exception e) {
                System.out.println("Ingrese un comando valido");
            } 
        }
    }
    
}
