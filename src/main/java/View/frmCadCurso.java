package View;

import Control.CursosControl;
import Model.Curso;
import javax.swing.JOptionPane;

public class frmCadCurso extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAula
     */
    
    
    public frmCadCurso() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chSeg = new javax.swing.JCheckBox();
        chTer = new javax.swing.JCheckBox();
        chQua = new javax.swing.JCheckBox();
        chQui = new javax.swing.JCheckBox();
        chSex = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        txtCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbInicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbFim = new javax.swing.JComboBox<>();
        chSab = new javax.swing.JCheckBox();
        chDom = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Curso");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE CURSO");

        jLabel2.setText("Curso:");

        jLabel4.setText("Dias da semana:");

        chSeg.setText("Segunda-feira");

        chTer.setText("Terça-feira");

        chQua.setText("Quarta-feira");

        chQui.setText("Quinta-feira");

        chSex.setText("Sexta-feira");

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalvarMousePressed(evt);
            }
        });

        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        jLabel5.setText("Horários: Das");

        cbInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel6.setText("às");

        cbFim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" }));

        chSab.setText("Sábado");

        chDom.setText("Domingo");

        jButton1.setText("Lista de Cursos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chSex)
                            .addComponent(chSab)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chDom))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(chQua)
                                .addComponent(chTer)
                                .addComponent(chSeg)
                                .addComponent(chQui)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chTer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chQua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chQui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chSex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chSab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chDom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(326, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void btnSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMousePressed
        // TODO add your handling code here:         
         
        if(!txtCurso.getText().isEmpty() && (chSeg.isSelected() || chTer.isSelected()
           || chQua.isSelected() || chQui.isSelected() || chSex.isSelected() 
            || chSab.isSelected() || chDom.isSelected())){
            
           
            Curso c = new Curso();
            String dia;
            c.setCurso(txtCurso.getText());
            if(chSeg.isSelected()){
                dia = "Segunda-feira";
                c.addDias(dia);
            }
            
            if (chTer.isSelected()){
                dia = "Terça-feira";
                c.addDias(dia);
            }
            
            if (chQua.isSelected()){
                dia = "Quarta-feira";
                c.addDias(dia);
            }
            
            if (chQui.isSelected()){
                dia = "Quinta-feira";
                c.addDias(dia);
            } 
            
            if (chSex.isSelected()){
                dia = "Sexta-feira";
                c.addDias(dia);
            }
            
            if (chSab.isSelected()){
                dia = "Sábado";
                c.addDias(dia);
            } 
            if(chDom.isSelected()){
                dia = "Domingo";
                c.addDias(dia);
            }
            
            c.setInicio(Integer.parseInt(cbInicio.getSelectedItem().toString()));
            c.setFim(Integer.parseInt(cbFim.getSelectedItem().toString()));
            
            CursosControl cc = new CursosControl();
            cc.cadastrarCurso(c);
            
            JOptionPane.showMessageDialog(null, "Curso cadastrado!");
            
            
        } else{
            JOptionPane.showMessageDialog(null, "Informações faltando!");
        }
        
    }//GEN-LAST:event_btnSalvarMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        frmCursos cursos = new frmCursos();
        cursos.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbFim;
    private javax.swing.JComboBox<String> cbInicio;
    private javax.swing.JCheckBox chDom;
    private javax.swing.JCheckBox chQua;
    private javax.swing.JCheckBox chQui;
    private javax.swing.JCheckBox chSab;
    private javax.swing.JCheckBox chSeg;
    private javax.swing.JCheckBox chSex;
    private javax.swing.JCheckBox chTer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCurso;
    // End of variables declaration//GEN-END:variables
}