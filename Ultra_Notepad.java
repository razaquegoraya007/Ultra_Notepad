/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package ultra.notepad;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Abdul Razaque
 */


public class Ultra_Notepad extends javax.swing.JFrame {

    /**
     * Creates new form Ultra_Notepad
     */
   
    String text=null;
    private Color color;
    JTextArea textArea = new JTextArea();
    
    
    public Ultra_Notepad() {
        initComponents();

        JButton addButton = new JButton("+");

        addButton.setBorder(null);
        addButton.setFocusPainted(false);
        addButton.setContentAreaFilled(false);

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String tabName = JOptionPane.showInputDialog("Enter Tab Name ");

                if (tabName != null) {

                    JLabel tabTitleLabel = new JLabel();
                    JTextArea textArea = new JTextArea();

                    textArea.setLineWrap(true);
                    tabbedpane.addTab(tabName, textArea);
                    tabbedpane.setComponentAt(0, tabTitleLabel);
                    
                }

            }

        });

        tabbedpane.addTab("", null);
        tabbedpane.setTabComponentAt(0, addButton);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedpane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        newTab = new javax.swing.JMenuItem();
        newWindow = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        find = new javax.swing.JMenuItem();
        replace = new javax.swing.JMenuItem();
        selectall = new javax.swing.JMenuItem();
        FormatMenu = new javax.swing.JMenu();
        font = new javax.swing.JMenuItem();
        textAreaColor = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        aboutNotepad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ultra_Notepad");
        setLocationByPlatform(true);
        setName("frame"); // NOI18N

        tabbedpane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedpane.setName(""); // NOI18N

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FileMenu.setBorder(null);
        FileMenu.setText("File");

        newTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newTab.setText("New Tab");
        newTab.setBorder(null);
        newTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTabActionPerformed(evt);
            }
        });
        FileMenu.add(newTab);

        newWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newWindow.setText("New Window");
        newWindow.setBorder(null);
        newWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWindowActionPerformed(evt);
            }
        });
        FileMenu.add(newWindow);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        open.setText("Open");
        open.setBorder(null);
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        FileMenu.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save.setText("Save");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        FileMenu.add(save);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        FileMenu.add(exit);

        jMenuBar1.add(FileMenu);

        EditMenu.setBorder(null);
        EditMenu.setText("Edit");

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undo.setText("Undo");
        undo.setBorder(null);
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        EditMenu.add(undo);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut.setText("Cut");
        cut.setBorder(null);
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        EditMenu.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy.setText("Copy");
        copy.setBorder(null);
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        EditMenu.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste.setText("Paste");
        paste.setBorder(null);
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        EditMenu.add(paste);

        find.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        find.setText("Find");
        find.setBorder(null);
        EditMenu.add(find);

        replace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        replace.setText("Replace");
        replace.setBorder(null);
        EditMenu.add(replace);

        selectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        selectall.setText("Select All");
        selectall.setBorder(null);
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });
        EditMenu.add(selectall);

        jMenuBar1.add(EditMenu);

        FormatMenu.setBorder(null);
        FormatMenu.setText("Format");

        font.setText("Font");
        font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontActionPerformed(evt);
            }
        });
        FormatMenu.add(font);

        textAreaColor.setText("Text Area Color");
        textAreaColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAreaColorActionPerformed(evt);
            }
        });
        FormatMenu.add(textAreaColor);

        jMenuBar1.add(FormatMenu);

        HelpMenu.setBorder(null);
        HelpMenu.setText("Help");

        aboutNotepad.setText("About Ultra_Notepad");
        aboutNotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutNotepadActionPerformed(evt);
            }
        });
        HelpMenu.add(aboutNotepad);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
//        UndoManager z = new UndoManager();
//        z.addEdit(z);
//        z.canUndo();
//        z.undo();


    }//GEN-LAST:event_undoActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        textArea.selectAll();
    }//GEN-LAST:event_selectallActionPerformed

    private void newWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWindowActionPerformed
       Ultra_Notepad ul = new Ultra_Notepad();
       ul.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_newWindowActionPerformed

    private void newTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTabActionPerformed

        String tabName = JOptionPane.showInputDialog("Enter Tab Name ");
        
        if (tabName != null) {

            JLabel tabTitleLabel = new JLabel();
            

            textArea.setLineWrap(true);
          
            tabbedpane.addTab(tabName, this.textArea);
            tabbedpane.setComponentAt(0, tabTitleLabel);
            
    }//GEN-LAST:event_newTabActionPerformed
        
    }


   
    
    
    private void textAreaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAreaColorActionPerformed

        
        Color newColor = JColorChooser.showDialog(this, "select a color", color);
        this.textArea.setBackground (newColor);
        
       
    }//GEN-LAST:event_textAreaColorActionPerformed

    
    
    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed

        
    

//Setting current by default directory "C" folder
            JFileChooser chooser = new JFileChooser("C:/");
            chooser.setAcceptAllFileFilterUsed(false);
            
            //Allowing only text (.txt) files extension to open
            FileNameExtensionFilter restrict = new FileNameExtensionFilter(".txt files", "txt");
            chooser.addChoosableFileFilter(restrict);

            int result = chooser.showOpenDialog(tabbedpane);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                try {
                    //Reading the file
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    textArea.read(br, null);
                    //Closing the file after reading
                    //Clearing the memory
                    br.close();
                    textArea.requestFocus();
                } catch (Exception e) {
                    System.out.print(e);
                }

    

    }//GEN-LAST:event_openActionPerformed
    }
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
             text = textArea.getSelectedText();
    }//GEN-LAST:event_copyActionPerformed

    private void fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontActionPerformed
           
               
                
    }//GEN-LAST:event_fontActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        final JFileChooser SaveAs = new JFileChooser();
            SaveAs.setApproveButtonText("Save");
            //Opening the dialog and asking from user where to save the file.
            int actionDialog = SaveAs.showOpenDialog(tabbedpane);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }
            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            try {
                outFile = new BufferedWriter(new FileWriter(fileName));
                textArea.write(outFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_saveActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        textArea.insert(text, textArea.getCaretPosition());
    }//GEN-LAST:event_pasteActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        text = textArea.getSelectedText();
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutActionPerformed

    private void aboutNotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutNotepadActionPerformed
//            JTextField tf = new JTextField();
            JOptionPane.showMessageDialog(null, "This Notepad is make by Abdul Razaque Goraya, Student Of \nSukkur IBA University ");
    }//GEN-LAST:event_aboutNotepadActionPerformed

    
    
    
    public static void main(String args[]) {
        new Ultra_Notepad();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ultra_Notepad().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu FormatMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem aboutNotepad;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem find;
    private javax.swing.JMenuItem font;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem newTab;
    private javax.swing.JMenuItem newWindow;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem replace;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem selectall;
    private javax.swing.JTabbedPane tabbedpane;
    private javax.swing.JMenuItem textAreaColor;
    private javax.swing.JMenuItem undo;
    // End of variables declaration//GEN-END:variables

}
