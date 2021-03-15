#include <stdio.h>

// item 1
typedef struct
{
    int x, y;   // posicao
    int r1, r2; // raios
} Ellipse;

// item 2
void Ellipse_print(const Ellipse *e)
{
    printf("Elipse em (%d, %d) de raios %d e %d\n",
           e->x, e->y, e->r1, e->r2);
}

int main()
{
    Ellipse t = {1, 2, 10, 2};
    Ellipse_print(&t);

    return 0;
}