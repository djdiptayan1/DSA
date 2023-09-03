#include<stdio.h>
#include<stdlib.h>
int main(){
    int r,c;
    printf("Enter the number of rows and columns: ");
    scanf("%d %d",&r,&c);
    int **arr = (int **)malloc(r*sizeof(int *)); // arr is a pointer to a pointer
    for(int i=0;i<r;i++){
        arr[i] = (int *)malloc(c*sizeof(int)); // arr[i] is a pointer to an array
    }

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("Enter the element at %d,%d: ",i,j);
            scanf("%d",&arr[i][j]);
        }
    }

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }



}