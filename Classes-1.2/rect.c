#include <stdio.h>

typedef struct
{
    int x, y;
    int w, h;
} Rect;

void print(Rect *r)
{
    printf("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
           r->w, r->h, r->x, r->y);
}

int area(Rect *r)
{
    return r->w * r->h;
}

void drag(Rect *r, int dx, int dy)
{
    r->x += dx;
    r->y += dy;
}

void main(void)
{
    Rect r = {1, 1, 10, 10};
    print(&r);
    printf("Area do retangulo e %d\n", area(&r));
    printf("Arrastando retangulo (dx = 35, dy = 12)\n");
    drag(&r, 35, 12);
    print(&r);
}