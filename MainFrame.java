import org.jvnet.substance.SubstanceLookAndFeel;
import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {
    
	
	
	    static {
        try {
            SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSunfireRedTheme");
            SubstanceLookAndFeel.setCurrentGradientPainter("org.jvnet.substance.painter.WaveGradientPainter");
            SubstanceLookAndFeel.setCurrentButtonShaper("org.jvnet.substance.button.StandardButtonShaper");
            UIManager.setLookAndFeel(new SubstanceLookAndFeel());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
	
    /** Creates new form MainFrame */
    public MainFrame() {
	
        initComponents();
    }
    
   
    private void initComponents() {
        jToolBar1 = new javax.swing.JToolBar();
        hidemessagebtn = new javax.swing.JButton();
        recovermsgbtn = new javax.swing.JButton();
        hidefilebtn = new javax.swing.JButton();
        recoverfilebtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        steganography = new javax.swing.JMenu();
        hidemessage = new javax.swing.JMenuItem();
        recovermsg = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        hidefile = new javax.swing.JMenuItem();
        recoverfile = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        contents = new javax.swing.JMenuItem();
		imageLabel = new javax.swing.JLabel("ksjdkflsdjfklsfskf");
		
        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A Novel Data Embedding Method Using Adaptive Pixel Pair Matching");
        hidemessagebtn.setText("Hide Message");
        hidemessagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidemessagebtnActionPerformed(evt);
            }
        });

        jToolBar1.add(hidemessagebtn);

        recovermsgbtn.setText("Recover Message");
        recovermsgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recovermsgbtnActionPerformed(evt);
            }
        });

        jToolBar1.add(recovermsgbtn);

        hidefilebtn.setText("Hide File");
        hidefilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidefilebtnActionPerformed(evt);
            }
        });

        jToolBar1.add(hidefilebtn);

        recoverfilebtn.setText("Recover File");
        recoverfilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverfilebtnActionPerformed(evt);
            }
        });

        jToolBar1.add(recoverfilebtn);

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jToolBar1.add(exitbtn);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 2, 620, 30);

        steganography.setMnemonic('S');
        steganography.setText("Steganography");
        hidemessage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        hidemessage.setText("Hide Message...");
        hidemessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidemessageActionPerformed(evt);
            }
        });

        steganography.add(hidemessage);

        recovermsg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        recovermsg.setText("Recover Message...");
        recovermsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recovermsgActionPerformed(evt);
            }
        });

        steganography.add(recovermsg);

        steganography.add(jSeparator3);

        hidefile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        hidefile.setText("Hide File...");
        hidefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidefileActionPerformed(evt);
            }
        });

        steganography.add(hidefile);

        recoverfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        recoverfile.setText("Recover File...");
        recoverfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverfileActionPerformed(evt);
            }
        });

        steganography.add(recoverfile);

        steganography.add(jSeparator2);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        steganography.add(exit);

        jMenuBar1.add(steganography);

        help.setMnemonic('H');
        help.setText("Help");
        contents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        contents.setText("Contents");
        contents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsActionPerformed(evt);
            }
        });

        help.add(contents);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);
		
		imageLabel.setIcon(new javax.swing.ImageIcon("S.jpg"));
		imageLabel.setBounds(60,80,500,334);
		add(imageLabel);
		
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-624)/2, (screenSize.height-526)/2, 624, 526);
    }
    

    private void recoverfileActionPerformed(java.awt.event.ActionEvent evt) {                                            

        RecoverFile rf=new RecoverFile();
        rf.show();
    }
    private void recoverfilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverfilebtnActionPerformed

        RecoverFile rf=new RecoverFile();
        rf.show();
    }//GEN-LAST:event_recoverfilebtnActionPerformed

    private void hidefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidefileActionPerformed

        HideFile hf=new HideFile();
        hf.show();
    }//GEN-LAST:event_hidefileActionPerformed

    private void recovermsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recovermsgActionPerformed

         RecoverMessage r=new RecoverMessage();
        r.show();
    }//GEN-LAST:event_recovermsgActionPerformed

    private void hidefilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidefilebtnActionPerformed

        HideFile hf=new HideFile();
        hf.show();
    }//GEN-LAST:event_hidefilebtnActionPerformed

    private void recovermsgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recovermsgbtnActionPerformed

        RecoverMessage r=new RecoverMessage();
        r.show();
    }//GEN-LAST:event_recovermsgbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed

        dispose();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void hidemessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidemessageActionPerformed

         HideMessage h=new HideMessage();
        h.show();
        
    }//GEN-LAST:event_hidemessageActionPerformed

    private void hidemessagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidemessagebtnActionPerformed

       
        HideMessage h=new HideMessage();
        h.show();
    }//GEN-LAST:event_hidemessagebtnActionPerformed

    private void contentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsActionPerformed

         System.out.println("Hello");
        ContentsFrame f=new ContentsFrame();
        f.show();
    }//GEN-LAST:event_contentsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    
    private javax.swing.JMenuItem contents;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton exitbtn;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem hidefile;
    private javax.swing.JButton hidefilebtn;
    private javax.swing.JMenuItem hidemessage;
    private javax.swing.JButton hidemessagebtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem recoverfile;
    private javax.swing.JButton recoverfilebtn;
    private javax.swing.JMenuItem recovermsg;
    private javax.swing.JButton recovermsgbtn;
    private javax.swing.JMenu steganography;
	private javax.swing.JLabel imageLabel;
    
    
}
