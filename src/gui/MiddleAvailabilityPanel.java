/*

Part of the ViewAvailableDoctorPanel, which uses GridLayout to set 3 columns
This panel is added in the middle column to show Available Doctors

By Daniel Vella

*/

package gui;

import defaultpackage.Doctor;
import java.awt.Color;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import utility.WeekUtils;

public class MiddleAvailabilityPanel extends javax.swing.JPanel 
   {
   
   private Doctor[] localDoctors_;
   private RightDoctorsDetailsPanel doctorDetails_;
   private final Border borderLabel;
   private final EmptyBorder borderEmpty;
   private final CompoundBorder compoundBorder_;

   public MiddleAvailabilityPanel(RightDoctorsDetailsPanel doctorDetails) 
      {
           
      initComponents();
      this.doctorDetails_ = doctorDetails;
      doctorDetails_.setVisible(false);
      
      // Sets border for labels
      borderEmpty = new EmptyBorder(5, 30, 5, 30);
      borderLabel = new LineBorder(new Color(203,211,230), 2, true);
      compoundBorder_ = new CompoundBorder(borderLabel, borderEmpty);

      }
   
   public void setDoctorsArray(Doctor[] doctors)
      {
      
      this.localDoctors_ = doctors;
      showAvailabilities();
      
      }
      
   // Set Availabilties from Disciplines Array of Doctors from DoctorManager
   private void showAvailabilities()
      {
               
      // Created ArrayList so program can loop through and set Names and Availabilities dynamically
      ArrayList<JLabel> labels = new ArrayList<>();
      ArrayList<JPanel> panels = new ArrayList<>();
      
      labels.add(doctorLabel1_);
      labels.add(doctorLabel2_);
      labels.add(doctorLabel3_);
      labels.add(doctorLabel4_);
      labels.add(doctorLabel5_);
      labels.add(doctorLabel6_);
      labels.add(doctorLabel7_);
      labels.add(doctorLabel8_);
      labels.add(doctorLabel9_);
      labels.add(doctorLabel10_);
      panels.add(availPanel1_);
      panels.add(availPanel2_);
      panels.add(availPanel3_);
      panels.add(availPanel4_);
      panels.add(availPanel5_);
      panels.add(availPanel6_);
      panels.add(availPanel7_);
      panels.add(availPanel8_);
      panels.add(availPanel9_);
      panels.add(availPanel10_);
      
      for(int i=0; i < localDoctors_.length; i++)
         { 
         
            // If the doctor reference is not empty
            if (localDoctors_[i] != null)
               {
                  
               labels.get(i).setText(localDoctors_[i].getName());
               
               // If doctor is available set green .. red if not
               if (localDoctors_[i].isAvailable(LocalTime.now(), WeekUtils.getDayOfWeek()))
                  {  
                     
                  panels.get(i).setBackground(Color.GREEN);
                  
                  }
               else 
                  {
                  
                  panels.get(i).setBackground(Color.RED);
                  
                  }
               
               
               }
            
            // Doctor Reference is empty so set to Unregistered
            else 
               {
                  
               labels.get(i).setText("Unregistered");
               panels.get(i).setBackground(Color.LIGHT_GRAY);
               
               }

         }
         
      }

   // Reset components to initial state
   private void resetSelected()
      {
         
      doctorLabel1_.setBorder(null);
      doctorLabel1_.setForeground(new Color(102,102,102));
      doctorLabel2_.setBorder(null);
      doctorLabel2_.setForeground(new Color(102,102,102));
      doctorLabel3_.setBorder(null);
      doctorLabel3_.setForeground(new Color(102,102,102));
      doctorLabel4_.setBorder(null);
      doctorLabel4_.setForeground(new Color(102,102,102));
      doctorLabel5_.setBorder(null);
      doctorLabel5_.setForeground(new Color(102,102,102));
      doctorLabel6_.setBorder(null);
      doctorLabel6_.setForeground(new Color(102,102,102));
      doctorLabel7_.setBorder(null);
      doctorLabel7_.setForeground(new Color(102,102,102));
      doctorLabel8_.setBorder(null);
      doctorLabel8_.setForeground(new Color(102,102,102));
      doctorLabel9_.setBorder(null);
      doctorLabel9_.setForeground(new Color(102,102,102));
      doctorLabel10_.setBorder(null);
      doctorLabel10_.setForeground(new Color(102,102,102));          

      }
   
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {
      java.awt.GridBagConstraints gridBagConstraints;

      backgroundADP_ = new javax.swing.JPanel();
      titleAvailabilitiesLabel_ = new javax.swing.JLabel();
      availPanel2_ = new javax.swing.JPanel();
      availPanel3_ = new javax.swing.JPanel();
      doctorLabel1_ = new javax.swing.JLabel();
      doctorLabel2_ = new javax.swing.JLabel();
      doctorLabel3_ = new javax.swing.JLabel();
      doctorLabel4_ = new javax.swing.JLabel();
      doctorLabel5_ = new javax.swing.JLabel();
      doctorLabel6_ = new javax.swing.JLabel();
      doctorLabel7_ = new javax.swing.JLabel();
      doctorLabel8_ = new javax.swing.JLabel();
      doctorLabel9_ = new javax.swing.JLabel();
      doctorLabel10_ = new javax.swing.JLabel();
      availPanel4_ = new javax.swing.JPanel();
      availPanel5_ = new javax.swing.JPanel();
      availPanel6_ = new javax.swing.JPanel();
      availPanel7_ = new javax.swing.JPanel();
      availPanel8_ = new javax.swing.JPanel();
      availPanel9_ = new javax.swing.JPanel();
      availPanel10_ = new javax.swing.JPanel();
      availPanel1_ = new javax.swing.JPanel();
      guideLabel_ = new javax.swing.JLabel();

      setBackground(new java.awt.Color(255, 255, 255));
      setMinimumSize(new java.awt.Dimension(191, 618));
      setPreferredSize(new java.awt.Dimension(191, 618));

      backgroundADP_.setBackground(new java.awt.Color(250, 250, 250));
      backgroundADP_.setForeground(new java.awt.Color(102, 102, 102));
      backgroundADP_.setMaximumSize(new java.awt.Dimension(500, 500));
      backgroundADP_.setPreferredSize(new java.awt.Dimension(218, 400));
      backgroundADP_.setLayout(new java.awt.GridBagLayout());

      titleAvailabilitiesLabel_.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
      titleAvailabilitiesLabel_.setText("Availabilities");
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 0;
      gridBagConstraints.gridwidth = 2;
      gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
      backgroundADP_.add(titleAvailabilitiesLabel_, gridBagConstraints);

      availPanel2_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel2_Layout = new javax.swing.GroupLayout(availPanel2_);
      availPanel2_.setLayout(availPanel2_Layout);
      availPanel2_Layout.setHorizontalGroup(
         availPanel2_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel2_Layout.setVerticalGroup(
         availPanel2_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 3;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel2_, gridBagConstraints);

      availPanel3_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel3_Layout = new javax.swing.GroupLayout(availPanel3_);
      availPanel3_.setLayout(availPanel3_Layout);
      availPanel3_Layout.setHorizontalGroup(
         availPanel3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel3_Layout.setVerticalGroup(
         availPanel3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 4;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel3_, gridBagConstraints);

      doctorLabel1_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel1_.setText("Populate with Doctors");
      doctorLabel1_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel1_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 2;
      backgroundADP_.add(doctorLabel1_, gridBagConstraints);

      doctorLabel2_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel2_.setText("Populate with Doctors");
      doctorLabel2_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel2_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 3;
      backgroundADP_.add(doctorLabel2_, gridBagConstraints);

      doctorLabel3_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel3_.setText("Populate with Doctors");
      doctorLabel3_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel3_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 4;
      backgroundADP_.add(doctorLabel3_, gridBagConstraints);

      doctorLabel4_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel4_.setText("Populate with Doctors");
      doctorLabel4_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel4_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 5;
      backgroundADP_.add(doctorLabel4_, gridBagConstraints);

      doctorLabel5_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel5_.setText("Populate with Doctors");
      doctorLabel5_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel5_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 6;
      backgroundADP_.add(doctorLabel5_, gridBagConstraints);

      doctorLabel6_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel6_.setText("Populate with Doctors");
      doctorLabel6_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel6_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 7;
      backgroundADP_.add(doctorLabel6_, gridBagConstraints);

      doctorLabel7_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel7_.setText("Populate with Doctors");
      doctorLabel7_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel7_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 8;
      backgroundADP_.add(doctorLabel7_, gridBagConstraints);

      doctorLabel8_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel8_.setText("Populate with Doctors");
      doctorLabel8_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel8_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 9;
      backgroundADP_.add(doctorLabel8_, gridBagConstraints);

      doctorLabel9_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel9_.setText("Populate with Doctors");
      doctorLabel9_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel9_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 10;
      backgroundADP_.add(doctorLabel9_, gridBagConstraints);

      doctorLabel10_.setForeground(new java.awt.Color(102, 102, 102));
      doctorLabel10_.setText("Populate with Doctors");
      doctorLabel10_.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            doctorLabel10_MouseClicked(evt);
         }
      });
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 11;
      backgroundADP_.add(doctorLabel10_, gridBagConstraints);

      availPanel4_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel4_Layout = new javax.swing.GroupLayout(availPanel4_);
      availPanel4_.setLayout(availPanel4_Layout);
      availPanel4_Layout.setHorizontalGroup(
         availPanel4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel4_Layout.setVerticalGroup(
         availPanel4_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 5;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel4_, gridBagConstraints);

      availPanel5_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel5_Layout = new javax.swing.GroupLayout(availPanel5_);
      availPanel5_.setLayout(availPanel5_Layout);
      availPanel5_Layout.setHorizontalGroup(
         availPanel5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel5_Layout.setVerticalGroup(
         availPanel5_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 6;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel5_, gridBagConstraints);

      availPanel6_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel6_Layout = new javax.swing.GroupLayout(availPanel6_);
      availPanel6_.setLayout(availPanel6_Layout);
      availPanel6_Layout.setHorizontalGroup(
         availPanel6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel6_Layout.setVerticalGroup(
         availPanel6_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 7;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel6_, gridBagConstraints);

      availPanel7_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel7_Layout = new javax.swing.GroupLayout(availPanel7_);
      availPanel7_.setLayout(availPanel7_Layout);
      availPanel7_Layout.setHorizontalGroup(
         availPanel7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel7_Layout.setVerticalGroup(
         availPanel7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 8;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel7_, gridBagConstraints);

      availPanel8_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel8_Layout = new javax.swing.GroupLayout(availPanel8_);
      availPanel8_.setLayout(availPanel8_Layout);
      availPanel8_Layout.setHorizontalGroup(
         availPanel8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel8_Layout.setVerticalGroup(
         availPanel8_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 9;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel8_, gridBagConstraints);

      availPanel9_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel9_Layout = new javax.swing.GroupLayout(availPanel9_);
      availPanel9_.setLayout(availPanel9_Layout);
      availPanel9_Layout.setHorizontalGroup(
         availPanel9_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel9_Layout.setVerticalGroup(
         availPanel9_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 10;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel9_, gridBagConstraints);

      availPanel10_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel10_Layout = new javax.swing.GroupLayout(availPanel10_);
      availPanel10_.setLayout(availPanel10_Layout);
      availPanel10_Layout.setHorizontalGroup(
         availPanel10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel10_Layout.setVerticalGroup(
         availPanel10_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 11;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel10_, gridBagConstraints);

      availPanel1_.setPreferredSize(new java.awt.Dimension(30, 30));

      javax.swing.GroupLayout availPanel1_Layout = new javax.swing.GroupLayout(availPanel1_);
      availPanel1_.setLayout(availPanel1_Layout);
      availPanel1_Layout.setHorizontalGroup(
         availPanel1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      availPanel1_Layout.setVerticalGroup(
         availPanel1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 2;
      gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
      backgroundADP_.add(availPanel1_, gridBagConstraints);

      guideLabel_.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
      guideLabel_.setForeground(new java.awt.Color(153, 153, 153));
      guideLabel_.setText("Press a Doctor's name to view details");
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 1;
      gridBagConstraints.gridwidth = 2;
      gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
      backgroundADP_.add(guideLabel_, gridBagConstraints);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(backgroundADP_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(backgroundADP_, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
      );
   }// </editor-fold>//GEN-END:initComponents

   // Mouse Listeners for User Experience on Click and to set Doctor Details
   private void doctorLabel1_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel1_MouseClicked
      
      if (!"Unregistered".equals(doctorLabel1_.getText()))
         {
         
         doctorDetails_.setDoctorDetails(localDoctors_[0]);
         resetSelected();
         doctorLabel1_.setForeground(Color.BLACK);
         doctorLabel1_.setBorder(compoundBorder_);
         doctorDetails_.setVisible(true);
         
         }
      
   }//GEN-LAST:event_doctorLabel1_MouseClicked

   private void doctorLabel2_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel2_MouseClicked
      
      if (!"Unregistered".equals(doctorLabel2_.getText()))
         {
         
         doctorDetails_.setDoctorDetails(localDoctors_[1]);
         resetSelected();
         doctorLabel2_.setForeground(Color.BLACK);
         doctorLabel2_.setBorder(compoundBorder_);
         doctorDetails_.setVisible(true);
         
         }
      
   }//GEN-LAST:event_doctorLabel2_MouseClicked

   private void doctorLabel3_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel3_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel3_.getText()))
      {

      doctorDetails_.setDoctorDetails(localDoctors_[2]);
      resetSelected();
      doctorLabel3_.setForeground(Color.BLACK);
      doctorLabel3_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      }
      
   }//GEN-LAST:event_doctorLabel3_MouseClicked

   private void doctorLabel4_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel4_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel4_.getText()))
      {
   
      doctorDetails_.setDoctorDetails(localDoctors_[3]);
      resetSelected();
      doctorLabel4_.setForeground(Color.BLACK);
      doctorLabel4_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel4_MouseClicked

   private void doctorLabel5_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel5_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel5_.getText()))
      {
     
      doctorDetails_.setDoctorDetails(localDoctors_[4]);
      resetSelected();
      doctorLabel5_.setForeground(Color.BLACK);
      doctorLabel5_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel5_MouseClicked

   private void doctorLabel6_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel6_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel6_.getText()))
      {
   
      doctorDetails_.setDoctorDetails(localDoctors_[5]);
      resetSelected();
      doctorLabel6_.setForeground(Color.BLACK);
      doctorLabel6_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel6_MouseClicked

   private void doctorLabel7_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel7_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel7_.getText()))
      {
      
      doctorDetails_.setDoctorDetails(localDoctors_[6]);
      resetSelected();
      doctorLabel7_.setForeground(Color.BLACK);
      doctorLabel7_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel7_MouseClicked

   private void doctorLabel8_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel8_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel8_.getText()))
      {
      
      doctorDetails_.setDoctorDetails(localDoctors_[7]);
      resetSelected();
      doctorLabel8_.setForeground(Color.BLACK);
      doctorLabel8_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel8_MouseClicked

   private void doctorLabel9_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel9_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel9_.getText()))
      {
      
      doctorDetails_.setDoctorDetails(localDoctors_[8]);
      resetSelected();
      doctorLabel9_.setForeground(Color.BLACK);
      doctorLabel9_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel9_MouseClicked

   private void doctorLabel10_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabel10_MouseClicked
      
   if (!"Unregistered".equals(doctorLabel10_.getText()))
      {
      
      doctorDetails_.setDoctorDetails(localDoctors_[9]);
      resetSelected();
      doctorLabel10_.setForeground(Color.BLACK);
      doctorLabel10_.setBorder(compoundBorder_);
      doctorDetails_.setVisible(true);
      
      }
      
   }//GEN-LAST:event_doctorLabel10_MouseClicked


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel availPanel10_;
   private javax.swing.JPanel availPanel1_;
   private javax.swing.JPanel availPanel2_;
   private javax.swing.JPanel availPanel3_;
   private javax.swing.JPanel availPanel4_;
   private javax.swing.JPanel availPanel5_;
   private javax.swing.JPanel availPanel6_;
   private javax.swing.JPanel availPanel7_;
   private javax.swing.JPanel availPanel8_;
   private javax.swing.JPanel availPanel9_;
   private javax.swing.JPanel backgroundADP_;
   private javax.swing.JLabel doctorLabel10_;
   private javax.swing.JLabel doctorLabel1_;
   private javax.swing.JLabel doctorLabel2_;
   private javax.swing.JLabel doctorLabel3_;
   private javax.swing.JLabel doctorLabel4_;
   private javax.swing.JLabel doctorLabel5_;
   private javax.swing.JLabel doctorLabel6_;
   private javax.swing.JLabel doctorLabel7_;
   private javax.swing.JLabel doctorLabel8_;
   private javax.swing.JLabel doctorLabel9_;
   private javax.swing.JLabel guideLabel_;
   private javax.swing.JLabel titleAvailabilitiesLabel_;
   // End of variables declaration//GEN-END:variables
}
