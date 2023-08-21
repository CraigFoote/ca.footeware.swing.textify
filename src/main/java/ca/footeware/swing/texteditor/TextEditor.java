/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ca.footeware.swing.texteditor;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author craig
 */
public class TextEditor extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private File file;
    private boolean isDark = true;
    private boolean changed = false;
    private final DocumentListenerImpl listener;

    /**
     * Creates new form NewJFrame
     */
    public TextEditor() {
        this.listener = new DocumentListenerImpl();
        initComponents();
        this.jEditorPane2.requestFocus();
        PlainDocument document = new PlainDocument();
        document.addDocumentListener(listener);
        this.jEditorPane2.setDocument(document);
        this.file = null;
        this.jEditorPane2.setComponentPopupMenu(new Menu());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Textify");
        setIconImages(null);

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jEditorPane2.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jEditorPane2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-new-document-24.png"))); // NOI18N
        jButton1.setToolTipText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-open-24.png"))); // NOI18N
        jButton2.setToolTipText("Open");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-24.png"))); // NOI18N
        jButton3.setToolTipText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-as-24.png"))); // NOI18N
        jButton4.setToolTipText("Save As");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lamp-24.png"))); // NOI18N
        jToggleButton1.setToolTipText("Toggle Dark Mode");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 715, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Save.
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (changed) {
            if (this.file == null) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Document", "txt"));
                fileChooser.setDialogTitle("Save");
                int userSelection = fileChooser.showSaveDialog(this);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    this.file = fileChooser.getSelectedFile();
                    this.changed = false;
                }
            }
            if (this.file != null) {
                try {
                    FileWriter writer = new FileWriter(this.file);
                    try (BufferedWriter bw = new BufferedWriter(writer)) {
                        this.jEditorPane2.write(bw);
                    }
                    this.setTitle(this.file.getAbsolutePath());
                    this.jEditorPane2.requestFocus();
                    this.changed = false;
                } catch (IOException e) {
                    Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Save As.
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Document", "txt"));
        fileChooser.setDialogTitle("Save As");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            this.file = fileChooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(this.file);
                try (BufferedWriter bw = new BufferedWriter(writer)) {
                    this.jEditorPane2.write(bw);
                }
                this.setTitle(this.file.getAbsolutePath());
                this.jEditorPane2.requestFocus();
                this.changed = false;
            } catch (IOException e) {
                Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Open.
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (changed) {
            int response;
            if (file != null) {
                response = JOptionPane.showConfirmDialog(this, "Do you want to discard unsaved changes to file '" + file.getName() + "'?", "Unsaved Changes", JOptionPane.YES_NO_OPTION);
            } else {
                response = JOptionPane.showConfirmDialog(this, "Do you want to discard unsaved changes?", "Unsaved Changes", JOptionPane.YES_NO_OPTION);
            }
            if (response == JOptionPane.NO_OPTION) {
                return;
            }
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Document", "txt"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.file = fileChooser.getSelectedFile();
            Path path = file.toPath();
            try {
                String mimeType = Files.probeContentType(path);
                if (mimeType == null || "text/plain".equals(mimeType)) {
                    BufferedReader input = new BufferedReader(new InputStreamReader(
                            new FileInputStream(this.file)));
                    this.jEditorPane2.read(input, "READING FILE :)");
                    this.jEditorPane2.getDocument().addDocumentListener(listener);
                    this.setTitle(this.file.getAbsolutePath());
                    this.jEditorPane2.requestFocus();
                    this.changed = false;
                } else {
                    JOptionPane.showMessageDialog(this, "File is not 'text/plain'.");
                }
            } catch (IOException e) {
                Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * New.
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (changed) {
            int response;
            if (file != null) {
                response = JOptionPane.showConfirmDialog(this, "Do you want to discard unsaved changes to file '" + file.getName() + "'?", "Unsaved Changes", JOptionPane.YES_NO_OPTION);
            } else {
                response = JOptionPane.showConfirmDialog(this, "Do you want to discard unsaved changes?", "Unsaved Changes", JOptionPane.YES_NO_OPTION);
            }
            if (response == JOptionPane.NO_OPTION) {
                return;
            }
        }
        PlainDocument document = new PlainDocument();
        this.jEditorPane2.setDocument(document);
        document.addDocumentListener(listener);
        this.file = null;
        this.setTitle("Textify");
        this.jEditorPane2.requestFocus();
        this.changed = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Toggle light/dark mode.
     *
     * @param evt
     */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        FlatLaf laf = isDark ? new FlatLightLaf() : new FlatDarkLaf();
        try {
            UIManager.setLookAndFeel(laf);
            SwingUtilities.updateComponentTreeUI(this);
            isDark = !isDark;
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * Main.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, e);
        }
        java.awt.EventQueue.invokeLater(() -> {
            TextEditor textEditor = new TextEditor();
            textEditor.setLocationRelativeTo(null);
            textEditor
                    .setIconImage(new ImageIcon(TextEditor.class
                            .getResource("/icons8-text-24.png")).getImage());
            textEditor.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    /**
     * Listens for changes to current document and sets 'changed' local boolean
     * variable.
     */
    private class DocumentListenerImpl implements DocumentListener, Serializable {

        private static final long serialVersionUID = 1L;

        public DocumentListenerImpl() {
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            changed = true;
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            changed = true;
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            changed = true;
        }
    }

    /**
     * A popup menu handling cut, copy and paste.
     */
    private class Menu extends JPopupMenu implements Serializable {

        private static final long serialVersionUID = 1L;

        public Menu() {
            JMenuItem item = new JMenuItem("Cut");
            item.addActionListener((ActionEvent e) -> {
                jEditorPane2.cut();
            });
            add(item);
            item = new JMenuItem("Copy");
            item.addActionListener((ActionEvent e) -> {
                jEditorPane2.copy();
            });
            add(item);
            item = new JMenuItem("Paste");
            item.addActionListener((ActionEvent e) -> {
                jEditorPane2.paste();
            });
            add(item);
        }
    }
}
