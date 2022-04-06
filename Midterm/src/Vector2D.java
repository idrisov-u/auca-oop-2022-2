public class Vector2D {
    private float x;
    private float y;

    public  Vector2D(float num1, float num2){
        x=num1;
        y=num2;

    }
    public Vector2D(){
        x=0;
        y=0;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }



    public Vector2D add(Vector2D vec1){
        return new Vector2D((this.x + vec1.getX()), (this.y+vec1.getY()));

    }
    public Vector2D subtract(Vector2D vec1){
        return new Vector2D((this.x - vec1.getX()), (this.y-vec1.getY()));

    }
    public Vector2D multiply(float num){
        return new Vector2D((this.x *num), (this.y *num));
    }
    public float dot(Vector2D vec1){
        float result = (this.x* vec1.getX()+this.y* vec1.getY());
        return result;
    }
    public double getMagnitude(){
        double magnutude  = Math.sqrt(((this.x)*(this.x))+((this.y)*this.y));
        return magnutude;
    }
    public Vector2D normalized(){
        return new Vector2D(1.0f,1.0f);
    }
    public String toString(){
        String  result = "";
        result = "("+this.x+", "+this.y+")";
        return result;
    }




}
