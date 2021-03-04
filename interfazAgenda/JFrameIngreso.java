import javax.swing.*;
import java.awt.*;

public class JFrameIngreso extends JFrame
{
  Ingreso pi = new Ingreso();
  
  public JFrameIngreso()
   {   
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 150);
      setTitle("Usuario y contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(pi);
      setLocationRelativeTo(null);
      setVisible(true);
       
   }   
}