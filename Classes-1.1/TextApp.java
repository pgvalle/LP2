public class TextApp {
    public static void main(String[] args) {
        Text t = new Text("Mononoki Nerd", "Mono", 10.0f, 0, 0);
        t.print();
    }
}

class Text {
    // item 1
    public String family, style;
    public float size;

    public int x, y;

    // construtor
    public Text(String family, String style, float size, int x, int y) {
        this.family = family;
        this.style = style;
        this.size = size;

        this.x = x;
        this.y = y;
    }

    // item 2
    public void print() {
        System.out.format("Texto em (%d, %d)\nFonte:   %s\nEstilo:  %s\nTamanho: %.1f px\n",
            this.x, this.y, this.family, this.style, this.size);
    }
}