import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import card.Card;
import card.CardPanel;

public class MainFrame extends JFrame{

	private CardPanel cardPanel;
	
	public MainFrame() {
		
		super("Nuki Flash Cards");
		
		setLayout(new BorderLayout());
		
		setMinimumSize(new Dimension(500, 500));
		setPreferredSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.revalidate();
		this.pack();
		this.repaint();
		this.setLocationRelativeTo(null);
		
		setVisible(true);
		
		layoutComponents();
		
	}
	
	private void layoutComponents() {
		
		CardPanel cardPanel = new CardPanel();
		
		Card card1 = new Card("Powerhouse of the cell", "Mitochondria");
		Card card2 = new Card("protein stuff made where", "ribosomes");
		
		cardPanel.addToCardsList(card1);
		cardPanel.addToCardsList(card2);
		
		this.add(cardPanel, BorderLayout.CENTER);
		
	}
	
}
