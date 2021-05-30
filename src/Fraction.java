

public class Fraction {
    private float numerateur;
    private float denominateur;
    private float res;



    Fraction(float num,float den){
        this.denominateur = den;
        this.numerateur = num;
        this.res = numerateur/denominateur;
    }


    public String toString(){
        String str;
        str = numerateur + "/" + denominateur +" => "+res;
        return str;

    }








}
