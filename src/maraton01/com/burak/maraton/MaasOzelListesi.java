package maraton01.com.burak.maraton;

public class MaasOzelListesi {

	double[] maasArray;
	int boyut = 0;

	public void add(double maas) {
		double[] tmp;
		if (maasArray == null) {
			maasArray = new double[1];
			maasArray[0] = maas;
		} else {
			tmp = new double[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = maasArray[i];
			tmp[boyut] = maas;
			maasArray = tmp;
		}
		boyut++;
	}

	public double[] getList() {
		return maasArray;
	}
}