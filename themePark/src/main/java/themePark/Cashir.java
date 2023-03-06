/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package themePark;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jawaher
 */
public class Cashir extends javax.swing.JFrame {

    /**
     * Creates new form Cashir
     */
    public Cashir() {
        initComponents();
        selectPay();
        selectCard();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pay_meth = new javax.swing.JTextField();
        AddPay = new javax.swing.JButton();
        EditPay = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PayTable = new javax.swing.JTable();
        pay_date = new javax.swing.JTextField();
        res_num = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        card_sn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        res_num1 = new javax.swing.JTextField();
        ex_date = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        points = new javax.swing.JTextField();
        DeletePay = new javax.swing.JButton();
        DeleteCard = new javax.swing.JButton();
        AddCard = new javax.swing.JButton();
        EditCard = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CardTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1071, 495));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Georgia Pro Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("Cashier");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 204));
        jLabel8.setText("Receipt number");

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 204));
        jLabel11.setText("Total price");

        pay_meth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pay_meth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_methActionPerformed(evt);
            }
        });

        AddPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddPay.setText("Add");
        AddPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPayMouseClicked(evt);
            }
        });
        AddPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPayActionPerformed(evt);
            }
        });

        EditPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditPay.setText("Edit");
        EditPay.setActionCommand("Register");
        EditPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditPayMouseClicked(evt);
            }
        });
        EditPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPayActionPerformed(evt);
            }
        });

        PayTable.setFont(new java.awt.Font("STKaiti", 0, 11)); // NOI18N
        PayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Receipt_num", "Total_price", "Payment_date", "Payment_method"
            }
        ));
        PayTable.setGridColor(new java.awt.Color(153, 153, 153));
        PayTable.setRowHeight(15);
        PayTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane2.setViewportView(PayTable);
        if (PayTable.getColumnModel().getColumnCount() > 0) {
            PayTable.getColumnModel().getColumn(3).setResizable(false);
        }

        pay_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pay_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_dateActionPerformed(evt);
            }
        });

        res_num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        res_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res_numActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 204));
        jLabel12.setText("Payment method");

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 204));
        jLabel13.setText("Payment date");

        jButton1.setText("Go back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        card_sn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        card_sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_snActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setText("card sn");

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 204));
        jLabel14.setText("Recipit number");

        res_num1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        res_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res_num1ActionPerformed(evt);
            }
        });

        ex_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ex_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_dateActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 204));
        jLabel15.setText("Expiry date");

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Georgia Pro Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 204));
        jLabel16.setText("Points");

        points.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        points.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsActionPerformed(evt);
            }
        });

        DeletePay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeletePay.setText("Delete");
        DeletePay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletePayMouseClicked(evt);
            }
        });
        DeletePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePayActionPerformed(evt);
            }
        });

        DeleteCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeleteCard.setText("Delete");
        DeleteCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCardMouseClicked(evt);
            }
        });
        DeleteCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCardActionPerformed(evt);
            }
        });

        AddCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddCard.setText("Add");
        AddCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCardMouseClicked(evt);
            }
        });
        AddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCardActionPerformed(evt);
            }
        });

        EditCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditCard.setText("Edit");
        EditCard.setActionCommand("Register");
        EditCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditCardMouseClicked(evt);
            }
        });
        EditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCardActionPerformed(evt);
            }
        });

        CardTable.setFont(new java.awt.Font("STKaiti", 0, 11)); // NOI18N
        CardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Card_sn", "Pay_Receipt_num", "Expiry_date", "Points"
            }
        ));
        CardTable.setGridColor(new java.awt.Color(153, 153, 153));
        CardTable.setRowHeight(15);
        CardTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane3.setViewportView(CardTable);

        jButton2.setText("Visitors list");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addGap(276, 276, 276)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddCard, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteCard, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pay_meth, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card_sn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(res_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ex_date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34)
                                .addComponent(res_num, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletePay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(res_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pay_meth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DeletePay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addComponent(EditPay)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(card_sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(res_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(ex_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(DeleteCard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddCard))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditCard)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void pay_methActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_methActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_methActionPerformed
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    
    private void AddPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPayMouseClicked

          if(res_num.getText().isEmpty()|| price.getText().isEmpty() || pay_date.getText().isEmpty()||pay_meth.getText().isEmpty()
           ){
            JOptionPane.showMessageDialog(this, "missing info for Payment");}
             else{
                try{
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
                    PreparedStatement add=con.prepareStatement("insert into theme_park.payment values(?,?,?,?)");
                    add.setInt(1,Integer.valueOf(res_num.getText()) );
                    add.setDouble(2,Double.valueOf(price.getText()));
                    add.setDate(3, Date.valueOf(pay_date.getText()));
                    add.setString(4,pay_meth.getText() );
                    

                    int row =add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"the payment is added");
                    con.close();
                    selectPay();
                }catch(Exception e){
                    e.printStackTrace();
                }
                }
    }//GEN-LAST:event_AddPayMouseClicked

    private void AddPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddPayActionPerformed

    private void EditPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditPayMouseClicked
        if(res_num.getText().isEmpty()|| price.getText().isEmpty() || pay_date.getText().isEmpty()||pay_meth.getText().isEmpty()
            ){
            JOptionPane.showMessageDialog(this, "Missing info");
        }else
        {
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
                String Q="update theme_park.payment set Receipt_num='"+ res_num.getText() +"', Total_price="+ Double.valueOf(price.getText()) +",Payment_date='"+pay_date.getText()+"',Payment_method='"+pay_meth.getText()+"'"+
                "where Receipt_num="+Integer.valueOf(res_num.getText());
                Statement Add =con.createStatement();
                Add.executeUpdate(Q);
                JOptionPane.showMessageDialog(this, "edited");
                selectPay();
            }catch(Exception e){

                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditPayMouseClicked

    private void EditPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPayActionPerformed

    private void pay_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_dateActionPerformed

    private void res_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res_numActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void card_snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_card_snActionPerformed

    private void res_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res_num1ActionPerformed

    private void ex_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex_dateActionPerformed

    private void pointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointsActionPerformed

    private void DeletePayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletePayMouseClicked
        if(res_num.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Enter the recipit number you want to delete");
        }else{
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
                int rd=Integer.valueOf(res_num.getText());
                String Q="delete from theme_park.payment where Receipt_num="+rd;
                Statement Add =con.createStatement();
                Add.executeUpdate(Q);
                selectPay();
                JOptionPane.showMessageDialog(this, "the payment is deleted");
            }catch(Exception e){
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_DeletePayMouseClicked

    private void DeletePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletePayActionPerformed

    private void DeleteCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCardMouseClicked
            if(card_sn.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Enter the card sn you want to delete");
        }else{
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
                String rd=card_sn.getText();
                String Q="delete from theme_park.card where Card_sn='"+rd+"'";
                Statement Add =con.createStatement();
                Add.executeUpdate(Q);
                selectCard();
                JOptionPane.showMessageDialog(this, "the card is deleted");
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_DeleteCardMouseClicked

    private void DeleteCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCardActionPerformed

    private void AddCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCardMouseClicked
       
          if(card_sn.getText().isEmpty()|| res_num1.getText().isEmpty() || ex_date.getText().isEmpty()||points.getText().isEmpty()
           ){
            JOptionPane.showMessageDialog(this, "missing info for card");}
             else{
                try{
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
                    PreparedStatement add=con.prepareStatement("insert into theme_park.card values(?,?,?,?)");
                    add.setString(1,card_sn.getText() );
                    add.setInt(2,Integer.valueOf(res_num1.getText()));
                    add.setDate(3, Date.valueOf(ex_date.getText()));
                    add.setInt(4,Integer.valueOf(points.getText()) );
                    

                    int row =add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"the card is added");
                    con.close();
                    selectCard();
                }catch(Exception e){
                    e.printStackTrace();
                }
                }
    }//GEN-LAST:event_AddCardMouseClicked

    private void AddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddCardActionPerformed

    private void EditCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditCardMouseClicked
            if(card_sn.getText().isEmpty()|| res_num1.getText().isEmpty() || ex_date.getText().isEmpty()||points.getText().isEmpty()
            ){
            JOptionPane.showMessageDialog(this, "Missing info");
        }else
        {
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
                String Q="update theme_park.card set Card_sn='"+ res_num.getText() +"', Pay_Receipt_num="+ Integer.valueOf(price.getText()) +",Expiry_date='"+pay_date.getText()+"',Points="+Integer.valueOf(pay_meth.getText())+
                "where Card_sn='"+card_sn.getText()+"'";
                Statement Add =con.createStatement();
                Add.executeUpdate(Q);
                JOptionPane.showMessageDialog(this, "card edited");
                selectCard();
            }catch(Exception e){

                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditCardMouseClicked

    private void EditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditCardActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new Visitorlist().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked
        public void selectPay()
    {
        try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
    st=con.createStatement();
    rs=st.executeQuery("select * from theme_park.payment");
    PayTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        e.printStackTrace();
        }
    }
        
        
            public void selectCard()
    {
        try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL ", "root", "asma8080");
    st=con.createStatement();
    rs=st.executeQuery("select * from theme_park.card");
    CardTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Cashir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCard;
    private javax.swing.JButton AddPay;
    private javax.swing.JTable CardTable;
    private javax.swing.JButton DeleteCard;
    private javax.swing.JButton DeletePay;
    private javax.swing.JButton EditCard;
    private javax.swing.JButton EditPay;
    private javax.swing.JTable PayTable;
    private javax.swing.JTextField card_sn;
    private javax.swing.JTextField ex_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField pay_date;
    private javax.swing.JTextField pay_meth;
    private javax.swing.JTextField points;
    private javax.swing.JTextField price;
    private javax.swing.JTextField res_num;
    private javax.swing.JTextField res_num1;
    // End of variables declaration//GEN-END:variables
}
