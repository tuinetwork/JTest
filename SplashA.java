import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SplashA extends JFrame implements ActionListener, MouseListener {
	ImageIcon im,cal,cal2;
	JLabel sp,as;
	int posX=0,posY=0;

	SplashA() {
		init();
	}

	private void init(){

		im = new ImageIcon("src/amine/anime.png");
		cal = new ImageIcon("src/amine/button-cancel.png");
		sp = new JLabel();

		sp.setBounds(0, 0, 628, 337);
		sp.setIcon(im);

		as = new JLabel();
		as.setBounds(570, 0, 50, 50);
		as.setIcon(cal);
		
		this.setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));
		this.add(sp);
		this.add(as);

		as.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e)  {
		       // you can open a new frame here as
		       // i have assumed you have declared "frame" as instance variable
			    	System.exit(JFrame.EXIT_ON_CLOSE);
		    }
		});
		as.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				cal2 = new ImageIcon("src/amine/button-cancel_red.png");
				as.setIcon(cal2);
			}
		});
		as.addMouseListener(new MouseAdapter() {
		    public void mouseExited(MouseEvent arg0) {
		    	cal= new ImageIcon("src/amine/button-cancel.png");
				as.setIcon(cal);
			}
		});

		this.addMouseListener(new MouseAdapter(){
		   public void mousePressed(MouseEvent e){
		      posX=e.getX();
		      posY=e.getY();
		   }
		});
		this.addMouseMotionListener(new MouseAdapter() {
		     public void mouseDragged(MouseEvent evt){
				//sets frame position when mouse dragged
				setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
		     }
		});

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
