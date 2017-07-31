public class Pi {
    private double pi = 4;
    private double minus = 3;
    private double plus = 5;
    public double calculatePi(){
        for(int i = 0; i < 1000000000; i++){
            if(i % 2 == 0){
                pi = pi - (4/minus);
                minus+= 4;
            }
            if(i % 2 == 1){
                pi = pi + (4/plus);
                plus += 4;
            }
        }
        return pi;
    }
}
