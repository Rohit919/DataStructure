package javaBasic;

import java.util.Scanner;
import java.util.Scanner;

public class _4_Particle {

	static float dist(float x1, float x2, float y1, float y2, float z1, float z2) {
		float d = 0;
		d = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2) * 1.0);
		return d;
	}

	static float area(float side1, float side2, float side3 ){
		 float s = (side1+side2+side3)/2;
		 float are = (float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		 return are;
		}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		float h, a, b, c, d, va, vb, vc, vd;

		h = scn.nextFloat();
		a = scn.nextFloat();
		b = scn.nextFloat();
		c = scn.nextFloat();
		d = scn.nextFloat();
		va = scn.nextFloat();
		vb = scn.nextFloat();
		vc = scn.nextFloat();
		vd = scn.nextFloat();

		char da, db, dc, dd;

		da = scn.next().charAt(0);
		db = scn.next().charAt(0);
		dc = scn.next().charAt(0);
		dd = scn.next().charAt(0);

		if (da == 'D') {
			va = va * (-1);
		}

		if (db == 'D') {
			vb = vb * (-1);
		}
		if (dc == 'D') {
			vc = vc * (-1);
		}
		if (dd == 'D') {
			vd = vd * (-1);
		}

		float xa = 0, ya = h * (-1);
		float xb = h, yb = h * (-1);
		float xc = h, yc = 0;
		float xd = 0, yd = 0;

		float[][] z = new float[100][4];

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 4; j++) {
				z[i][j] = 0;
			}
		}

		z[0][0] = a;
		z[0][1] = b;
		z[0][2] = c;
		z[0][3] = d;
		for (int i = 1; i < 100; i++) {
			z[i][0] = z[i - 1][0] + va;
			z[i][1] = z[i - 1][1] + vb;
			z[i][2] = z[i - 1][2] + vc;
			z[i][3] = z[i - 1][3] + vd;

			if (z[i][0] > h) {
				z[i][0] = h;
			}
			if (z[i][0] < 0) {
				z[i][0] = 0;
			}
			if (z[i][1] > h) {
				z[i][1] = h;
			}

			if (z[i][1] < 0) {
				z[i][1] = 0;
			}
			if (z[i][2] > h) {
				z[i][2] = h;
			}
			if (z[i][2] < 0) {
				z[i][2] = 0;
			}
			if (z[i][3] > h) {
				z[i][3] = h;
			}
			if (z[i][3] < 0) {
				z[i][3] = 0;
			}
		}

		float[] ab = new float[100];
		for (int i = 0; i < 100; i++) {
			ab[i] = dist(xa, xb, ya, yb, z[i][0], z[i][1]);
		}

		float[] bc = new float[100];
		for (int i = 0; i < 100; i++) {
			bc[i] = dist(xb, xc, yb, yc, z[i][1], z[i][2]);
		}

		float[] ac = new float[100];
		for (int i = 0; i < 100; i++) {
			ac[i] = dist(xa, xc, ya, yc, z[i][0], z[i][2]);
		}

		float[] ad = new float[100];
		for (int i = 0; i < 100; i++) {
			ad[i] = dist(xa, xd, ya, yd, z[i][0], z[i][3]);
		}

		float[] bd = new float[100];
		for (int i = 0; i < 100; i++) {
			bd[i] = dist(xb, xd, yb, yd, z[i][1], z[i][3]);
		}

		float[] cd = new float[100];
		for (int i = 0; i < 100; i++) {
			cd[i] = dist(xc, xd, yc, yd, z[i][2], z[i][3]);
		}

		float[] abc = new float[100];
		for (int i = 0; i < 100; i++) {
			abc[i] = area(ab[i], bc[i], ac[i]);
		}

		float[] adc = new float[100];
		for (int i = 0; i < 100; i++) {
			adc[i] = area(ad[i], cd[i], ac[i]);
		}

		float[] abd = new float[100];
		for (int i = 0; i < 100; i++) {
			abd[i] = area(ab[i], ad[i], bd[i]);
		}

		float[] bcd = new float[100];
		for (int i = 0; i < 100; i++) {
			bcd[i] = area(bc[i], cd[i], bd[i]);
		}

		float maxabc = abc[0];
		for (int i = 0; i < 100; i++) {
			if (maxabc < abc[i])
				maxabc = abc[i];
		}
		float minabc = abc[0];
		for (int i = 0; i < 100; i++) {
			if (minabc > abc[i])
				minabc = abc[i];
		}
		float maxadc = adc[0];
		for (int i = 0; i < 100; i++) {
			if (maxadc < adc[i])
				maxadc = adc[i];
		}

		float minadc = adc[0];
		for (int i = 0; i < 100; i++) {
			if (minadc > adc[i])
				minadc = adc[i];
		}

		float ans1 = (float) (4 * Math.pow((maxabc + maxadc), 2));
		float ans2 = (float) (4 * Math.pow((minabc + minadc), 2));
		System.out.println(Math.round(ans1) + " " + Math.round(ans2));

	}
}