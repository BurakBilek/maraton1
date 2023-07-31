package maraton01.com.burak.maraton;

import java.util.Scanner;

public class Runner1 {

	public static void main(String[] args) {
		OgrenciOzelListesi ogrenciArray = new OgrenciOzelListesi();
		Scanner sc = new Scanner(System.in);
		int secim = 0;
		int ogrenciSayiDizisi = 0;

		boolean[] yuzmehobisi;
		boolean[] konserhobisi;
		boolean[] gezihobisi;
		boolean[] machobisi;

		while (true) {
			System.out.println("MENÜ");
			System.out.println("1- Sınıf arkadaşı tanımla");
			System.out.println("2- Hobilerini gir");
			System.out.println("3- Maaş beklentilerini gir");
			System.out.println("4- Sınıf listesi");
			System.out.println("0- ÇIKIŞ");
			secim = sc.nextInt();

			switch (secim) {
			case 1:
				System.out.print("Bu sınıfa kaç öğrenci tanımlayacaksınız? : ");
				ogrenciSayiDizisi = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < ogrenciSayiDizisi; i++) {
					System.out.println((i + 1) + ". Öğrencinin adı: ");
					String ogrenciAdi = sc.nextLine();
					ogrenciArray.add(ogrenciAdi);
				}
				break;

			case 2:
				yuzmehobisi = new boolean[ogrenciSayiDizisi];
				konserhobisi = new boolean[ogrenciSayiDizisi];
				gezihobisi = new boolean[ogrenciSayiDizisi];
				machobisi = new boolean[ogrenciSayiDizisi];

				System.out.println("Öğrencilerin hobilerini giriniz: ");

				for (int i = 0; i < ogrenciSayiDizisi; i++) {
					System.out.println(ogrenciArray.getlist()[i] + " için hobilerini giriniz (true/false): ");
					System.out.print("Yüzmekten hoşlanır mısın? ");
					yuzmehobisi[i] = sc.nextBoolean();
					System.out.print("Konsere gitmekten hoşlanır mısın? ");
					konserhobisi[i] = sc.nextBoolean();
					System.out.print("Gezmekten hoşlanır mısın? ");
					gezihobisi[i] = sc.nextBoolean();
					System.out.print("Maç izlemekten hoşlanır mısın? ");
					machobisi[i] = sc.nextBoolean();
					sc.nextLine();
				}

				break;

			case 3:
				for (int i = 0; i < ogrenciSayiDizisi; i++) {
					System.out.print("Maaş beklentisi giriniz: ");
					double maas = sc.nextDouble();
					sc.nextLine();
					System.out.println(ogrenciArray.getlist()[i] + "'nın maaş beklentisi: " + maas);
				}

				break;

			case 4:

				break;

			case 0:
				System.out.println("ÇIKIŞ");
				break;

			default:
				System.err.println("Geçerli bir seçim yapınız.");
			}
		}
	}
}
