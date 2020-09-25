
public class Fraction{

    private int mDenominateur;
    private int mNumerateur;

    public Fraction(){
        mNumerateur = 0;
        mDenominateur = 1;
    }

    public Fraction(int numerateur, int denominateur){
        mNumerateur = numerateur;
        setDenominateur(denominateur);
    }  

    public void setNumerateur(int numerateur) {
        this.mNumerateur = numerateur;
    }

    public void setDenominateur(int denominateur) {
        assert denominateur != 0 : " Le dénominateur ne doit pas être null ";
        
        mDenominateur = denominateur;
    }
    public int getDenominateur() {
        return mDenominateur;
    }

    public int getNumerateur() {
        return mNumerateur;
    }

    public Fraction plus(Fraction f2){
        int dem = this.mDenominateur * f2.mDenominateur;
        int num = this.mNumerateur * f2.mDenominateur + f2.mNumerateur * this.mDenominateur;

        return new Fraction(num, dem);
    }

    public Fraction moins(Fraction f2){
        int dem = this.mDenominateur * f2.mDenominateur;
        int num = this.mNumerateur * f2.mDenominateur - f2.mNumerateur * this.mDenominateur;

        return new Fraction(num, dem);
    }

    public Fraction multiplier(Fraction f2){
        int dem = this.mDenominateur * f2.mDenominateur;
        int num = this.mNumerateur * f2.mNumerateur;

        return new Fraction(num, dem);
    }

    public Fraction diviser(Fraction f2){
        int dem = this.mDenominateur * f2.mNumerateur;
        int num = this.mNumerateur * f2.mDenominateur;

        return new Fraction(num, dem);
    }

    public void mutilipier(int q){
        mNumerateur *= q;
    }


    @Override
    public String toString() {
        
        return "[" + mNumerateur + "/" + mDenominateur + "]";
    }
}