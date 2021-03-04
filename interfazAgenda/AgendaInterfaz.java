import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AgendaInterfaz extends JFrame 
{

    public AgendaInterfaz() 
    {
        initComponents();
    }
     
    CodigoAgenda objeto = new CodigoAgenda();

    private void initComponents() 
    {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        NOM = new JTextField();
        jLabel2 = new JLabel();
        TEL= new JTextField();
        jLabel3 = new JLabel();
        CORR = new JTextField();
        jLabel5 = new JLabel();
        FNA = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jScrollPane1 = new JScrollPane();
        INFO = new JTextArea();
        jLabel4 = new JLabel();
        busqueda = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE");

        jLabel2.setText("CELULAR");

        jLabel3.setText("CORREO");
        
        jLabel5.setText("FECHA DE NACIMIENTO");

        jButton1.setText("GUARDAR");
        jButton1.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent evt) 
            {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("CONSULTAR");
        jButton2.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent evt) 
            {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("MOSTRAR");
        jButton3.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent evt) 
            {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setText("ELIMINAR");
        jButton4.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent evt) 
            {
                jButton4MouseClicked(evt);
            }
        });
        
        setResizable(false);
        setTitle("Tabla de datos");
        setLocationRelativeTo(null);
        setVisible(true);
        
        INFO.setColumns(20);
        INFO.setRows(5);
        jScrollPane1.setViewportView(INFO);

        jLabel4.setText("INGRESE DATO A CONSULTAR O ELIMINAR");
        
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NOM)
                                    .addComponent(TEL)
                                    .addComponent(CORR)
                                    .addComponent(FNA, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(busqueda)))))
                .addContainerGap(15, Short.MAX_VALUE)));
                
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NOM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TEL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CORR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FNA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(busqueda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(17, 17, 17)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    
       pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) 
    {
      objeto.ingresarInfo();
      
      if (NOM.getText()==null||NOM.getText().isEmpty())
      { 
        JOptionPane.showMessageDialog(null, "DEBES COLOCAR AL MENOS UN NOMBRE",
        "Aviso", JOptionPane.INFORMATION_MESSAGE);
        NOM.requestFocus();
      }
      else
        if(TEL.getText()==null||TEL.getText().isEmpty()) 
        {
          JOptionPane.showMessageDialog(null, "DEBES CAPTURAR SU NUMERO DE CELULAR",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);
          TEL.requestFocus();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
         }
         
      NOM.setText(null);
      TEL.setText(null);
      CORR.setText(null);
      FNA.setText(null);  
         
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) 
    {
      objeto.consultarInfo();
      if (busqueda.getText()==null||busqueda.getText().isEmpty())
      { 
        JOptionPane.showMessageDialog(null, "DEBES COLOCAR EL DATO A BUSCAR",
        "Aviso", JOptionPane.INFORMATION_MESSAGE);
        busqueda.requestFocus();
      }
      else
      {
        JOptionPane.showMessageDialog(null, "CONSULTA EXITOSA");
      }

      busqueda.setText(null);
    }

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) 
    {
      objeto.mostrarInfo();
    }

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) 
    {
      objeto.eliminar();
      if (busqueda.getText()==null||busqueda.getText().isEmpty())
      { 
        JOptionPane.showMessageDialog(null, "DEBES COLOCAR EL DATO A ELIMINAR",
        "Aviso", JOptionPane.INFORMATION_MESSAGE);
        busqueda.requestFocus();
      }
      else
      {
        JOptionPane.showMessageDialog(null, "DATO ELIMINADO CORRECTAMENTE");
      }

      busqueda.setText(null);
    }


    // Declaracion de variables
    public static JTextField NOM;
    public static JTextField TEL;
    public static JTextField CORR;
    public static JTextField FNA;
    public static JTextArea INFO;
    public static JTextField busqueda;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
}
