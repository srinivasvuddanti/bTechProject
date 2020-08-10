
/**
 *
 * @author  Administrator
 */
import java.awt.*;
import java.io.*;

public class HideMessage extends javax.swing.JFrame {
    
    /** Creates new form HideMessage */
    public HideMessage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        filebrowsebtn = new javax.swing.JButton();
        filepath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hidebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        msgsize = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bmpsize = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        msgsize1 = new javax.swing.JTextField();
        closebtn = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        showmsg = new javax.swing.JLabel();
        labeltarget = new javax.swing.JLabel();
        targetfile = new javax.swing.JTextField();
        filebrowsebtn1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hide Message");
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        message.setMargin(new java.awt.Insets(5, 5, 0, 0));
        jScrollPane1.setViewportView(message);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 20, 450, 120);

        jLabel1.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel1.setText("Message :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(14, 20, 60, 15);

        filebrowsebtn.setText("...");
        filebrowsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filebrowsebtnActionPerformed(evt);
            }
        });

        getContentPane().add(filebrowsebtn);
        filebrowsebtn.setBounds(500, 150, 30, 23);

        getContentPane().add(filepath);
        filepath.setBounds(80, 150, 420, 20);

        jLabel2.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel2.setText("Bitmap File :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 150, 70, 15);

        jLabel3.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 210, 70, 15);

        hidebtn.setText("Hide");
        hidebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidebtnActionPerformed(evt);
            }
        });

        getContentPane().add(hidebtn);
        hidebtn.setBounds(440, 210, 90, 23);

        jLabel4.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel4.setText("Message Size :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 260, 90, 15);

        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 250, 530, 10);

        msgsize.setEditable(false);
        getContentPane().add(msgsize);
        msgsize.setBounds(170, 260, 100, 20);

        jLabel5.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel5.setText("Bitmap Size :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 290, 90, 15);

        bmpsize.setEditable(false);
        getContentPane().add(bmpsize);
        bmpsize.setBounds(170, 290, 100, 20);

        jLabel6.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel6.setText("Message Capacity :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 260, 110, 15);

        msgsize1.setEditable(false);
        getContentPane().add(msgsize1);
        msgsize1.setBounds(390, 260, 100, 20);

        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        getContentPane().add(closebtn);
        closebtn.setBounds(440, 320, 90, 23);

        getContentPane().add(password);
        password.setBounds(80, 210, 360, 22);

        showmsg.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        getContentPane().add(showmsg);
        showmsg.setBounds(80, 320, 350, 20);

        labeltarget.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        labeltarget.setText("Target File :");
        getContentPane().add(labeltarget);
        labeltarget.setBounds(10, 180, 70, 15);

        getContentPane().add(targetfile);
        targetfile.setBounds(80, 180, 420, 20);

        filebrowsebtn1.setText("...");
        filebrowsebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filebrowsebtn1ActionPerformed(evt);
            }
        });

        getContentPane().add(filebrowsebtn1);
        filebrowsebtn1.setBounds(500, 180, 30, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-540)/2, (screenSize.height-388)/2, 540, 388);
    }
    // </editor-fold>//GEN-END:initComponents

    private void filebrowsebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filebrowsebtn1ActionPerformed
// TODO add your handling code here:
        FileDialog fd=new FileDialog(this,"Open Bitmap File",FileDialog.LOAD);
            fd.show();
            String s1=fd.getDirectory();
            String s2=fd.getFile();
            if(s1!=null&&s2!=null)
            targetfile.setText(s1+s2);
    }//GEN-LAST:event_filebrowsebtn1ActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
// TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void hidebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidebtnActionPerformed
// TODO add your handling code here:
        String pass=password.getText();
        String m=message.getText();
        String fp=filepath.getText();
        String tf=targetfile.getText();
        
        if(pass.length()>0&&m.length()>0&&fp.length()>0&&tf.length()>0)
        {
            msgsize.setText(""+m.length()+" Bytes");
            File f=new File(fp);
            bmpsize.setText(""+f.length()+" Bytes");
            long capacity=(f.length()-54)-32*8-4*8;
            capacity=capacity/8;
            msgsize1.setText(""+capacity+" Bytes");
            showmsg.setText("Hiding Message");
            try{
            Hide.Stegano(fp, tf, pass, m);
            }catch(Exception e)
            {
                    System.out.println(e);
            }
            showmsg.setText("Process Completed");           
        }
        else
        {
            System.out.println("Hello");
            showmsg.setText("Failed: Insufficient Data");
        }
    }//GEN-LAST:event_hidebtnActionPerformed

    private void filebrowsebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filebrowsebtnActionPerformed
// TODO add your handling code here:
            FileDialog fd=new FileDialog(this,"Open Bitmap File",FileDialog.LOAD);
            fd.show();
            String s1=fd.getDirectory();
            String s2=fd.getFile();
            if(s1!=null&&s2!=null)
            filepath.setText(s1+s2);
    }//GEN-LAST:event_filebrowsebtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HideMessage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bmpsize;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton filebrowsebtn;
    private javax.swing.JButton filebrowsebtn1;
    private javax.swing.JTextField filepath;
    private javax.swing.JButton hidebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labeltarget;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField msgsize;
    private javax.swing.JTextField msgsize1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel showmsg;
    private javax.swing.JTextField targetfile;
    // End of variables declaration//GEN-END:variables
    
}
