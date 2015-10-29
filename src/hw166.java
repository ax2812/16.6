import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Panel;


public class hw166 extends JFrame {
   static int r = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hw166 frame = new hw166();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hw166() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		message p = new message(0);
		add(p);
		
	}
	
	static class message extends JPanel {
		String mess = "";
		String a = "java is fun";
		String b = "java is powerful";
		
				
		
		public message(int s){
			addMouseListener(new MouseListener(){
				
				@Override
				public void mouseClicked(MouseEvent e) {
					
					// TODO Auto-generated method stub
					if(r == 0){
						mess = b;
						repaint();
						r++;
					}
					else {
						mess = a;
						repaint();
						r--;
					}
				}
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
				
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				
			});
				
				
			}
			@Override
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				g.drawString(mess, 100, 100);
			}
			
			
			
		}
		
		
	}
	
	
	


