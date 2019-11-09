package zipcode.hamming;

public class Hamming {
    String s;
    String s1;

    public Hamming(String s, String s1) throws IllegalArgumentException {
        // validate if the two strings are the same length
        if(s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        int hammingDistance = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s1.charAt(i))
                hammingDistance = hammingDistance + 1;
        }
        return hammingDistance;
    }
}
