/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class empl extends javax.swing.JInternalFrame implements dbvar {

    /**
     * Creates new form empl
     */
    String user;
    public empl() {
        initComponents();
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        user=e8.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        e1 = new javax.swing.JTextField();
        e2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        e4 = new javax.swing.JTextArea();
        e51 = new javax.swing.JRadioButton();
        e52 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        e3 = new javax.swing.JTextField();
        e6 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        e7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        e8 = new javax.swing.JTextField();
        e9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Employee Manager");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unnamed.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Age");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Name");

        e4.setColumns(20);
        e4.setRows(5);
        jScrollPane1.setViewportView(e4);

        buttonGroup1.add(e51);
        e51.setText("Male");

        buttonGroup1.add(e52);
        e52.setText("Female");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Post");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Phone");

        e6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posts", "admin", "manager", "first", "second", "third", " " }));
        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Salary");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("User");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Pass");

        jButton5.setText("Image");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Employee Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(e9)
                            .addComponent(e8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(e7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(e51)
                        .addGap(30, 30, 30)
                        .addComponent(e52)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e52)
                            .addComponent(e51)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{

        String url = "jdbc:mysql://localhost/store";
        String user="root";
         Connection conn =DriverManager.getConnection(durl ,duser,dpass );
        try{
         
          String q="insert into empl(name,age,phone,address,gender,post,salary,user,pass) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement myst = (PreparedStatement) conn.prepareStatement(q);
        myst.setString(1,e1.getText());
        myst.setString(2,e2.getText()); 
        myst.setString(3,e3.getText());
        myst.setString(4,e4.getText());
        if(e51.isSelected())
        {
        myst.setString(5,"male");
        }
        
        else
        {
        myst.setString(5,"female");
        }
        
        myst.setString(6,e6.getSelectedItem().toString());
        
        myst.setString(7,e7.getText());
        myst.setString(8,e8.getText());
        myst.setString(9,e9.getText());
        
        user = e8.getText();
        
        int count = myst.executeUpdate();
        
        if(count==1)
        {
         JOptionPane.showMessageDialog(rootPane, "Employee added successfully");
         clear();
        }
        
        
        }
        catch(Exception e)
        {        
        JOptionPane.showMessageDialog(rootPane,"Error in connectivity"+e.getMessage());
        }
        
        finally
        {
        
          conn.close();
        }
}
catch(Exception e)
{

JOptionPane.showMessageDialog(rootPane,"Cannot connect");

}
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{

       
         Connection con =DriverManager.getConnection(durl ,duser,dpass );
        try{
         
          String q="select name,age,phone,address,gender,post,salary,user,pass from empl where user =?";
        PreparedStatement myst = (PreparedStatement) con.prepareStatement(q);
        myst.setString(1,e8.getText());
        ResultSet rs =myst.executeQuery();
        
        user = e8.getText();
        
        if(rs.next())
        {
        e1.setText(rs.getString(1));
        e2.setText(rs.getString(2));
        e3.setText(rs.getString(3));
        e4.setText(rs.getString(4));
        if(rs.getString(5).equalsIgnoreCase("male"))
        {
        e51.setSelected(true);
        }
        else
        {
        e52.setSelected(true);
        }
        
        e6.setSelectedItem(rs.getString(6));
        e7.setText(rs.getString(7));
        e9.setText(rs.getString(9));
        
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        
        }
        
        
        
        
        }
        catch(SQLException e)
        {        
        JOptionPane.showMessageDialog(rootPane,"Error in connectivity"+e.getMessage());
        }
        
        finally
        {
        
          con.close();
        }
}
catch(Exception e)
{

JOptionPane.showMessageDialog(rootPane,"Cannot connect");

}  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      image obj = new image();
      parentform.abc.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
        try{

       
         Connection conn =DriverManager.getConnection(durl ,duser,dpass );
        try{
         
          String q="delete from empl where user =?";
        PreparedStatement myst = (PreparedStatement) conn.prepareStatement(q);
        myst.setString(1,e8.getText());
      
        
        int count = myst.executeUpdate();
        
        if(count==1)
       {
         JOptionPane.showMessageDialog(rootPane, "Employee deleted Successfully");
         clear();
       
       }
       
       else
       {
         JOptionPane.showMessageDialog(rootPane,"Employee does not exist");
         clear();
         jButton3.setEnabled(false);
         jButton4.setEnabled(false);
       }
        
        
        
        }
        catch(SQLException e)
        {        
        JOptionPane.showMessageDialog(rootPane,"Error in connectivity"+e.getMessage());
        }
        
        finally
        {
        
          conn.close();
        }
}
catch(Exception e)
{

JOptionPane.showMessageDialog(rootPane,"Cannot connect");

} 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
try{

       
         Connection con =DriverManager.getConnection(durl ,duser,dpass );
        try{
         
          String q="update empl set name=?,age =?,phone=?,address=?,gender=?,post=?,salary=?,pass=? where user=?";
        PreparedStatement myst = (PreparedStatement) con.prepareStatement(q);
        myst.setString(1,e1.getText());
        myst.setString(2,e2.getText()); 
        myst.setString(3,e3.getText());
        myst.setString(4,e4.getText());
        if(e51.isSelected())
        {
        myst.setString(5,"male");
        }
        
        else
        {
        myst.setString(5,"female");
        }
        
        myst.setString(6,e6.getSelectedItem().toString());
        
        myst.setString(7,e7.getText());
        myst.setString(8,e9.getText());
        myst.setString(9,e8.getText());
        
        user = e8.getText();
        
        int count = myst.executeUpdate();
        
        if(count==1)
        {
         JOptionPane.showMessageDialog(rootPane, "Employee updated successfully");
         clear();
         jButton3.setEnabled(false);
         jButton4.setEnabled(false);
         jButton5.setEnabled(false);
         JOptionPane.showMessageDialog(rootPane, "Update employee image");
         image obj = new image();
         parentform.abc.add(obj);
         obj.setVisible(true);
        }
        
        
        }
        catch(SQLException e)
        {        
        JOptionPane.showMessageDialog(rootPane,"Error in connectivity"+e.getMessage());
        }
        
        finally
        {
          
          con.close();
        }
}
catch(SQLException e)
{

JOptionPane.showMessageDialog(rootPane,"Cannot connect");

}

    }//GEN-LAST:event_jButton4ActionPerformed

    
    public void clear()
    {
    e1.setText(null);
    e2.setText(null);
    e3.setText(null);
    e4.setText(null);
    buttonGroup1.clearSelection();
    e6.setSelectedIndex(0);
    e7.setText(null);
    e8.setText(null);
    e9.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JTextField e3;
    private javax.swing.JTextArea e4;
    private javax.swing.JRadioButton e51;
    private javax.swing.JRadioButton e52;
    private javax.swing.JComboBox<String> e6;
    private javax.swing.JTextField e7;
    private javax.swing.JTextField e8;
    private javax.swing.JTextField e9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}