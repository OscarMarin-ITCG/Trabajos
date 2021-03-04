import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class CodigoAgenda 
{
    String datos[][] = new String[10][20];
    
    int i = 0;
    public void ingresarInfo() 
    {
        if (i < datos.length) 
        {
            String nombre = String.valueOf(AgendaInterfaz.NOM.getText());
            String telefono= String.valueOf(AgendaInterfaz.TEL.getText());
            String correo = String.valueOf(AgendaInterfaz.CORR.getText());
            String fechaNacimiento = String.valueOf(AgendaInterfaz.FNA.getText());

            datos[i][0] = nombre;
            datos[i][1] = telefono;
            datos[i][2] = correo;
            datos[i][3] = fechaNacimiento;
            i++;

        }
         
    }

    public void consultarInfo() 
    {

        String identidad = String.valueOf(AgendaInterfaz.busqueda.getText());
        

        for (int i = 0; i < datos.length; i++) 
        {
            if (identidad.equals(datos[i][0])) 
            {
                String rep = "NOMBRE(S)   |   CELULAR   |   CORREO    |    FECHA DE NACIMIENTO\n";
                AgendaInterfaz.INFO.setText(rep + "" + datos[i][0] + "\t" + datos[i][1] + "\t" + datos[i][2] + "\t" + datos[i][3] + "\n");
                
                i = datos.length;
            }

        }

    }

    public void mostrarInfo() 
    {
        String rep = "NOMBRE   |   CELULAR  |   CORREO    |    FECHA DE NACIMIENTO\n";

        for (int j = 0; j < datos.length; j++) 
        {

            rep += datos[j][0] + "\t" + datos[j][1] + "\t" + datos[j][2] + "\t" + datos[j][3] + "\n";
            AgendaInterfaz.INFO.setText(rep);
            for (int i = 0; i < datos.length; i++) 
            {

                if (datos[i][j] == null) 
                {
                    datos[i][j] = "";
                }
            }

        }
    }

    public void eliminar() 
    {
        String identidad = String.valueOf(AgendaInterfaz.busqueda.getText());

        for (int i = 0; i < datos.length; i++) 
        {
        
            if (identidad.equals(datos[i][0])) 
            {
                 
                datos[i][0] = "";
                datos[i][1] = "";
                datos[i][2] = "";
                datos[i][3] = "";
                
                
                i = datos.length;
            }

        }

    }

}
