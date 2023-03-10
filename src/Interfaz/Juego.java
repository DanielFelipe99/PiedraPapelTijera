/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.awt.Dimension;
import java.util.Random;
import javax.swing.JList;
import javax.swing.JOptionPane;




/**
 *
 * @author danie
 */
public class Juego extends javax.swing.JFrame {
    VentanaPrincipal ventana = new VentanaPrincipal();
  
    /**
     * Creates new form Juego
     */
    
    String seleccion;
    String [] elementos = {"Piedra", "Papel", "Tijera"};
    JList<String> lista = new  JList<>(elementos);
    int puntos1;
    int puntos2;
    int contador1;
    int contador2;
    
    public Juego() {
        initComponents();
        this.setSize(new Dimension(700,600));
        this.setMinimumSize(new Dimension(500,510));
        this.setTitle("Juego");
        this.setLocationRelativeTo(null);
        
        
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
        lblPantalla = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblNombrePuntos = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblNombrePuntosJugador2 = new javax.swing.JLabel();
        lblPuntosJugador2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        listVariables = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lvlIntroduccion = new javax.swing.JLabel();
        btnJugarTurno = new javax.swing.JButton();
        lblSeleccion = new javax.swing.JLabel();
        lblSeleccionJugador2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTituloJugador2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPantalla.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/mastin-ingles (1).png"))); // NOI18N
        jPanel1.add(lblPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 90));

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/5a25afff45f3a85 (1).png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 340, 90, 40));

        lblNombrePuntos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel2.add(lblNombrePuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 20));
        jPanel2.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 80, 20));

        lblNombrePuntosJugador2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblNombrePuntosJugador2.setText("Puntos Jugador 2");
        jPanel2.add(lblNombrePuntosJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 20));
        jPanel2.add(lblPuntosJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listVariables.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        listVariables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piedra", "Papel", "Tijera" }));
        listVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listVariablesActionPerformed(evt);
            }
        });
        jPanel3.add(listVariables, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 50));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Elige una opcion: ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 20));

        lvlIntroduccion.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lvlIntroduccion.setText("Tendras 3 oportunidades para ganar ");
        jPanel3.add(lvlIntroduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, -1));

        btnJugarTurno.setBackground(new java.awt.Color(0, 0, 0));
        btnJugarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/90e273b8423147b (1).png"))); // NOI18N
        btnJugarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarTurnoActionPerformed(evt);
            }
        });
        jPanel3.add(btnJugarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 70));

        lblSeleccion.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jPanel3.add(lblSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 190, 30));

        lblSeleccionJugador2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jPanel3.add(lblSeleccionJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boxer (1).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, 120));

        lblTituloJugador2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTituloJugador2.setText("Jugador 2");
        jPanel3.add(lblTituloJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        new VentanaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void listVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listVariablesActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_listVariablesActionPerformed

    private void btnJugarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarTurnoActionPerformed
        // TODO add your handling code here:
        
        seleccion = listVariables.getSelectedItem().toString();
        Random random = new Random();
        int indice = random.nextInt(elementos.length);
        String seleccion2 = lista.getModel().getElementAt(indice);
        lblSeleccionJugador2.setText("El jugador 2 eligió: " + seleccion2); 
        System.out.println(seleccion2);
        lblSeleccion.setText("Tu elegiste: " + seleccion);
        
        
        if(seleccion == "Tijera" && seleccion2 == "Tijera"){
            puntos1 = 0;
            puntos2 = 0;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
            System.out.println("nadie gana: ");
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
         if(seleccion == "Papel" && seleccion2 == "Papel"){
            puntos1 = 0;
            puntos2 = 0;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
            System.out.println("nadie gana: ");
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(seleccion == "Piedra" && seleccion2 == "Piedra"){
            puntos1 = 0;
            puntos2 = 0;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
            System.out.println("nadie gana: ");
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        //--------------------------------------------------
        if(seleccion == "Tijera" && seleccion2 == "Piedra"){
            puntos1 = 0;
            puntos2 = 1;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
          
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(seleccion == "Tijera" && seleccion2 == "Papel"){
            puntos1 = 1;
            puntos2 = 0;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
            
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(seleccion == "Piedra" && seleccion2 == "Tijera"){
            puntos1 = 1;
            puntos2 = 0;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
           
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(seleccion == "Piedra" && seleccion2 == "Papel"){
            puntos1 = 0;
            puntos2 = 1;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
        
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(seleccion == "Papel" && seleccion2 == "Tijera"){
            puntos1 = 0;
            puntos2 = 1;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
           
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(seleccion == "Papel" && seleccion2 == "Piedra"){
            puntos1 = 1;
            puntos2 = 0;
            contador1 = contador1 + puntos1;
            contador2 = contador2 + puntos2;
            
            System.out.println("Jugador 1: " + contador1);
            System.out.println("Jugador 2: " + contador2);
        }
        if(contador1 == 3){
            JOptionPane.showMessageDialog(null, "¡El jugador 1 " + ventana.nombre + " ha ganado!");
            dispose();
            new VentanaPrincipal().setVisible(true);
      
        }else{
            if(contador2 == 3){
            JOptionPane.showMessageDialog(null, "¡El jugador 2 ha ganado"  );
            dispose();
            new VentanaPrincipal().setVisible(true);
            }
        }
       
        
        lblPuntos.setText(contador1 + "");
        lblPuntosJugador2.setText(contador2 + "");
        
        
    }//GEN-LAST:event_btnJugarTurnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarTurno;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblNombrePuntos;
    private javax.swing.JLabel lblNombrePuntosJugador2;
    public static javax.swing.JLabel lblPantalla;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblPuntosJugador2;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lblSeleccionJugador2;
    private javax.swing.JLabel lblTituloJugador2;
    private javax.swing.JComboBox<String> listVariables;
    private javax.swing.JLabel lvlIntroduccion;
    // End of variables declaration//GEN-END:variables
}
