package Projects;

import java.awt.*;


import javax.sound.sampled.Clip;

import javax.swing.*;

import java.awt.event.*;

import java.sql.*;
@SuppressWarnings("serial")
public class ConfirmPage extends JFrame{
	JButton home=new JButton(new ImageIcon(getClass().getResource("home.jpg")));
	//JButton info=new JButton(new ImageIcon(getClass().getResource("info.png")));
	JButton quit=new JButton(new ImageIcon(getClass().getResource("quit.jpg")));
	JButton restart=new JButton(new ImageIcon(getClass().getResource("restart.jpg")));
	//JButton score=new JButton(new ImageIcon(getClass().getResource("score.png")));


    JLabel l=new JLabel(new ImageIcon(getClass().getResource("thank.gif")));
   
    

Color blue=new Color(27,233,233);
Color yellow=new Color(255,255,0);
Color green=new Color(0,255,0);
Color purple=new Color(128,0,64);

boolean flag,control,setsound=true;
int count,scount;

String name,sname;
int playerno,number=0;
Clip clip;

Statement statement;
Connection connection;
public ConfirmPage(){
	
	
	home.setFocusable(false);
	
    	
	

	
	
    	home.setBackground(green);
    	//info.setBackground(pink);
    	//forward.setBackground(pink);
    quit.setBackground(yellow);
    	restart.setBackground(blue);

    	//.setBackground(pink);


    	


    	JPanel p=new JPanel(new GridLayout(3,1,93,93));
    	p.add(restart);
        p.add(home);
        p.add(quit);
        p.setBackground(purple);
    

    	
    	JPanel mainpanel=new JPanel(new  FlowLayout());
    	mainpanel.add(l,BorderLayout.WEST);
    	mainpanel.add(p,BorderLayout.CENTER);

    	mainpanel.setBackground(purple); 
    	
    	add(mainpanel);
    	setTitle("Choose Menu");
		setVisible(true);
		setSize(1300,650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
    	
    	
		home.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			TravellingGame t=new TravellingGame();
    			//t.setSize(1650,1080);
    			t.setTitle("Choose Menu");
    			t.setVisible(true);
    			t.setSize(1110,690);
    			t.setLocationRelativeTo(null);
    			 Image icon=new ImageIcon("src/p.jpg").getImage();
    				t.setIconImage(icon);
    		    setVisible(false);
    		    TravellingGame.clip.stop();
    				
    			
    		}
    	});
    	
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			System.exit(0);
				
			}
			});
		restart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				travel1 t=new travel1();
    			t.setSize(1380,758);
    			t.setUndecorated(true);
    			t.setTitle("Travelling Game");
    			t.setVisible(true);
    			t.setLocationRelativeTo(null);
    			 Image icon=new ImageIcon("src/p.jpg").getImage();
    				t.setIconImage(icon);
    			setVisible(false);
				
			}
			});
		
 
 
 
  


    }
	public static void main(String[] args) {
	new ConfirmPage();
		

		//new SoundTesting();

	}

}
