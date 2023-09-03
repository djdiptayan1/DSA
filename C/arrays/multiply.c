#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int r1, c1, r2, c2;
    printf("Enter the number of rows and columns of the FIRST matrix:");
    scanf("%d %d", &r1, &c1);

    printf("Enter the number of rows and columns of the SECOND matrix:");
    scanf("%d %d", &r2, &c2);

    int mul[r1][c2];

    // Allocating memory for the arrays dynamically
    int **arr1 = (int **)malloc(r1 * sizeof(int *));
    int **arr2 = (int **)malloc(r2 * sizeof(int *));
    for (int i = 0; i < r1; i++)
        arr1[i] = (int *)malloc(c1 * sizeof(int));
    for (int i = 0; i < r2; i++)
        arr2[i] = (int *)malloc(c2 * sizeof(int));

    // Taking input for the arrays
    printf("Enter the elements of the first matrix:");
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            printf("Enter the element at %d, %d:", i, j);
            scanf("%d", &arr1[i][j]);
        }
    }

    printf("Enter the elements of the second matrix:");
    for (int i = 0; i < r2; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            printf("Enter the element at %d, %d:", i, j);
            scanf("%d", &arr2[i][j]);
        }
    }

    printf("Multiplied Matrix:\n");
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            mul[i][j] = 0;
            for (int k = 0; k < c1; k++)
            {
                mul[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }

    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            printf("%d ", mul[i][j]);
        }
        printf("\n");
    }
}