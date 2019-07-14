import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Tictactio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactio window = new Tictactio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	  // Inilaization The Variable
	
	        int turn = 2;
	        int singlebutton [] = {0,0,0,0,0,0,0,0,0};   // Creating an array
	        
	         int playeronewon [] = {0,0,0,0,0,0,0,0,0};
	         int playertwowon [] = {0,0,0,0,0,0,0,0,0};
	         
	         // Creating an Method 
	         
	         //---------------------------------------- First Player Method--------------------------------//
	         int  playeronewon ()  
	         {
	        	 
	        	 
	        	 if(playeronewon[0]==1 && playeronewon[1]==1 && playeronewon[2]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[3]==1 && playeronewon[4]==1 && playeronewon[5]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[6]==1 && playeronewon[7]==1 && playeronewon[8]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[0]==1 && playeronewon[3]==1 && playeronewon[6]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[1]==1 && playeronewon[4]==1 && playeronewon[7]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[2]==1 && playeronewon[5]==1 && playeronewon[8]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[2]==1 && playeronewon[4]==1 && playeronewon[6]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playeronewon[0]==1 && playeronewon[4]==1 && playeronewon[8]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 
				return 0;
	        	 
	        	 
	        	 
				
	        	 
	        	
	         }
	         
	       //----------------------------END FIRSt PLAYER  METHOD----------------------------------------------------// 
	         
	         
//----------------------------------------SECOND PLAYER METHODS ---------------------------------------------------------//
	         
	         
	         
	         
	         //---------------------------------------- First Player Method--------------------------------//
	         int  playertwowon ()  
	         {
	        	 
	        	 
	        	 if(playertwowon[0]==1 && playertwowon[1]==1 && playertwowon[2]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[3]==1 && playertwowon[4]==1 && playertwowon[5]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[6]==1 && playertwowon[7]==1 && playertwowon[8]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[0]==1 && playertwowon[3]==1 && playertwowon[6]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[1]==1 && playertwowon[4]==1 && playertwowon[7]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[2]==1 && playertwowon[5]==1 && playertwowon[8]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[2]==1 && playertwowon[4]==1 && playertwowon[6]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 if(playertwowon[0]==1 && playertwowon[4]==1 && playertwowon[8]==1)
	        	 {
	        		 
	        	        return 1;
	        	 }
	        	 
	        	 
				return 0;
	        	 
	        	 
	        	 
				
	        	 
	        	
	         }
	         
	    //--------------------END ----------------------------------------------METHODS ---------------------------//     
	        
	public Tictactio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 0, 0));
		frame.setBounds(100, 100, 575, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton bt1 = new JButton("");
		bt1.setBounds(48, 28, 125, 89);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// IF it is even value Then Put X if it is Not Even Number than Put 0  
			   
				// Start
				if (singlebutton [0] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++; //increment
					 
					 bt1.setText("X");
					 
					 singlebutton[0]=1;
					 
					 playeronewon [0] = 1;
					 
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt1.setText("0");
					singlebutton[0]=1;
					playertwowon [0] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
					
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null," ! This Button is already Used !");
				}
				// END 
			}
		});
		frame.getContentPane().setLayout(null);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.setBounds(208, 28, 125, 89);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		if (singlebutton [1] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt2.setText("X");
					 
					 singlebutton[1]=1;
					 playeronewon [1] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt2.setText("0");
					singlebutton[1]=1;
					playertwowon [1] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
				// END
				
			}
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("");
		bt3.setBounds(372, 28, 125, 89);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		if (singlebutton [2] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt3.setText("X");
					 
					 singlebutton[2]=1;
					 playeronewon [2] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
					 
				}
				
				else
				{
					turn++;
					bt3.setText("0");
					singlebutton[2]=1;
					
					playertwowon [2] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
				// END
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt3);
		
		JButton bt4 = new JButton("");
		bt4.setBounds(48, 157, 125, 89);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   if (singlebutton [3] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt4.setText("X");
					 
					 singlebutton[3]=1;
					 
					 playeronewon [3] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt4.setText("0");
					singlebutton[3]=1;
					
					playertwowon [3] = 1;
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
				// END
			}
		});
		bt4.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("");
		bt5.setBounds(208, 157, 125, 89);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
                      if (singlebutton [4] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt5.setText("X");
					 
					 singlebutton[4]=1;
					 
					 playeronewon [4] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt5.setText("0");
					singlebutton[4]=1;
					
					playertwowon [4] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
			}
		});
		bt5.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("");
		bt6.setBounds(372, 157, 125, 89);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
          if (singlebutton [5] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt6.setText("X");
					 
					 singlebutton[5]=1;
					 
					 playeronewon [5] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
					   
				}
				
				else
				{
					turn++;
					bt6.setText("0");
					singlebutton[5]=1;
					playertwowon [5] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
					
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt6);
		
		JButton bt7 = new JButton("");
		bt7.setBounds(48, 280, 125, 89);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
if (singlebutton [6] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt7.setText("X");
					 
					 singlebutton[6]=1;
					 
					 playeronewon [6] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt7.setText("0");
					singlebutton[6]=1;
					
					playertwowon [6] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
			}
		});
		bt7.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt7);
		
		JButton bt8 = new JButton("");
		bt8.setBounds(208, 280, 125, 89);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               
				  if (singlebutton [7] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt8.setText("X");
					 
					 singlebutton[7]=1;
					 
					 playeronewon [7] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt8.setText("0");
					singlebutton[7]=1;
					
					playertwowon [7] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
			}
		});
		bt8.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt8);
		
		JButton bt9 = new JButton("");
		bt9.setBounds(372, 280, 125, 89);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
                if (singlebutton [8] ==0)
					
				{
				
				if (turn %2==0)
				{
					 turn++;
					 bt9.setText("X");
					 
					 singlebutton[8]=1;
					 
					 playeronewon [8] = 1;
					 
 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2==1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
				else
				{
					turn++;
					bt9.setText("0");
					singlebutton[8]=1;
					
					playertwowon [8] = 1;
					
					 //=================================================//
					 
					 // WINING OUTPUT
					   int result1 = playeronewon();
					   int result2 = playertwowon();
					 
					   if(result1==1)
					   {
						   
						     JOptionPane.showMessageDialog(null, "Congratulations, PLAYER ONE Won The Game ! ");
					   }
					   
					   else if (result2 == 1)
					   {
						   JOptionPane.showMessageDialog(null, "Congratulations, PLAYER SECOND Won The Game ! ");
						    
					   }
					   // END WINING ELSE IF
					   //=================================================//
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null,"! This Button is already Used !");
				}
			}
		});
		bt9.setFont(new Font("Tahoma", Font.BOLD, 26));
		frame.getContentPane().add(bt9);
		
		JButton btplay = new JButton("Play Again");
		btplay.setForeground(new Color(204, 0, 0));
		btplay.setBounds(183, 399, 177, 39);
		btplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		//RESET ALL BUTTON =================================================================
				
				bt1.setText("");
				bt2.setText("");
				bt3.setText("");
				bt4.setText("");
				bt5.setText("");
				bt6.setText("");
				bt7.setText("");
				bt8.setText("");
				bt9.setText("");
				 
				
				// Creating For Loop
				
				turn =2;
				
				for(int i=0; i<9 ; i++)
				{
					
					singlebutton[i]=0;
					 
				}
				
				 for(int i=0;i<9;i++)
				 {
					 playeronewon[i]=0;
				 }
	
				 
				 for(int i=0;i<9;i++)
				 {
					 playertwowon[i]=0;
				 }
			}
		});
		btplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btplay);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 447, 559, 21);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 204, 102));
		frame.getContentPane().add(panel);
	}
}
