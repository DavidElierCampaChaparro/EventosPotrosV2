package gui;

import crud.Factory;
import crud.IDAOPersonas;
import objetosNegocio.Persona;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/ 
public class FrmInicio extends javax.swing.JFrame {
    private IDAOPersonas personas;
    private Persona persona;
    
    public FrmInicio() {
        initComponents();
        personas = Factory.getPersonas();
        
        anadirPlaceHolderStyle(idTextField); // para hacer que se vea más presentable el text field del id
        anadirPlaceHolderStyle(contrasenaPasswordField); // para hacer más presentable el textfield de la contraseña
    }
    
    /**
    * Metodo para el campo de texto de la contraseña y el ID.
    * Es utilizado para que cuando no haya ningun texto puesto se establezca de manera automática
    * @param textField 
    */ 
    public void anadirPlaceHolderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    /**
    * Metodo para el campo de texto de la contraseña y el ID.
    * Es utilizado para que cuando no haya ningun texto puesto se establezca de manera automática
    * @param textField 
    */ 
    public void removerPlaceHolderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idTextField = new javax.swing.JTextField();
        entrarButton = new javax.swing.JButton();
        contrasenaPasswordField = new javax.swing.JPasswordField();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(936, 645));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(936, 645));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(936, 645));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTextField.setText("ID");
        idTextField.setToolTipText("ID de Usuario de CIA Itson");
        idTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTextFieldFocusLost(evt);
            }
        });
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 440, -1));
        idTextField.getAccessibleContext().setAccessibleDescription("");

        entrarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 200, 40));

        contrasenaPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contrasenaPasswordField.setText("Contraseña");
        contrasenaPasswordField.setEchoChar('\u0000');
        contrasenaPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contrasenaPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contrasenaPasswordFieldFocusLost(evt);
            }
        });
        contrasenaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contrasenaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 440, -1));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoInicio.png"))); // NOI18N
        fondoLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fondoLabelFocusGained(evt);
            }
        });
        jPanel1.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    /**
    * Consulta una persona con los datos del idTextField y contrasenaTextField.
    * Después verifica el atributo de la persona es admin para después crear con el
    * frame correspondiente
    */ 
    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        persona = personas.consultarPersonaLogin(idTextField.getText(), contrasenaPasswordField.getText());
        if (persona == null){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        } else if(persona.isEsAdmin()){
            FrmVistaEventosAdmin fvea = new FrmVistaEventosAdmin(persona.getID());
            fvea.setVisible(true);
            this.dispose();
        } else if (!persona.isEsAdmin()){
            FrmVistaEventosUsuario fveu = new FrmVistaEventosUsuario(persona.getID());
            fveu.setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_entrarButtonActionPerformed

    /**
    * Es para hacer más presentable el textfield del id
    */ 
    private void idTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFieldFocusGained
        if(idTextField.getText().equals("ID")){
            idTextField.setText(null);
            idTextField.requestFocus();
            removerPlaceHolderStyle(idTextField);
        }
    }//GEN-LAST:event_idTextFieldFocusGained

    /**
    * Es para hacer más presentable el textfield de la contraseña
    */ 
    private void contrasenaPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contrasenaPasswordFieldFocusGained
        if(contrasenaPasswordField.getText().equals("Contraseña")){
            contrasenaPasswordField.setText(null);
            contrasenaPasswordField.requestFocus();
            contrasenaPasswordField.setEchoChar('*');
            removerPlaceHolderStyle(contrasenaPasswordField);
        }
    }//GEN-LAST:event_contrasenaPasswordFieldFocusGained

    /**
    * Es para hacer más presentable el textfield del id
    */ 
    private void idTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFieldFocusLost
        if(idTextField.getText().length() == 0){
            anadirPlaceHolderStyle(idTextField);
            idTextField.setText("ID");
        }
    }//GEN-LAST:event_idTextFieldFocusLost

    /**
    * Es para hacer más presentable el textfield de la contraseña
    */ 
    private void contrasenaPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contrasenaPasswordFieldFocusLost
        if(contrasenaPasswordField.getText().length() == 0){
            anadirPlaceHolderStyle(contrasenaPasswordField);
            contrasenaPasswordField.setText("Contraseña");
            contrasenaPasswordField.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_contrasenaPasswordFieldFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void fondoLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fondoLabelFocusGained
        this.requestFocusInWindow();
    }//GEN-LAST:event_fondoLabelFocusGained

    private void contrasenaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaPasswordFieldActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenaPasswordField;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
