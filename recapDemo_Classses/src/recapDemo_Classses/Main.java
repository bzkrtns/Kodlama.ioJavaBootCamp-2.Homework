package recapDemo_Classses;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();

		int toplam = dortIslem.Toplama(12, 4);
		System.out.println(toplam);

		int cıkar = dortIslem.Cıkarma(12, 4);
		System.out.println(cıkar);

		int bol = dortIslem.Bolme(12, 4);
		System.out.println(bol);

		int carp = dortIslem.Çarpma(12, 4);
		System.out.println(carp);

	}

}
