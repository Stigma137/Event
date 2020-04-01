package test;

import javafx.scene.chart.XYChart;
import math.src.main.java.org.apache.commons.math3.distribution.AbstractRealDistribution;
import statistics.ProbabilisticDistribution;

public class Distributions {

	public static void main(String[] args) {
		ProbabilisticDistribution pb = new ProbabilisticDistribution();
		double[] data = distGenerator(pb.getFdistribution());
		XYChart<Double, Double> xy 
	}
	public static double[] distGenerator(AbstractRealDistribution abstractRealDistribution) {
		double[] data = new double[1000];
		for (int i = 0; i < data.length; i++) {
			data[i] = abstractRealDistribution.sample();
		}
		return data;
	}
}
