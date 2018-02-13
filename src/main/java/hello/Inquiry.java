package hello;

public class Inquiry {
    private final String item;
    private final String store;
    
    public Inquiry(String item, String store) {
    	this.item = item;
    	this.store = store;
    }

	public String getItem() {
		return item;
	}

	public String getStore() {
		return store;
	}
    
    
}
