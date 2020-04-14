

public class DinamikDiziMain {

	public static void main(String[] args){
		
		DynamicArray dizi = new DynamicArray();
	 
	        dizi.Append(10);
	        dizi.Append(20);
	        dizi.Append(30);
	        dizi.Append(40);
	        dizi.Append(50);
	       
	        dizi.Remove();
	        dizi.Remove();
	        dizi.Remove();
	}
}

class DynamicArray {
    public int boyut = 1;
    public int A[] = new int[boyut];
    private int sayac = 0;

    public void Append(int eleman) {
        if (sayac == boyut) {
            //Dizi boyutu iki katına çıkarılıyor.
            boyut = 2 * boyut;
            final int[] geciciDizi = new int[boyut];
            //yeni boyut ile oluşturulan geciciDizi'ye A dizisinin elemanları kopyalanıyor.
            System.arraycopy(A, 0, geciciDizi, 0, A.length);
            //A dizisine yeni oluşturulan geciciDizi kopyalanıyor.
            A = geciciDizi;
        }
        A[sayac] = eleman;
        sayac++;
    }

    public void Remove() {
        if (sayac > 0) {
            sayac--;
            A[sayac] = 0; // En son eklenen eleman 0 yapılıyor.
        }
        if (sayac == boyut / 4) {
            //Dizi boyutu yarıya indiriliyor.
            boyut = boyut / 2;
            final int[] geciciDizi = new int[boyut];
            //yeni boyut ile oluşturulan diziye a dizisinin elemanları kopyalanıyor.
            System.arraycopy(A, 0, geciciDizi, 0, geciciDizi.length);
            //A dizisine yeni oluşturulan geciciDizi kopyalanıyor.
            A = geciciDizi;
        }
    }
}

