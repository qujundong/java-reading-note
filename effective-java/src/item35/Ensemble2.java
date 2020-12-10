package item35;

public enum Ensemble2 {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
    NONET(9), DECTET(10), TRIPLE_QUARTET(12);
    private final int numberOfMusicians;
    Ensemble2(int size) { this.numberOfMusicians = size; }
    public int numberOfMusicians() { return numberOfMusicians; }

    public static void main(String[] args) {
        System.out.println(Ensemble2.TRIPLE_QUARTET.numberOfMusicians);
    }
}