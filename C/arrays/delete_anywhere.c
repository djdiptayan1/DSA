#include <stdio.h>
#include <stdlib.h>

int main()
{
    int size, pos, ele;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        printf("Enter the element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("Enter the position of the element to be deleted: ");
    scanf("%d", &pos);

    size--;
    for (int i = size; i > pos; i--)
    {
        arr[i - 1] = arr[i];
    }
    printf("The array after deletion is: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
}