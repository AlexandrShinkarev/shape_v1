public class Triangle extends Shape {
    private float a; // длина основания
    private float h; //высота к основанию

    public Triangle(float a, float h){
        this.a = a;
        this. h = h;
    }

    @Override
    public float getSquare() {
        return 0.5f * a * h;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}
