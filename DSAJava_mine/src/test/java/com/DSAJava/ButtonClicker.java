package com.DSAJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClicker extends JFrame implements ActionListener
	{
	    static int score = 0;

	    public static void main (String[] args)
	    {
	        ButtonClicker run = new ButtonClicker();
	        run.cole();
	    } // main method

	    public ButtonClicker () 
	    {
	        JFrame j = new JFrame("Window title");
	        JButton click = new JButton("button");

	        j.getContentPane().add(click);

	        click.addActionListener(this);

	        j.setSize(450,450);
	        j.setVisible(true);
	    }
	    
	    @Override
	    public void actionPerformed(ActionEvent e)
	    {	
	    	try {
				Runtime.getRuntime().exec("cls");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        System.out.println("Score: " + score);
	        score++;        
	    }

	    public void cole ()
	    {
 
	    }

		
	
	} // ButtonClicker class

