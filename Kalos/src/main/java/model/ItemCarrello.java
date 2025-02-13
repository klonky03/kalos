package model;

public class ItemCarrello {

	public ItemCarrello(ProdottoBean prodotto){
		this.prodotto = prodotto;
		quantitąCarrello = 1;
	}
	
	public ProdottoBean getProdotto() {
		return prodotto;
	}
	
	public void setProdotto(ProdottoBean prodotto) {
		this.prodotto = prodotto;
	}
	
	public int getQuantitąCarrello() {
		return quantitąCarrello;
	}
	
	public void setQuantitąCarrello(int quantitą) {
		this.quantitąCarrello = quantitą;
	}
	
	public int getId() {
		return prodotto.getIdProdotto();
	}
	
	public double getTotalPrice() {
		return quantitąCarrello * prodotto.getPrezzo();
		

	}
	
	public String getDescription() {
		return prodotto.getDescrizione();
	}
	
	public void incrementa() {
		if(quantitąCarrello < prodotto.getQuantitą() )
			quantitąCarrello = quantitąCarrello + 1;
	}
	
	public void decrementa() {
		if( quantitąCarrello > 1)
			quantitąCarrello = quantitąCarrello - 1;
	}
	
	private ProdottoBean prodotto;
	private int quantitąCarrello;
}