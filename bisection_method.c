#include <stdio.h>
// #include <math.h>

int main()
{
    float a, b, x, fx;
    printf("enter a: ");
    scanf("%f", &a);
    printf("enter b: ");
    scanf("%f", &b);

    for (int i = 1; i <= 11; i++)
    {
        x = (a + b) / 2;
        fx = x*x*x - (4* x) - 9;

        if (fx > 0)
        {
            b = x;
        }
        else
        {
            a = x;
        }
        printf("iteration : %d ,the root is : %f, fx : %f \n", i, x, fx);
    }

    return 0;
}