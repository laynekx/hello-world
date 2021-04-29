class Second2{
//a and b values
private double a, b;

//Set "dance" array
private String[][] dance = {{"zumba", "rumba"}, {"chacha", "hiphop"}};

//Set d and e which chooses an element in "dance" array
private int d = (a > b && a > 0.5) ? 0 : 1;
private int e = (a > b && a < 0.5) ? 0 : 1;

//Set dance to variable
public String j = dance[d][e];

//Set recursive function to generate "result" using a and b values
public double p(double x, double y){
    if (x >= y){
        return x/y + p(x - Math.random(), y - Math.random());
        }
    else{
        double f = (a > b) ? dance[d].length : dance[d].length - 1;
        return f;
    }
}
}
class Yolo{
//Check result
    public static void main(String[] args){
        double a = Math.random();
        double b = Math.random();
        Second2 obj = new Second2();
        double result = obj.p(a, b);
        float a1 = (float) a;
        float b1 = (float) b;
        float result1 = (float) result;
        System.out.println("The result is: " + result1 + " from the dance: " + obj.j + " " + 
        "where the random values of a1 and b1 are " + a1 + " and " + b1 + " respectively.");
        }
}