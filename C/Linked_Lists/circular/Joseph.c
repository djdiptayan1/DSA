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