/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package parroquia_cristo_resucitado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.awt.Image;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFileChooser;
import java.io.File; 
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author Fabricio
 */
public class personas extends javax.swing.JFrame {

    /**
     * Creates new form personas
     */
    public personas() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar_combobox_parroquias();
        llenar_combobox_departamentos();
        
    
        jComboBox3.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
            if(e.getStateChange()==ItemEvent.SELECTED)
            {
                try
                {
                    jComboBox4.removeAllItems();
                    basededatos bd= new basededatos();
                    bd.conexion();
                    Statement st= bd.con.createStatement();
                    rs=st.executeQuery("select * from departamentos A join lugares B on "
                    + "B.Id_departamento=A.Id_departamento\n" +
                    "join municipios C on B.Id_municipio=C.Id_municipio\n" +
                    "where A.Id_departamento="+(jComboBox3.getSelectedIndex()+1));

                    while(rs.next())
                    {
                        jComboBox4.addItem(rs.getString(7));
                    }
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage()); 
                }
            }
        }});
        
    }
    
    
    public void llenar_combobox_parroquias()
    {
        try
        {
            jComboBox2.removeAllItems();
            basededatos bd= new basededatos();
            bd.conexion();
            Statement st= bd.con.createStatement();
            rs=st.executeQuery("select * from parroquia");
            while(rs.next())
            {
                jComboBox2.addItem(rs.getString(2));
            }
            
            jComboBox2.addItem("Añadir parroquia...");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }       
    }
    
     public void llenar_combobox_departamentos()
    {
        try
        {
            jComboBox3.removeAllItems();
            basededatos bd= new basededatos();
            bd.conexion();
            Statement st= bd.con.createStatement();
            rs=st.executeQuery("select * from departamentos");
            while(rs.next())
            {
                jComboBox3.addItem(rs.getString(2));
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
                try
                {
                    jComboBox4.removeAllItems();
                    basededatos bd= new basededatos();
                    bd.conexion();
                    Statement st= bd.con.createStatement();
                    rs=st.executeQuery("select * from departamentos A join lugares B on "
                    + "B.Id_departamento=A.Id_departamento\n" +
                    "join municipios C on B.Id_municipio=C.Id_municipio\n" +
                    "where A.Id_departamento=1");

                    while(rs.next())
                    {
                        jComboBox4.addItem(rs.getString(7));
                    }
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage()); 
                }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("N° de Identidad:");

        jTextField1.setName(""); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombres:");

        jTextField2.setName(""); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setName(""); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel3.setText("Apellidos:");
        jLabel3.setAutoscrolls(true);

        jLabel4.setText("Correo electrónico:");
        jLabel4.setAutoscrolls(true);

        jTextField4.setName(""); // NOI18N

        jLabel5.setText("N° Teléfono:");
        jLabel5.setAutoscrolls(true);

        jTextField5.setName(""); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel6.setText("Dirección:");
        jLabel6.setAutoscrolls(true);

        jTextField6.setName(""); // NOI18N

        jCheckBox1.setText("Estado vital");

        jCheckBox2.setText("Estado activo en la parroquia");
        jCheckBox2.setToolTipText("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Masculino", " Femenino", "Selecione una opcion", " " }));
        jComboBox1.setSelectedIndex(2);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexo:");
        jLabel7.setToolTipText("");
        jLabel7.setAutoscrolls(true);

        jLabel8.setText("Parroquia:");
        jLabel8.setToolTipText("");
        jLabel8.setAutoscrolls(true);

        jLabel9.setText("Fecha de nacimiento:");
        jLabel9.setAutoscrolls(true);

        jLabel10.setText("Departamento:");
        jLabel10.setToolTipText("");
        jLabel10.setAutoscrolls(true);

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Municipio:");
        jLabel11.setToolTipText("");
        jLabel11.setAutoscrolls(true);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Lugar de Nacimiento: ");

        jButton2.setText("Elija una fotografía...");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("Registro de personas");

        jButton4.setText("Guardar");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Registrar como Laico");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField6)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9))
                            .addComponent(jButton4))
                        .addGap(70, 70, 70)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))
                                .addGap(30, 30, 30))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ResultSet rs;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:      
        try 
        {
            basededatos bd=new basededatos();
            Statement stmt=null;
            ResultSet rs=null;
            bd.conexion();
           
            
            int valor=0;
            CallableStatement call=bd.con.prepareCall("{call EXISTIR_PERSONA(?)}");
            call.setString(1, jTextField1.getText());
            call.execute();
            rs = call.getResultSet();
            while(rs.next())
            {
               valor=rs.getInt(1);
            }

                if (valor==1)
                {
                    busquedaPersonas(jTextField1.getText());
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No Existe el registro");
                }
 
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
               /*try
        {
            jComboBox4.removeAllItems();
            basededatos bd= new basededatos();
            bd.conexion();
            Statement st= bd.con.createStatement();
            rs=st.executeQuery("select * from departamentos A join lugares B on "
            + "B.Id_departamento=A.Id_departamento\n" +
            "join municipios C on B.Id_municipio=C.Id_municipio\n" +
            "where A.Id_departamento="+(jComboBox3.getSelectedIndex()+1));
            
            while(rs.next())
            {
                jComboBox4.addItem(rs.getString(7));
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }*/

    }//GEN-LAST:event_jComboBox3ItemStateChanged

    public void municipios()
    {
        try
        {
            basededatos bd= new basededatos();
            bd.conexion();
            Statement st= bd.con.createStatement();
            rs=st.executeQuery("select * from departamentos A join lugares B on "
            + "B.Id_departamento=A.Id_departamento\n" +
            "join municipios C on B.Id_municipio=C.Id_municipio\n" +
            "where A.Id_departamento="+(jComboBox3.getSelectedIndex()+1));
            
            while(rs.next())
            {
                jComboBox4.addItem(rs.getString(7));
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jComboBox3ActionPerformed
    
    String imagen_BD="";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            if(jTextField1.getText()!=null)
            {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filtro= new FileNameExtensionFilter("*.JPG", "jpg");
                fileChooser.setFileFilter(filtro);

                int result = fileChooser.showOpenDialog(this);

                if (result == JFileChooser.APPROVE_OPTION) 
                {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                }
                String path="";
                    try
                    {   
                        path = fileChooser.getSelectedFile().getAbsolutePath();  
                        //URL url = this.getClass().getResource(path);  
                        ImageIcon icon = new ImageIcon(path);  
                        jButton2.setIcon(icon);
                        ImageIcon icons= (ImageIcon) jButton2.getIcon();
                        int ancho= jButton2.getWidth();
                        int alto= jButton2.getHeight();
                        ImageIcon iconoEscalado= new ImageIcon(icons.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
                        jButton2.setIcon(iconoEscalado);
                    }
                    catch(Exception ex)
                    {
                        System.out.print("No se encontró el archivo: "+ex.getMessage());
                    }



                    imagen_BD= "src/parroquia_cristo_resucitado/img/"+jTextField1.getText()+".jpg";
                    try {
                        copyFile_Java7(path, imagen_BD);
                    } catch (IOException ex) {
                        Logger.getLogger(personas.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Aún no ha ingresado un número de identidad.");
            }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().length()>0)
        {
            int es_vital=0, es_activo=0;

            if (jCheckBox1.isSelected())
            {
                es_vital=1;
            }
            else
            {
                es_vital=0;
            }

            if (jCheckBox2.isSelected())
            {
                es_activo=1;
            }
            else
            {
                es_activo=0;
            }

                String fecha=new SimpleDateFormat("yyyy-MM-dd").format(jCalendar1.getDate());
                basededatos bd=new basededatos();
                Statement stmt=null;
                ResultSet rs=null;
                bd.conexion();


                try
                {

                    CallableStatement call=bd.con.prepareCall("{CALL insertar_personas(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                    call.setString(1, jTextField1.getText());
                    call.setString(2, jTextField2.getText());
                    call.setString(3, jTextField3.getText());
                    call.setString(4,  fecha);
                    call.setInt(5, es_vital);
                    call.setInt(6, es_activo);
                    call.setInt(7, jComboBox2.getSelectedIndex()+1);
                    call.setInt(8, id_lugares());
                    call.setString(9, jTextField4.getText());
                    call.setInt(10, jComboBox1.getSelectedIndex());
                    call.setString(11, jTextField5.getText());
                    call.setString(12, jTextField6.getText());
                    call.setString(13, imagen_BD);
                    call.execute();
                    JOptionPane.showMessageDialog(this, "Registro insertado con éxito");
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Debe especificar un número de identidad para poder continuar.");
        }
       
       /* personas_BDIUDS insertar= new personas_BDIUDS();
        insertar.insert(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(),
            (Date)jCalendar1.getDate(), es_vital, es_activo, jComboBox2.getSelectedIndex()+1, id_lugares(), jTextField4.getText(),
            jComboBox1.getSelectedIndex(), jTextField5.getText(), jTextField6.getText(), imagen_BD);*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        Calendar fecha= new GregorianCalendar();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(2);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCalendar1.setDate(new java.util.Date());
        jButton2.setIcon(null);
        jButton2.setText("Elija una fotografía...");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().length()>0)
        {
            try
            {
                basededatos bd= new basededatos();
                bd.conexion();
                PreparedStatement st= bd.con.prepareStatement("UPDATE temporales SET Valor_temporal=? WHERE Id_Temporales=1");
                st.setString(1, jTextField1.getText());
                st.executeUpdate();
                
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage()); 
            }
            
           laicos lc= new laicos();
           lc.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Epecifique un número de identidad para continuar.");
        }
               
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c< '0' || c > '9') && (c<'-' || c>'-')) evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        
        char val = evt.getKeyChar();
        
        if( (val< 'a' || val > 'z') && (val< 'A' || val > 'Z') && (val< ' ' || val > ' ') ) evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea guardar cambios?", "ATENCIÓN", dialogButton);
        if(dialogResult == 0) 
        {
                try
                {
                    FicheroXML xml= new FicheroXML("src/parroquia_cristo_resucitado/xml/personas.xml");
                    xml.crearFicheroXML("PERSONA");
                    ArrayList<String> atributos = new ArrayList<>(), valoresatributos = new ArrayList<>();
                    
                    String vitalicio="", activus="";
                    
                    if(jCheckBox1.isSelected())
                    {
                        vitalicio="1";
                    }
                    else
                    {
                        vitalicio="0";
                    }
                    
                    if(jCheckBox2.isSelected())
                    {
                        activus="1";
                    }
                    else
                    {
                        activus="0";
                    }
                    
                    
                    String fecha=new SimpleDateFormat("yyyy-MM-dd").format(jCalendar1.getDate());
                    
                    atributos.add("personas");
                    valoresatributos.add(jTextField1.getText());        
                    Element item=xml.crearNodoItem("Persona", atributos, valoresatributos);
                    xml.agregarNodo(item, "ID", jTextField1.getText(), null, null);                            
                    xml.agregarNodo(item, "NOM", jTextField2.getText(), null, null);
                    xml.agregarNodo(item, "APE", jTextField3.getText(), null, null);                            
                    xml.agregarNodo(item, "EMAIL", jTextField4.getText(), null, null);
                    xml.agregarNodo(item, "PHONE", jTextField5.getText(), null, null);                            
                    xml.agregarNodo(item, "ADDRESS", jTextField6.getText(), null, null);
                    xml.agregarNodo(item, "SEXO", jComboBox1.getSelectedItem().toString(), null, null);                            
                    xml.agregarNodo(item, "PARROQUIA", jComboBox2.getSelectedItem().toString(), null, null);
                    xml.agregarNodo(item, "DEPTO", jComboBox3.getSelectedItem().toString(), null, null);                            
                    xml.agregarNodo(item, "MUNI", jComboBox4.getSelectedItem().toString(), null, null);
                    xml.agregarNodo(item, "VITAL", vitalicio, null, null);
                    xml.agregarNodo(item, "ACTIVO", activus, null, null);
                    xml.agregarNodo(item, "FECHA", jCalendar1.getDate().toString(), null, null);                            
                    xml.agregarNodo(item, "IMAGEN", imagen_BD, null, null);
                    xml.agregarItemARaiz(item);
   
                    xml.generarFicheroXML();
                    
                } 
                catch (ParserConfigurationException ex) 
                {
                    Logger.getLogger(personas.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (TransformerException ex) 
                {
                    Logger.getLogger(personas.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } 
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea recuperar la información editada anteriormente", "ATENCIÓN", dialogButton);
        if(dialogResult == 0) 
        {
            
            leerConfiguracion();
        }     
    }//GEN-LAST:event_formWindowOpened

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
                
        char val = evt.getKeyChar();
        
        if( (val< 'a' || val > 'z') && (val< 'A' || val > 'Z') && (val< ' ' || val > ' ') ) evt.consume();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c< '0' || c > '9') && (c<'-' || c>'-')) evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped
    public void leerConfiguracion(){
        try
        {
            File fXmlFile = new File("src/parroquia_cristo_resucitado/xml/personas.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Persona");


            for (int temp = 0; temp < nList.getLength(); temp++) 
            {

            Node nNode = nList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {

                    Element eElement = (Element) nNode;
                    this.jTextField1.setText( eElement.getElementsByTagName("ID").item(0).getTextContent());
                    this.jTextField2.setText( eElement.getElementsByTagName("NOM").item(0).getTextContent());
                    this.jTextField3.setText( eElement.getElementsByTagName("APE").item(0).getTextContent());
                    this.jTextField4.setText( eElement.getElementsByTagName("EMAIL").item(0).getTextContent());
                    this.jTextField5.setText( eElement.getElementsByTagName("PHONE").item(0).getTextContent());
                    this.jTextField6.setText( eElement.getElementsByTagName("ADDRESS").item(0).getTextContent());
                    this.jComboBox1.setSelectedItem(eElement.getElementsByTagName("SEXO").item(0).getTextContent());
                    this.jComboBox2.setSelectedItem(eElement.getElementsByTagName("PARROQUIA").item(0).getTextContent());
                    this.jComboBox3.setSelectedItem(eElement.getElementsByTagName("DEPTO").item(0).getTextContent());
                    this.jComboBox4.setSelectedItem(eElement.getElementsByTagName("MUNI").item(0).getTextContent());
                    int v=Integer.parseInt(eElement.getElementsByTagName("VITAL").item(0).getTextContent());
                    int a=Integer.parseInt(eElement.getElementsByTagName("ACTIVO").item(0).getTextContent());
                    //jCheckBox1.setText(a);
                    //jCheckBox2.setText(v);
                    if(v==1)
                    {
                        jCheckBox1.setSelected(true);
                    }
                    else
                    {
                        jCheckBox1.setSelected(false);                 
                    }

                    if(a==1)
                    {
                        jCheckBox2.setSelected(true);
                    }
                    else
                    {
                        jCheckBox2.setSelected(false);                 
                    }
                     

                    String path=" ";
                    
                    try
                    {
                        path=eElement.getElementsByTagName("IMAGEN").item(0).getTextContent();
                        ImageIcon perfil= new ImageIcon(path);
                        jButton2.setIcon(perfil);
                        int ancho= jButton2.getWidth();
                        int alto= jButton2.getHeight();
                        ImageIcon iconoEscalado= new ImageIcon(perfil.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
                        jButton2.setIcon(iconoEscalado);
                        jButton2.setText(path);
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(this, path);
                    }
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat sdf= new SimpleDateFormat();
                    cal.setTime(sdf.parse(eElement.getElementsByTagName("FECHA").item(0).getTextContent()));
                    jLabel9.setText(eElement.getElementsByTagName("FECHA").item(0).getTextContent());
                    this.jCalendar1.setDate(cal.getTime());
                }
            }
    } catch (Exception e) {
    e.printStackTrace();
    }
  }

    public int id_lugares()
    {                     
        int valor=0;
        Object muni= jComboBox4.getSelectedItem();
        Object depto=jComboBox3.getSelectedItem();
        String mun=String.valueOf(muni);
        String dep=String.valueOf(depto);
        //jLabel13.setText(dep);
        try 
        {
            basededatos bd=new basededatos();
            Statement stmt=null;
            ResultSet rs=null;
            bd.conexion();

            CallableStatement call=bd.con.prepareCall("{CALL lugar_id(?, ?)}");
            call.setString(1,dep);
            call.setString(2,mun);
            call.execute();
            rs = call.getResultSet();
            while(rs.next())
            {
               valor=rs.getInt(1);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return valor;
        
               
    }
    
    public static void copyFile_Java7(String origen, String destino) throws IOException {
        Path FROM = Paths.get(origen);
        Path TO = Paths.get(destino);
        //sobreescribir el fichero de destino, si existe, y copiar
        // los atributos, incluyendo los permisos rwx
        CopyOption[] options = new CopyOption[]{
          StandardCopyOption.REPLACE_EXISTING,
          StandardCopyOption.COPY_ATTRIBUTES
        }; 
        Files.copy(FROM, TO, options);
    }
 
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
            java.util.logging.Logger.getLogger(personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personas().setVisible(true);
            }
        });
    }
    
    public void busquedaPersonas(String identidad)
    {
            basededatos bd=new basededatos();
            personas per= new personas();
            Statement stmt=null;
            ResultSet rs=null;
            bd.conexion();
        try 
        {
            CallableStatement call=bd.con.prepareCall("{CALL busqueda_identidad(?)}");
            call.setString(1, identidad);
            /*call.registerOutParameter(1, java.sql.Types.VARCHAR);*/
            call.execute();
            rs = call.getResultSet();
            while(rs.next())
            {
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(9));
                jTextField5.setText(rs.getString(11));
                jTextField6.setText(rs.getString(12));
                
                if(rs.getInt(5)==1)
                {
                    jCheckBox1.setSelected(true);
                }
                
                if(rs.getInt(6)==1)
                {
                    jCheckBox2.setSelected(true);
                }
                
                if(rs.getInt(10)==0)
                {
                    jComboBox1.setSelectedIndex(0);
                }
                else if(rs.getInt(10)==1)
                {
                    jComboBox1.setSelectedIndex(1);
                }
                else
                {
                   jComboBox1.setSelectedIndex(2);
                }
                
                jComboBox2.setSelectedIndex(idParroquia(rs.getString(7)));
                jCalendar1.setDate(rs.getDate(4));
                jComboBox3.setSelectedItem(rs.getString(14));
                jComboBox4.setSelectedItem(rs.getString(13  ));
                

                
                try
                {
                        ImageIcon perfil= new ImageIcon(rs.getString(15));
                        jButton2.setIcon(perfil);
                        int ancho= jButton2.getWidth();
                        int alto= jButton2.getHeight();
                        ImageIcon iconoEscalado= new ImageIcon(perfil.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
                        jButton2.setIcon(iconoEscalado);
                }
                catch(Exception ex)
                {
                    System.out.print("No se encontró el archivo: "+ex.getMessage());
                }
            }
            
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
    public int idParroquia(String parroquia)
    {
        int valor=0;
        try
        {
            basededatos bd= new basededatos();
            bd.conexion();
            Statement st= bd.con.createStatement();
            rs=st.executeQuery("select id_parroquia from parroquia where nombre_parroquia='"+parroquia+"'");
            
            while(rs.next())
            {
                valor=rs.getInt(1);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
        return valor-1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
