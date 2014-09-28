package spacetrader;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

/**
 * Miscellaneous methods
 */
public class Util {

	/**
	 * Sample ONCE from a normal distribution. If you want to sample
	 * more than once, it would be better to instantiate a new
	 * NormalDistribution and sample from that.
	 * 
	 * @param mean
	 * @param sd must be positive
	 */
	public static double sampleFromNormal(double mean, double sd) {
		
		if (sd <= 0) {
			throw new IllegalArgumentException("sd must be positive");
		}

		NormalDistribution distr = new NormalDistribution(mean, sd);
		return distr.sample();
	}

	/**
	 * Sample ONCE from a binomial distribution. If you want to sample
	 * more than once, it would be better to instantiate a new
	 * BinomialDistribution and sample from that.
	 * 
	 * @param trials Number of trials; positive
	 * @param p Probability of success; in (0, 1)
	 */
	public static double sampleFromBinomial(int trials, double p) {

		if (trials <= 0) {
			throw new IllegalArgumentException("trials must be positive");
		}
		if (p < 0 || p > 1) {
			throw new IllegalArgumentException("p must be in the range (0, 1)");
		}

		BinomialDistribution distr = new BinomialDistribution(trials, p);
		return distr.sample();
	}

	/**
	 * Sample ONCE from a normal distribution. If you want to sample
	 * more than once, it would be better to instantiate a new
	 * UniformRealDistribution and sample from that.
	 * 
	 * @param lower Lower bound of the uniform distro
	 * @param upper Upper bound of the uniform distro
	 */
	public static double sampleFromUniformReal(double lower, double upper) {

		UniformRealDistribution distr = new UniformRealDistribution(lower, upper);
		return distr.sample();
	}


	/**
	 * Sample ONCE from a normal distribution, so that the sample
	 * is &gt;= lower
	 * 
	 * @param mean
	 * @param sd must be positive
	 * @param lower all samples will be greater than or equal to lower
	 * @return a sample >= lower
	 */
	public static double sampleFromNormalAbove(
		double mean, double sd, 
		double lower) {

		if (sd <= 0) {
			throw new IllegalArgumentException("sd must be positive");
		}

		NormalDistribution distr = new NormalDistribution(mean, sd);
		while (true) {
			sample = distr.sample();
			if (sample >= lower) {
				return sample;
			}
		}
	}

	/**
	 * Sample once from a normal distribution, so that the sample is &lt;= upper
	 * 
	 * @param mean
	 * @param sd must be positive
	 * @param upper all samples will be &lt;= upper
	 * @return a sample &lt;= upper
	 */
	public static double sampleFromNormalBelow(
		double mean, double sd, 
		double upper) {

		if (sd <= 0) {
			throw new IllegalArgumentException("sd must be positive");
		}

		NormalDistribution distr = new NormalDistribution(mean, sd);
		while (true) {
			sample = distr.sample();
			if (sample <= upper) {
				return sample;
			}
		}
	}

	/**
	 * Sample once from a normal distribution, so that the sample is &lt;= upper
	 * and &gt;= lower.
	 * 
	 * @param mean
	 * @param sd must be positive
	 * @param lower all samples will be &gt;= lower
	 * @param upper all samples will be &lt;= upper
	 * @return a sample &lt;= upper and &gt;= lower
	 */
	public static double sampleFromNormalWithin(
		double mean, double sd, 
		double lower, double upper) {

		if (sd <= 0) {
			throw new IllegalArgumentException("sd must be positive");
		}

		NormalDistribution distr = new NormalDistribution(mean, sd);
		while (true) {
			sample = distr.sample();
			if (sample <= upper && sample >= lower) {
				return sample;
			}
		}
	}
}