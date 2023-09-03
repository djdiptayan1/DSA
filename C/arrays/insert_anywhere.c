#include <stdio.h>
#include <stdlib.h>
int main()
{
    int size, pos, ele;
    printf("enter the size of array: ");
    scanf("%d", &size);
    int arr[size];

    printf("enter the elements of array: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("enter the position to insert: ");
    scanf("%d", &pos);
    printf("enter the element to insert: ");
    scanf("%d", &ele);

    size++; // increasing the size of array

    for (int i = size; i > pos; i--)
        arr[i] = arr[i - 1];

    arr[pos] = ele;

    printf("elements of array: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}