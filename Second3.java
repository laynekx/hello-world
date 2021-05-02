class Second3{
//a and b values
private double a;
private double b;

//set value
public void setValue(double a0, double b0){
    this.a = a0;
    this.b = b0;
}

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
class Output{
//Check result
    public static void main(String[] args){
        double a0 = Math.random();
        double b0 = Math.random();
        Second3 obj = new Second3();
        obj.setValue(a0, b0);
        double result = obj.p(a0, b0);
        float a1 = (float) a0;
        float b1 = (float) b0;
        float result1 = (float) result;
        System.out.println("The result is: " + result1 + " from the dance: " + obj.j + " " + 
        "where the random values of a0 and b0 are " + a1 + " and " + b1 + " respectively.");
        }
}
