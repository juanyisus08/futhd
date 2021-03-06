/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.sql.Connection;//Conexión a base de datos.
import java.sql.DriverManager;//driver de conexión.
import java.sql.ResultSet;//resultado final de datos.
import java.sql.SQLException;//Tratamiento de errores de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//Fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imágenes
import javax.swing.JOptionPane;//Ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pojos.equipo;

/**
 *
 * @author Juan
 */
public class General extends javax.swing.JFrame {

    /**
     * Creates new form General
     */
    equipo objEquipo=new equipo(); // generación de objeto
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
     public void conectarBase(){
        try{//inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/futhd","root","");
            JOptionPane.showMessageDialog(null,"Operación éxitosa \n\n");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1:\n"+ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:\n"+e);
        }
     }
    
    public General() {
        initComponents();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPTotales = new javax.swing.JLabel();
        lblPEmpatados = new javax.swing.JLabel();
        lblEquipo = new javax.swing.JLabel();
        txtPEmpatados = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        txtPPerdidos = new javax.swing.JTextField();
        btnEliminarEquipo = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        lblGAnotados = new javax.swing.JLabel();
        lblPPerdidos = new javax.swing.JLabel();
        lblCaptura = new javax.swing.JLabel();
        txtPTotales1 = new javax.swing.JTextField();
        txtGAnotados = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        txtEliminarEquipo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        lblPGanados = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPGanados = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPTotales.setText("Partidos totales");

        lblPEmpatados.setText("Partidos empatados");

        lblEquipo.setText("Equipo");

        txtPEmpatados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPEmpatadosActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtPPerdidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPPerdidosActionPerformed(evt);
            }
        });

        btnEliminarEquipo.setText("Eliminar datos del equipo");
        btnEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEquipoActionPerformed(evt);
            }
        });

        btnPDF.setText("Ver PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        lblGAnotados.setText("Goles anotados");

        lblPPerdidos.setText("Partidos pérdidos:");

        lblCaptura.setText("Captura el ID del equipo a eliminar:");

        txtPTotales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPTotales1ActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar equipo");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Equipo", "Goles Anotados", "Partidos Ganados", "Partidos Empatados", "Partidos Perdidos", "Partidos Totales"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        lblId.setText("id:");

        lblPGanados.setText("Partidos ganados");

        txtPGanados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPGanadosActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PASTO.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminarEquipo)
                        .addGap(75, 75, 75)
                        .addComponent(lblCaptura)
                        .addGap(31, 31, 31)
                        .addComponent(txtEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEquipo)
                                    .addComponent(lblId)
                                    .addComponent(lblGAnotados)
                                    .addComponent(lblPGanados)
                                    .addComponent(lblPPerdidos)
                                    .addComponent(lblPEmpatados)
                                    .addComponent(lblPTotales, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPPerdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPEmpatados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPGanados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(282, 282, 282)
                                                .addComponent(btnConsultar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(294, 294, 294)
                                                .addComponent(btnPDF))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtPTotales1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnRegistrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipo)
                            .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGAnotados)
                            .addComponent(txtGAnotados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPGanados)
                            .addComponent(txtPGanados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCaptura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPEmpatados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPEmpatados))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPPerdidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPPerdidos))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPTotales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPTotales))
                                .addGap(120, 120, 120))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnConsultar)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPDF)
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminarEquipo)
                        .addGap(22, 22, 22)
                        .addComponent(btnRegistrar)
                        .addGap(50, 50, 50)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPEmpatadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPEmpatadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPEmpatadosActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        try {
            conectarBase(); //llamada a la conexión.
            //Declaración de un Objeto de almacenamiento lógico de datos "Modelo de datos".
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsulta.setModel(modeloDatos);

            rs=stmt.executeQuery("SELECT * FROM futbol");

            //Imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("id");
            modeloDatos.addColumn("equipo");
            modeloDatos.addColumn("golesanotados");
            modeloDatos.addColumn("pganados");
            modeloDatos.addColumn("pempatados");
            modeloDatos.addColumn("pperidos");
            modeloDatos.addColumn("ptotales");

            //Imprimir filas o registros.
            while(rs.next()){ //Inicia while
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            } //Termina while.

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error 2 de BD Consulta" +e);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtPPerdidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPPerdidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPPerdidosActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed

        int confirmaBaja;
        try {
            conectarBase();
            int equipobaja=Integer.parseInt(txtEliminarEquipo.getText());

            confirmaBaja=stmt.executeUpdate("DELETE FROM futbol WHERE id = '"+equipobaja+"' ");

            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el equipo de BD\n\n"+equipobaja+"\nVerifica consulta");

            } else {
                JOptionPane.showMessageDialog(null, "Error, no existe Id de equipo en BD\n\n"+equipobaja+"\nVerifica consulta");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar baja de BD\n\n"+ex);
        }
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
        try {
            String rutaReporte="src/reportes/rptEquipos.jasper";
            JasperPrint rptequiposPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptequiposPDF,false);
            ventanaVisor.setTitle("Equipos FutHD");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void txtPTotales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPTotales1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTotales1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        conectarBase();
        //Almacenar los valores de formulario en el objeto.
        objEquipo.setId(Integer.parseInt(txtId.getText()));
        objEquipo.setEquipo(txtEquipo.getText());
        objEquipo.setGanotados(Integer.parseInt(txtGAnotados.getText()));
        objEquipo.setPganados(Integer.parseInt(txtPGanados.getText()));
        objEquipo.setPempatados(Integer.parseInt(txtPEmpatados.getText()));
        objEquipo.setPperdidos(Integer.parseInt(txtPPerdidos.getText()));
        objEquipo.setPtotales(Integer.parseInt(txtPPerdidos.getText()));
        // Variable objeto para registrar un alumno
        String altaEquipo="INSERT INTO FUTBOL(id,equipo,golesanotados,pganados,pempatados,pperdidos,ptotales) VALUES ('"+objEquipo.getId()+"','"+objEquipo.getEquipo()+"','"+objEquipo.getGanotados()+"','"+objEquipo.getPganados()+"','"+objEquipo.getPempatados()+"','"+objEquipo.getPperdidos()+"','"+objEquipo.getPtotales()+"')";
        // Estructura de tratamiento de errores en ejecución.

        try {
            stmt.executeUpdate(altaEquipo);
            JOptionPane.showMessageDialog(null,"Se registró el equipo de forma exitosa.\n\n"+objEquipo.getEquipo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error 1 de base de datos al general alta del equipo\n\n Verifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPGanadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPGanadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPGanadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblCaptura;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblGAnotados;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPEmpatados;
    private javax.swing.JLabel lblPGanados;
    private javax.swing.JLabel lblPPerdidos;
    private javax.swing.JLabel lblPTotales;
    private javax.swing.JTextField txtEliminarEquipo;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtGAnotados;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPEmpatados;
    private javax.swing.JTextField txtPGanados;
    private javax.swing.JTextField txtPPerdidos;
    private javax.swing.JTextField txtPTotales1;
    // End of variables declaration//GEN-END:variables
}
