package gui;
 
/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/
public class DlgAcercaDe extends javax.swing.JDialog {

    public DlgAcercaDe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        labelMaestro = new javax.swing.JLabel();
        labelDavid = new javax.swing.JLabel();
        labelMax = new javax.swing.JLabel();
        labelSemestre = new javax.swing.JLabel();
        labelMateria = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label.setText("Programa desarrollado por los alumnos: ");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        labelMaestro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMaestro.setText("Maestro: Daniel Toledo Félix Campoa");
        jPanel1.add(labelMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        labelDavid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDavid.setText("David Elier Campa Chaparro 245178");
        jPanel1.add(labelDavid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        labelMax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMax.setText("Maximiliano Reyna Aguilar 244877");
        jPanel1.add(labelMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        labelSemestre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSemestre.setText("Semestre: Enero-Mayo 2024");
        jPanel1.add(labelSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        labelMateria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMateria.setText("Materia: Diseño de Software");
        jPanel1.add(labelMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        cerrarButton.setText("Cerrar");
        cerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 160, 90));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAcercaDe.png"))); // NOI18N
        jPanel1.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelDavid;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelMaestro;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelMax;
    private javax.swing.JLabel labelSemestre;
    // End of variables declaration//GEN-END:variables
}
