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

struct Node *insert_first(struct Node *head, int data) // inserting at the beginning
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    ptr->next = head;
    head = ptr;
    return head;
}

struct Node *insert_at(struct Node *head, int data, int index) // index is the position where we want to insert the data
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node *p = head;
    int i = 0;
    while (i != index - 1) // traversing to the index
    {
        p = p->next; // p points to the index-1 node
        i++;
    }
    ptr->data = data;    // inserting the data
    ptr->next = p->next; // pointing the next of ptr to the next of p
    p->next = ptr;       // pointing the next of p to ptr
    return head;
}

struct Node *insert_end(struct Node *head, int data) // inserting at the end
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node)); // creating a new node
    struct Node *p = head;                                         // creating a pointer to traverse the linked list
    ptr->data = data;                                              // inserting the data

    while (p->next != NULL)
    {                // traversing to the last node
        p = p->next; // p points to the last node
    }
    p->next = ptr;    // pointing the next of last node to ptr
    ptr->next = NULL; // pointing the next of ptr to NULL
    return head;
}

struct Node *insert_after(struct Node *head, struct Node *prev, int data) // inserting after a given node
{
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node)); // creating a new node
    struct Node *p = head;                                         // creating a pointer to traverse the linked list
    ptr->data = data;                                              // inserting the data

    ptr->next = prev->next;
    prev->next = ptr;

    return head;
}

int main()
{
    struct Node *head;
    struct Node *second;

    // Allocate memory for nodes in the linked list in Heap
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));

    // Link first and second nodes
    head->data = 7;
    head->next = second;

    // Link second and third nodes
    second->data = 11;
    second->next = NULL;

    head = insert_first(head, 100);         // Inserting 100 at the beginning
    head = insert_first(head, 200);         // Inserting 200 at the beginning
    head = insert_at(head, 300, 4);         // Inserting 300 at index 2
    head = insert_end(head, 400);           // Inserting 400 at the end
    head = insert_after(head, second, 500); // Inserting 500 after second node
    LLprint(head);
    return 0;
}