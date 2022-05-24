import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.Math;

/*
Autor: Mateo Matijevic Bosnjak
Description: Homework02 - The best program ever made / GUI Interface with basic functions and buttons 
Program was made in a agressive/comical aproach towards the person using hope please do not get inuslted by it or anything of the sorts it was not my intention
Verion: 1.0.0
*/
public class GUIHell extends JFrame {

   private JTextField jtfRandomNumber;
   private JTextField jtfBirth;
   private JTextField jtfRandomName;
   private JTextField jtfRandomLastName;
   private JTextField jtfEasyMode;
   private JSlider phoneNumberSlider;
   int rangeBirth;
   private JButton btnRandomise;
   private JButton btnName;
   private JButton btnLName;
   private JButton btnBirth;
   private JButton btnThatsMe;
   private Random rCharacter;
   private JMenu menuFromHell;
   private JMenuBar menuBarFromHell;
   private JMenuItem description;
   private JMenuItem help;
   private JMenuItem exit;
   int randomNum;
   String plsWork;
   // Static Ints needed for slider (Phone Number)
   static final int PHN_MIN = 000000000;
   static final int PHN_MAX = 999999999;

   public GUIHell() {
      // Sets Layout for GUIHell
      setLayout(new BorderLayout());

      // Menu for GUIHell
      JMenuBar menuBar = new JMenuBar();
      JMenu menu = new JMenu("Escape");
      JMenu subMenu1 = new JMenu("Help");
      JMenu subMenu2 = new JMenu("Help");
      JMenu subMenu3 = new JMenu("Help");
      JMenu subMenu4 = new JMenu("Help");
      JMenu subMenu5 = new JMenu("Help");
      JMenu subMenu6 = new JMenu("Help");
      JMenu subMenu7 = new JMenu("Help");
      JMenu subMenu8 = new JMenu("Help");
      JMenu subMenu9 = new JMenu("Help");
      JMenu subMenu10 = new JMenu("Help");
      JMenu subMenu11 = new JMenu("Help");
      menuBar.add(menu);
      JMenuItem description = new JMenuItem("Description");
      JMenuItem help = new JMenuItem("Help");
      JMenuItem exit = new JMenuItem("Exit");
      menu.add(description);
      menu.add(help);
      menu.add(subMenu1);
      subMenu1.add(subMenu2);
      subMenu2.add(subMenu3);
      subMenu3.add(subMenu4);
      subMenu4.add(subMenu5);
      subMenu5.add(subMenu6);
      subMenu6.add(subMenu7);
      subMenu7.add(subMenu8);
      subMenu8.add(subMenu9);
      subMenu9.add(subMenu10);
      subMenu10.add(subMenu11);
      subMenu11.add(help);
      menu.add(exit);
      setJMenuBar(menuBar);

      // Action listeners that give functionality to items in menu
      description.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null,
                  "What needs to be described? This is only the best application ever made. I mean IGN gave us a perfect 5/7 what more is there to say.");
            JOptionPane.showMessageDialog(null,
                  "What you are seeing infront of you now however is a dialog message duhh...");
            JOptionPane.showMessageDialog(null,
                  "But behind this is our state of the art anti-hacker and AI busting captcha. It is quite simple all you need to do is enter your CORRECT Phone Number, Date of Birth, Name and Last name in order to see our program in all its glory!");
         }
      });

      help.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Hmm... How do I put this...");
            JOptionPane.showMessageDialog(null, "You are on your own :)");
         }
      });
      exit.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Gone so soon?");
            System.exit(0);
         }
      });

      // North panel - Label's and text fields
      JPanel jpTopDog = new JPanel();
      add(jpTopDog, BorderLayout.NORTH);
      jpTopDog.setBackground(
            new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
      jpTopDog.setLayout(new GridLayout(4, 0, 5, 5));

      JLabel lblPhoneNumber = new JLabel("Your Phone Number: ");
      lblPhoneNumber.setForeground(Color.white);
      lblPhoneNumber.setHorizontalAlignment(JLabel.LEFT);
      jpTopDog.add(lblPhoneNumber);

      JTextField jtfRandomNumber = new JTextField("");
      jpTopDog.add(jtfRandomNumber);

      JLabel lblBirth = new JLabel("Your Date Of Birth: ");
      lblBirth.setForeground(Color.pink);
      lblBirth.setHorizontalAlignment(JLabel.CENTER);
      jpTopDog.add(lblBirth);

      JTextField jtfBirth = new JTextField("");
      jpTopDog.add(jtfBirth);
      jtfBirth.setEditable(false);

      JLabel lblName = new JLabel("Your Name: ");
      lblName.setForeground(Color.gray);
      lblName.setHorizontalAlignment(JLabel.CENTER);
      jpTopDog.add(lblName);

      JTextField jtfRandomName = new JTextField("");
      jpTopDog.add(jtfRandomName);
      jtfRandomName.setEditable(false);

      JLabel lblLastName = new JLabel("Your Last Name: ");
      lblLastName.setForeground(Color.yellow);
      lblLastName.setHorizontalAlignment(JLabel.RIGHT);
      jpTopDog.add(lblLastName);

      JTextField jtfRandomLastName = new JTextField("");
      jpTopDog.add(jtfRandomLastName);
      jtfRandomLastName.setEditable(false);

      // New JPanel for center
      JPanel jpCenter = new JPanel();
      jpCenter.setLayout(new GridLayout(0, 1, 5, 5));
      jpCenter.setBackground(
            new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
      jpCenter.setForeground(
            new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));

      add(jpCenter, BorderLayout.CENTER);

      // Creates a slider which can alter the number in the phone number textbox
      JSlider phoneNumberSlider = new JSlider(PHN_MIN, PHN_MAX);
      jpCenter.add(phoneNumberSlider);
      phoneNumberSlider.addChangeListener(
            new ChangeListener() {
               public void stateChanged(ChangeEvent ce) {
                  jtfRandomNumber.setText("+385" + phoneNumberSlider.getValue());
               }
            });

      JLabel lblEasyMode = new JLabel("The peasant way of setting phone number");
      lblEasyMode.setForeground(Color.red);
      lblEasyMode.setHorizontalAlignment(JLabel.CENTER);
      jpCenter.add(lblEasyMode);

      JRadioButton jrbDontTouchMe = new JRadioButton("Don't touch me");
      JRadioButton jrbTermination = new JRadioButton("Terminator");

      jpCenter.add(jrbDontTouchMe);
      jpCenter.add(jrbTermination);
      jrbDontTouchMe.setHorizontalAlignment(JRadioButton.CENTER);
      jrbTermination.setHorizontalAlignment(JRadioButton.CENTER);

      // Button thats me that prompts messages and exits upon click
      JButton btnThatsMe = new JButton("Thats me!");
      jpCenter.add(btnThatsMe);
      btnThatsMe.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "THATS YOU?");
            JOptionPane.showMessageDialog(null, "NO WAY!");
            JOptionPane.showMessageDialog(null, "CONGRATS!");
            JOptionPane.showMessageDialog(null, "YOU ARE ABOUT TO SEE THE GREATEST PROGRAM EVER MADE");
            JOptionPane.showMessageDialog(null, "DOES THAT EXCITE YOU?");
            JOptionPane.showMessageDialog(null, "WELL IT SHOULD!");
            JOptionPane.showMessageDialog(null, "HERE GOES NOTHING!");
            JOptionPane.showMessageDialog(null,
                  "Do you really thing we would allow our master piece to be seen by anyone?");
            JOptionPane.showMessageDialog(null,
                  "Expecialy someone who is willing to give his/hers personal information to a random program");
            JOptionPane.showMessageDialog(null, "And for the record we know you didn't even put in the correct info");
            JOptionPane.showMessageDialog(null, "Nor do we appreciate liars");
            JOptionPane.showMessageDialog(null, "Mr. Who ever you are!");
            System.exit(0);
         }
      });

      // I wanted to use the mouse handler in order to make it so that when you move
      // around the field the colors would change or something would happen to the
      // screen but I didn't have enough knowlage to do this
      jrbDontTouchMe.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            jpTopDog.setBackground(Color.gray);
            btnRandomise.setEnabled(false);
            btnName.setEnabled(false);
            btnLName.setEnabled(false);
            btnBirth.setEnabled(false);
            btnThatsMe.setEnabled(false);
            JOptionPane.showMessageDialog(null, "I told you not to touch me!");
            JOptionPane.showMessageDialog(null, "Now I'll brake everything! >:(");
         }
      });
      jrbTermination.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            System.exit(0);
         }
      });

      // New JPanel for south/buttons
      JPanel jpDownDog = new JPanel();
      jpDownDog.setLayout(new GridLayout(0, 2));
      // jpDownDog.setBackground(new Color((int)(Math.random() * 255),
      // (int)(Math.random() * 255), (int)(Math.random() * 255)));
      add(jpDownDog, BorderLayout.SOUTH);

      // Gives a random number when button Give my number is clicked
      btnRandomise = new JButton("Give my number");
      jpDownDog.add(btnRandomise);
      btnRandomise.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  jtfRandomNumber.setText("+385" + (int) (Math.random() * 1000000000));
               }
            });

      // Button and "formula" for random dates of birth between 1900 and 2100
      btnBirth = new JButton("Give my Birth");
      // Integers for making date viable and excluding 0
      int minYear = 1900;
      int maxYear = 2100;
      int rangeYear = (maxYear - minYear) + 1;
      int minMonth = 1;
      int maxMonth = 12;
      int rangeMonth = (maxMonth - minMonth) + 1;
      int minDay = 1;
      int maxDay = 31;
      int rangeDay = (maxDay - minDay) + 1;
      jpDownDog.add(btnBirth);
      btnBirth.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  jtfBirth.setText(((int) (Math.random() * rangeDay) + minDay) + "/"
                        + ((int) (Math.random() * rangeMonth) + minMonth) + "/"
                        + ((int) (Math.random() * rangeYear) + minYear));
               }
            });

      // Button for "random" name generation
      btnName = new JButton("Give my name");
      jpDownDog.add(btnName);
      btnName.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  String[] whoAreYou = { "Mateo", "Ante", "Alan", "Ivan", "Filip", "Dorijan", "Karlo", "Petar",
                        "Kristijan", "Donatello", "Mikey", "Ivor", "Matej",
                        "Leonardo", "Josip", "Pedro", "Marija", "Marijana", "Ivana", "Ivona", "Ena", "Ema", "Patricija",
                        "Iva", "Petra", "Zana", "Karolina", "Melani", "Antonija",
                        "Barbara", "Viktorija", "Stjepan", "Sven" };
                  int rName = (int) (Math.random() * whoAreYou.length);
                  jtfRandomName.setText(whoAreYou[rName]);
               }
            });

      // Button for "random" last name generation
      btnLName = new JButton("Give my last name");
      jpDownDog.add(btnLName);
      btnLName.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  String[] whoIsYourFamiliy = { "Matijevic", "Bosnjak", "Runjic", "Mutka", "Ledencan", "Goldschmit",
                        "Karacic", "Stipancic", "Duvnjak", "Golubovic",
                        "Biber", "Mandukic", "Mlinarevic", "Kispal", "Galic", "Horvat", "Dupljak", "Ivanic", "Vlah",
                        "Baric", "Barisic", "Rosso", "Stojsic", "Briski",
                        "Zana", "Milanovic", "Pernar", "Gibraltar", "Escobar", "Lesskovac", "Novoselic" };
                  int rLastName = (int) (Math.random() * whoIsYourFamiliy.length);
                  jtfRandomLastName.setText(whoIsYourFamiliy[rLastName]);
               }
            });

      // WindowListener used in the case of the user trying to exit the program dialog
      // pops up - works with JFrame.DO_NOTHING_ON_CLOSE
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
            JOptionPane.showMessageDialog(null, "Yeah about that...");
            JOptionPane.showMessageDialog(null, "You've alreay seen to much.");
            JOptionPane.showMessageDialog(null, "These security measure rival that of CIA and FBI");
            JOptionPane.showMessageDialog(null, "Until you fill these out you can't leave");
            JOptionPane.showMessageDialog(null, "You know just for our safety ;)");
            JOptionPane.showMessageDialog(null, "I mean we don't want you to get the wrong idea");
            JOptionPane.showMessageDialog(null, "We already know everything about you and your digital footprint");
            JOptionPane.showMessageDialog(null, "Mr. Who ever you are!");
            JOptionPane.showMessageDialog(null, "Well here you go back to the security measures");
            JOptionPane.showMessageDialog(null, "");
            JOptionPane.showMessageDialog(null, "");
            JOptionPane.showMessageDialog(null, "");
            JOptionPane.showMessageDialog(null, "Ivane kako ovo zatvorimo?");
            JOptionPane.showMessageDialog(null, "Pa samo stisni OK");
         }
      });
   }// End of constructor

   public static void main(String args[]) {
      GUIHell giveMePointsPlease = new GUIHell();
      giveMePointsPlease.setTitle(
            "I don�t have the time or the crayons to explain how I made the best program ever, but as soon as you fill out the following fields you will see it in all its glory.");
      // giveMePointsPlease.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      giveMePointsPlease.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      giveMePointsPlease.setLocation(900, 300);
      giveMePointsPlease.setVisible(true);
      giveMePointsPlease.pack();
   }// End of main
}// End of class GUIHells