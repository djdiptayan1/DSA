#include <stdio.h>
#include <stdlib.h>

struct stack
{
    int size;
    int top;
    int *arr;
};

int isEmpty(struct stack *ptr) // Checking if the stack is empty
{
    if (ptr->top == -1)
        return 1;
    else
        return 0;
}

int isFull(struct stack *ptr) // Checking if the stack is full
{
    if (ptr->top == ptr->size - 1)
        return 1;
    else
        return 0;
}

int push(struct stack *ptr, int val) // Pushing an element in the stack
{
    if (!isFull(ptr))
    {
        ptr->top++;
        ptr->arr[ptr->top] = val;
        return 1;
    }
    else
    {
        printf("Stack Overflow\n");
        return 0;
    }
}
int pop(struct stack *ptr) // Popping an element from the stack
{
    if (!isEmpty(ptr))
    {
        int val = ptr->arr[ptr->top];
        ptr->top--;
        return val;
    }
    else
    {
        printf("Stack Underflow\n");
        return 0;
    }
}
int peek(struct stack *ptr, int i)
{
    int arrayInd = ptr->top - i + 1;
    if (arrayInd < 0)
    {
        printf("Not a valid position for the stack\n");
        return -1;
    }
    else
    {
        return ptr->arr[arrayInd];
    }
}
int main()
{
    struct stack *s = (struct stack *)malloc(sizeof(struct stack)); // Allocate memory for the stack
    s->size = 80;
    s->top = -1;
    s->arr = (int *)malloc(s->size * sizeof(int));
    // Pushing an element manually
    // s->arr[0] = 7;
    // s->top++;

    push(s, 66);
    push(s, 56);
    push(s, 76);
    for (int i = 1; i <= s->top + 1; i++)
        printf("The value at position %d is %d\n", i, peek(s, i));
    return 0;
}
