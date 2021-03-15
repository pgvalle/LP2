public class RectApp {
    public static void main(String[] args) {
        Rect r = new Rect(50, 2, 100, 20);
        r.print();
        System.out.format("A area do retangulo e %d\n", r.area());

        // arrastando retangulo
        System.out.print("Arrastando retangulo (dx = 10, dy = 88)\n");
        r.drag(10, 88);
        r.print();
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print() {
        System.out.format("Rentangulo de tamanho (%d, %d) em (%d, %d)\n",
            this.w, this.h, this.x, this.y);
    }

    int area() {
        return this.w * this.h;
    }

    void drag(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}