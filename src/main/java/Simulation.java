class Simulation{
    private int young = 500;
    private int old = 0;
    private int adult = 0;

    private float birthRate = 1.5f;
    private float seniorSurvivalRate = 0.3f;
    private float youngSurvivalRate= 0.8f;
    private float adultSurvivalRate= 0.6f;

    public Simulation(int gens, SimulationProperties properties){
        young=properties.getYoung();
        old=properties.getOld();
        adult=properties.getAdult();

        birthRate=properties.getBirthRate();
        seniorSurvivalRate=properties.getSeniorSurvivalRate();
        youngSurvivalRate=properties.getYoungSurvivalRate();
        adultSurvivalRate=properties.getAdultSurvivalRate();

        for(int i = 0;i<gens;i++){
            simGen();
            System.out.println("gen: "+i);
            System.out.println(young);
            System.out.println(adult);
            System.out.println(old);

        }

    }
    public void simGen(){
        old= Math.round( old*seniorSurvivalRate);
        adult= Math.round(adult*adultSurvivalRate);
        young = Math.round(young*youngSurvivalRate);
        old+=adult;
        adult=young;
        young = Math.round(adult*birthRate);

    }

    public int getYoung() {
        return young;
    }

    public int getOld() {
        return old;
    }

    public int getAdult() {
        return adult;
    }

    public float getBirthRate() {
        return birthRate;
    }

    public float getSeniorSurvivalRate() {
        return seniorSurvivalRate;
    }

    public float getYoungSurvivalRate() {
        return youngSurvivalRate;
    }

    public float getAdultSurvivalRate() {
        return adultSurvivalRate;
    }
}
class SimulationProperties {
    int young = 500;
    int old = 0;
    int adult = 0;

    float birthRate = 1.5f;
    float seniorSurvivalRate = 0.3f;
    float youngSurvivalRate= 0.8f;
    float adultSurvivalRate= 0.6f;

    public SimulationProperties setBirthRate(float birthRate){
        this.birthRate=birthRate;
        return this;
    }
    public SimulationProperties setSeniorSurvivalRate(float seniorSurvivalRate){
        this.seniorSurvivalRate=seniorSurvivalRate;
        return this;
    }
    public SimulationProperties setYoungSurvivalRate(float youngSurvivalRate){
        this.youngSurvivalRate=youngSurvivalRate;
        return this;
    }
    public SimulationProperties setAdultSurvivalRate(float adultSurvivalRate){
        this.adultSurvivalRate=adultSurvivalRate;
        return this;
    }
    public SimulationProperties setAdults(int adults){
        this.adult=adults;
        return this;
    }
    public SimulationProperties setYoungs(int young){
        this.young=young;
        return this;
    }
    public SimulationProperties setSeniors(int seniors){
        this.old=seniors;
        return this;
    }

    public int getYoung() {
        return young;
    }

    public int getOld() {
        return old;
    }

    public int getAdult() {
        return adult;
    }

    public float getBirthRate() {
        return birthRate;
    }

    public float getSeniorSurvivalRate() {
        return seniorSurvivalRate;
    }

    public float getYoungSurvivalRate() {
        return youngSurvivalRate;
    }

    public float getAdultSurvivalRate() {
        return adultSurvivalRate;
    }
}