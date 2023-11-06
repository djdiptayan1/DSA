#include <stdio.h>
#include <stdlib.h>
struct Node *front = NULL;
struct Node *rear = NULL;

struct Node
{
    int data;
    struct Node *next;
};
void enqueue(int val)
{
    struct Node *n = (struct Node *)malloc(sizeof(struct Node));
    if (n == NULL)
        printf("Queue is full\n");
    else
    {
        n->data = val;
        n->next = NULL;
        if (front == NULL)
            front = rear = n;
        else
        {
            rear->next = n;
            rear = n;
        }
    }
}
int dequeue()
{
    int a = -1;
    if (front == NULL)
    {
        printf("Queue is empty\n");
    }
    else
    {
        struct Node *ptr = front;
        a = ptr->data;
        front = front->next;
        free(ptr);

        // If front becomes NULL after dequeuing the last element, also update rear to NULL
        if (front == NULL)
        {
            rear = NULL;
        }
    }
    return a;
}

void traversal(struct Node *ptr)
{
    printf("Queue is: \n");
    while (ptr != NULL)
    {
        printf("%d\n", ptr->data);
        ptr = ptr->next;
    }
}
int main()
{
    enqueue(10);
    enqueue(20);
    enqueue(30);
    traversal(front);
    dequeue();
    traversal(front);
    return 0;
}