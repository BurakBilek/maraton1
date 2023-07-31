package maraton01.com.burak.maraton;

public class OgrenciOzelListesi {

	String[] ogrenciArray;
	int boyut = 0;

	public void add(String ogrenciAdi) {
		String[] tmp;

		if (ogrenciArray == null) {
			ogrenciArray = new String[1];
			ogrenciArray[0] = ogrenciAdi;
		} else {
			tmp = new String[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = ogrenciArray[i];
			tmp[boyut] = ogrenciAdi;
			ogrenciArray = tmp;
		}
		boyut++;

	}

	public String[] getlist() {

		return ogrenciArray;

	}

}