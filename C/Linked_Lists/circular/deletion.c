#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

void LLprint(struct Node *head)
{
    struct Node *ptr = head;
    if (head != NULL)
    {
        do
        {
            printf("%d\n", ptr->data);
            ptr = ptr->next;
        } while (ptr != head);
    }
}
struct Node *delete_first(struct Node *head)
{
    struct Node *temp = head;
    struct Node *ptr = head;
    while (ptr->next != head)
    {
        ptr = ptr->next;
    }
    ptr->next = temp->next;
    head = temp->next;
    free(temp);
    return head;
}

struct Node *delete_last(struct Node *head)
{
    struct Node *p = head;
    struct Node *q = head->next;
    while (q->next != head)
    {
        p = p->next;
        q = q->next;
    }
    p->next = head;
    free(q);
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

struct Node *delete_value(struct Node *head, int value) // deleting at index
{
    struct Node *p = head;       // previous node of q
    struct Node *q = head->next; // next node of p
    int i = 0;
    while (q->data != value && q->next != NULL)
    {
        p = p->next;
        q = q->next;
    }
    if (q->data == value)
    {
        p->next = q->next;
        free(q);
    }
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
    head->data = 1;
    head->next = second;

    // Link second and third nodes
    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = forth;

    forth->data = 4;
    forth->next = head;

    // Insert elements at the beginning of the circular linked list
    head = delete_at(head, 2);

    LLprint(head);

    return 0;
}
