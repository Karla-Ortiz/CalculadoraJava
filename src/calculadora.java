
import com.sun.glass.events.KeyEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KORTIZ
 */
public class calculadora extends javax.swing.JFrame {

    /**
     * Creates new form calculadora
     */
    public calculadora() {
        initComponents();
    }

    private double num1 = 0.0, num2 = 0.0, total = 0.0;
    private String operador = "+", datos = "";
    private boolean error = false;

    public void setNum1() {
        if (txtOperaciones.getText().equals("No se puede dividir entre 0")) {
            txtOperaciones.setText("");
        }
        double numIn = 0.0;
        switch (operador) {
            case "/":
                numIn = Double.parseDouble(txtOperaciones.getText().isEmpty() ? "0.0" : txtOperaciones.getText());
                if (num1 == 0.0 && (numIn == 0.0 || numIn == 0)) {
                    num1 = 0.0;
                } else if (numIn == 0.0 || numIn == 0) {
                    error = true;
                } else {
                    num1 = CalculadoraCtrl.operar(num1, numIn, operador);
                }
                break;
            default:
                numIn = Double.parseDouble(txtOperaciones.getText().isEmpty() ? "0.0" : txtOperaciones.getText());
                num1 = num1 == 0.0 ? numIn : CalculadoraCtrl.operar(num1, numIn, operador);
                break;
        }
    }

    public void setOperacion(int operacion) {
        switch (operacion) {
            case 1:
                num2 = Double.parseDouble(txtOperaciones.getText().isEmpty() ? "0.0" : txtOperaciones.getText());
                total = CalculadoraCtrl.operar(num1, num2, operador);
                break;
            case 2:
                num2 = Double.parseDouble(txtOperaciones.getText().isEmpty() ? "0.0" : txtOperaciones.getText());
                total = CalculadoraCtrl.operar(num1, num2, operador);
                break;
            case 3:
                num2 = Double.parseDouble(txtOperaciones.getText().isEmpty() ? "0.0" : txtOperaciones.getText());
                total = CalculadoraCtrl.operar(num1, num2, operador);
                break;
            case 4:
                num2 = Double.parseDouble(txtOperaciones.getText().isEmpty() ? "0.0" : txtOperaciones.getText());
                if (num2 != 0.0 && num2 != 0) {
                    total = CalculadoraCtrl.operar(num1, num2, operador);
                }
                break;
        }
        num1 = 0.0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt5 = new javax.swing.JButton();
        txtOperaciones = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnminus = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnx = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        lbDatos = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        txt5.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        txtOperaciones.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtOperaciones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperacionesActionPerformed(evt);
            }
        });
        txtOperaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacionesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOperacionesKeyReleased(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnplus.setText("+");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnminus.setText("-");
        btnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnx.setText("*");
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        lbDatos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDatos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem3.setText("Diagrama de procesos (BPNM/Bizagi)");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Caso de uso");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Presentación ejecutiva");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Manual de usuario");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Manual de programador");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOperaciones)
                    .addComponent(lbDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        // TODO add your handling code here:
        setNum1();
        operador = "+";
        if (error) {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("No se puede dividir entre cero");
            txtOperaciones.selectAll();
            error = false;
        } else {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("");
        }
    }//GEN-LAST:event_btnplusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CalculadoraCtrl.reset();
        num1 = 0.0;
        num2 = 0.0;
        operador = "+";
        txtOperaciones.setText("");
        lbDatos.setText("");
        txtOperaciones.requestFocus();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "1";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn1ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here    
    }//GEN-LAST:event_formKeyPressed

    private void txtOperacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionesKeyPressed
        // TODO add your handling code here:  
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ADD:
                setNum1();
                operador = "+";
                break;
            case KeyEvent.VK_SUBTRACT:
                setNum1();
                operador = "-";
                break;
            case KeyEvent.VK_MULTIPLY:
                setNum1();
                operador = "*";
                break;
            case KeyEvent.VK_DIVIDE:
                setNum1();
                operador = "/";
                break;
            case KeyEvent.VK_ENTER:
                switch (operador) {
                    case "+":
                        setOperacion(1);
                        break;
                    case "-":
                        setOperacion(2);
                        break;
                    case "*":
                        setOperacion(3);
                        break;
                    case "/":
                        setOperacion(4);
                        if (num2 == 0.0) {
                            txtOperaciones.setText("No se puede dividir entre cero");
                            txtOperaciones.selectAll();
                            error = false;
                        }
                        break;
                }
                break;
        }
    }//GEN-LAST:event_txtOperacionesKeyPressed

    private void txtOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperacionesActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void txtOperacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionesKeyReleased
        // TODO add your handling code here:
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ADD:
                if (error) {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("No se puede dividir entre cero");
                    txtOperaciones.selectAll();
                    error = false;
                } else {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("");
                }
                break;
            case KeyEvent.VK_SUBTRACT:
                if (error) {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("No se puede dividir entre cero");
                    txtOperaciones.selectAll();
                    error = false;
                } else {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("");
                }
                break;
            case KeyEvent.VK_MULTIPLY:
                if (error) {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("No se puede dividir entre cero");
                    txtOperaciones.selectAll();
                    error = false;
                } else {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("");
                }
                break;
            case KeyEvent.VK_DIVIDE:
                if (error) {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("No se puede dividir entre cero");
                    txtOperaciones.selectAll();
                    error = false;
                } else {
                    lbDatos.setText(String.valueOf(num1) + operador);
                    txtOperaciones.setText("");
                }
                break;
            case KeyEvent.VK_ENTER:
                if (error) {
                    lbDatos.setText("0.0");
                    txtOperaciones.setText("No se puede dividir entre cero");
                    txtOperaciones.selectAll();
                    error = false;
                } else {
                    lbDatos.setText(String.valueOf(total));
                    txtOperaciones.setText(String.valueOf(total));
                }
                operador = "+";
                break;
        }
    }//GEN-LAST:event_txtOperacionesKeyReleased

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "2";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "3";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "4";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "5";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "6";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "7";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "8";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "9";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos += "0";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        // TODO add your handling code here:
        datos = txtOperaciones.getText().equals("No se puede dividir entre cero") ? "" : txtOperaciones.getText();
        datos = datos.isEmpty() ? "0." : datos + ".";
        txtOperaciones.setText(datos);
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusActionPerformed
        // TODO add your handling code here:
        setNum1();
        operador = "-";
        if (error) {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("No se puede dividir entre cero");
            txtOperaciones.selectAll();
            error = false;
        } else {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("");
        }
    }//GEN-LAST:event_btnminusActionPerformed

    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        // TODO add your handling code here:
        setNum1();
        operador = "*";
        if (error) {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("No se puede dividir entre cero");
            txtOperaciones.selectAll();
            error = false;
        } else {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("");
        }
    }//GEN-LAST:event_btnxActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        // TODO add your handling code here:
        setNum1();
        operador = "/";
        if (error) {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("No se puede dividir entre cero");
            txtOperaciones.selectAll();
            error = false;
        } else {
            lbDatos.setText(String.valueOf(num1) + operador);
            txtOperaciones.setText("");
        }
    }//GEN-LAST:event_btndivActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        // TODO add your handling code here:
        switch (operador) {
            case "+":
                setOperacion(1);
                break;
            case "-":
                setOperacion(2);
                break;
            case "*":
                setOperacion(3);
                break;
            case "/":
                setOperacion(4);
                if (num2 == 0.0) {
                    txtOperaciones.setText("No se puede dividir entre cero");
                    txtOperaciones.selectAll();
                    error = true;
                }
                break;
        }
        if (error) {
            lbDatos.setText(String.valueOf(total));
            operador = "+";
        } else {
            lbDatos.setText(String.valueOf(total));
            txtOperaciones.setText(String.valueOf(total));
            operador = "+";
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        historial h = new historial();
        h.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnminus;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnx;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel lbDatos;
    private javax.swing.JButton txt5;
    private javax.swing.JTextField txtOperaciones;
    // End of variables declaration//GEN-END:variables

}
