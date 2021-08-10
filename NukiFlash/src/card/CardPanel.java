package card;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import customComponents.CustomButton;

public class CardPanel extends JPanel{

	private CardDictionary cardDictionary = new CardDictionary();
	
	public CardPanel() {
		
		setLayout(new BorderLayout());
		
		CardDictionary cardDictionary = new CardDictionary();
		layoutComponents();
		
	}

	private CustomButton flipCardButton;
	private JTextField cardText = new JTextField();;
	private int temp = 1;
	
	private void layoutComponents() {
		
		//JTextField cardText = new JTextField();
		
		cardText.setEditable(false);
		cardText.setPreferredSize(new Dimension(400, 350));
		
		CustomButton flipCardButton = new CustomButton("Flip Card");
		
		flipCardButton.setPreferredSize(new Dimension(400, 150));
		
		flipCardButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				flipCard();
			}
			
		});
		
		this.add(cardText, BorderLayout.CENTER);
		this.add(flipCardButton, BorderLayout.SOUTH);
		
	}
	
	public void flipCard() {
		if (temp % 2 == 0) {
			cardText.setText(cardDictionary.cardsList.get(0).getBackFaceQ());
		} else {
			cardText.setText(cardDictionary.cardsList.get(0).getFrontFaceA());
		}
		temp++;
	}
	
}
