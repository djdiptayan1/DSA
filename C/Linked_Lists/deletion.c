#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};

void LLprint(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

struct Node *delete_first(struct Node *head) // deleting first node
{
    struct Node *ptr = head;
    head = head->next;
    free(ptr);
    return head;
}
struct Node *delete_at(struct Node *head, int index) // deleting at index
{
    struct Node *p = head;       // previous node of q
    struct Node *q = head->next; // next node of p
    int i = 0;
    for (int i = 0; i < index - 1; i++) // traversing to the index
    {
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    free(q);
    return head;
}
struct Node *delete_last(struct Node *head) // deleting last node
{
    struct Node *p = head;
    struct Node *q = head->next;
    while (q->next != NULL) // traversing to the last node
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL; // making the second last node as last node
    free(q);
    return head;
}

int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *forth;

    // Allocate memory for nodes in the linked list in Heap
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    forth = (struct Node *)malloc(sizeof(struct Node));

    // Link first and second nodes
    head->data = 7;
    head->next = second;

    // Link second and third nodes
    second->data = 8;
    second->next = third;

    third->data = 9;
    third->next = forth;

    forth->data = 10;
    forth->next = NULL;

    // head = delete_first(head); // deleting first node
    head = delete_at(head, 2); // deleting at index 2
    head = delete_last(head);  // deleting last node
    LLprint(head);

    return 0;
}