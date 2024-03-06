public class AreaCirc {
    double raio;
    double pi;

    public AreaCirc(double initialArea){
        pi = 3.14;
        raio = initialArea;
    }

    double area(){
        return pi * Math.pow(raio, 2);
    }
}
