/*

View Available Doctors Panel which adds 3 main panels for its functionality

By Daniel Vella

*/

package gui;

public class ViewAvailableDoctorPanel extends javax.swing.JPanel 
   {

   private LeftDisciplinesListPanel disciplines_;
   private MiddleAvailabilityPanel availability_;
   private RightDoctorsDetailsPanel details_;
   
   public ViewAvailableDoctorPanel() 
      {
         
      initComponents();
      initialiseViewAvailableDoctorPanel();
   
      }
   
   private void initialiseViewAvailableDoctorPanel()
      {

      details_ = new RightDoctorsDetailsPanel();
      availability_ = new MiddleAvailabilityPanel(details_);
      disciplines_ = new LeftDisciplinesListPanel(availability_);
      
      backgroundVADP_.add(disciplines_);
      backgroundVADP_.add(availability_);
      backgroundVADP_.add(details_);
      
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

      backgroundVADP_ = new javax.swing.JPanel();

      setBackground(new java.awt.Color(255, 255, 255));

      backgroundVADP_.setBackground(new java.awt.Color(255, 255, 255));
      backgroundVADP_.setLayout(new java.awt.GridLayout(1, 3));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(backgroundVADP_, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(backgroundVADP_, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
      );
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel backgroundVADP_;
   // End of variables declaration//GEN-END:variables
}
