/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.manejocadenas;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio3
     */
    public Ejercicio3() {
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

        lblTitulol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCadena = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulol.setText("MANEJO DE CADENAS ");

        jLabel2.setText("Ingrese una cadena:");

        txtCadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadenaMouseClicked(evt);
            }
        });

        txtAResultado.setColumns(20);
        txtAResultado.setRows(5);
        jScrollPane1.setViewportView(txtAResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblTitulol, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulol)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadenaMouseClicked
        // TODO add your handling code here:
        String cadena = txtCadena.getText();
        String la = "", le = "", li = "", lo = "", lu = "";
        String espacioBlanco = "El número de espacios en blanco en la cadena son: "+"\n"+ this.espacionBlanco(cadena);
        int[] numeroVocales = this.vocales(cadena);
        for (int i = 0; i < numeroVocales.length; i++) {
            la = "\nEl número de vocales a en la cadena es:" +"\n"+numeroVocales[0];
            le = "\nEl número de vocales e en la cadena es:" +"\n" +numeroVocales[1];
            li = "\nEl número de vocales i en la cadena es:" +"\n"+ numeroVocales[2];
            lo = "\nEl número de vocales o en la cadena es:" +"\n"+ numeroVocales[3];
            lu = "\nEl número de vocales u en la cadena es:" +"\n"+ numeroVocales[4];
        }
        String cadenaReemplazada = "\nLa cadena después de reemplazar a por @ y o por $ es:" +"\n"+ this.reemplazoVocales(cadena);
        String  cadenaVolteada ="\nLa cadena volteada es:"+"\n"+this.voltearCadena(cadena);
        //+ "\n" + la + "\n" + le + "\n" + li + "\n" + lo + "\n" + lu + "\n" + cadenaReemplazada
        txtAResultado.setText(espacioBlanco + la + le +li+lo+lu+cadenaReemplazada+cadenaVolteada );
    }//GEN-LAST:event_txtCadenaMouseClicked
    public int espacionBlanco(String cadena) {
        int contBlanco = 0;
        if (!cadena.isEmpty()) {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    contBlanco++;
                }
            }
        }
        return contBlanco;
    }

    public int[] vocales(String cadena) {
        int conta = 0;
        int conte = 0;
        int conti = 0;
        int conto = 0;
        int contu = 0;
        int[] vocales = new int[5];
        if (!cadena.isEmpty()) {
            for (int i = 0; i < cadena.length(); i++) {
                switch (cadena.charAt(i)) {
                    case 'a' -> {
                        conta++;
                        vocales[0] = conta;
                    }
                    case 'e' -> {
                        conte++;
                        vocales[1] = conte;
                    }
                    case 'i' -> {
                        conti++;
                        vocales[2] = conti;
                    }
                    case 'o' -> {
                        conto++;
                        vocales[3] = conto;
                    }
                    case 'u' -> {
                        contu++;
                        vocales[4] = contu;
                    }
                    default -> {
                    }
                }
            }
        }

        return vocales;
    }

    public String reemplazoVocales(String cadena) {
        if (!cadena.isEmpty()) {
           String cadenaR=cadena.replace('a', '@');
           cadena= cadenaR.replace('o', '$');
        }
        return cadena;
    }

    public String voltearCadena(String cadena) {
        char[] cadenaVolteada = new char[cadena.length()];
        String cadenaVolteada1 = "";
        int j = cadena.length() - 1;
        for (int i = 0; i < cadena.length() - 1; i++) {

            cadenaVolteada1 = cadena.charAt(i)+cadenaVolteada1;
            j--;
            System.out.println("------"+cadenaVolteada1);
        }

        return cadenaVolteada1;
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
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulol;
    private javax.swing.JTextArea txtAResultado;
    private javax.swing.JTextField txtCadena;
    // End of variables declaration//GEN-END:variables
}
