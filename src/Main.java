import java.awt.*;    
import java.awt.event.*; 
import java.io.File;
import javax.swing.filechooser.FileSystemView;
  
 
public class Main extends WindowAdapter {    
 
/*    Frame f;    
    Main() {    
      f = new Frame();
      f.addWindowListener (this);    
      f.setSize (400, 400);    
      f.setLayout (null);    
      f.setVisible (true);    
    }
  
   @Override
   public void windowClosing (WindowEvent e) {    
      f.dispose();    
   }     */

   // main method  
   public static void main(String[] args) {
      //new Main();

      File[] drives = File.listRoots();
      FileSystemView fsv = FileSystemView.getFileSystemView();
      
      if(drives.length > 0 && drives != null) {
         for(File drive : drives)
         {
            System.out.println("--------------------------------");
            System.out.println("Drive Name "+drive);
            System.out.println("Type Of Drive: " + fsv.getSystemTypeDescription(drive));
            System.out.println("Total Space: " + drive.getTotalSpace()/(1024*1024*1024) + " GB");
            System.out.println("Free Space: " + drive.getFreeSpace()/(1024*1024*1024) + " GB");
            System.out.println("Usable Drive: " + drive.getUsableSpace()/(1024*1024*1024) + " GB");
         }
      }
   }    
}    
