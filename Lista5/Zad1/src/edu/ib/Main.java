package edu.ib;

public class Main {

    public static void main(String[] args) {
	BisectionE bisectionE = new BisectionE(-5, 5, 0.0001, 100);
	//FixedPointE fixedPointE = new FixedPointE(1, 0.01, 100);
	NewtonE newtonE = new NewtonE(1.016, 0.9, 0.01, 100);
	//SieczneE sieczneE = new SieczneE(1, 2, 0.01, 100);
    }
}
