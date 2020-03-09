import math.src.main.java.org.apache.commons.math3.distribution.*;
public class ProbabilisticDistribution {
	public EventType field;
	private KolmogorovSmirnovDistribution kolmogorovSmirnovDistribution;
	private EnumeratedDistribution enumeratedDistribution;
	private MultivariateNormalDistribution multivariateNormalDistribution;
	private GammaDistribution gammaDistribution;
	private BetaDistribution betaDistribution;
	private AbstractIntegerDistribution abstractIntegerDistribution;
	private GumbelDistribution gumbelDistribution;
	private LogisticDistribution logisticDistribution;
	private AbstractRealDistribution abstractRealDistribution;
	private LaplaceDistribution laplaceDistribution;
	private MixtureMultivariateRealDistribution mixtureMultivariateRealDistribution;
	private PoissonDistribution poissonDistribution;
	private WeibullDistribution weibullDistribution;
	private ParetoDistribution paretoDistribution;
	private PascalDistribution pascalDistribution;
	private BinomialDistribution binomialDistribution;
	private LevyDistribution levyDistribution;
	private CauchyDistribution cauchyDistribution;
	private NakagamiDistribution nakagamiDistribution;
	private GeometricDistribution geometricDistribution;
	private UniformRealDistribution uniformRealDistribution;
	private ExponentialDistribution exponentialDistribution;
	private ZipfDistribution zipfDistribution;
	private EnumeratedRealDistribution enumeratedRealDistribution;
	private TriangularDistribution triangularDistribution;
	private LogNormalDistribution logNormalDistribution;
	private AbstractMultivariateRealDistribution abstractMultivariateRealDistribution;
	private HypergeometricDistribution hypergeometricDistribution;
	private NormalDistribution normalDistribution;
	private MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution;
	private UniformIntegerDistribution uniformIntegerDistribution;
	private ConstantRealDistribution constantRealDistribution;
	private EnumeratedIntegerDistribution enumeratedIntegerDistribution;
	private TDistribution tDistribution;
	private ChiSquaredDistribution chiSquaredDistribution;
	private FDistribution fdistribution;
	private RealDistribution realDistribution;
	private IntegerDistribution integerDistribution; 
	
	public ProbabilisticDistribution() {
		
	}
	public double getNextClockTick() {
		return 0;
	}
	public EventType getField() {
		return field;
	}
	public void setField(EventType field) {
		this.field = field;
	}
	public KolmogorovSmirnovDistribution getKolmogorovSmirnovDistribution() {
		return kolmogorovSmirnovDistribution;
	}
	public void setKolmogorovSmirnovDistribution(KolmogorovSmirnovDistribution kolmogorovSmirnovDistribution) {
		this.kolmogorovSmirnovDistribution = kolmogorovSmirnovDistribution;
	}
	public EnumeratedDistribution getEnumeratedDistribution() {
		return enumeratedDistribution;
	}
	public void setEnumeratedDistribution(EnumeratedDistribution enumeratedDistribution) {
		this.enumeratedDistribution = enumeratedDistribution;
	}
	public MultivariateNormalDistribution getMultivariateNormalDistribution() {
		return multivariateNormalDistribution;
	}
	public void setMultivariateNormalDistribution(MultivariateNormalDistribution multivariateNormalDistribution) {
		this.multivariateNormalDistribution = multivariateNormalDistribution;
	}
	public GammaDistribution getGammaDistribution() {
		return gammaDistribution;
	}
	public void setGammaDistribution(GammaDistribution gammaDistribution) {
		this.gammaDistribution = gammaDistribution;
	}
	public BetaDistribution getBetaDistribution() {
		return betaDistribution;
	}
	public void setBetaDistribution(BetaDistribution betaDistribution) {
		this.betaDistribution = betaDistribution;
	}
	public AbstractIntegerDistribution getAbstractIntegerDistribution() {
		return abstractIntegerDistribution;
	}
	public void setAbstractIntegerDistribution(AbstractIntegerDistribution abstractIntegerDistribution) {
		this.abstractIntegerDistribution = abstractIntegerDistribution;
	}
	public GumbelDistribution getGumbelDistribution() {
		return gumbelDistribution;
	}
	public void setGumbelDistribution(GumbelDistribution gumbelDistribution) {
		this.gumbelDistribution = gumbelDistribution;
	}
	public LogisticDistribution getLogisticDistribution() {
		return logisticDistribution;
	}
	public void setLogisticDistribution(LogisticDistribution logisticDistribution) {
		this.logisticDistribution = logisticDistribution;
	}
	public AbstractRealDistribution getAbstractRealDistribution() {
		return abstractRealDistribution;
	}
	public void setAbstractRealDistribution(AbstractRealDistribution abstractRealDistribution) {
		this.abstractRealDistribution = abstractRealDistribution;
	}
	public LaplaceDistribution getLaplaceDistribution() {
		return laplaceDistribution;
	}
	public void setLaplaceDistribution(LaplaceDistribution laplaceDistribution) {
		this.laplaceDistribution = laplaceDistribution;
	}
	public MixtureMultivariateRealDistribution getMixtureMultivariateRealDistribution() {
		return mixtureMultivariateRealDistribution;
	}
	public void setMixtureMultivariateRealDistribution(
			MixtureMultivariateRealDistribution mixtureMultivariateRealDistribution) {
		this.mixtureMultivariateRealDistribution = mixtureMultivariateRealDistribution;
	}
	public PoissonDistribution getPoissonDistribution() {
		return poissonDistribution;
	}
	public void setPoissonDistribution(PoissonDistribution poissonDistribution) {
		this.poissonDistribution = poissonDistribution;
	}
	public WeibullDistribution getWeibullDistribution() {
		return weibullDistribution;
	}
	public void setWeibullDistribution(WeibullDistribution weibullDistribution) {
		this.weibullDistribution = weibullDistribution;
	}
	public ParetoDistribution getParetoDistribution() {
		return paretoDistribution;
	}
	public void setParetoDistribution(ParetoDistribution paretoDistribution) {
		this.paretoDistribution = paretoDistribution;
	}
	public PascalDistribution getPascalDistribution() {
		return pascalDistribution;
	}
	public void setPascalDistribution(PascalDistribution pascalDistribution) {
		this.pascalDistribution = pascalDistribution;
	}
	public BinomialDistribution getBinomialDistribution() {
		return binomialDistribution;
	}
	public void setBinomialDistribution(BinomialDistribution binomialDistribution) {
		this.binomialDistribution = binomialDistribution;
	}
	public LevyDistribution getLevyDistribution() {
		return levyDistribution;
	}
	public void setLevyDistribution(LevyDistribution levyDistribution) {
		this.levyDistribution = levyDistribution;
	}
	public CauchyDistribution getCauchyDistribution() {
		return cauchyDistribution;
	}
	public void setCauchyDistribution(CauchyDistribution cauchyDistribution) {
		this.cauchyDistribution = cauchyDistribution;
	}
	public NakagamiDistribution getNakagamiDistribution() {
		return nakagamiDistribution;
	}
	public void setNakagamiDistribution(NakagamiDistribution nakagamiDistribution) {
		this.nakagamiDistribution = nakagamiDistribution;
	}
	public GeometricDistribution getGeometricDistribution() {
		return geometricDistribution;
	}
	public void setGeometricDistribution(GeometricDistribution geometricDistribution) {
		this.geometricDistribution = geometricDistribution;
	}
	public UniformRealDistribution getUniformRealDistribution() {
		return uniformRealDistribution;
	}
	public void setUniformRealDistribution(UniformRealDistribution uniformRealDistribution) {
		this.uniformRealDistribution = uniformRealDistribution;
	}
	public ExponentialDistribution getExponentialDistribution() {
		return exponentialDistribution;
	}
	public void setExponentialDistribution(ExponentialDistribution exponentialDistribution) {
		this.exponentialDistribution = exponentialDistribution;
	}
	public ZipfDistribution getZipfDistribution() {
		return zipfDistribution;
	}
	public void setZipfDistribution(ZipfDistribution zipfDistribution) {
		this.zipfDistribution = zipfDistribution;
	}
	public EnumeratedRealDistribution getEnumeratedRealDistribution() {
		return enumeratedRealDistribution;
	}
	public void setEnumeratedRealDistribution(EnumeratedRealDistribution enumeratedRealDistribution) {
		this.enumeratedRealDistribution = enumeratedRealDistribution;
	}
	public TriangularDistribution getTriangularDistribution() {
		return triangularDistribution;
	}
	public void setTriangularDistribution(TriangularDistribution triangularDistribution) {
		this.triangularDistribution = triangularDistribution;
	}
	public LogNormalDistribution getLogNormalDistribution() {
		return logNormalDistribution;
	}
	public void setLogNormalDistribution(LogNormalDistribution logNormalDistribution) {
		this.logNormalDistribution = logNormalDistribution;
	}
	public AbstractMultivariateRealDistribution getAbstractMultivariateRealDistribution() {
		return abstractMultivariateRealDistribution;
	}
	public void setAbstractMultivariateRealDistribution(
			AbstractMultivariateRealDistribution abstractMultivariateRealDistribution) {
		this.abstractMultivariateRealDistribution = abstractMultivariateRealDistribution;
	}
	public HypergeometricDistribution getHypergeometricDistribution() {
		return hypergeometricDistribution;
	}
	public void setHypergeometricDistribution(HypergeometricDistribution hypergeometricDistribution) {
		this.hypergeometricDistribution = hypergeometricDistribution;
	}
	public NormalDistribution getNormalDistribution() {
		return normalDistribution;
	}
	public void setNormalDistribution(NormalDistribution normalDistribution) {
		this.normalDistribution = normalDistribution;
	}
	public MixtureMultivariateNormalDistribution getMixtureMultivariateNormalDistribution() {
		return mixtureMultivariateNormalDistribution;
	}
	public void setMixtureMultivariateNormalDistribution(
			MixtureMultivariateNormalDistribution mixtureMultivariateNormalDistribution) {
		this.mixtureMultivariateNormalDistribution = mixtureMultivariateNormalDistribution;
	}
	public UniformIntegerDistribution getUniformIntegerDistribution() {
		return uniformIntegerDistribution;
	}
	public void setUniformIntegerDistribution(UniformIntegerDistribution uniformIntegerDistribution) {
		this.uniformIntegerDistribution = uniformIntegerDistribution;
	}
	public ConstantRealDistribution getConstantRealDistribution() {
		return constantRealDistribution;
	}
	public void setConstantRealDistribution(ConstantRealDistribution constantRealDistribution) {
		this.constantRealDistribution = constantRealDistribution;
	}
	public EnumeratedIntegerDistribution getEnumeratedIntegerDistribution() {
		return enumeratedIntegerDistribution;
	}
	public void setEnumeratedIntegerDistribution(EnumeratedIntegerDistribution enumeratedIntegerDistribution) {
		this.enumeratedIntegerDistribution = enumeratedIntegerDistribution;
	}
	public TDistribution gettDistribution() {
		return tDistribution;
	}
	public void settDistribution(TDistribution tDistribution) {
		this.tDistribution = tDistribution;
	}
	public ChiSquaredDistribution getChiSquaredDistribution() {
		return chiSquaredDistribution;
	}
	public void setChiSquaredDistribution(ChiSquaredDistribution chiSquaredDistribution) {
		this.chiSquaredDistribution = chiSquaredDistribution;
	}
	public FDistribution getFdistribution() {
		return fdistribution;
	}
	public void setFdistribution(FDistribution fdistribution) {
		this.fdistribution = fdistribution;
	}
	public RealDistribution getRealDistribution() {
		return realDistribution;
	}
	public void setRealDistribution(RealDistribution realDistribution) {
		this.realDistribution = realDistribution;
	}
	public IntegerDistribution getIntegerDistribution() {
		return integerDistribution;
	}
	public void setIntegerDistribution(IntegerDistribution integerDistribution) {
		this.integerDistribution = integerDistribution;
	}
	
}
