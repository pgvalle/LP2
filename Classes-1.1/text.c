#include <stdio.h>

// item 1
typedef struct
{
    char *family;
    char *style;
    float size;

    int x, y;
} Text;

// item 2
void Text_print(const Text *t)
{
    printf("Texto em (%d, %d)\nFonte:   %s\nEstilo:  %s\nTamanho: %.1f px\n",
           t->x, t->y, t->family, t->style, t->size);
}

int main()
{
    Text t = {"Mononoki Nerd", "Mono", 14.0, 0, 0};
    Text_print(&t);

    return 0;
}