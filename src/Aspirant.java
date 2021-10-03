public class Aspirant extends Student {
    String nauchnayaRabota;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String nauchnayaRabota) {
        super(firstName, lastName, group, averageMark);
        this.nauchnayaRabota = nauchnayaRabota;
    }

    int getScholarship() {
        if (this.averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
