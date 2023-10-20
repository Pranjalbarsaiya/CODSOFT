
package student_grade_calculator;

public class grade extends javax.swing.JFrame {

    public grade() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblaverage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblgrade = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_maths = new javax.swing.JTextField();
        txt_science = new javax.swing.JTextField();
        txt_gk = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_english1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_social = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calisto MT", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Grade Calculator");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 400, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Average");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Grade");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 30));

        lblaverage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblaverage.setForeground(new java.awt.Color(255, 0, 0));
        lblaverage.setText("Average");
        jPanel2.add(lblaverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Total");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 30));

        lblgrade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblgrade.setForeground(new java.awt.Color(255, 0, 0));
        lblgrade.setText("Grade");
        jPanel2.add(lblgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 130, 30));

        lbltotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(255, 0, 0));
        lbltotal.setText("Total");
        jPanel2.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 130, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradecalcimg/calcimg.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-540, -260, 960, 600));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 420, 340));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Subjects");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Science");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("General Knowledge");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 30));

        txt_maths.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 140, 30));

        txt_science.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_science, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, 30));

        txt_gk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_gk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 170, 30));

        txt_english1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_english1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("English");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        txt_social.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_social, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Social Science");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Marks");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Maths");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 460, 430));

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 320, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Student Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double maths,science,english,socialscience,generalknowledge,total,average;
        String grade;

        maths = Integer.parseInt(txt_maths.getText());
        science = Integer.parseInt(txt_science.getText());
        english = Integer.parseInt(txt_gk.getText());
        socialscience = Integer.parseInt(txt_social.getText());
        generalknowledge = Integer.parseInt(txt_gk.getText());
        

        total = maths + science + english + socialscience + generalknowledge;

        average = total/5;

        if(average >= 90)
        {
            grade = "A";
        }

        else if(average >= 80)
        {
            grade = "B";
        }

        else if(average >= 70)
        {
            grade = "C";
        }

        else if(average >= 40)
        {
            grade = "D";
        }

        else
        {
            grade = "S";
        }

        lbltotal.setText(String.valueOf(total));
        lblaverage.setText(String.valueOf(average));

        lblgrade.setText(grade);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblaverage;
    private javax.swing.JLabel lblgrade;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField txt_english1;
    private javax.swing.JTextField txt_gk;
    private javax.swing.JTextField txt_maths;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_science;
    private javax.swing.JTextField txt_social;
    // End of variables declaration//GEN-END:variables
}
