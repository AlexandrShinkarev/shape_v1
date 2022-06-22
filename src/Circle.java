public class Circle extends Shape {
    private final float pi = 3.14f;
    private float r; // ������

    public Circle(float r){
        this.r = r;
    }


    @Override
    public float getSquare() {
        return pi * (r * r);
    }

    public float getPi() {
        return pi;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
