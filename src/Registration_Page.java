
import java.sql.Connection;
import javax.swing.JFrame;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author mhmir
 */
public class Registration_Page extends javax.swing.JFrame {

    
    PreparedStatement p;
    ResultSet r;
    /**
     * Creates new form Registration_Page
     */
    public Registration_Page() {
        initComponents();
        this.setLocationRelativeTo(null);//opens tab in center of the screen
        jPanelRegPanel.setBackground(new java.awt.Color(0,0,0,180));
        jTextFieldFname.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldMname.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldLname.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldAddress.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldPassport.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldPhone.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldEmail.setBackground(new java.awt.Color(255,255,255,200));
        jPasswordField1.setBackground(new java.awt.Color(255,255,255,200));
        jTextFieldAddress.setBackground(new java.awt.Color(255,255,255,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegPanel = new javax.swing.JPanel();
        ErrorSign = new javax.swing.JLabel();
        ErrorSign1 = new javax.swing.JLabel();
        ErrorSign2 = new javax.swing.JLabel();
        ErrorSign3 = new javax.swing.JLabel();
        ErrorSign4 = new javax.swing.JLabel();
        ErrorSign5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelLoginForm = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jTextFieldMname = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPassport = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFieldLname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelRegPageBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ErrorSign.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        ErrorSign.setForeground(new java.awt.Color(255, 0, 0));
        ErrorSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ErrorSignMouseClicked(evt);
            }
        });
        jPanelRegPanel.add(ErrorSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 10, 30));

        ErrorSign1.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        ErrorSign1.setForeground(new java.awt.Color(255, 0, 0));
        jPanelRegPanel.add(ErrorSign1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 10, 30));

        ErrorSign2.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        ErrorSign2.setForeground(new java.awt.Color(255, 0, 0));
        jPanelRegPanel.add(ErrorSign2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 10, 30));

        ErrorSign3.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        ErrorSign3.setForeground(new java.awt.Color(255, 0, 0));
        jPanelRegPanel.add(ErrorSign3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 10, 30));

        ErrorSign4.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        ErrorSign4.setForeground(new java.awt.Color(255, 0, 0));
        jPanelRegPanel.add(ErrorSign4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 10, 30));

        ErrorSign5.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        ErrorSign5.setForeground(new java.awt.Color(255, 0, 0));
        jPanelRegPanel.add(ErrorSign5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 10, 30));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Registration Form");
        jPanelRegPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 28, 229, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Middle Name :");
        jPanelRegPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 155, 160, 67));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Last Name :");
        jPanelRegPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 229, 160, 67));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Email :");
        jPanelRegPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 303, 160, 67));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Phone Number :");
        jPanelRegPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 377, 160, 67));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Passport Number :");
        jPanelRegPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 451, 160, 67));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Password :");
        jPanelRegPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 525, 160, 67));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Address :");
        jPanelRegPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 634, 160, 67));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("First Name :");
        jPanelRegPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 81, 160, 67));

        jLabelLoginForm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelLoginForm.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginForm.setText("Signin");
        jLabelLoginForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLoginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginFormMouseClicked(evt);
            }
        });
        jPanelRegPanel.add(jLabelLoginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 784, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Have an account?");
        jPanelRegPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 760, 160, 67));

        jTextFieldFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFnameFocusLost(evt);
            }
        });
        jTextFieldFname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldFnameMouseClicked(evt);
            }
        });
        jTextFieldFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFnameActionPerformed(evt);
            }
        });
        jPanelRegPanel.add(jTextFieldFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 100, 392, -1));

        jTextFieldMname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelRegPanel.add(jTextFieldMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 174, 392, -1));

        jTextFieldAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAddressFocusLost(evt);
            }
        });
        jTextFieldAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAddressMouseClicked(evt);
            }
        });
        jPanelRegPanel.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 621, 392, 60));

        jTextFieldPassport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPassport.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPassportFocusLost(evt);
            }
        });
        jTextFieldPassport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPassportMouseClicked(evt);
            }
        });
        jPanelRegPanel.add(jTextFieldPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 470, 392, -1));

        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneFocusLost(evt);
            }
        });
        jTextFieldPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPhoneMouseClicked(evt);
            }
        });
        jPanelRegPanel.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 396, 392, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jTextFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEmailMouseClicked(evt);
            }
        });
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelRegPanel.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 322, 392, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanelRegPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 544, 392, -1));

        jTextFieldLname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelRegPanel.add(jTextFieldLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 248, 392, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelRegPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 708, 154, 45));

        getContentPane().add(jPanelRegPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 850));

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 3, 36)); // NOI18N
        jLabel10.setText("FLY SAFE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, 220, 60));

        jLabel11.setFont(new java.awt.Font("Modern No. 20", 3, 36)); // NOI18N
        jLabel11.setText("FLY HIGH");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 250, 230, 60));

        jLabelMinimize.setBackground(new java.awt.Color(255, 0, 51));
        jLabelMinimize.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 10, -1, 50));

        jLabelClose.setBackground(new java.awt.Color(255, 0, 51));
        jLabelClose.setFont(new java.awt.Font("Vrinda", 0, 30)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(51, 51, 51));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 10, -1, -1));

        jLabelRegPageBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airplane-on-seatac-international.jpg"))); // NOI18N
        getContentPane().add(jLabelRegPageBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelLoginFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginFormMouseClicked
        // TODO add your handling code here:
        Login_Page rgf = new Login_Page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelLoginFormMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesmanagementsystem","root","");
            String sql="INSERT INTO `registration`(`first_name`, `middle_name`, `last_name`, `email`, `phone`, `passport`, `password`, `address`, `role`) VALUES(?,?,?,?,?,?,?,?,?)";
            p=con.prepareStatement(sql);
            p.setString(1,jTextFieldFname.getText().trim() );
            p.setString(2,jTextFieldMname.getText().trim() );
            p.setString(3,jTextFieldLname.getText().trim() );
            p.setString(4,jTextFieldEmail.getText().trim().toLowerCase() );
            p.setString(5,jTextFieldPhone.getText() );
            p.setString(6,jTextFieldPassport.getText() );
            p.setString(7,jPasswordField1.getText());
            p.setString(8,jTextFieldAddress.getText() );
            p.setString(9,"Passenger" );

            if(jTextFieldFname.getText().isEmpty())
            {
                ErrorSign.setText("!");
            }
            if(jTextFieldEmail.getText().isEmpty())
            {
                ErrorSign1.setText("!");
            }
            if(jTextFieldPhone.getText().isEmpty())
            {
                ErrorSign2.setText("!");
            }
            if(jTextFieldPassport.getText().isEmpty())
            {
                ErrorSign3.setText("!");
            }
            if(jPasswordField1.getText().isEmpty())
            {
                ErrorSign4.setText("!");
            }
            if(jTextFieldAddress.getText().isEmpty())
            {
                ErrorSign5.setText("!");
            }
            
            if((!jTextFieldFname.getText().isEmpty()) && (!jTextFieldEmail.getText().isEmpty()) && (!jTextFieldPhone.getText().isEmpty()) && (!jTextFieldPassport.getText().isEmpty())&& (!jPasswordField1.getText().isEmpty())&& (!jTextFieldAddress.getText().isEmpty()))
                    {
                p.executeUpdate(); 
                JOptionPane.showMessageDialog(this,"Registration Successful" );
           }else{
              JOptionPane.showMessageDialog(this," Please fillup all fields" );
           }
             //JOptionPane.showMessageDialog(this," Enter you name " );
            }
         catch(Exception e){
               System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFnameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFnameFocusLost
        // TODO add your handling code here:
                String uservalue = jTextFieldFname.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") ||
        { 
             
            //jTextFieldFname.setText("abcd@gmai.com");
            ErrorSign.setText("!");
            
        }
    }//GEN-LAST:event_jTextFieldFnameFocusLost

    private void jTextFieldFnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldFnameMouseClicked
        // TODO add your handling code here:
                        String uservalue = jTextFieldFname.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign.setText("");
            
        }
    }//GEN-LAST:event_jTextFieldFnameMouseClicked

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        // TODO add your handling code here:
        String uservalue = jTextFieldEmail.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign1.setText("!");
            
        }
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jTextFieldPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneFocusLost
        // TODO add your handling code here:
                String uservalue = jTextFieldPhone.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign2.setText("!");
            
        }
    }//GEN-LAST:event_jTextFieldPhoneFocusLost

    private void jTextFieldPassportFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPassportFocusLost
        // TODO add your handling code here:
                String uservalue = jTextFieldPassport.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign3.setText("!");
            
        }
    }//GEN-LAST:event_jTextFieldPassportFocusLost

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
                String uservalue = jPasswordField1.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign4.setText("!");
            
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextFieldAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAddressFocusLost
        // TODO add your handling code here:
                String uservalue = jTextFieldAddress.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign5.setText("!");
            
        }
    }//GEN-LAST:event_jTextFieldAddressFocusLost

    private void ErrorSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ErrorSignMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorSignMouseClicked

    private void jTextFieldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEmailMouseClicked
        // TODO add your handling code here:
        String uservalue = jTextFieldEmail.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign1.setText("");
            
        }
    }//GEN-LAST:event_jTextFieldEmailMouseClicked

    private void jTextFieldPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMouseClicked
        // TODO add your handling code here:
        String uservalue = jTextFieldPhone.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign2.setText("");
            
        }
    }//GEN-LAST:event_jTextFieldPhoneMouseClicked

    private void jTextFieldPassportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPassportMouseClicked
        // TODO add your handling code here:
        String uservalue = jTextFieldPassport.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign3.setText("");
            
        }
    }//GEN-LAST:event_jTextFieldPassportMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        String uservalue = jPasswordField1.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign4.setText("");
            
        }
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jTextFieldAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAddressMouseClicked
        // TODO add your handling code here:
        String uservalue = jTextFieldAddress.getText();
        if(uservalue.equals("") )//uservalue.equals("abcd@gmai.com") || 
            
        { 
            //jTextFieldFname.setText("");
            ErrorSign5.setText("");
            
        }
    }//GEN-LAST:event_jTextFieldAddressMouseClicked

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
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorSign;
    private javax.swing.JLabel ErrorSign1;
    private javax.swing.JLabel ErrorSign2;
    private javax.swing.JLabel ErrorSign3;
    private javax.swing.JLabel ErrorSign4;
    private javax.swing.JLabel ErrorSign5;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLoginForm;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelRegPageBG;
    private javax.swing.JPanel jPanelRegPanel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldMname;
    private javax.swing.JTextField jTextFieldPassport;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}