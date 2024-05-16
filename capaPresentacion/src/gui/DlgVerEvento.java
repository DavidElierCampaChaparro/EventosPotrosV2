package gui;

 // @author David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877
import crud.Factory;
import crud.IDAOEventos;
import objetosNegocio.Evento;


/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/
public class DlgVerEvento extends javax.swing.JDialog {
    private IDAOEventos eventos;
    private Evento evento;
    
    /**
     * Recibe los datos visibles del evento clickeado: Nombre, Fecha, Hora, Lugar
     * para después consultar todos sus demás datos
     * @param datos Los datos visibles del evento que se reciben 
     */
    public DlgVerEvento(Evento datos) {
        initComponents();
        eventos = Factory.getEventos();
        this.evento = eventos.consultarEvento(datos); // El evento es = la consulta del evento con sus 4 datos:  Nombre,Fecha,Hora,Lugar
        inicializarTextFields();                            
    }

    /**
     * Método para establecer los campos de texto con
     * los atributos del evento
     */
    public void inicializarTextFields(){
        eventoTextField.setText(this.evento.getNombre());
        fechaTextField.setText(this.evento.getFecha());
        horaTextField.setText(this.evento.getHora());
        lugarTextField.setText(this.evento.getLugar());
        descripcionTextArea.setText(this.evento.getDescripcion());
        horasCulturalesTextField.setText(Integer.toString(this.evento.getHorasCultura()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eventoLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        lugarLabel = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        horasCulturalesLabel = new javax.swing.JLabel();
        lugarTextField = new javax.swing.JTextField();
        eventoTextField = new javax.swing.JTextField();
        fechaTextField = new javax.swing.JTextField();
        horaTextField = new javax.swing.JTextField();
        lugarTextField1 = new javax.swing.JTextField();
        horasCulturalesTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionTextArea = new javax.swing.JTextArea();
        aceptarBoton = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventoLabel.setBackground(new java.awt.Color(204, 255, 255));
        eventoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eventoLabel.setForeground(new java.awt.Color(204, 255, 255));
        eventoLabel.setText("Evento:");
        jPanel1.add(eventoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        descripcionLabel.setBackground(new java.awt.Color(204, 255, 255));
        descripcionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionLabel.setForeground(new java.awt.Color(204, 255, 255));
        descripcionLabel.setText("Descripción del evento:");
        jPanel1.add(descripcionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        lugarLabel.setBackground(new java.awt.Color(204, 255, 255));
        lugarLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lugarLabel.setForeground(new java.awt.Color(204, 255, 255));
        lugarLabel.setText("Lugar:");
        jPanel1.add(lugarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        horaLabel.setBackground(new java.awt.Color(204, 255, 255));
        horaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(204, 255, 255));
        horaLabel.setText("Hora");
        jPanel1.add(horaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        fechaLabel.setBackground(new java.awt.Color(204, 255, 255));
        fechaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(204, 255, 255));
        fechaLabel.setText("Fecha:");
        jPanel1.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        horasCulturalesLabel.setBackground(new java.awt.Color(204, 255, 255));
        horasCulturalesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        horasCulturalesLabel.setForeground(new java.awt.Color(204, 255, 255));
        horasCulturalesLabel.setText("Horas culturales:");
        jPanel1.add(horasCulturalesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        lugarTextField.setEditable(false);
        lugarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lugarTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 510, 30));

        eventoTextField.setEditable(false);
        eventoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(eventoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 510, 30));

        fechaTextField.setEditable(false);
        fechaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(fechaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 510, 30));

        horaTextField.setEditable(false);
        horaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(horaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 510, 30));

        lugarTextField1.setText("jTextField1");
        lugarTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(lugarTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 510, 30));

        horasCulturalesTextField.setEditable(false);
        jPanel1.add(horasCulturalesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 100, -1));

        descripcionTextArea.setEditable(false);
        descripcionTextArea.setColumns(20);
        descripcionTextArea.setRows(5);
        jScrollPane1.setViewportView(descripcionTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 510, 340));

        aceptarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aceptarBoton.setText("OK!");
        aceptarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 190, 80));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        jPanel1.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

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

    private void lugarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarTextFieldActionPerformed

    private void eventoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventoTextFieldActionPerformed

    private void fechaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextFieldActionPerformed

    private void horaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaTextFieldActionPerformed

    private void lugarTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugarTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarTextField1ActionPerformed

    private void aceptarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBotonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_aceptarBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBoton;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JTextArea descripcionTextArea;
    private javax.swing.JLabel eventoLabel;
    private javax.swing.JTextField eventoTextField;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JTextField fechaTextField;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JTextField horaTextField;
    private javax.swing.JLabel horasCulturalesLabel;
    private javax.swing.JTextField horasCulturalesTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lugarLabel;
    private javax.swing.JTextField lugarTextField;
    private javax.swing.JTextField lugarTextField1;
    // End of variables declaration//GEN-END:variables
}
