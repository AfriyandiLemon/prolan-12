package mahasiswa;

public class Afriyandi extends Mahasiswa {

    @Override
    public void lulus() {
        System.out.println("setiap mahasiswa pasti lulus");
    }

    @Override
    public void kuliah() {
    System.out.println("belajar adalah kewajiban mahasiswa");    
    }

    @Override
    public void tidaklulus() {
    System.out.println("hanya ada mahasiswa yang tidak lulus tepat waktu");    
    }
    
}
