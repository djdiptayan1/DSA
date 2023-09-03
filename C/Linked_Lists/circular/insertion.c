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

struct Node *insert_first(struct Node *head, int data)
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    ptr->next = ptr; // Create a circular reference

    struct Node *p = head->next;
    while (p->next != head)
    {
        p = p->next;
    }
    p->next = ptr;    // Update the last node to point to the new node
    ptr->next = head; // Update the new node to point to the head
    head = ptr;       // Update the head pointer

    return head;
}

struct Node *insert_last(struct Node *head, int data) // Insertion at the end
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    struct Node *p = head;
    while (p->next != head)
    {
        p = p->next;
    }
    p->next = ptr; // Update the last node to point to the new node
    ptr->next = head;
    return head;
}

struct Node *insert_at(struct Node *head, int data, int index) // Insertion at a given index
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    struct Node *p = head;
    int i = 0;
    while (i != index - 1)
    {
        p = p->next;
        i++;
    }
    ptr->next = p->next;
    p->next = ptr;
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
    forth->next = head;

    // Insert elements at the beginning of the circular linked list
    head = insert_at(head, 6, 1);

    LLprint(head);

    return 0;
}
