package maraton01.com.burak.maraton;

class HobiOzelListesi {
	private Boolean[][] hobiler;
	private int index;

	public HobiOzelListesi(int maxOgrenciSayisi) {
		this.hobiler = new Boolean[maxOgrenciSayisi][4];
		this.index = 0;
	}

	public void addHobiListesi(boolean yuzme, boolean konser, boolean gezi, boolean mac) {
		hobiler[index] = new Boolean[] { yuzme, konser, gezi, mac };
		index++;
	}

	public Boolean[][] getHobiler() {
		return hobiler;
	}
}
