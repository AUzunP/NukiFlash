package card;

public class Card {

	private String frontFaceA;
	private String backFaceQ;
	
	public Card(String frontFaceA, String backFaceQ) {
		
		this.frontFaceA = frontFaceA;
		this.backFaceQ = backFaceQ;
		
	}

	public String getFrontFaceA() {
		return frontFaceA;
	}

	public void setFrontFaceA(String frontFaceA) {
		this.frontFaceA = frontFaceA;
	}

	public String getBackFaceQ() {
		return backFaceQ;
	}

	public void setBackFaceQ(String backFaceQ) {
		this.backFaceQ = backFaceQ;
	}
	
}
