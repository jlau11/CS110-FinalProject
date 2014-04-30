import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// War Gui outline

public class WarGui extends JFrame
{
   private War game;
   private Jpanel topPanel, leftPanel, rightPanel;
   private JButton button;
   
   public WarGui()
   {
      setLayout(new GridLayout(2,1));
      game = new War();
      topPanel = new JPanel();
      topPanel.setBackground(Color.Yellow);
      title = JLabel ("WAR - CARD GAME")
      topPanel.add(title);
      
      leftPanel = new JPanel();
      leftPanel.setBackground(color.blue);
      leftPanel.add(new JLabel(ImageIcon("back.jpg")));
      add(button, leftPanel);
      
      rightPanel = new JPanel();
      rightPanel.setBackground(color.black);
      rightPanel.add(new JLabel(ImageIcon("back.jpg")));
      add(button, rightPanel);

      
    }
      
     
      
