#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

int isEmpty(struct Node *top)
{
    if (top == NULL)
        return 1;
    else
        return 0;
}

int isFull(struct Node *top)
{
    struct Node *p = (struct Node *)malloc(sizeof(struct Node)); // p is a pointer to a node
    if (p == NULL)                                               // if p is NULL, then there is no space in heap
        return 1;
    else
        return 0;
}

struct Node *push(struct Node *top, int x)
{
    if (!isFull(top))
    {
        struct Node *n = (struct Node *)malloc(sizeof(struct Node));
        n->data = x;
        n->next = top;
        top = n;
    }
    else
        printf("Stack Overflow\n");
    return top;
}
int pop(struct Node **top) // returns the address of the top node
{
    if (!isEmpty(*top))
    {
        struct Node *n = *top; // n is a pointer to a node
        *top = (*top)->next;   // top is a pointer to a node
        int x = n->data;       // x is an integer
        free(n);               // free the memory of the node
        return x;
    }
    else
        printf("Stack Underflow\n");
}

void traversal(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

int main()
{
    struct Node *top = NULL;
    top = push(top, 78);
    top = push(top, 29);
    top = push(top, 7);
    int element = pop(&top); // top is a pointer to a node
    printf("Popped element is %d\n", element);
    traversal(top);
}