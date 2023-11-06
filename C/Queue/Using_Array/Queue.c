#include <stdio.h>
#include <stdlib.h>
struct Queue
{
    int size;
    int front;
    int rear;
    int *arr;
};

int isEmpty(struct Queue *q)
{
    if (q->front == q->rear)
        return 1;
    return 0;
}
int isFull(struct Queue *q)
{
    if (q->rear == q->size - 1)
        return 1;
    return 0;
}

void enqueue(struct Queue *q, int val)
{
    if (!isFull(q))
    {
        q->rear++;
        q->arr[q->rear] = val;
    }
    else
    {
        printf("Queue is Full\n");
    }
}
int dequeue(struct Queue *q)
{
    int a = -1;
    if (!isEmpty(q))
    {
        q->front++;
        a = q->arr[q->front];
    }
    else
    {
        printf("Queue is Empty\n");
    }
    return a;
}

int main()
{
    struct Queue *q = (struct Queue *)malloc(sizeof(struct Queue));
    q->size = 100;
    q->front = q->rear = -1;
    q->arr = (int *)malloc(q->size * sizeof(int));
    printf(isEmpty(q) ? "Queue is Empty\n" : "Queue is not Empty\n");
    enqueue(q, 10);
    enqueue(q, 20);
    printf(isEmpty(q) ? "Queue is Empty\n" : "Queue is not Empty\n");
    for (int i = 0; i < q->rear+1; i++)
    {
        printf("%d ", q->arr[i]);
    }

    return 0;
}